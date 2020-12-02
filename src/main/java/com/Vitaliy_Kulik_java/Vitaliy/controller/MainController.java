package com.Vitaliy_Kulik_java.Vitaliy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

@RestController
@RequestMapping(value = "/")
public class MainController
{
    @GetMapping("/")

    public String greeting()
    {
        return "Ви зараз на 1 сторінці Hello";
    }
    @GetMapping("/goAway")
    public String due()
    {
        return "Ви зараз на сторінці goAway";
    }

    @GetMapping("/second")
    public String home()
    {
        return "и зараз на сторінці second";
    }

}
