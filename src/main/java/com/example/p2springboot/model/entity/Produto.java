package com.example.p2springboot.model.entity;

public class Produto {

    private Integer id;
    private String nome;
    private String imagemUrl;
    private Float oldPrice;
    private Float price;
    private String descricao;
    private Integer parcela_id;
    private Parcela parcela;

    public Integer getId() { return id; }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }

    public Float getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(Float oldPrice) {
        this.oldPrice = oldPrice;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getParcela_id() {
        return parcela_id;
    }

    public void setParcela_id(Integer parcela_id) {
        this.parcela_id = parcela_id;
    }

    public Parcela getParcela() {
        return parcela;
    }

    public void setParcela(Parcela parcela) {
        this.parcela = parcela;
    }
}
