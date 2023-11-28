package com.ricardo.projetobase.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_produto")
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

    public Produto(Long id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
}
