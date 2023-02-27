package com.xworkz.ornaments.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.ornaments.dto.OrnamentsDto;
import com.xworkz.ornaments.repo.OrnamentsRepo;
import com.xworkz.ornaments.repo.OrnamentsRepoImpl;

@Component
public class OrnamentsServiceImpl implements OrnamentsService {
	@Autowired
	private OrnamentsRepo repo ;
	
	@Override
	public boolean save(List<OrnamentsDto> dto) {

		if(dto!=null)
		{
			System.out.println("service runned");
			for (OrnamentsDto orn : dto) {
				repo.save(orn);
			}
			return true;
		}
		
		
		return false;
	}

	@Override
	public List<OrnamentsDto> readAll() {

		return repo.readAll();
	}

	@Override
	public OrnamentsDto findNameByIdAndColor(String name, int id, String color) {
         
		
			
			return repo.findNameByIdAndColor(name,id,color);
		
		
		
		
	}

	@Override
	public boolean updateNameByPrice(String name, int price) {
if(name.equalsIgnoreCase(name)&&price>100)
{
	return repo.updateNameByPrice(name,price);
}
		return false;
	}

	@Override
	public boolean deleteNameByPrice(String name, int price) {
if(name.equalsIgnoreCase(name)&&price>100)
{
	return repo.deleteNameByPrice(name,price);
	
}
		
		return false;
	}

	
}
