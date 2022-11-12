create database projetoevolucao;

use projetoevolucao;

create table cliente (
idcliente int (11) primary key not null auto_increment,
cpf varchar(50),
nome varchar(50),
telefone varchar(50),
email varchar(100),
datanascimento date,
sexo char(1),
estadocivil varchar(30),
cidade varchar(50)
);

desc cliente;

create table estoque(
idprod int (11),
produto varchar(50),
quantidade int(11),
pcompra decimal(5,2),
pvenda decimal(5,2)
);

desc estoque;

desc cliente;

insert into cliente values('1','99999999900','daniel','11955054485','daniel@gmail.com','22042001','f','solteiro','sao paulo');

select * from cliente;


create table vendedor(
nome varchar(50),
cpf varchar(50),
telefone varchar(50),
email varchar(50),
datanascimento date,
sexo char(1),
cidade varchar(50),
ativacao date,
desativacao date,
cargo varchar(50),
codigo int primary key auto_increment
);

