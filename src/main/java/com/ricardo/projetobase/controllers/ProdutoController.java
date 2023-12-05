package com.ricardo.projetobase.controllers;

import com.ricardo.projetobase.beans.CustomProperties;
import com.ricardo.projetobase.beans.LazyBean;
import com.ricardo.projetobase.beans.MyBean;
import com.ricardo.projetobase.config.ConfigurationPropertiesExemplo;
import com.ricardo.projetobase.config.CustomPropertiesConfig;
import com.ricardo.projetobase.models.Produto;
import com.ricardo.projetobase.models.dtos.ProdutoDTO;
import com.ricardo.projetobase.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@Component
@RequestMapping("/produtos")
@Scope("prototype")
@PropertySource("classpath:custom.properties")
public class ProdutoController {

    @Value("${teste.value}")
    private String valorDaPropriedade;

    @Value("${message}")
    private String message;

    @Autowired
    private CustomProperties customProperties;

    @Autowired
    //@Qualifier("produtoServiceImpl")
    private  ProdutoService produtoService;

    @Autowired
    private ConfigurationPropertiesExemplo config;

    @Autowired
    private MyBean myBean;
    @Autowired
    private LazyBean lazyBean;

    public ProdutoController() {
        System.out.println("controller iniciado");
    }

    @PostMapping("/salvarProduto")
    public ResponseEntity<Produto> salvarProduto(@RequestBody ProdutoDTO produtoDTO) {
        return ResponseEntity.ok().body(produtoService.salvarProduto(produtoDTO));
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Produto>> listarTodosProdutos() {
        myBean.testandoBean();
        System.out.println("testando o value:" + valorDaPropriedade);
        System.out.println(message);
        customProperties.impimir();
        System.out.println(config.getNumero());
        return ResponseEntity.ok().body(produtoService.listar());
    }
}
