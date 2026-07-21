package com.aula.ninjas.service;

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
