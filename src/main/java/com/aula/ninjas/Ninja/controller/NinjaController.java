package com.aula.ninjas.Ninja.controller;

import com.aula.ninjas.Ninja.service.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




/* APIs REST POSSUEM 2 ESTADOS:
 * STATELESS -> ESTADO NÃO É MANTIDOSEMPRE QUE O FOR FEITA UMA NOVA REQUISIÇÃO, SERÁ NECESSÁRIO ENVIAR UM TOKEN DE AUTENTICAÇÃO OU DADOS DE LOGIN, POR EXEMPLO.
 * STATEFULL -> ESTADO É MANTIDO, USUÁRIO JÁ FICA LOGADO, E TOKEN DE AUTENTICAÇÃO JÁ FICA ATIVO E APENAS É RENOVADO PARA ENVIO DA REQUISIÇÃO.
 * */
@RestController //anotação para indicar que a classe é um controlador e REST, para retornar resposta HTTP com Json, misturando @Controller e @RequestBody
@RequestMapping("/ninjas-v1")
public class NinjaController {

    @Autowired
    private NinjaService NinjaService;

}
