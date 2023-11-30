package com.ricardo.projetobase.services.impl;

import com.ricardo.projetobase.models.Produto;
import com.ricardo.projetobase.models.dtos.ProdutoDTO;
import com.ricardo.projetobase.services.ProdutoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl2 implements ProdutoService {
    @Override
    public Produto salvarProduto(ProdutoDTO produtoDTO) {
        return null;
    }

    @Override
    public List<Produto> listar() {
        return null;
    }
}
