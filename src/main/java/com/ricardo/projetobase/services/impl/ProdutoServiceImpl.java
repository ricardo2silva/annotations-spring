package com.ricardo.projetobase.services.impl;

import com.ricardo.projetobase.models.Produto;
import com.ricardo.projetobase.models.dtos.ProdutoDTO;
import com.ricardo.projetobase.repositories.ProdutoRepository;
import com.ricardo.projetobase.services.ProdutoService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }
    @Override
    public Produto salvarProduto(ProdutoDTO produtoDTO) {
        return produtoRepository.save(new Produto(produtoDTO.getNome(), produtoDTO.getValor()));
    }

    @Override
    public List<Produto> listar() {
        return produtoRepository.findAll();
    }
}
