package com.example.p2springboot.model.repository;

import com.example.p2springboot.model.entity.Produto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoMapper implements RowMapper<Produto>{

    @Override
    public Produto mapRow(ResultSet resultSet, int i) throws SQLException {
        Produto produto = new Produto();
        produto.setId(resultSet.getInt("id"));
        produto.setNome(resultSet.getString("nome"));
        produto.setImagemUrl(resultSet.getString("imagemUrl"));
        produto.setOldPrice(resultSet.getFloat("oldPrice"));
        produto.setPrice(resultSet.getFloat("price"));
        produto.setDescricao(resultSet.getString("descricao"));
        produto.setParcela_id(resultSet.getInt("parcela_id"));

        return produto;
    }
}
