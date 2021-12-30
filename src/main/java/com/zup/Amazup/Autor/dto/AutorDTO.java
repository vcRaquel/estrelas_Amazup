package com.zup.Amazup.Autor.dto;

import java.net.URI;

public class AutorDTO {

    public URI uri;
    public String nome;

    public URI getUri() {
        return uri;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
