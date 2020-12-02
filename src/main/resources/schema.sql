CREATE TABLE Сompany--таблиця Компаній
(
                        Сompany_Id INT PRIMARY KEY,--порядковий номер підприємств
                        Name_Сompany VARCHAR(250),--імя підприємтв
                        Staff_Сompany INTEGER--штаб(кількість працівників)
);
CREATE TABLE Workers--таблиця Працівників
(
                        Workers_Id INT PRIMARY KEY,--Порядковий номер робітника
                        First_Name_Workers VARCHAR(250),--Імя робітника
                        Second_Name_Workers VARCHAR(250),--Прізвище робітника
                        Work_Experience_Workers INTEGER,--Стаж роботи робітника
                        Position_Workers VARCHAR(250),--Посада робітника
                        Сompany_Workers VARCHAR(250)--Компанія роботи
);
CREATE TABLE Position--таблиця Посад
(
                        Position_Id INT PRIMARY KEY,--Порядковий номер Посади
                        Name_Position VARCHAR(250),--Імя Посади
                        Rank_Position VARCHAR(250),--Значимість посади
                        Salary_Position  INTEGER NOT NULL--Заробітна плата Посади
);--senior junior trainee