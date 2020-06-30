package com.grupo21.ifome.CasosDeUso.Repositorios;

import com.grupo21.ifome.Entidades.Cliente;
import com.grupo21.ifome.Entidades.Pedido;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface PedidoRepositorio extends JpaRepository<Pedido, Integer> {

    @Transactional(readOnly=true)
    Page<Pedido> findByCliente(Cliente cliente, Pageable pageRequest);
}
