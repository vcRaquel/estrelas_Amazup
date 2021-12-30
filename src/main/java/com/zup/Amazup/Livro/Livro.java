package com.zup.Amazup.Livro;

import com.zup.Amazup.Autor.Autor;
import com.zup.Amazup.Livro.enuns.Genero;

import javax.persistence.*;

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    @ManyToOne
    private Autor autor;
    private double preco;
    private Genero genero;

}
