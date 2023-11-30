package com.ricardo.projetobase.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_produto")
@Data
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identificador")
    private Long id;
    @Column(name="nome_produto")
    private String nome;
    @Column(name="valor_produto")
    private Double preco;
    public Produto(){}

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}
