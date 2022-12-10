package com.bank.movement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovementService implements IMovementService {
	@Autowired
	private MovementRepository repository;

	@Override
	public List<Movement> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Movement> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public Movement save(Movement movement) {
		return repository.save(movement);
	}

	@Override
	public void delete(Movement movement) {
		repository.delete(movement);
		
	}

}
