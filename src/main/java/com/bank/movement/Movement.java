package com.bank.movement;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document(collection = "movement")
@AllArgsConstructor
@NoArgsConstructor
public class Movement {
	@MongoId
	private String id;	
	private String account_id;
	private Double amount;
	private String type;
	private String creationdate;
	private Integer Port;
}
