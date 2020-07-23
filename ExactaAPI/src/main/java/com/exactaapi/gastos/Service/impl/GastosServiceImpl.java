package com.exactaapi.gastos.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exactaapi.gastos.Model.Gasto;
import com.exactaapi.gastos.Repository.GastosRepository;
import com.exactaapi.gastos.Service.GastosService;

@Service
public class GastosServiceImpl implements GastosService {

	@Autowired
	GastosRepository gastosRepository;

	@Override
	public List<Gasto> findAll() {
		return gastosRepository.findAll();

	}

	@Override
	public Gasto save(Gasto gasto) {
		gastosRepository.save(gasto);
		return gasto;
	}

	@Override
	public Gasto findById(long id) {
		return gastosRepository.findById(id).get();
	}
}
