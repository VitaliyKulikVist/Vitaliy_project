package com.Vitaliy_Kulik_java.Vitaliy.controller;

import com.Vitaliy_Kulik_java.Vitaliy.VitaliyApplication;
import com.Vitaliy_Kulik_java.Vitaliy.model.Workers;
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

import java.util.List;

import static org.mockito.ArgumentMatchers.any;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.notNull;

@RunWith(MockitoJUnitRunner.class)
class Workes_controllerTest
{
@Mock
private Workers_Repository workers_repository;

@Mock
private Workers workers;

    @Mock
    private Workers_Service workers_service;

@InjectMocks
private Workes_controller workes_controller;


    @Test
    public void get_All()
    {
        Workes_controller get_All_t = new Workes_controller();
//        get_All_t.get_Workers(1);
//        get_All_t.get_All();



//        Assert.assertNotNull(get_All_t.get_All());
//        Assert.assertNotEquals(get_All_t.get_All()," ");
//        Assert.assertNull(get_All_t.get_All());
//
//        Assertions.assertNotNull(get_All_t.get_All());
//        Assertions.assertNotEquals(get_All_t.get_All()," ");
//        Assertions.assertNull(get_All_t.get_All());


//        Workes_controller get_All_t = new Workes_controller();
//        get_All_t.get_All();
//        if (get_All_t.get_All() == null)
//        {
//              assertAll();
//              Assertions.assertNotEquals(records_get_all,null);
//              Assert.assertNotNull(records_get_all.get(1));
//        }
    }

    @Test
    public void get_Workers()
    {
        Workes_controller get_Workers_t = new Workes_controller();
        Assertions.assertNotNull(get_Workers_t);


    }

    @Test
    public void create_Workers()
    {
        Workes_controller create_Workers_t = new Workes_controller();
        Assertions.assertNotNull(create_Workers_t);
    }

    @Test
    public void update_Workers()
    {
        Workes_controller update_Workers_t = new Workes_controller();
        Assertions.assertNotNull(update_Workers_t);
    }

    @Test
    public void delete_Workers()
    {
        Workes_controller delete_Workers_t = new Workes_controller();
        Assertions.assertNotNull(delete_Workers_t);
    }
}