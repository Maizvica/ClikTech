package com.example.clicktech;

public class Item {

    String nome;
    String fabricante;
    float valor;
    int id;
    int estoque;

    public Item(String nome, String fabricante, float preço, int id, int estoque) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.valor = preço;
        this.id = id;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
