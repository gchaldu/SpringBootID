package com.chaldu.patron.inyeccion.dependencia.inyecciondependencia.models.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("miServicioEmail") //@Service o @Component son lo mismo
public class MiServicio implements IServicio{

    @Override
    public String operacion()
    {
        return "Estoy realizando una operacion...";
    }   
     
}
