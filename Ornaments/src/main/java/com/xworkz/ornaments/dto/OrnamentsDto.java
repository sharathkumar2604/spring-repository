package com.xworkz.ornaments.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import jdk.jfr.Name;

@Entity
@Table(name="ornament")
@NamedQuery(name="read",query="select dt from OrnamentsDto dt")
@NamedQuery(name="findNameByIdAndColor",query="select dr from OrnamentsDto dr where dr.nameOFTheOrnaments=:nm and dr.id=:id and dr.color=:cl ")
@NamedQuery(name="updateNameByPrice",query="update OrnamentsDto dto set dto.nameOFTheOrnaments=:nm where dto.price=:pr")
@NamedQuery(name="deleteNameByPrice",query="delete from OrnamentsDto dto where dto.nameOFTheOrnaments =:nm and dto.price=:pr")
public class OrnamentsDto {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	private String nameOFTheOrnaments;
	private int noOfGrams;
	private int price;
	private String type;
	private String color;
	
	public OrnamentsDto() {

	}

	public OrnamentsDto(String nameOFTheOrnaments, int noOfGrams, int price, String type, String color) {
		this.nameOFTheOrnaments = nameOFTheOrnaments;
		this.noOfGrams = noOfGrams;
		this.price = price;
		this.type = type;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameOFTheOrnaments() {
		return nameOFTheOrnaments;
	}

	public void setNameOFTheOrnaments(String nameOFTheOrnaments) {
		this.nameOFTheOrnaments = nameOFTheOrnaments;
	}

	public int getNoOfGrams() {
		return noOfGrams;
	}

	public void setNoOfGrams(int noOfGrams) {
		this.noOfGrams = noOfGrams;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "OrnamentsDto [id=" + id + ", nameOFTheOrnaments=" + nameOFTheOrnaments + ", noOfGrams=" + noOfGrams
				+ ", price=" + price + ", type=" + type + ", color=" + color + "]";
	}

	
}