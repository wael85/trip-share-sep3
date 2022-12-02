-- Create users .
insert into trip_share.user (email, address, drive_license, first_name, last_name, phone)
values ('juan@email.com','Horsens',1234,'juan','matrines',12345678);
insert into trip_share.user (email, address, drive_license, first_name, last_name, phone)
values ('wael@email.com','Horsens',null,'wael','haded',01010101);
insert into trip_share.user (email, address, drive_license, first_name, last_name, phone)
values ('syamend@email.com','Vejle',null,'syamend','mamo',31754601);
insert into trip_share.user (email, address, drive_license, first_name, last_name, phone)
values ('mikkel@email.com','Kolding',8081,'mikkel','hansen',87654321);
insert into trip_share.user (email, address, drive_license, first_name, last_name, phone)
values ('email@email.com','Denmark',1111,'email','eamil',11111111);

--Create trips
insert into trip_share.trip (id, available_seats, full_price, driver_id)
values (1,1,100,'juan@email.com');
insert into trip_share.trip (id, available_seats, full_price, driver_id)
values (2,2,200,'juan@email.com');
insert into trip_share.trip (id, available_seats, full_price, driver_id)
values (3,3,300,'mikkel@email.com');
insert into trip_share.trip (id, available_seats, full_price, driver_id)
values (4,4,400,'email@email.com');


--Create stops for trips
--first trip
insert into trip_share.location (id, street_number, arrival_time, city, post_code, street_name, trip_id)
values (1,1,'2023-12-02 12:11:53.000000','aarhus',8000,'stationgade',1);
insert into trip_share.location (id, street_number, arrival_time, city, post_code, street_name, trip_id)
values (2,12,'2023-12-02 16:11:53.000000','fredricia',6000,'harborgade0',1);

--seconed trip
insert into trip_share.location (id, street_number, arrival_time, city, post_code, street_name, trip_id)
values (3,13,'2022-12-20 12:11:53.000000','Skandaborg',6500,'Schoolgade',2);
insert into trip_share.location (id, street_number, arrival_time, city, post_code, street_name, trip_id)
values (4,14,'2022-12-20 12:31:53.000000','Horsens',7400,'viadage',2);
insert into trip_share.location (id, street_number, arrival_time, city, post_code, street_name, trip_id)
values (5,23,'2022-12-20 13:11:53.000000','Vejle',7100,'fjordgade',2);

--third trip
insert into trip_share.location (id, street_number, arrival_time, city, post_code, street_name, trip_id)
values (6,45,'2022-12-22 12:11:53.000000','Horsens',7400,'viagade',3);
insert into trip_share.location (id, street_number, arrival_time, city, post_code, street_name, trip_id)
values (7,67,'2022-12-22 12:31:53.000000','Vejle',7100,'poolgade',3);
insert into trip_share.location (id, street_number, arrival_time, city, post_code, street_name, trip_id)
values (8,78,'2022-12-22 13:11:53.000000','Kolding',6000,'bankgade',3);
insert into trip_share.location (id, street_number, arrival_time, city, post_code, street_name, trip_id)
values (9,89,'2022-12-02 17:11:53.000000','copenhagen',1000,'queengade',3);


--create Cars
insert into trip_share.car (id, color, fuel_type, model, plate_number, seats_count, fk_drive_license)
values (1,'Blue','dissel','suzuki','ju2020',4,1234);
insert into trip_share.car (id, color, fuel_type, model, plate_number, seats_count, fk_drive_license)
values (2,'white','benzin','BMW','bm2023',2,8081);
insert into trip_share.car (id, color, fuel_type, model, plate_number, seats_count, fk_drive_license)
values (3,'black','EL','Tesla','Ts2018',4,1111);
