package com.nzofoli.spring.produtosapi.controller;

import com.nzofoli.spring.produtosapi.model.Produto;
import com.nzofoli.spring.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    // RequestBody permite injetar um JSON e transformar no obj produto
    public Produto salvarProduto(@RequestBody Produto produto) {
        System.out.println("Salvando produto: " + produto);
        var id = UUID.randomUUID().toString();
        produto.setId(id);
        produtoRepository.save(produto);
        return produto;
    }
}
