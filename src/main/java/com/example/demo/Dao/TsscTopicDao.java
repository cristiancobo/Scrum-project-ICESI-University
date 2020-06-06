package com.example.demo.Dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.annotation.Scope;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Repository;

import com.example.demo.Modelo.TsscTopic;

@Repository
@Scope("singleton")
public class TsscTopicDao implements ITsscTopicDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void save(TsscTopic entity) {
		// TODO Auto-generated method stub
		entityManager.persist(entity);
		
	}

	@Override
	public void update(TsscTopic entity) {
		// TODO Auto-generated method stub
		entityManager.merge(entity);
		
	}

	@Override
	public void delete(TsscTopic entity) {
		// TODO Auto-generated method stub
		entityManager.remove(entity);
	
		
	}
	
	@Override
	public List<TsscTopic> findAll() {
		// TODO Auto-generated method stub
		String query = "SELECT t FROM TsscTopic t";
		return entityManager.createQuery(query).getResultList();
	}

	@Override
	public List<TsscTopic> findByName(String name) {
		// TODO Auto-generated method stub
         String query = "Select t FROM TsscTopic t where t.name = :name";
         Query q = entityManager.createQuery(query);
         q.setParameter("name", name);
		 return q.getResultList();
		 
	
	}

	@Override
	public TsscTopic findById(Long id) {
		return entityManager.find(TsscTopic.class,id);
		
	}

	@Override
	public List<TsscTopic> findByDescription(String description) {
		// TODO Auto-generated method stub
        String query = "SELECT t FROM TsscTopic t WHERE t.description = :description";
        Query q = entityManager.createQuery(query);
        q.setParameter("description", description);
		 return q.getResultList();

	}

	@Override
	public List<Object[]> findTopicsByGameDateOrderedByTime(LocalDate date1) {
		// TODO Auto-generated method stub
		String x = "SELECT a,b FROM TsscTopic a RIGHT JOIN TsscGame b ON a = b.tsscTopic" + " WHERE b.scheduledDate = :date GROUP BY(a.name), b.scheduledTime ORDER BY b.scheduledTime ASC";
		Query q = entityManager.createQuery(x);
		q.setParameter("date", date1);
		return  q.getResultList();

	}


	

}
