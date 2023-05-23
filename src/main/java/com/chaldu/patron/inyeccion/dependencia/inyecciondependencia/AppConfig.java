package com.chaldu.patron.inyeccion.dependencia.inyecciondependencia;

import java.util.LinkedList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chaldu.patron.inyeccion.dependencia.inyecciondependencia.models.domain.ItemFactura;
import com.chaldu.patron.inyeccion.dependencia.inyecciondependencia.models.domain.Producto;

@Configuration
public class AppConfig {

    @Bean("itemsFactura")
    public List<ItemFactura> regItemFacturas()
    {
        Producto producto = new Producto("PC", 550000f);
        Producto producto2 = new Producto("Lenovo", 520000f);
        Producto producto3 = new Producto("MacBook", 750000f);

        ItemFactura itemFactura = new ItemFactura(producto, 1);
        ItemFactura itemFactura2 = new ItemFactura(producto2, 10);
        ItemFactura itemFactura3 = new ItemFactura(producto3, 5);
        

        List<ItemFactura> list = new LinkedList<>();
        list.add(itemFactura);
        list.add(itemFactura2);
        list.add(itemFactura3);
        return list;
    }

    @Bean("itemFacturaOficina")
    public List<ItemFactura> regItemFacturasOficina()
    {
        Producto producto = new Producto("Lapices", 10000f);
        Producto producto2 = new Producto("Resma A4", 20000f);
        Producto producto3 = new Producto("Goma de borrar", 50000f);

        ItemFactura itemFactura = new ItemFactura(producto, 10);
        ItemFactura itemFactura2 = new ItemFactura(producto2, 20);
        ItemFactura itemFactura3 = new ItemFactura(producto3, 7);
        

        List<ItemFactura> list = new LinkedList<>();
        list.add(itemFactura);
        list.add(itemFactura2);
        list.add(itemFactura3);
        return list;
    }

}
