package com.aula.ninjas.Ninja.service;

import org.springframework.stereotype.Service;

@Service
public class NinjaService {

    public String index(String name){
        return name;
    }

    public Boolean teste(Integer num){
        return num > 1;
    }


}
