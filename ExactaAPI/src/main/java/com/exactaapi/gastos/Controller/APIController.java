package com.exactaapi.gastos.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exactaapi.gastos.Model.Gasto;
import com.exactaapi.gastos.Service.GastosService;

@RestController
@RequestMapping("/api/v1/gastos")
public class APIController {

	@Autowired
	GastosService gastosService;
	
	@RequestMapping(value = "/listarGastos", method = RequestMethod.GET)
	public ResponseEntity<?> listarGastos() {
		return new ResponseEntity<>(gastosService.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/criarGasto", method = RequestMethod.POST)
	public ResponseEntity<?> criarGasto(@RequestBody Gasto gasto) {
		return new ResponseEntity<>(gastosService.save(gasto), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/listarGasto/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> listarGasto(@PathVariable(value="id") long id) {
		return new ResponseEntity<>(gastosService.findById(id), HttpStatus.OK);
	}
}
