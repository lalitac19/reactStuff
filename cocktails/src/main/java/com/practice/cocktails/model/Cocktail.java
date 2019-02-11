package com.practice.cocktails.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Cocktail {

	@Id
	@GeneratedValue
	private long cocktailID; 
	private String cocktailName;
	private String ingredients; 
	private String mainAlcohol; 
	
	public Cocktail(long cocktailID, String cocktailName,
					String ingredients, String mainAlcohol) {
		this.cocktailID = cocktailID;
		this.cocktailName = cocktailName;
		this.ingredients = ingredients; 
		this.mainAlcohol = mainAlcohol; 
		
	}
}
