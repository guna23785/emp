create database emp_db;

use emp_db;

create table project
(
 id int primary key auto_increment,
 name varchar(200) not null
);


insert into project(name) values('Monkey Project');

update project set name='Telecom' where id=1;

delete from project where id=1;

select id,name from project;
