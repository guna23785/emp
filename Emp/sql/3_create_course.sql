create table course
(
 id bigint primary key auto_increment,
 name varchar(200) not null
);

insert into course(name) values('java');