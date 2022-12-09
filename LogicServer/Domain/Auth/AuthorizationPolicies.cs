﻿using System.Security.Claims;
using Microsoft.Extensions.DependencyInjection;

namespace Domain.Auth;

public static class AuthorizationPolicies
{
    public static void AddPolicies(IServiceCollection services)
    {
        services.AddAuthorizationCore(options =>
        {

            options.AddPolicy("DriveLicense", a =>
                a.RequireAuthenticatedUser().RequireAssertion(context =>
                {
                    Claim? licenseClaim = context.User.FindFirst(claim => claim.Type.Equals("DriveLicense"));
                    if (string.IsNullOrEmpty(licenseClaim?.Value)) return false;
                    return true;
                }));
        });
    }
}