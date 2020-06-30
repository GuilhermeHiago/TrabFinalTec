package com.grupo21.ifome.CasosDeUso.Servicos.Exceptions;

public class ObjectNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1;

    public ObjectNotFoundException(String msg) {
        super(msg);
    }

    public ObjectNotFoundException(String msg, Throwable cause){
        super(msg, cause);
    }
}
