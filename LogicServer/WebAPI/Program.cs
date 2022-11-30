
using Application.GrpcInterfaces;
using Application.Logic;
using Application.LogicInterfaces;
using Grpc.Net.Client;
using gRPCClient.gRPC_Imp;
using gRPCClient.GrpcInterfaces;


var builder = WebApplication.CreateBuilder(args);

// Add services to the container.
builder.Services.AddControllers();
// Learn more about configuring Swagger/OpenAPI at https://aka.ms/aspnetcore/swashbuckle
builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();
builder.Services.AddScoped<IUserService,UserGrpcImp>();
builder.Services.AddScoped<IUserLogic, UserLogic>();
builder.Services.AddScoped<ITripServices, TripGrpcImp>();
builder.Services.AddScoped<IRegisterCarService, RegisterCarGrpcImp>();
builder.Services.AddScoped<IRegisterCarLogic, RegisterCarLogic>();
builder.Services.AddScoped<ITripLogic,TripLogic>();
builder.Services.AddGrpc();


builder.Services.AddSingleton(new UserServices.UserServicesClient(GrpcChannel.ForAddress("http://localhost:8081")));
builder.Services.AddSingleton(new CarServices.CarServicesClient(GrpcChannel.ForAddress("http://localhost:8081")));
builder.Services.AddSingleton(new TripServices.TripServicesClient(GrpcChannel.ForAddress("http://localhost:8081")));

var app = builder.Build();
app.UseCors(x => x
    .AllowAnyMethod()
    .AllowAnyHeader()
    .SetIsOriginAllowed(origin => true) // allow any origin
    .AllowCredentials());

// Configure the HTTP request pipeline.
if (app.Environment.IsDevelopment())
{
    app.UseSwagger();
    app.UseSwaggerUI();
}

app.UseHttpsRedirection();

app.UseAuthorization();

app.MapControllers();

app.Run();