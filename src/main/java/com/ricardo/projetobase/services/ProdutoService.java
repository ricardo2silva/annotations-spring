package com.ricardo.projetobase.services;

import com.ricardo.projetobase.models.Produto;
import com.ricardo.projetobase.models.dtos.ProdutoDTO;

import java.util.List;

public interface ProdutoService {
    Produto salvarProduto(ProdutoDTO produtoDTO);
    List<Produto> listar();
}
