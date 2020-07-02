package com.grupo21.ifome.casosDeUso.Politicas;

import java.util.List;

import com.grupo21.ifome.entidades.Cliente;
import com.grupo21.ifome.entidades.Pedido;
import com.grupo21.ifome.entidades.Restaurante;

import org.springframework.stereotype.Component;

@Component
public class SelecaoRestauranteProximidade implements SelecaoRestaurante {

    @Override
    public Restaurante escolheRestaurante(Cliente c, Pedido p, List<Restaurante> listRest) {
        Restaurante escolhido = null;
        Double distanciaAtual = null;

        // Remover da lista os restaurante sem a forma de pagamento

        for(Restaurante r : listRest){
            double x_pow = Math.pow(r.getPos().getX() - c.getPos().getX(), 2);
            double y_pow = Math.pow(r.getPos().getY() - c.getPos().getY(), 2);

            double dist = Math.sqrt(x_pow + y_pow);
            
            // Converte para km
            dist = (int)dist / 1000;

            if(escolhido == null || distanciaAtual == null){
                escolhido = r;
                distanciaAtual = dist;
            }else if(dist < distanciaAtual){

            }
        }
        return escolhido;
    }
    
}