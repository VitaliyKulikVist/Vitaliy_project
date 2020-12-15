insert into Сompany (Сompany_Id, Name_Сompany,Staff_Сompany)
values (1, 'ПАТ Рівне обл енерго ',2);
insert into Сompany (Сompany_Id, Name_Сompany,Staff_Сompany)
values (2, 'ЗТП Рівне Газ',2);
insert into Сompany (Сompany_Id, Name_Сompany,Staff_Сompany)
values (3, 'ФОП Vist_inc',1);

insert into Workers (Workers_Id,First_Name_Workers,Second_Name_Workers,Work_Experience_Workers,Position_Workers,Сompany_Workers)
values (1, 'Вася','Пупкін',3,'senior','ПАТ Рівне обл енерго ');
insert into Workers (Workers_Id,First_Name_Workers,Second_Name_Workers,Work_Experience_Workers,Position_Workers,Сompany_Workers)
values (2, 'Микола','Зубкін',2,'junior','ПАТ Рівне обл енерго ');
insert into Workers (Workers_Id,First_Name_Workers,Second_Name_Workers,Work_Experience_Workers,Position_Workers,Сompany_Workers)
values (3, 'Іра','Загубкіна',1,'trainee','ЗТП Рівне Газ');
insert into Workers (Workers_Id,First_Name_Workers,Second_Name_Workers,Work_Experience_Workers,Position_Workers,Сompany_Workers)
values (4, 'Настя','Дубдубкіна',3,'senior','ЗТП Рівне Газ');
insert into Workers (Workers_Id,First_Name_Workers,Second_Name_Workers,Work_Experience_Workers,Position_Workers,Сompany_Workers)
values (5, 'Вітя','Мордапупкін',2,'junior','ФОП Vist_inc');

insert into Position (Position_Id ,Name_Position,Rank_Position,Salary_Position)
values (1, 'Team Lid','senior',5000);
insert into Position (Position_Id ,Name_Position,Rank_Position,Salary_Position)
values (2, 'Job_ovec','junior',3000);
insert into Position (Position_Id ,Name_Position,Rank_Position,Salary_Position)
values (3, 'Rab','trainee',1000);

//select * from Company where Сompany_Id = 5