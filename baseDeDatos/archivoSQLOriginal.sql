/*Control de Gastos de la cuenta bancaria de Javier*/


create database gastos;
use gastos;







create table gastosGenerales(
id_gastos int(10) primary key auto_increment,
saldo_actual double(9,2),
saldo_utilizado double(9,2), 
saldo_nuevo double(9,2), 
tipo_operacion varchar(200),
fecha_movimiento date)Engine=InnoDB;

insert into gastosGenerales values(null, "63758.19","11366.13", "52892.06","otro","2022-09-13");

/*Describir una tabla para saber que campos tiene*/
desc gastosGenerales;

/*Eliminar una tabla*/
drop database gastos;

/*alterar una base de datos y agregar un nuevo campo*/
alter table gastosGenerales 
add tipo_operacion varchar(300);

/*Crear los procedimientos almacenados*/

/*Insertar un nuevo dato*/
delimiter //
create procedure sp_insertarGastoNuevo(in saldoActual varchar(50), saldoUtilizado varchar(50),
saldoNuevo varchar(50), tipoOperacion varchar(200), fecha date)
begin
insert into gastosgenerales(id_gastos, saldo_actual, saldo_utilizado, saldo_nuevo, tipo_operacion, fecha_movimiento)
values(null, saldoActual, saldoUtilizado, saldoNuevo, tipoOperacion, fecha);
end //
delimiter ;



/*Borrar el procedimiento almacenado*/
drop procedure sp_insertarGastoNuevo

/*Eliminar la tabla*/
drop 

/*Consultar el estatus del gasto*/
delimiter //
create procedure sp_ConsultarGastosTable()
begin 
select id_gastos, saldo_actual, saldo_utilizado, saldo_nuevo, 
tipo_operacion, fecha_movimiento from gastosgenerales;
end //
delimiter ;

/*Eliminando registros*/
delimiter //
create procedure sp_eliminarGasto(in idGastos int(10))
begin
delete from gastosgenerales where id_gastos = idGastos;
ALTER TABLE gastosgenerales AUTO_INCREMENT=1;
end //
delimiter ;

DELETE FROM gastosgenerales  where id_gastos =  26;
ALTER TABLE gastosgenerales AUTO_INCREMENT=1;

SELECT * FROM gastos.gastosgenerales;


call sp_ConsultarGastosTable;

delete from gastosgenerales;

call sp_insertarGastoNuevo("5000","5000", "2000", "Depósito de un cliente", '2022-09-14');

TRUNCATE gastosgenerales;

/*Renumerar la base de datos*/
SET @autoid :=0;
UPDATE gastosgenerales SET id_gastos = @autoid := (@autoid+1);



