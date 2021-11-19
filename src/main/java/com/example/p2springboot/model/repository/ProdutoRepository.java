package com.example.p2springboot.model.repository;


import com.example.p2springboot.model.entity.Parcela;
import com.example.p2springboot.model.entity.Produto;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ProdutoRepository {

    private JdbcTemplate jdbcTemplate;
    private ParcelaRepository parcelaRepository;

    public ProdutoRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
        this.parcelaRepository = new ParcelaRepository(jdbcTemplate);
    }

    public List<Produto> buscarTodosProdutos() {
        String sql = "select * from produto";

        List<Produto> listarProdutos = jdbcTemplate.query(
                sql, new ProdutoMapper());

        listarProdutos.forEach(produto -> {
            Parcela parcela = parcelaRepository.procurarParcela(produto.getParcela_id());
            produto.setParcela(parcela);
        });

        return listarProdutos;
    }
}
