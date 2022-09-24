create database college_data;
use college_data;
create table pay_list (
	id integer,
    `subject` varchar(10) not null,
    num integer,
    `name` varchar(10) not null,
    primary key(id)
);