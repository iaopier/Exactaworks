package com.exactaapi.gastos.Service;

import java.util.List;

import com.exactaapi.gastos.Model.Gasto;

public interface GastosService {
	List<Gasto> findAll();
	Gasto save(Gasto gasto);
	Gasto findById(long id);
}
