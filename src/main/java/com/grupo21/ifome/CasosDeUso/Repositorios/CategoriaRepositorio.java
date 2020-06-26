package com.grupo21.ifome.CasosDeUso.Repositorios;

import com.grupo21.ifome.Entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepositorio extends JpaRepository<Categoria, Integer> {

}
