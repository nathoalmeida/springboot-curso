package com.nzofoli.spring.produtosapi.repository;

import com.nzofoli.spring.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// Interface para encapsular as operações de persistência da classe Produto
public interface ProdutoRepository extends JpaRepository<Produto, String> {

    List<Produto> findByNome(String nome);

}
