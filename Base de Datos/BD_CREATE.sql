CREATE schema ARKONDATA;
use arkondata;

create table alcaldias (id_alcaldia bigint not null auto_increment, alcaldia_status varchar(255), estado varchar(255), nombre varchar(255), primary key (id_alcaldia));


 create table estaciones (id_estacion bigint not null auto_increment, geographic_point varchar(255), position_latitude double precision, position_longitude double precision, id_alcaldia bigint, primary key (id_estacion)) ;

create table vehiculos (id_vehiculo bigint not null auto_increment, vehicle_current_status bigint, vehicle_label bigint, primary key (id_vehiculo));

create table metrobuses (id bigint not null auto_increment, date_updated varchar(255), position_odometer bigint, position_speed bigint, trip_id bigint, trip_route_id bigint, trip_schedule_relationship bigint, trip_start_date bigint, id_estacion bigint, id_vehiculo bigint, primary key (id));



alter table estaciones add constraint FKod40bwim0ix3smxhv5unbjhrw foreign key (id_alcaldia) references alcaldias (id_alcaldia);
alter table metrobuses add constraint FK9ma4673aubesa4embad5ilxmj foreign key (id_estacion) references estaciones (id_estacion);
alter table metrobuses add constraint FK3ie55h199r0otbr368kbf0rv1 foreign key (id_vehiculo) references vehiculos (id_vehiculo);