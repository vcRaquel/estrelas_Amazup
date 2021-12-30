package com.zup.Amazup.Livro.dto;

import com.zup.Amazup.Autor.Autor;
import com.zup.Amazup.Autor.dto.AutorURI_DTO;
import com.zup.Amazup.Livro.enuns.Genero;

public class LivroDTO {

    private int id;
    private String nome;
    private AutorURI_DTO autor;
    private double preco;
    private Genero genero;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AutorURI_DTO getAutor() {
        return autor;
    }

    public void setAutor(AutorURI_DTO autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
