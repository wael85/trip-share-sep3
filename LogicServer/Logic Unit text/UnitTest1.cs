using Application.GrpcInterfaces;
using Application.Logic;
using Domain.DTOs;
using Domain.Model;
using FakeItEasy;
using gRPCClient.GrpcInterfaces;
using Microsoft.AspNetCore.Mvc;
using WebAPI.Controllers;

namespace Logic_Unit_text;

public class UnitTest1
{
   
    
    //Users Controller
    [Fact]
    public async void CerateUserTest()
    {
        //Arrange
         User user = new User()
        {
            Email = "fake@email.com",
            Password = "password",
            Address = "Vejle",
            DriveLicense = "",
            FirstName = "fake",
            LastName = "itEasy",
            Phone = "12345678"
        };
    
        ReturnedUserDTO  returnedUser = new ReturnedUserDTO()
        {
            Address = user.Address,
            DriveLicense = user.DriveLicense,
            Email = user.Email,
            FirstName = user.FirstName,
            LastName = user.LastName,
            Phone = user.Phone
        };
        var fakedatauser = A.Fake<IUserService>();
        var fakedatacar = A.Fake<ICarService>();
        var logic = new UserLogic(fakedatauser,fakedatacar);
        A.CallTo(() => fakedatauser.CreateAsync(user)).Returns(Task.FromResult(returnedUser));
        var controller = new UsersController(logic);
        
        //Act
        var testeduser = await  controller.CreateAsync(user);
        
        //Assert
        if (testeduser!=null)
        {
            var result = testeduser.Result as CreatedResult;
            var tested = result.Value as ReturnedUserDTO;


            Assert.Equal(user.Email,tested?.Email);
        }
        
    }
    [Fact]
    public async void CreateUserWithEmptyEmail()
    {
        
        //Arrange
        User user = new User()
        {
            Email = "",
            Password = "password",
            Address = "Vejle",
            DriveLicense = "",
            FirstName = "fake",
            LastName = "itEasy",
            Phone = "12345678"
        };
    
        ReturnedUserDTO  returnedUser = new ReturnedUserDTO()
        {
            Address = user.Address,
            DriveLicense = user.DriveLicense,
            Email = user.Email,
            FirstName = user.FirstName,
            LastName = user.LastName,
            Phone = user.Phone
        };
        var fakedatauser = A.Fake<IUserService>();
        var fakedatacar = A.Fake<ICarService>();
        var logic = new UserLogic(fakedatauser,fakedatacar);
        A.CallTo(() => fakedatauser.CreateAsync(user)).Returns(Task.FromResult(returnedUser));
        var controller = new UsersController(logic);
        
        //Act
        var testeduser = await controller.CreateAsync(user);
        //Assert
        var result = testeduser.Result as ObjectResult;
        
        var code = result.StatusCode as int?;


        Assert.Equal(500,code);
        
    }
    [Fact]
    public async void CreateUserWithEmailNotValid()
    {
        
        //Arrange
        User user = new User()
        {
            Email = "fakeemail.com",
            Password = "password",
            Address = "Vejle",
            DriveLicense = "",
            FirstName = "fake",
            LastName = "itEasy",
            Phone = "12345678"
        };
    
        ReturnedUserDTO  returnedUser = new ReturnedUserDTO()
        {
            Address = user.Address,
            DriveLicense = user.DriveLicense,
            Email = user.Email,
            FirstName = user.FirstName,
            LastName = user.LastName,
            Phone = user.Phone
        };
        var fakedatauser = A.Fake<IUserService>();
        var fakedatacar = A.Fake<ICarService>();
        var logic = new UserLogic(fakedatauser,fakedatacar);
        A.CallTo(() => fakedatauser.CreateAsync(user)).Returns(Task.FromResult(returnedUser));
        var controller = new UsersController(logic);
        
        //Act
        
        var testeduser = await controller.CreateAsync(user);
        
        //Assert
        var result = testeduser.Result as ObjectResult;
        
        var code = result.StatusCode.Value;


        Assert.Equal(500,code);
        
    }
    [Fact]
    public async void CreateUserWithEmailNotValid2()
    {
        
        //Arrange
        User user = new User()
        {
            Email = "fake@emailcom",
            Password = "password",
            Address = "Vejle",
            DriveLicense = "",
            FirstName = "fake",
            LastName = "itEasy",
            Phone = "12345678"
        };
    
        ReturnedUserDTO  returnedUser = new ReturnedUserDTO()
        {
            Address = user.Address,
            DriveLicense = user.DriveLicense,
            Email = user.Email,
            FirstName = user.FirstName,
            LastName = user.LastName,
            Phone = user.Phone
        };
        var fakedatauser = A.Fake<IUserService>();
        var fakedatacar = A.Fake<ICarService>();
        var logic = new UserLogic(fakedatauser,fakedatacar);
        A.CallTo(() => fakedatauser.CreateAsync(user)).Returns(Task.FromResult(returnedUser));
        var controller = new UsersController(logic);
        
        //Act
        
        var testeduser = await controller.CreateAsync(user);
        
        //Assert
        var result = testeduser.Result as ObjectResult;
        
        var code = result.StatusCode.Value;


        Assert.Equal(500,code);
        
    }
    [Fact]
    public async void CreateUserWithEmailLessThan3()
    {
        
        //Arrange
        User user = new User()
        {
            Email = "@.",
            Password = "password",
            Address = "Vejle",
            DriveLicense = "",
            FirstName = "fake",
            LastName = "itEasy",
            Phone = "12345678"
        };
    
        ReturnedUserDTO  returnedUser = new ReturnedUserDTO()
        {
            Address = user.Address,
            DriveLicense = user.DriveLicense,
            Email = user.Email,
            FirstName = user.FirstName,
            LastName = user.LastName,
            Phone = user.Phone
        };
        var fakedatauser = A.Fake<IUserService>();
        var fakedatacar = A.Fake<ICarService>();
        var logic = new UserLogic(fakedatauser,fakedatacar);
        A.CallTo(() => fakedatauser.CreateAsync(user)).Returns(Task.FromResult(returnedUser));
        var controller = new UsersController(logic);
        
        //Act
        
        var testeduser = await controller.CreateAsync(user);
        
        //Assert
        var result = testeduser.Result as ObjectResult;
        
        var code = result.StatusCode.Value;


        Assert.Equal(500,code);
        
    }
    [Fact]
    public async void CreateUserEmptyPhone()
    {
        
        //Arrange
        User user = new User()
        {
            Email = "fake@email.com",
            Password = "password",
            Address = "Vejle",
            DriveLicense = "",
            FirstName = "fake",
            LastName = "itEasy",
            Phone = ""
        };
    
        ReturnedUserDTO  returnedUser = new ReturnedUserDTO()
        {
            Address = user.Address,
            DriveLicense = user.DriveLicense,
            Email = user.Email,
            FirstName = user.FirstName,
            LastName = user.LastName,
            Phone = user.Phone
        };
        var fakedatauser = A.Fake<IUserService>();
        var fakedatacar = A.Fake<ICarService>();
        var logic = new UserLogic(fakedatauser,fakedatacar);
        A.CallTo(() => fakedatauser.CreateAsync(user)).Returns(Task.FromResult(returnedUser));
        var controller = new UsersController(logic);
        
        //Act
        
        var testeduser = await controller.CreateAsync(user);
        
        //Assert
        var result = testeduser.Result as ObjectResult;
        
        var code = result.StatusCode.Value;


        Assert.Equal(500,code);
        
    }
    [Fact]
    public async void CreateUserWithPhoneLessThan8()
    {
        
        //Arrange
        User user = new User()
        {
            Email = "fake@email.com",
            Password = "password",
            Address = "Vejle",
            DriveLicense = "",
            FirstName = "fake",
            LastName = "itEasy",
            Phone = "1234567"
        };
    
        ReturnedUserDTO  returnedUser = new ReturnedUserDTO()
        {
            Address = user.Address,
            DriveLicense = user.DriveLicense,
            Email = user.Email,
            FirstName = user.FirstName,
            LastName = user.LastName,
            Phone = user.Phone
        };
        var fakedatauser = A.Fake<IUserService>();
        var fakedatacar = A.Fake<ICarService>();
        var logic = new UserLogic(fakedatauser,fakedatacar);
        A.CallTo(() => fakedatauser.CreateAsync(user)).Returns(Task.FromResult(returnedUser));
        var controller = new UsersController(logic);
        
        //Act
        
        var testeduser = await controller.CreateAsync(user);
        
        //Assert
        var result = testeduser.Result as ObjectResult;
        
        var code = result.StatusCode.Value;


        Assert.Equal(500,code);
        
    }
    [Fact]
    public async void CreateUserWithPhoneMoreThan12()
    {
        
        //Arrange
        User user = new User()
        {
            Email = "fake@email.com",
            Password = "password",
            Address = "Vejle",
            DriveLicense = "",
            FirstName = "fake",
            LastName = "itEasy",
            Phone = "1234567891011"
        };
    
        ReturnedUserDTO  returnedUser = new ReturnedUserDTO()
        {
            Address = user.Address,
            DriveLicense = user.DriveLicense,
            Email = user.Email,
            FirstName = user.FirstName,
            LastName = user.LastName,
            Phone = user.Phone
        };
        var fakedatauser = A.Fake<IUserService>();
        var fakedatacar = A.Fake<ICarService>();
        var logic = new UserLogic(fakedatauser,fakedatacar);
        A.CallTo(() => fakedatauser.CreateAsync(user)).Returns(Task.FromResult(returnedUser));
        var controller = new UsersController(logic);
        
        //Act
        
        var testeduser = await controller.CreateAsync(user);
        
        //Assert
        var result = testeduser.Result as ObjectResult;
        
        var code = result.StatusCode.Value;


        Assert.Equal(500,code);
        
    }
    [Fact]
    public async void CreateUserWithStringPhone()
    {
        
        //Arrange
        User user = new User()
        {
            Email = "fake@email.com",
            Password = "password",
            Address = "Vejle",
            DriveLicense = "",
            FirstName = "fake",
            LastName = "itEasy",
            Phone = "asfasfasf"
        };
    
        ReturnedUserDTO  returnedUser = new ReturnedUserDTO()
        {
            Address = user.Address,
            DriveLicense = user.DriveLicense,
            Email = user.Email,
            FirstName = user.FirstName,
            LastName = user.LastName,
            Phone = user.Phone
        };
        var fakedatauser = A.Fake<IUserService>();
        var fakedatacar = A.Fake<ICarService>();
        var logic = new UserLogic(fakedatauser,fakedatacar);
        A.CallTo(() => fakedatauser.CreateAsync(user)).Returns(Task.FromResult(returnedUser));
        var controller = new UsersController(logic);
        
        //Act
        
        var testeduser = await controller.CreateAsync(user);
        
        //Assert
        var result = testeduser.Result as ObjectResult;
        
        var code = result.StatusCode.Value;


        Assert.Equal(500,code);
        
    }
    [Fact]
    public async void CreateUserWithDrivinngLicense()
    {
        
        //Arrange
        User user = new User()
        {
            Email = "fake@email.com",
            Password = "password",
            Address = "Vejle",
            DriveLicense = "driver",
            FirstName = "fake",
            LastName = "itEasy",
            Phone = "12345678"
        };
    
        ReturnedUserDTO  returnedUser = new ReturnedUserDTO()
        {
            Address = user.Address,
            DriveLicense = user.DriveLicense,
            Email = user.Email,
            FirstName = user.FirstName,
            LastName = user.LastName,
            Phone = user.Phone
        };
        var fakedatauser = A.Fake<IUserService>();
        var fakedatacar = A.Fake<ICarService>();
        var logic = new UserLogic(fakedatauser,fakedatacar);
        A.CallTo(() => fakedatauser.CreateAsync(user)).Returns(Task.FromResult(returnedUser));
        var controller = new UsersController(logic);
        
        //Act
        
        var testeduser = await controller.CreateAsync(user);
        
        //Assert
        var result = testeduser.Result as CreatedResult;
        
        var returned = result.Value as ReturnedUserDTO;


        Assert.Equal(user.DriveLicense,returned?.DriveLicense);
        
    }
    [Fact]
    public async void GetUserById()
    {
        //Arrange
        string email = "email@email.com";

        ReturnedUserDTO userDto = new ReturnedUserDTO()
        {
            Email = email
        };

        var fakedatauser = A.Fake<IUserService>();
        var fakedatacar = A.Fake<ICarService>();
        var logic = new UserLogic(fakedatauser, fakedatacar);
        A.CallTo(() => fakedatauser.GetUserById(email)).Returns(Task.FromResult(userDto));
        var controller = new UsersController(logic);

        //Act
        var testeduser = await controller.GetUserInfoAsync(email);

        //Assert
        if (testeduser != null)
        {
            var result = testeduser.Result as OkObjectResult;
            var tested = result.Value as UserInformationDto;


            Assert.Equal(email, tested?.Email);
        }
    }
    [Fact]
    public async void GetUserByIdNotExist()
    {
        //Arrange
        string email = "email@email.com";

        ReturnedUserDTO userDto = new ReturnedUserDTO()
        {
            Email = email
        };

        var fakedatauser = A.Fake<IUserService>();
        var fakedatacar = A.Fake<ICarService>();
        var logic = new UserLogic(fakedatauser, fakedatacar);
        A.CallTo(() => fakedatauser.GetUserById(email)).Returns(Task.FromResult(new ReturnedUserDTO()));
        var controller = new UsersController(logic);

        //Act
        var testeduser = await controller.GetUserInfoAsync(email);

        //Assert
        if (testeduser != null)
        {
            var result = testeduser.Result as OkObjectResult;
            var tested = result.Value as ReturnedUserDTO;


            Assert.NotEqual(email,tested?.Email);
        }
    }
    //Car controller
    [Fact]
    public async void CreateCarAsync()
    {
        //arrange 
        var request = new BeADriverRequestDto("email@email.com","asfasf","cx34024","red","nissan",4,"benzin");
        Car car1 = new Car("cx34024","red","nissan",4,"benzin");
        var fake = A.Fake<ICarService>();
        var logic = new CarLogic(fake);
        A.CallTo(() => fake.RegisterAsync(request)).Returns(Task.FromResult(car1));

        var carController = new CarsController(logic);
        //Act
        var response=await   carController.CreateAsync(request);
        //assert
        var returend = response.Result as ObjectResult;
        var car = returend.Value as Car;
        Assert.Equal("cx34024",car?.PlateNumber);

    }
    [Fact]
    public async void VerifyMyCar()
    {
        //arrange
        var fake = A.Fake<ICarService>();
        var logic = new CarLogic(fake);
        var carController = new CarsController(logic);
        
        //Act
        var response=await carController.VerifyCar("cx34024");
        
        //assert
        var returend = response.Result as ObjectResult;
        var car = returend.Value as Car;
        Assert.Equal("cx34024",car?.PlateNumber.ToLower());
    }
    [Fact]
    public async void VerifyMyCarWithWrongPlateNumber()
    {
        //arrange
        var fake = A.Fake<ICarService>();
        var logic = new CarLogic(fake);
        var carController = new CarsController(logic);
        
        //Act
        var response=await carController.VerifyCar("ewg1242");
        
        //assert
        var returend = response.Result as ObjectResult;
        var car = returend.Value as Car;
        var code = returend.StatusCode.Value;
        Assert.Equal(500,code);
    }
    [Fact]
    public async void VerifyMyCarWithCompanyCarReturnsError()
    {
        //arrange
        var fake = A.Fake<ICarService>();
        var logic = new CarLogic(fake);
        var carController = new CarsController(logic);
        
        //Act
        var response=await carController.VerifyCar("dc88876");
        
        //assert
        var returend = response.Result as ObjectResult;
        var car = returend.Value as Car;
        var code = returend.StatusCode.Value;
        Assert.Equal(500,code);
    }
    [Fact]
    public async void VerifyMyCarWithEmptyPalteRetunsError()
    {
        //arrange
        var fake = A.Fake<ICarService>();
        var logic = new CarLogic(fake);
        var carController = new CarsController(logic);
        
        //Act
        var response=await carController.VerifyCar("");
        
        //assert
        var returend = response.Result as ObjectResult;
        var car = returend.Value as Car;
        var code = returend.StatusCode.Value;
        Assert.Equal(500,code);
    }

    //Trips Controller
    [Fact]
    public async void CreteTrip()
    {
        Trip re = new Trip()
        {
            AvailableSeats = 3,
            Driver = new ReturnedUserDTO()
            {
                Email = "test@email.com"
            },
            FullPrice = 100.1,
            Passengers = new List<ReturnedUserDTO>(),
            Id = 1,
            Stops = new List<Location>(),
            Tickets = new List<SeatTicket>()
            

        };
        TripCreationDto request = new TripCreationDto()
        {
            DriverId = "test@email.com",
            AvailableSeats = 3,
            FullPrice = 100.1,
            Stops = new List<Location>()
        };
        //Arrange
        var fake = A.Fake<ITripServices>();
        var userfake = A.Fake<IUserService>();
        var logic = new TripLogic(userfake, fake);
        A.CallTo(() => fake.CreateAsync(request)).Returns(Task.FromResult(re));
        var controller = new TripsController(logic);
        
        //Act
        var response = await controller.CreateAsync(request);
        
        //Assert
        var result = response.Result as ObjectResult;
        var returnedTrip = result.Value as Trip;
        
        Assert.Equal(re.Driver.Email,returnedTrip?.Driver.Email);
        Assert.Equal(re.FullPrice,returnedTrip.FullPrice);
    }
    [Fact]
    public async void CreateTowTripForSameDriver()
    {
        Trip re = new Trip()
        {
            AvailableSeats = 3,
            Driver = new ReturnedUserDTO()
            {
                Email = "test@email.com"
            },
            FullPrice = 100.1,
            Passengers = new List<ReturnedUserDTO>(),
            Id = 1,
            Stops = new List<Location>(),
            Tickets = new List<SeatTicket>()
            

        };
        TripCreationDto request = new TripCreationDto()
        {
            DriverId = "test@email.com",
            AvailableSeats = 3,
            FullPrice = 100.1,
            Stops = new List<Location>()
        };
        //Arrange
        var fake = A.Fake<ITripServices>();
        var userfake = A.Fake<IUserService>();
        var logic = new TripLogic(userfake, fake);
        A.CallTo(() => fake.CreateAsync(request)).Returns(Task.FromResult(re));
        var controller = new TripsController(logic);
        
        //Act
        var response = await controller.CreateAsync(request);

        re.FullPrice = 50;
        var rsponse2 = await controller.CreateAsync(request);
        
        //Assert
        var result = response.Result as ObjectResult;
        var returnedTrip = result.Value as Trip;

        var result2 = rsponse2.Result as ObjectResult;
        var returnedTrip2 = result2.Value as Trip;
        
        Assert.Equal(re.Driver.Email,returnedTrip?.Driver.Email);
        Assert.Equal(re.FullPrice,returnedTrip.FullPrice);
        Assert.Equal(re.Driver.Email,returnedTrip2?.Driver.Email);
        Assert.Equal(50,returnedTrip2.FullPrice);
    }

    [Fact]
    public async void GetAllTrips()
    {
        List<Trip> trips = new List<Trip>();
        //Arrange
        Trip re = new Trip()
        {
            AvailableSeats = 3,
            Driver = new ReturnedUserDTO()
            {
                Email = "test@email.com"
            },
            FullPrice = 100.1,
            Passengers = new List<ReturnedUserDTO>(),
            Id = 1,
            Stops = new List<Location>(),
            Tickets = new List<SeatTicket>()
            

        };
        Trip re1 = new Trip()
        {
            AvailableSeats = 3,
            Driver = new ReturnedUserDTO()
            {
                Email = "test1@email.com"
            },
            FullPrice = 50.1,
            Passengers = new List<ReturnedUserDTO>(),
            Id = 2,
            Stops = new List<Location>(),
            Tickets = new List<SeatTicket>()
            

        };
        trips.Add(re);
        trips.Add(re1);
        
        var fake = A.Fake<ITripServices>();
        var userfake = A.Fake<IUserService>();
        var logic = new TripLogic(userfake, fake);
        A.CallTo(() => fake.GetAllTripsAsync()).Returns(Task.FromResult(trips));
        var controller = new TripsController(logic);
        
        //Act 

        var response = await controller.GetAsync(null);
        
        //Assert
        var result = response.Result as ObjectResult;
        var list = result?.Value as List<Trip>;
        Assert.Equal(trips.Count,list?.Count);
        Assert.Equal(trips?.FirstOrDefault().Id,list?.FirstOrDefault().Id);
    }
    [Fact]
    public async void GetAllTripsByEmailHavingOneTrip  ()
    {
        List<Trip> trips = new List<Trip>();
        //Arrange
        Trip re = new Trip()
        {
            AvailableSeats = 3,
            Driver = new ReturnedUserDTO()
            {
                Email = "test@email.com"
            },
            FullPrice = 100.1,
            Passengers = new List<ReturnedUserDTO>(),
            Id = 1,
            Stops = new List<Location>(),
            Tickets = new List<SeatTicket>()
            

        };
        Trip re1 = new Trip()
        {
            AvailableSeats = 3,
            Driver = new ReturnedUserDTO()
            {
                Email = "test1@email.com"
            },
            FullPrice = 50.1,
            Passengers = new List<ReturnedUserDTO>(),
            Id = 2,
            Stops = new List<Location>(),
            Tickets = new List<SeatTicket>()
            

        };
        trips.Add(re);

        var fake = A.Fake<ITripServices>();
        var userfake = A.Fake<IUserService>();
        var logic = new TripLogic(userfake, fake);
        A.CallTo(() => fake.GetTripsByDriverId("test@email.com")).Returns(Task.FromResult(trips));
        var controller = new TripsController(logic);
        
        //Act 

        var response = await controller.GetUsersTripsByEmail("test@email.com");
        
        //Assert
        var result = response.Result as ObjectResult;
        var list = result?.Value as List<Trip>;
        Assert.Equal(trips.Count,list?.Count);
        Assert.Equal(trips?.FirstOrDefault().Id,list?.FirstOrDefault().Id);
    }
    
    [Fact]
    public async void GetAllTripsByEmailHavingMoreOneTrip()
    {
        List<Trip> trips = new List<Trip>();
        //Arrange
        Trip re = new Trip()
        {
            AvailableSeats = 3,
            Driver = new ReturnedUserDTO()
            {
                Email = "test@email.com"
            },
            FullPrice = 100.1,
            Passengers = new List<ReturnedUserDTO>(),
            Id = 1,
            Stops = new List<Location>(),
            Tickets = new List<SeatTicket>()
            

        };
        Trip re1 = new Trip()
        {
            AvailableSeats = 3,
            Driver = new ReturnedUserDTO()
            {
                Email = "test@email.com"
            },
            FullPrice = 50.1,
            Passengers = new List<ReturnedUserDTO>(),
            Id = 2,
            Stops = new List<Location>(),
            Tickets = new List<SeatTicket>()
            

        };
        trips.Add(re);
        trips.Add(re1);

        var fake = A.Fake<ITripServices>();
        var userfake = A.Fake<IUserService>();
        var logic = new TripLogic(userfake, fake);
        A.CallTo(() => fake.GetTripsByDriverId("test@email.com")).Returns(Task.FromResult(trips));
        var controller = new TripsController(logic);
        
        //Act 

        var response = await controller.GetUsersTripsByEmail("test@email.com");
        
        //Assert
        var result = response.Result as ObjectResult;
        var list = result?.Value as List<Trip>;
        Assert.Equal(trips.Count,list?.Count);
        Assert.Equal(trips?.FirstOrDefault().Id,list?.FirstOrDefault().Id);
    }
    
    //SeatTicket Controller
    [Fact]
    public async void CreateSeatTicket()
    {
        //Arrange
        var request = new CreateSeatTicketDto()
        {
            DropLocationId = 2,
            PassengerId = "test@email.com",
            PickUpLocationId = 2,
            SeatAmount = 1,
            SeatPrice = 20,
            TripId = 1
        };
        var res = new SeatTicket()
        {
            DropLocation = new Location()
            {
                Id = 1
            },
            Id = 1,
            Passenger = new User()
            {
                Email = "test@email.com"
            },
            PickUpLocation = new Location()
            {
                Id = 2
            },
            SeatAmount = 3,
            SeatPrice = 200,
            TripId = 1
        };

        var fake = A.Fake<ISeatTicketService>();
        A.CallTo(() => fake.CreateAsync(request)).Returns(Task.FromResult(res));
        var logic = new SeatTicketLogic(fake);
        var controller = new SeatTicketsController(logic);

        //Act
        var response = await controller.CreateAsync(request);

        //Assert
        var result = response.Result as ObjectResult;
        var tiket = result.Value as SeatTicket;
        Assert.Equal(res.Id, tiket?.Id);
    }

    [Fact]
    public async void CreateTowSeatTicketSameTrip()
    {
        //Arrange
        var request = new CreateSeatTicketDto()
        {
            DropLocationId = 2,
            PassengerId = "test@email.com",
            PickUpLocationId = 2,
            SeatAmount = 1,
            SeatPrice = 20,
            TripId = 1
        };
        var res = new SeatTicket()
        {
            DropLocation = new Location()
            {
                Id = 1
            },
            Id = 1,
            Passenger = new User()
            {
                Email = "test@email.com"
            },
            PickUpLocation = new Location()
            {
                Id = 2
            },
            SeatAmount = 3,
            SeatPrice = 200,
            TripId = 1
        };

        var fake = A.Fake<ISeatTicketService>();
        A.CallTo(() => fake.CreateAsync(request)).Returns(Task.FromResult(res));
        var logic = new SeatTicketLogic(fake);
        var controller = new SeatTicketsController(logic);

        //Act
        var response = await controller.CreateAsync(request);
        var response2 = await controller.CreateAsync(request);

        //Assert
        var result = response.Result as ObjectResult;
        var tiket = result.Value as SeatTicket;

        var result2 = response2.Result as ObjectResult;
        var ticket2 = result2.Value as SeatTicket;
        Assert.Equal(res.Id, tiket?.Id);
        Assert.Equal(res.Id, ticket2?.Id);

    }
}