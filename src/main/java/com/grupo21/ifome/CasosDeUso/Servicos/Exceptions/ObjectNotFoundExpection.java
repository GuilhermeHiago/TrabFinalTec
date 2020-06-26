package com.grupo21.ifome.CasosDeUso.Servicos.Exceptions;

public class ObjectNotFoundExpection extends RuntimeException{

    private static final long serialVersionUID = 1;

    public ObjectNotFoundExpection(String msg) {
        super(msg);
    }

    public ObjectNotFoundExpection(String msg, Throwable cause){
        super(msg, cause);
    }
}
