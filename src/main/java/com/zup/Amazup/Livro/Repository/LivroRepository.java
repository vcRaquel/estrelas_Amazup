package com.zup.Amazup.Livro.Repository;

import com.zup.Amazup.Livro.Livro;
import org.springframework.data.repository.CrudRepository;

public interface LivroRepository extends CrudRepository<Livro, Integer> {
}
