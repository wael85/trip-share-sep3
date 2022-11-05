using Grpc.Net.Client;
using gRPCClient.gRPC_Imp;
using gRPCClient.grpcInterfaces;
using gRPCClient.Proto;

var builder = WebApplication.CreateBuilder(args);

// Add services to the container.

builder.Services.AddControllers();
// Learn more about configuring Swagger/OpenAPI at https://aka.ms/aspnetcore/swashbuckle
builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();

builder.Services.AddScoped<IUserGrpc, UserGrpcImp>();

builder.Services.AddGrpc();

builder.Services.AddSingleton(new UserService.UserServiceClient(GrpcChannel.ForAddress("https://localhost:8081")));

var app = builder.Build();

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