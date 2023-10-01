package com.groupomar.facturadigital.models.dao;

import com.groupomar.facturadigital.models.entity.Factura;
import org.springframework.data.repository.CrudRepository;

public interface IFacturaDao extends CrudRepository<Factura,Long> {
}
