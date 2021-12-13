package com.zup.Amazup.Livro;

import com.zup.Amazup.Autor.Autor;
import com.zup.Amazup.Livro.enuns.Genero;

import javax.persistence.Entity;

@Entity
public class Livro {
    private String nome;
    private Autor autor;
    private double preco;
    private Genero genero;

}
