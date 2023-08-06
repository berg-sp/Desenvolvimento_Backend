create database jogo;

use jogo;

create table heroi(id int, nome varchar(30), ataque int, defesa int, pontos_vida int);
create table inimigo(id int, nome varchar(30), ataque int, defesa int, pontos_vida int);
create table dungeon(id int, nome varchar(30), ataque int, defesa int, pontos_vida int);
    
create table mascote(id int auto_increment primary key, nome varchar(30), id_heroi int, foreign key (id_heroi) references heroi(id));
    
alter table heroi add primary key(id);
alter table heroi modify column id int auto_increment primary key;

describe heroi;

select * from heroi;

insert into heroi(id, nome, ataque, defesa, pontos_vida) values ('1', 'Lyn', '10', '7', '25');
insert into heroi(id, nome, ataque, defesa, pontos_vida) values ('2', 'Elywood', '8', '12', '25');
insert into heroi(id, nome, ataque, defesa, pontos_vida) values ('3', 'Marcus', '15', '16', '32');
insert into heroi(nome, ataque, defesa, pontos_vida) values ('Dorcas', '18', '15', '27');

delete from heroi where id=4 limit 1;

