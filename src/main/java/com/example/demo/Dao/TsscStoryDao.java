package com.example.demo.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.example.demo.Modelo.TsscStory;

@Repository
@Scope("singleton")
public class TsscStoryDao  implements ITsscStoryDao{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void save(TsscStory entity) {
		// TODO Auto-generated method stub
		entityManager.persist(entity);
		
	}

	@Override
	public void update(TsscStory entity) {
		// TODO Auto-generated method stub
		entityManager.merge(entity);
		
	}

	@Override
	public void delete(TsscStory entity) {
		// TODO Auto-generated method stub
		entityManager.remove(entity);
	
		
	}

	@Override
	public TsscStory findById(Long id) {
		return entityManager.find(TsscStory.class, id);
		
	}

	@Override
	public List<TsscStory> findAll() {
		String jpql = "Select t from TsscStory t";
		return 	entityManager.createQuery(jpql).getResultList();	
	}

}
