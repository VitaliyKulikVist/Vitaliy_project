package com.Vitaliy_Kulik_java.Vitaliy.model;

import com.Vitaliy_Kulik_java.Vitaliy.VitaliyApplication;
import com.Vitaliy_Kulik_java.Vitaliy.controller.MainController;
import com.Vitaliy_Kulik_java.Vitaliy.controller.Workes_controller;
import com.Vitaliy_Kulik_java.Vitaliy.repository.Workers_Repository;
import com.Vitaliy_Kulik_java.Vitaliy.service.Workers_Service;
import com.Vitaliy_Kulik_java.Vitaliy.service.Workers_Service_Impl;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(MockitoJUnitRunner.class)
class WorkersTest
{
    @Mock
    private Workers_Repository workers_Repository;

    @InjectMocks
    private Workers workers;

    @Test
    void get_Workers_Id()
    {
        Workers get_Workers_Id_t = new Workers(1, "Вася","Пупкін",3,"senior","Рівне обл енерго");
        get_Workers_Id_t.set_Workers_Id(1);//перевірка чи користувач 1 пустий
        //перевірка на пустоту колонки
        Assertions.assertNotEquals(get_Workers_Id_t.get_Workers_Id(),"1");
    }

    @Test
    void set_Workers_Id()
    {
        Workers set_Workers_Id_t = new Workers(1, "Вася","Пупкін",3,"senior","Рівне обл енерго");
        set_Workers_Id_t.set_Workers_Id(1);//перевірка чи користувач 1 пустий
        //перевірка на пустоту колонки
        Assertions.assertNotEquals(set_Workers_Id_t.get_Workers_Id(),"1");
    }

    @Test
    void get_First_Name_Workers()
    {
        Workers get_First_Name_Workers_t = new Workers(1, "Вася","Пупкін",3,"senior","Рівне обл енерго");
        get_First_Name_Workers_t.set_Workers_Id(1);//перевірка чи користувач 1 пустий

        //перевірка на пустоту колонки
        Assertions.assertNotEquals(get_First_Name_Workers_t.get_First_Name_Workers(),"");
    }

    @Test
    void set_First_Name_Workers()
    {
        Workers set_First_Name_Workers_t = new Workers(1, "Вася","Пупкін",3,"senior","Рівне обл енерго");
        set_First_Name_Workers_t.set_Workers_Id(1);//перевірка чи користувач 1 пустий
        set_First_Name_Workers_t.set_First_Name_Workers("Вася");
        //перевірка на пустоту колонки
        Assert.assertNotNull(set_First_Name_Workers_t.get_First_Name_Workers(),"Вася");
    }

    @Test
    void get_Second_Name_Workers()
    {
        Workers get_Second_Name_Workers_t = new Workers(1, "Вася","Пупкін",3,"senior","Рівне обл енерго");
        get_Second_Name_Workers_t.set_Workers_Id(1);//перевірка чи користувач 1 пустий
        //перевірка на пустоту колонки
        Assertions.assertNotEquals(get_Second_Name_Workers_t.get_Second_Name_Workers(),"");
    }

    @Test
    void set_Second_Name_Workers()
    {
        Workers set_Second_Name_Workers_t = new Workers(1, "Вася","Пупкін",3,"senior","Рівне обл енерго");
        set_Second_Name_Workers_t.set_Workers_Id(1);//перевірка чи користувач 1 пустий
        //перевірка на пустоту колонки
        set_Second_Name_Workers_t.set_Second_Name_Workers("Пупкін");
        Assert.assertNotNull(set_Second_Name_Workers_t.get_Second_Name_Workers(),"Пупкін");
    }

    @Test
    void get_Work_Experience_Workers()
    {
        Workers get_Work_Experience_Workers_t = new Workers(1, "Вася","Пупкін",3,"senior","Рівне обл енерго");
        get_Work_Experience_Workers_t.set_Workers_Id(1);//перевірка чи користувач 1 пустий
        //перевірка на пустоту колонки
        //
        get_Work_Experience_Workers_t.set_Work_Experience_Workers(1);
        Assertions.assertNotEquals(get_Work_Experience_Workers_t.get_Work_Experience_Workers("1"),'1');
    }

    @Test
    void set_Work_Experience_Workers()
    {
        Workers set_Work_Experience_Workers_t = new Workers(1, "Вася","Пупкін",3,"senior","Рівне обл енерго");
        set_Work_Experience_Workers_t.set_Workers_Id(1);//перевірка чи користувач 1 пустий
        //перевірка на пустоту колонки
        set_Work_Experience_Workers_t.set_Work_Experience_Workers(2);
        Assert.assertNotNull(set_Work_Experience_Workers_t.get_Work_Experience_Workers("2"),'2');
    }

    @Test
    void get_Position_Workers()
    {
        Workers get_Position_Workers_t = new Workers(1, "Вася","Пупкін",3,"senior","Рівне обл енерго");
        get_Position_Workers_t.set_Workers_Id(1);//перевірка чи користувач 1 пустий
        //перевірка на пустоту колонки
        Assertions.assertNotEquals(get_Position_Workers_t.get_Position_Workers(),"");
    }

    @Test
    void set_Position_Workers()
    {
        Workers set_Position_Workers_t = new Workers(1, "Вася","Пупкін",3,"senior","Рівне обл енерго");
        set_Position_Workers_t.set_Workers_Id(1);//перевірка чи користувач 1 пустий
        //перевірка на пустоту колонки
        //
        set_Position_Workers_t.set_Position_Workers("senior");
        Assert.assertNotNull(set_Position_Workers_t.get_Position_Workers(),"senior");
    }

    @Test
    void get_Сompany_Workers()
    {
        Workers get_Сompany_Workers_t = new Workers(1, "Вася","Пупкін",3,"senior","Рівне обл енерго");
        get_Сompany_Workers_t.set_Workers_Id(1);//перевірка чи користувач 1 пустий
        //перевірка на пустоту колонки
        Assertions.assertNotEquals(get_Сompany_Workers_t.get_Сompany_Workers(),"");
    }

    @Test
    void set_Сompany_Workers()
    {
        Workers set_Сompany_Workers_t = new Workers(1, "Вася","Пупкін",3,"senior","Рівне обл енерго");
        set_Сompany_Workers_t.set_Workers_Id(1);//перевірка чи користувач 1 пустий
        //перевірка на пустоту колонки
        set_Сompany_Workers_t.set_Сompany_Workers("ПАТ");
        Assert.assertNotNull(set_Сompany_Workers_t.get_Сompany_Workers(),"ПАТ");

    }
    @Test
    void to_String()
    {
        Workers to_String_t = new Workers(1, "Вася","Пупкін",3,"senior","Рівне обл енерго");
        to_String_t.set_Сompany_Workers("gggg");
        Assert.assertNotNull(to_String_t.toString());
    }
}