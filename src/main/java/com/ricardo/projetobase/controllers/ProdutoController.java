package com.ricardo.projetobase.controllers;

import com.ricardo.projetobase.models.Produto;
import com.ricardo.projetobase.models.dtos.ProdutoDTO;
import com.ricardo.projetobase.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@Component
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    @Qualifier("produtoServiceImpl")
    private  ProdutoService produtoService;

    @PostMapping("/salvarProduto")
    public ResponseEntity<Produto> salvarProduto(@RequestBody ProdutoDTO produtoDTO) {
        return ResponseEntity.ok().body(produtoService.salvarProduto(produtoDTO));
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Produto>> listarTodosProdutos() {
        return ResponseEntity.ok().body(produtoService.listar());
    }
}
