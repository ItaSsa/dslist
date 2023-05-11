package com.devsuperior.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_belonging")
public class Belonging {
	@EmbeddedId
	private BelongingPk id =  new BelongingPk();
	
	private Integer position;
	
	public BelongingPk getId() {
		return id;
	}

	public void setId(BelongingPk id) {
		this.id = id;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public Belonging() {
		
	}

	public Belonging(Game game,GameList List, Integer position) {
		this.id.setGame(game);
		this.id.setGameList(List);
		this.position = position;
	}
	
	
}
