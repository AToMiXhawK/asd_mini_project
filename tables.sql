create sequence uid
start 1000000
increment 1;


create table users(                                                                    
id int unique default nextval('uid'),
uname varchar(12) primary key,
pwd varchar(12) not null,
u_type varchar(7) not null,
fname varchar(12) not null,
lname varchar(12),
mobile decimal(10),
email varchar(30));

insert into users values(DEFAULT,'admin','admin','admin','Githin','Manesh',7907114233,'githinmanesh@gmail.com');

create sequence cid
start 1000000
increment 1;

create table complaints(
    id int default nextval('cid') primary key,
    uid int not null,
    priority varchar(7) not null,
    status varchar(15),
    content varchar(256) not null,
    location varchar(32),
    category varchar(16),
    remarks varchar(128),
    foreign key (uid) references users(id) 
);

insert into complaints values(Default,1000043,'High','Pending','Test Complaint 1','Kollam','Traffic','Work under Progress');
