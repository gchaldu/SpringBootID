package com.chaldu.patron.inyeccion.dependencia.inyecciondependencia.models.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
//@SessionScope
@RequestScope
public class Factura implements Serializable{

    @Value("${factura.descripcion}")
    private String descripcion;
    
    @Autowired
    private Cliente cliente;
    
    @Autowired
    @Qualifier("itemFacturaOficina")
    private List<ItemFactura> listItem;

    @PostConstruct
    public void init()
    {
        this.cliente.setNombre(cliente.getNombre().concat(" ").concat("Alejandro"));
        this.setDescripcion(this.descripcion.concat(" del cliente ").concat(cliente.getNombre()));
    }
    @PreDestroy
    public void destroy()
    {
        System.out.println("Factura destruida con exito... ".concat(descripcion));
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public List<ItemFactura> getListItem() {
        return listItem;
    }
    public void setListItem(List<ItemFactura> listItem) {
        this.listItem = listItem;
    }
    
    
}
