package com.bank.movement;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document(collection = "movement")
@AllArgsConstructor
@NoArgsConstructor
public class Movement {
	@Id
	private Long id;	
	private String account_id;
	private Double amount;
	private String type;
	private String creationdate;
}
