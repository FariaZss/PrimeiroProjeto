package com.aula.ninjas.Missao.controller;

import com.aula.ninjas.Missao.service.MissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/missao-v1")
public class MissaoController {

    @Autowired
    private MissaoService missaoService;

}
