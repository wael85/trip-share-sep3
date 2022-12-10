using System.Net;
using System.Text.Json;
using Application.GrpcInterfaces;
using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Model;

namespace Application.Logic;

public class CarLogic:ICarLogic
{
    private readonly ICarService _service;
    

    public CarLogic(ICarService service)
    {
        _service = service;
    }

    public async Task<Car> RegisterAsync(BeADriverRequestDto dto)
    {
        var response = await _service.RegisterAsync(dto);

        return response;
    }

    public async Task<Car?> VerifyCar(string plateNumber)
    {
        try
        {
            Car? car = await GetCarDetailsByPlateNumber(plateNumber);
            return await Task.FromResult(car);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw new Exception(e.Message);
        }
    }

    public async Task<Car?> GetCarDetailsByPlateNumber(String plateNumber)
    {
        string uri = "https://v1.motorapi.dk/vehicles/" + plateNumber;
        HttpRequestMessage message = new HttpRequestMessage(HttpMethod.Get, uri);
        message.Headers.Add("X-AUTH-TOKEN", "94q3bcoadj87txms4efmsw0q4w6dqzfe");
        HttpClient client = new HttpClient();
        HttpResponseMessage resMsg =  client.SendAsync(message).Result;
        if (resMsg.StatusCode == HttpStatusCode.NotFound)
        {
            throw new Exception("The car not exist or it is company car ");
        }
        var json =  resMsg.Content.ReadAsStringAsync();
        var obj = JsonSerializer.Deserialize<Root>(json.Result);
        string carModel = obj.make + " " + obj.model;

        Car exists = new Car(obj.registration_number, obj.color, carModel, obj.seats, obj.fuel_type);
        return await Task.FromResult(exists);

    }

   
}
public class MotInfo
{
    public string type { get; set; }
    public string date { get; set; }
    public string result { get; set; }
    public string status { get; set; }
    public string status_date { get; set; }
    public int? mileage { get; set; }
}

public class Root
{
    public string registration_number { get; set; }
    public string status { get; set; }
    public DateTime status_date { get; set; }
    public string type { get; set; }
    public string use { get; set; }
    public string first_registration { get; set; }
    public string vin { get; set; }
    public object own_weight { get; set; }
    public int? cerb_weight { get; set; }
    public int? total_weight { get; set; }
    public int? axels { get; set; }
    public int? pulling_axels { get; set; }
    public int? seats { get; set; }
    public bool coupling { get; set; }
    public int? trailer_maxweight_nobrakes { get; set; }
    public int? trailer_maxweight_withbrakes { get; set; }
    public int? doors { get; set; }
    public string make { get; set; }
    public string model { get; set; }
    public string variant { get; set; }
    public string model_type { get; set; }
    public int? model_year { get; set; }
    public string color { get; set; }
    public string chassis_type { get; set; }
    public int? engine_cylinders { get; set; }
    public int? engine_volume { get; set; }
    public int? engine_power { get; set; }
    public string fuel_type { get; set; }
    public string registration_zipcode { get; set; }
    public long? vehicle_id { get; set; }
    public MotInfo mot_info { get; set; }
    public bool is_leasing { get; set; }
    public object leasing_from { get; set; }
    public object leasing_to { get; set; }
}
