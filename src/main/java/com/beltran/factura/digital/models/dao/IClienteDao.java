package com.beltran.factura.digital.models.dao;

import com.beltran.factura.digital.models.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long>, JpaRepository<Cliente,Long> {
}
