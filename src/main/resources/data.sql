insert into user_details(id,birth_date,name)
values(10001, current_date(), 'Will');

insert into user_details(id,birth_date,name)
values(10002, current_date(), 'Tom');

insert into post(id,description,user_id)
values(2001, 'I want to learn Aws', 10001);

insert into post(id,description,user_id)
values(2002, 'I want to learn Python', 10001);

insert into post(id,description,user_id)
values(2003, 'I want to learn Devops', 10002);