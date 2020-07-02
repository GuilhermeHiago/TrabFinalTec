package com.grupo21.ifome.CasosDeUso.Politicas;

import java.util.List;

import com.grupo21.ifome.Entidades.Cliente;
import com.grupo21.ifome.Entidades.Pedido;
import com.grupo21.ifome.Entidades.Restaurante;

import org.springframework.stereotype.Component;

@Component
public class SelecaoRestauranteProximidade implements SelecaoRestaurante {
    public SelecaoRestauranteProximidade(){}

    @Override
    public Restaurante escolheRestaurante(Cliente c, Pedido p, List<Restaurante> listRest) {
        Restaurante escolhido = null;
        Double distanciaAtual = null;

        // Remover da lista os restaurante sem a forma de pagamento

        for(Restaurante r : listRest){
            double x_pow = Math.pow(r.getPos().getX() - c.getPosicao().getX(), 2);
            double y_pow = Math.pow(r.getPos().getY() - c.getPosicao().getY(), 2);

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