package com.chaldu.patron.inyeccion.dependencia.inyecciondependencia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.chaldu.patron.inyeccion.dependencia.inyecciondependencia.models.service.IServicio;
import com.chaldu.patron.inyeccion.dependencia.inyecciondependencia.models.service.MiServicio;

@Controller
public class IndexController {

    @Autowired
    @Qualifier("miServicioRest")
    private IServicio miServicio;

    /* @Autowired
    public IndexController(IServicio servicio)
    {
        this.miServicio = servicio;
    } */
    @GetMapping({"/", "", "index"})
    public String inicio(Model model) {
        model.addAttribute("titulo", "Hola Inyeccion de dependencia");
        model.addAttribute("objeto", this.miServicio.operacion());
        return "index";
    }
    /* @Autowired
    public void setServicio(IServicio servicio)
    {
        this.miServicio = servicio;
    } */
}
