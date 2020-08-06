# Criação de uma nova base de dados

create database empresa;
use empresa;
create table departamento(
idDepto int not null auto_increment,
nomeDepto varchar(50),
andarDepto smallint,
constraint pk_departamento primary key (idDepto)
);
create table funcionario(
idFunc int not null auto_increment,
nomeFunc varchar(100) not null,
email varchar(80),
sexo enum("M","F") not null,
dataAdm date,
salario float,
idDepto int,
constraint pk_funcionario primary key (idFunc),
constraint fk_funcionario_departamento foreign key (idDepto) references departamento(idDepto)
);
create table projeto(
idProj int not null auto_increment,
titulo varchar(40),
constraint pk_projeto primary key (idProj)
);
create table projFunc(
idFunc int not null,
idProj int not null,
constraint pk_projFunc primary key (idFunc, idProj),
constraint fk_func_projFunc foreign key (idFunc) references funcionario(idFunc),
constraint fk_proj_projFunc foreign key (idProj) references projeto(idProj)
);
insert into departamento values (null,'Engenharia',15);
insert into departamento values (null,'TI',14);
insert into departamento values (null,'Financeiro',13);
insert into departamento values (null,'Compras',1);
insert into funcionario values (null,'Ana Almeida','ana@empresa.com','F','2020-07-30',5000,1);
insert into funcionario values (null,'Beto Barbosa','beto@empresa.com','M','2020-07-15',4500,2);
insert into funcionario values (null,'Claudia Cardoso','claudia@empresa.com','F','2018-05-20',10000,1);
insert into funcionario values (null,'Diego Drumond','diego@empresa.com','M','2019-12-15',7000,4);
insert into funcionario values (null,'Elvis Ego','elvis@empresa.com','M','2020-01-30',5000,5);
insert into projeto values (null, 'Nova rodovia SP');
insert into projeto values (null, 'Novo viaduto PR');
insert into projeto value (null, 'Reforma Ponte SP');
insert into projfunc values (1,1);
insert into projfunc values (2,1);
insert into projfunc values (1,2);
insert into projfunc values (1,3);
insert into projfunc values (3,3);

