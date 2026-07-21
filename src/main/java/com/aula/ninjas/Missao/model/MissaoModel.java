package com.aula.ninjas.Missao.model;

import com.aula.ninjas.Ninja.model.NinjaModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "tb_missao")
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter
    @Setter
    private String nome;
    @Getter
    @Setter
    private String rank;
    @Getter
    @Setter
    @ManyToOne
    private List<NinjaModel> ninjas;


    public MissaoModel() {
    }

    public MissaoModel(Long id, String nome, String rank, List<NinjaModel> ninjas) {
        this.id = id;
        this.nome = nome;
        this.rank = rank;
        this.ninjas = ninjas;
    }

}
