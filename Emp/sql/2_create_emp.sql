create table emp
(
 id bigint primary key auto_increment,
 name varchar(200) not null,
 location varchar(200) not null,
 project_id bigint not null,
 course_id bigint not null,
 constraint fk_project_id foreign key (project_id) references project(id) 
);

insert into emp(name,location,project_id,course_id) values('Guna','Chennai',1,1);

select id,name,location,project_id from emp;


ALTER TABLE emp 
    ADD CONSTRAINT fk_course_id
    FOREIGN KEY(course_id)
    REFERENCES course(ID)