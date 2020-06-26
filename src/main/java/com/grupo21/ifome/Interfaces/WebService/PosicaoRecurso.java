package com.grupo21.ifome.Interfaces.WebService;

import com.grupo21.ifome.CasosDeUso.Servicos.PosicaoServico;
import com.grupo21.ifome.Entidades.Posicao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/posicao")
public class PosicaoRecurso {
    @Autowired
    PosicaoServico posicaoServico;

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id) {
        Posicao res = posicaoServico.buscarPorId(id);
        return ResponseEntity.ok().body(res);
    }
}