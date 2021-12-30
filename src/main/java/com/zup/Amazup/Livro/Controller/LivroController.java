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

        //atribuir a uma variável do tipo URI a construção de uma URI feita com o construtor
        //(a classe URIConstrutor criada)
        URI enderecoVitrini = construtor.criarURI(";livros", "" + livro.getId());

        HashMap<String, URI> resposta = new HashMap<>();
        resposta.put("vitrine", enderecoVitrini);
        return resposta;
    }

}
