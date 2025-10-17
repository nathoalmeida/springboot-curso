package com.nzofoli.spring.produtosapi.controller;

import com.nzofoli.spring.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @PostMapping
    public Produto salvarProduto(@RequestBody Produto produto) {
        System.out.println("Salvando produto: " + produto);
        return produto;
    }
}
