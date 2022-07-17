package com.galdy.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galdy.dsmeta.entities.Sale;
import com.galdy.dsmeta.services.SaleService;

@RestController
@CrossOrigin(origins ="*", allowedHeaders = "*")
@RequestMapping(value = "/sales")
public class SaleController {
	@Autowired
	private SaleService service;
	
	@GetMapping
	public List<Sale> findAll() {
		return service.findSales();
	}
}
