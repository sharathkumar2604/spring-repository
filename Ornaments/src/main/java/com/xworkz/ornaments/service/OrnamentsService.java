package com.xworkz.ornaments.service;

import org.springframework.stereotype.Component;

import java.util.List;
import com.xworkz.ornaments.dto.OrnamentsDto;


public interface OrnamentsService {

	public boolean save(List<OrnamentsDto> dto);
	
	public List<OrnamentsDto> readAll();
	
	public OrnamentsDto findNameByIdAndColor(String name,int id,String color);
	
	public boolean updateNameByPrice(String name,int price);
	
	public boolean deleteNameByPrice(String name ,int price);
	
	
}
