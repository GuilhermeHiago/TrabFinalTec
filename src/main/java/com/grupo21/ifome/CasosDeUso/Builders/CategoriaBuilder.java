package com.grupo21.ifome.CasosDeUso.Builders;

import com.grupo21.ifome.Entidades.Categoria;

public class CategoriaBuilder {
    private Categoria categoria;

    public CategoriaBuilder(){
        categoria = new Categoria();
    }

    public static CategoriaBuilder builder(){
        return new CategoriaBuilder();
    }

    public CategoriaBuilder withId(Integer id){
        this.categoria.setId(id);
        return this;
    }

    public CategoriaBuilder withNome(String nome){
        this.categoria.setNome(nome);
        return this;
    }

    public CategoriaBuilder withImCategoria(String imgCategoria){
        this.categoria.setImg(imgCategoria);
        return this;
    }

    public Categoria build(){
        return this.categoria;
    }
}