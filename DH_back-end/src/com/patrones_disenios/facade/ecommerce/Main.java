package com.patrones_disenios.facade.ecommerce;


import com.patrones_disenios.facade.ecommerce.service.ICompraService;
import com.patrones_disenios.facade.ecommerce.service.impl.EnvioService;
import com.patrones_disenios.facade.ecommerce.service.impl.PagoService;
import com.patrones_disenios.facade.ecommerce.model.Direccion;
import com.patrones_disenios.facade.ecommerce.model.Producto;
import com.patrones_disenios.facade.ecommerce.model.Tarjeta;
import com.patrones_disenios.facade.ecommerce.service.impl.AlmacenService;
import com.patrones_disenios.facade.ecommerce.service.impl.CompraService;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Producto productoUno = new Producto("1",5,1000,"Mouse");
        Producto productoDos = new Producto("2",5,3000,"Teclado");
        Tarjeta tarjeta  = new Tarjeta("1111222233334444","012","2025/07/09");

        Direccion direccion = new Direccion("Av Monroe","860","1428","CABA","Capital federal");
        ICompraService compraService = new CompraService(new AlmacenService(Arrays.asList(productoUno,productoDos)),new PagoService(),new EnvioService());

        compraService.procesarCompra("1",2,tarjeta,direccion);

    }
}
