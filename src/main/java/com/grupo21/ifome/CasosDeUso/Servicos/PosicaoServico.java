package com.grupo21.ifome.CasosDeUso.Servicos;

import com.grupo21.ifome.CasosDeUso.Repositorios.PedidoRepositorio;
import com.grupo21.ifome.CasosDeUso.Repositorios.PosicaoRepositorio;
import com.grupo21.ifome.CasosDeUso.Servicos.Exceptions.ObjectNotFoundExpection;
import com.grupo21.ifome.Entidades.Pedido;
import com.grupo21.ifome.Entidades.Posicao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PosicaoServico {
    @Autowired
    private PosicaoRepositorio posicaoRepositorio;

    public Posicao buscarPorId(Integer id){
        Optional<Posicao> buscaPosicao = posicaoRepositorio.findById(id);
        return buscaPosicao.orElseThrow(() -> new ObjectNotFoundExpection("Objeto nao encontradp! Id: "+id+", Tipo: "+ Posicao.class.getName()));
    }
}
