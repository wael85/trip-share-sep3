using HttpClient.ClientImplementation;
using Microsoft.AspNetCore.Components.Web;
using Microsoft.AspNetCore.Components.WebAssembly.Hosting;
using Radzen;
using TripShare;

var builder = WebAssemblyHostBuilder.CreateDefault(args);
builder.RootComponents.Add<App>("#app");
builder.RootComponents.Add<HeadOutlet>("head::after");

builder.Services.AddScoped(sp => new System.Net.Http.HttpClient { BaseAddress = new Uri("https://localhost:7101") });
builder.Services.AddScoped<IUserClient, UserClientImp>();
builder.Services.AddScoped<ICarClient, HttpCarClient>();
builder.Services.AddScoped<NotificationService>();

await builder.Build().RunAsync();