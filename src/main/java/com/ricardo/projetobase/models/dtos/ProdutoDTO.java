package com.ricardo.projetobase.models.dtos;

import java.io.Serializable;

public class ProdutoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome;
    private Double valor;

    public ProdutoDTO() {
    }

    public ProdutoDTO(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }


}
