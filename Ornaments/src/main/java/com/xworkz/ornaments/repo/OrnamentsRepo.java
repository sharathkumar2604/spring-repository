package com.xworkz.ornaments.repo;

import java.util.List;

import org.springframework.stereotype.Component;

import com.xworkz.ornaments.dto.OrnamentsDto;

public interface OrnamentsRepo {

	public boolean save(OrnamentsDto dto);
	
	public List<OrnamentsDto> readAll();

	public OrnamentsDto findNameByIdAndColor(String name, int id, String color);

	public boolean updateNameByPrice(String name, int price);
	
	public boolean deleteNameByPrice(String name, int price);


}
