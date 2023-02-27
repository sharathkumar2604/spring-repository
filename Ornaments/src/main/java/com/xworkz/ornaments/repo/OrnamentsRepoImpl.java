package com.xworkz.ornaments.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import com.xworkz.ornaments.dto.OrnamentsDto;

@Component
public class OrnamentsRepoImpl implements OrnamentsRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("OrnamentsPersistance");
	EntityManager em = emf.createEntityManager();

	@Override
	public boolean save(OrnamentsDto dto) {
		if (em != null) {
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			System.out.println(dto);
			return true;
		}

		return false;
	}

	@Override
	public List<OrnamentsDto> readAll() {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("read",OrnamentsDto.class);
			em.getTransaction().commit();
			return query.getResultList();

			
		
	}
		return null;

}

	@Override
	public OrnamentsDto findNameByIdAndColor(String name, int id, String color) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("findNameByIdAndColor",OrnamentsDto.class);
			query.setParameter("nm",name);
			query.setParameter("id",id);
			query.setParameter("cl",color);
			
			em.getTransaction().commit();
			return (OrnamentsDto) query.getSingleResult();

		
	}
		return null;
}

	@Override
	public boolean updateNameByPrice(String name, int price) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("updateNameByPrice");
			query.setParameter("nm",name);
			query.setParameter("pr", price);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;
			
			

		                     
		
	}
		return false;


}

	@Override
	public boolean deleteNameByPrice(String name, int price) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("deleteNameByPrice");
			query.setParameter("nm",name);
			query.setParameter("pr", price);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;
	}
		return false;
}

}
