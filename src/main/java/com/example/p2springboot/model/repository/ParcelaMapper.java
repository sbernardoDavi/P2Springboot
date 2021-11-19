package com.example.p2springboot.model.repository;

import com.example.p2springboot.model.entity.Parcela;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ParcelaMapper implements RowMapper<Parcela>{

    @Override
    public Parcela mapRow(ResultSet resultSet, int i) throws SQLException {
        Parcela parcela = new Parcela();
        parcela.setId(resultSet.getInt("id"));
        parcela.setNumParcelas(resultSet.getInt("numParcelas"));
        parcela.setValue(resultSet.getFloat("value"));

        return parcela;

    }
}
