package com.example.p2springboot.controller;

import com.example.p2springboot.model.entity.Produto;
import com.example.p2springboot.model.repository.ProdutoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(JdbcTemplate jdbcTemplate) {

        produtoRepository = new ProdutoRepository(jdbcTemplate);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Produto> buscarTodosProdutos(){
        return produtoRepository.buscarTodosProdutos();
    }
}
