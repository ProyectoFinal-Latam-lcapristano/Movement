package com.bank.movement;

import java.util.List;
import java.util.Optional;

public interface IMovementService {
	public List<Movement> findAll();
	public Optional<Movement> findById(String id);
	public Movement save(Movement movement);
	public void delete(Movement movement);
}
