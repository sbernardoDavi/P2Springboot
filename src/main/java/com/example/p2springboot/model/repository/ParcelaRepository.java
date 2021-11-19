package com.example.p2springboot.model.repository;
import com.example.p2springboot.model.entity.Parcela;
import org.springframework.jdbc.core.JdbcTemplate;

public class ParcelaRepository {

    private JdbcTemplate jdbcTemplate;

    public ParcelaRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Parcela procurarParcela(int id) {
        String sql = "select * from parcela where id = ?";

        return jdbcTemplate.queryForObject(sql, new ParcelaMapper(), id);
    }
}
