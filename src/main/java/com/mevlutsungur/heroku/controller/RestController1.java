package com.mevlutsungur.heroku.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RestController1 {

    @RequestMapping("hello/{ad}")
    public String  metod(@PathVariable String ad) {
        return "Hello " + ad;
    }
}
