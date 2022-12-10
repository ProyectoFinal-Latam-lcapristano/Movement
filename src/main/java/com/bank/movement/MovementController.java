package com.bank.movement;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MovementController {
	@Autowired
	private Environment env;
	
	@Autowired
	private IMovementService service;
	
	@GetMapping("/list")
	public List<Movement> listar(){
		
		return service.findAll().stream().map(p-> {
			p.setPort(Integer.parseInt(env.getProperty("local.server.port")));
			return p;
		}).collect(Collectors.toList());
	}
	
	@GetMapping("/{id}")
	public Optional<Movement> findById(@PathVariable String id){
		return service.findById(id);
	}
		
	@PostMapping()
	public Movement guardar(@RequestBody Movement movement){
		return service.save(movement);
	}
	
	@DeleteMapping()
	public void eliminar(@RequestBody Movement movement){
		service.delete(movement);
	}
}
