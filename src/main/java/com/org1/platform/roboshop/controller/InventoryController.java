package com.org1.platform.roboshop.controller;

import java.util.List;

import com.org1.platform.roboshop.dao.RoboshopRepository;
import com.org1.platform.roboshop.model.Inventory;
import jakarta.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("inventory")
@Tag(description="inventory related operations", name="inventory")
public class InventoryController {

	private static Logger L = LoggerFactory.getLogger(InventoryController.class);
	
	@Autowired private RoboshopRepository roboshopRepository;
	
	@PostMapping(consumes= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Inventory> createInventory(@RequestBody @Valid Inventory inventory, final BindingResult bindingResult)  {

		inventory = roboshopRepository.save(inventory);
		return ResponseEntity.status(HttpStatus.CREATED).body(inventory);
		
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Inventory>> getAllInventory()  {

		return ResponseEntity.ok(roboshopRepository.findAll());
	}
	


}
