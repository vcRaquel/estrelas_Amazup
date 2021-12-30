package com.zup.Amazup.Livro.Controller;

import com.zup.Amazup.Componentes.URIConstrutor;
import com.zup.Amazup.Livro.Livro;
import com.zup.Amazup.Livro.Service.LivroService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.HashMap;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;
    @Autowired
    private URIConstrutor construtor;
    @Autowired
    ModelMapper modelMapper;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public HashMap<String, URI> cadastrarLivro(@RequestBody @Valid Livro livro){
        Livro livroObjeto = livroService.salvarLivro(livro);

        //atribuir a uma variável do tipo URI a construção de uma URI feita com o UriComponentsBuilder
        //que irá criar uma nova instância de URI (newInstance()), definir seu protocolo (scheme("http")),
        //seu hospedeiro (host("localhost")), sua porta (port(8080)), seu caminho (path("/livros/{id}"))
        URI enderecoVitrini = UriComponentsBuilder.newInstance()
                .scheme("http").host("localhost").port(8080)
                //para atribuir o valor do id do objeto à variable do path,
                // usamos o buildAndExpand passando como parâmetro o que será acrescentado à URI construída
                .path("/livros/{id}").buildAndExpand(livro.getId()).toUri();

        HashMap<String, URI> resposta = new HashMap<>();
        resposta.put("vitrine", enderecoVitrini);
        return resposta;
    }

}
