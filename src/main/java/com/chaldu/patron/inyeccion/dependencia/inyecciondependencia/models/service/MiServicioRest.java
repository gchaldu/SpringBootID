package com.chaldu.patron.inyeccion.dependencia.inyecciondependencia.models.service;

import org.springframework.stereotype.Component;

@Component("miServicioRest")
public class MiServicioRest implements IServicio {

    @Override
    public String operacion() {
        return "Ejecutando mi servivio REST";
    }
    
}
