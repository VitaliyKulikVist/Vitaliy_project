package com.Vitaliy_Kulik_java.Vitaliy.controller;

import com.Vitaliy_Kulik_java.Vitaliy.repository.Workers_Repository;
import com.Vitaliy_Kulik_java.Vitaliy.service.Workers_Service_Impl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.ui.Model;
import org.thymeleaf.model.IModel;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(MockitoJUnitRunner.class)
class MainControllerTest
{
    @Mock
    private Workers_Repository workers_Repository;

    @InjectMocks
    private MainController mainController;

    @Test
    void greeting()
    {
        MainController greeting_t = new MainController();
greeting_t.greeting();
if(greeting_t.greeting()==null)
{
    assertAll();
}

    }

    @Test
    void due()
    {
        MainController due_t = new MainController();
        due_t.due();
        if(due_t.due()==null)
        {
            assertAll();
        }
    }

    @Test
    void home()
    {
        MainController home_t = new MainController();
        home_t.home();
        if(home_t.home()==null)
        {
            assertAll();
        }
    }
}