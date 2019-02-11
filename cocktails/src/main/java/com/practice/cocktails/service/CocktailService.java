package com.practice.cocktails.service;

import java.util.List;

import com.practice.cocktails.model.Cocktail;

public interface CocktailService {
	List<Cocktail> getAllCocktails();
	Cocktail getCocktail();
	String addCocktail();
	Cocktail editCocktail();
	String deleteCocktail();
	
}
