package com.patrones_disenios.facade.ecommerce.service;

import com.patrones_disenios.facade.ecommerce.model.Direccion;
import com.patrones_disenios.facade.ecommerce.model.Tarjeta;

public interface ICompraService {

    void procesarCompra(String productoId, Integer cantidad, Tarjeta tarjeta, Direccion direccion);
}
