using Domain.Auth;
using HttpClient.ClientImplementation;
using HttpClient.ClientInterfaces;
using HttpClients.ClientInterface;
using Microsoft.AspNetCore.Components.Authorization;
using Microsoft.AspNetCore.Components.Web;
using Microsoft.AspNetCore.Components.WebAssembly.Hosting;
using Radzen;
using TripShare;
using TripShare.Auth;

var builder = WebAssemblyHostBuilder.CreateDefault(args);
builder.RootComponents.Add<App>("#app");
builder.RootComponents.Add<HeadOutlet>("head::after");
builder.Services.AddScoped(sp => new System.Net.Http.HttpClient { BaseAddress = new Uri("https://localhost:7101") });
builder.Services.AddScoped<IUserClient, UserClientImp>();
builder.Services.AddScoped<ICarClient, HttpCarClient>();
builder.Services.AddScoped<ITripClient, HttpTripClient>();
builder.Services.AddScoped<ISeatTicketClient, HttpSeatTicketClient>();
builder.Services.AddScoped<INotificationClient, HttpNotificationClient>();
builder.Services.AddScoped<IRatingClient, HttpRatingClient>();


builder.Services.AddScoped<IAuthService, JwtAuthService>();
builder.Services.AddScoped<NotificationService>();
builder.Services.AddScoped<AuthenticationStateProvider, CustomAuthProvider>();

AuthorizationPolicies.AddPolicies(builder.Services);
await builder.Build().RunAsync();