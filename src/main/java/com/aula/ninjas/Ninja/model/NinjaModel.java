package com.aula.ninjas.Ninja.model;

import com.aula.ninjas.Missao.model.MissaoModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

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

    @Setter
    @Getter
    @OneToMany
    private List<MissaoModel> missoes;

    public NinjaModel() {} // NO ARGS CONSTRUCTOR

    public NinjaModel(String nome, int idade, String estilo, String vila, String rank) { // CONSTRUCTOR COM ARGUMENTOS
        this.nome = nome;
        this.idade = idade;
        this.estilo = estilo;
        this.vila = vila;
        this.rank = rank;
    }

}
