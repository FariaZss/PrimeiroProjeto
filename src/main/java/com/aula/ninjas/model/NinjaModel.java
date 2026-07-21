package com.aula.ninjas.model;

import jakarta.persistence.*;
import jdk.jfr.Name;
import lombok.Getter;
import lombok.Setter;

@Entity //TRANSFORMA A CLASSE EM ENTIDADE NO BANCO DE DADOS - CRIA TABELA
@Table(name = "tb_cadastro") //ANOTAÇÃO DE CRIAÇÃO DE TABELA E DEFININDO UM NOME
public class NinjaModel {

    @Id //DEFINE QUE O ATRIBUTO SERÁ O ID DA TABELA
    @GeneratedValue (strategy = GenerationType.IDENTITY) //PASSA UMA ESTRATÉGIA DE COMO SERÁ GERADO O VALOR (INCREMENTANDO)
    private Long id;

    @Setter
    @Getter
    private String nome;
    @Setter
    @Getter
    private int idade;
    @Setter
    @Getter
    private String estilo;
    @Setter
    @Getter
    private String vila;
    @Getter
    @Setter
    private String rank;

    public NinjaModel() {} // NO ARGS CONSTRUCTOR

    public NinjaModel(String nome, int idade, String estilo, String vila, String rank) { // CONSTRUCTOR COM ARGUMENTOS
        this.nome = nome;
        this.idade = idade;
        this.estilo = estilo;
        this.vila = vila;
        this.rank = rank;
    }

}
