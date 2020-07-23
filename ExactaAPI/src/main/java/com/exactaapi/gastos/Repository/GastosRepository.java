package com.exactaapi.gastos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exactaapi.gastos.Model.Gasto;

public interface GastosRepository extends JpaRepository<Gasto,Long> {

}
