package com.zup.Amazup.Livro.Service;

import com.zup.Amazup.Livro.Livro;
import com.zup.Amazup.Livro.Repository.LivroRepository;
import com.zup.Amazup.Livro.customExceptions.LivroJaCadastradoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    public Livro salvarLivro(Livro livro){
        if (livroRepository.existsByNomeAndAutorId(livro.getNome(), livro.getAutor().getId())) {
            throw new LivroJaCadastradoException();
        }
        Livro livroObjeto = livroRepository.save(livro);

        return livroObjeto;
    }

}
