package com.generation.blogpessoal.postagem;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface PostagemRepository extends JpaRepository<Postagem, Long> {

	List<Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
}
