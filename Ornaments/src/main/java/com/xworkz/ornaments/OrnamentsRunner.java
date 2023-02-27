package com.xworkz.ornaments;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.ornaments.config.OrnamentsConfig;
import com.xworkz.ornaments.dto.OrnamentsDto;
import com.xworkz.ornaments.service.OrnamentsService;
import com.xworkz.ornaments.service.OrnamentsServiceImpl;

public class OrnamentsRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(OrnamentsConfig.class);
		
		OrnamentsServiceImpl service = context.getBean(OrnamentsServiceImpl.class);
		
		OrnamentsDto dto = new OrnamentsDto("Bangal", 12, 60000,"Gold","GoldColor");
		OrnamentsDto dto1 = new OrnamentsDto("Fingerring",10, 55000,"Silver" , "SilverColor");
		OrnamentsDto dto2 = new OrnamentsDto("NeckChain",30, 150000,"Gold","GoldColor");
		OrnamentsDto dto3 = new OrnamentsDto("LegChain",13,1300,"Silver","GoldSilver");
		//service.save(dto);
//		List<OrnamentsDto> dt = Arrays.asList(dto,dto1,dto2,dto3);
//        service.save(dt);
		for (OrnamentsDto ornamentsDto : service.readAll()) {
			
		
		System.out.println(ornamentsDto);
//		
		}	
//		System.out.println(service.findNameByIdAndColor("NeckChain", 31,"GoldColor"));
		
//		System.out.println(service.updateNameByPrice("NeckChokar",150000));
//		
//		System.out.println(service.deleteNameByPrice("legchain", 1300));
////		
	}

}

