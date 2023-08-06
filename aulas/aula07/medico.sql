create database hospital;

use hospital;

create table medico(crm int primary key, nome varchar(60), especialidade varchar(40));

insert into medico(crm, nome, especialidade) values (123, "Marcio", "Ortopedista");
insert into medico(crm, nome, especialidade) values (456, "Fernanda", "Dermatologista");
insert into medico(crm, nome, especialidade) values (789, "Laura", "Cardiologista");

select * from medico;

update medico set especialidade="Neurologista" where crm=456;

delete from medico where crm=789;