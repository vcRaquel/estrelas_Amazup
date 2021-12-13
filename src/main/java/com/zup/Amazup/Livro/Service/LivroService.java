package com.zup.Amazup.Livro.Service;

import com.zup.Amazup.Livro.Repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {
    @Autowired
    LivroRepository livroRepository;

}
