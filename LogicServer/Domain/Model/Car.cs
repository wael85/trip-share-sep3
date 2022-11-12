
using System.Dynamic;
using System.Net;
using System.Reflection;
using System.Runtime.CompilerServices;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Domain.Model;

public class Car
{
    
    [JsonPropertyName("registration_number")]
    public string PlateNumber { get; set; }
    [JsonPropertyName("color")]
    public string Color { get; set; }
    [JsonPropertyName("model")]
    public string CarModel { get; set; }
    [JsonPropertyName("seats")]
    public int SeatsCount { get; set; }
    [JsonPropertyName("fuel_type")]
    public string FuelType { get; set; }

    public Car( string plateNumber, string color, string carModel, int seatsCount, string fuelType)
    {
        
        PlateNumber = plateNumber;
        Color = color;
        CarModel = carModel;
        SeatsCount = seatsCount;
        FuelType = fuelType;
    }

    public Car(string plateNumber)
    {
        string uri = "https://v1.motorapi.dk/vehicles/" + plateNumber;
        HttpRequestMessage message = new HttpRequestMessage(HttpMethod.Get, uri);
        message.Headers.Add("X-AUTH-TOKEN", "94q3bcoadj87txms4efmsw0q4w6dqzfe");
        HttpClient client = new HttpClient();
        HttpResponseMessage resMsg = client.SendAsync(message).Result;
        if (resMsg.StatusCode == HttpStatusCode.NotFound)
        {
            throw new Exception("The car not exist or it is company car ");
        }
        var json = resMsg.Content.ReadAsStringAsync();
        var obj = JsonSerializer.Deserialize<Root>(json.Result);
        Color = obj.color;
        PlateNumber = obj.registration_number;
        SeatsCount = obj.seats;
        FuelType = obj.fuel_type;
        CarModel = obj.make + " " + obj.model;
    }

    public class MotInfo
    {
        public string type { get; set; }
        public string date { get; set; }
        public string result { get; set; }
        public string status { get; set; }
        public string status_date { get; set; }
        public int mileage { get; set; }
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
        public int cerb_weight { get; set; }
        public int total_weight { get; set; }
        public int axels { get; set; }
        public int pulling_axels { get; set; }
        public int seats { get; set; }
        public bool coupling { get; set; }
        public int trailer_maxweight_nobrakes { get; set; }
        public int trailer_maxweight_withbrakes { get; set; }
        public int doors { get; set; }
        public string make { get; set; }
        public string model { get; set; }
        public string variant { get; set; }
        public string model_type { get; set; }
        public int model_year { get; set; }
        public string color { get; set; }
        public string chassis_type { get; set; }
        public int engine_cylinders { get; set; }
        public int engine_volume { get; set; }
        public int engine_power { get; set; }
        public string fuel_type { get; set; }
        public string registration_zipcode { get; set; }
        public long vehicle_id { get; set; }
        public MotInfo mot_info { get; set; }
        public bool is_leasing { get; set; }
        public object leasing_from { get; set; }
        public object leasing_to { get; set; }
    }

      
    }
    