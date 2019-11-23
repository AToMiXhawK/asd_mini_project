create sequence uid
start 1000000
increment 1;


create table users(                                                                    
id int default nextval('uid'),
uname varchar(12) primary key,
pwd varchar(12) not null,
u_type varchar(7) not null,
fname varchar(12) not null,
lname varchar(12),
mobile decimal(10),
email varchar(30));

insert into users values(DEFAULT,'admin','admin','admin','Githin','Manesh',7907114233,'githinmanesh@gmail.com');



