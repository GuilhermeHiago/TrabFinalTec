package com.grupo21.ifome.CasosDeUso.Servicos;

import com.grupo21.ifome.CasosDeUso.Repositorios.ClienteRepositorio;
import com.grupo21.ifome.Entidades.Cliente;
import com.grupo21.ifome.security.UserSS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    //busca por email
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Cliente cliente = clienteRepositorio.getByEmail(email);
        if(cliente == null) {
            throw  new UsernameNotFoundException(email);
        }
        return new UserSS(cliente.getId(), cliente.getEmail(), cliente.getSenha());
    }
}
