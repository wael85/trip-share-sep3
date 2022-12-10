
using System.Text;
using Application.GrpcInterfaces;
using Application.Logic;
using Application.LogicInterface;
using Application.LogicInterfaces;
using Domain.Auth;
using Grpc.Net.Client;
using gRPCClient.gRPC_Imp;
using gRPCClient.GrpcInterfaces;
using Microsoft.AspNetCore.Authentication.JwtBearer;
using Microsoft.IdentityModel.Tokens;


var builder = WebApplication.CreateBuilder(args);

// Add services to the container.
builder.Services.AddControllers();
// Learn more about configuring Swagger/OpenAPI at https://aka.ms/aspnetcore/swashbuckle
builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();
builder.Services.AddScoped<IUserService,UserGrpcImp>();
builder.Services.AddScoped<IUserLogic, UserLogic>();
builder.Services.AddScoped<ITripServices, TripGrpcImp>();
builder.Services.AddScoped<ICarService, CarGrpcImp>();
builder.Services.AddScoped<ICarLogic, CarLogic>();
builder.Services.AddScoped<ITripLogic,TripLogic>();
builder.Services.AddScoped<ISeatTicketService, SeatTicketGrpcImp>();
builder.Services.AddScoped<ISeatTicketLogic, SeatTicketLogic>();
builder.Services.AddScoped<IAuthLogic, AuthLogic>();
builder.Services.AddScoped<INotificationGrpcService, NotificationGrpcImp>();
builder.Services.AddScoped<INotificationLogic, NotificationLogic>();
builder.Services.AddScoped<IRatingService, RatingGrpcImp>();
builder.Services.AddScoped<IRatingLogic, RatingLogic>();

builder.Services.AddGrpc();


builder.Services.AddSingleton(new UserServices.UserServicesClient(GrpcChannel.ForAddress("http://localhost:8081")));
builder.Services.AddSingleton(new CarServices.CarServicesClient(GrpcChannel.ForAddress("http://localhost:8081")));
builder.Services.AddSingleton(new TripServices.TripServicesClient(GrpcChannel.ForAddress("http://localhost:8081")));
builder.Services.AddSingleton(new TicketServices.TicketServicesClient(GrpcChannel.ForAddress("http://localhost:8081")));
builder.Services.AddSingleton(new NotificationServices.NotificationServicesClient(GrpcChannel.ForAddress("http://localhost:8081")));
builder.Services.AddSingleton(new RatingServices.RatingServicesClient(GrpcChannel.ForAddress("http://localhost:8081")));

builder.Services.AddAuthentication(JwtBearerDefaults.AuthenticationScheme).AddJwtBearer(options =>
{
    options.RequireHttpsMetadata = false;
    options.SaveToken = true;
    options.TokenValidationParameters = new TokenValidationParameters()
    {
        ValidateIssuer = true,
        ValidateAudience = true,
        ValidAudience = builder.Configuration["Jwt:Audience"],
        ValidIssuer = builder.Configuration["Jwt:Issuer"],
        IssuerSigningKey = new SymmetricSecurityKey(Encoding.UTF8.GetBytes(builder.Configuration["Jwt:Key"]))
    };
});

AuthorizationPolicies.AddPolicies(builder.Services);


var app = builder.Build();

app.UseHttpsRedirection();
app.UseAuthentication();
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



app.UseAuthorization();

app.MapControllers();

app.Run();