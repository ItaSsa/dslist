package com.devsuperior.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDto> findAll(){
		var result = gameRepository.findAll();
		List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
		return dto;
		 
	}
}