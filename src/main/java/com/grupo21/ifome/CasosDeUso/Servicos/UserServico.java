package com.grupo21.ifome.CasosDeUso.Servicos;

import com.grupo21.ifome.security.UserSS;
import org.springframework.security.core.context.SecurityContextHolder;

public class UserServico {

    public static UserSS authenticated() {
        try {
            return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        } catch (Exception e) {
            return null;
        }
    }
}
