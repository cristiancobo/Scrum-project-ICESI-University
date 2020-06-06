package com.example.demo.Dao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.example.demo.Modelo.TsscGame;



@Repository
@Scope("singleton")
public class TsscGameDAO implements ITsscGameDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void save(TsscGame entity) {
		// TODO Auto-generated method stub
		entityManager.persist(entity);
		
	}

	@Override
	public void update(TsscGame entity) {
		// TODO Auto-generated method stub
		entityManager.merge(entity);
		
	}

	@Override
	public void delete(TsscGame entity) {
		// TODO Auto-generated method stub
		entityManager.remove(entity);
	
		
	}

	@Override
	public TsscGame findById(Long id) {
		return entityManager.find(TsscGame.class, id);
		
	}

	@Override
	public List<TsscGame> findByIdTopic(Long iD) {
		String query = "SELECT t FROM TsscGame t where t.tsscTopic.id = :iD";
		Query q = entityManager.createQuery(query);
		q.setParameter("iD", iD);
		return q.getResultList();
	}

	@Override
	public List<TsscGame> findByName(String name) {
		// TODO Auto-generated method stub
        String query = "SELECT t FROM TsscGame t WHERE t.name = :name";
        Query q = entityManager.createQuery(query);
        q.setParameter("name", name);
		
		 return q.getResultList();
	}

	@Override
	public List<TsscGame> findByDescription(String description) {
		// TODO Auto-generated method stub
        String query = "SELECT t FROM TsscGame t WHERE t.DESCRIPTION = :description";
        Query q = entityManager.createQuery(query);
        q.setParameter("description", description);
		 return q.getResultList();
	}

	@Override
	public List<TsscGame> findByDateRange(LocalDate date1, LocalDate date2) {
		// TODO Auto-generated method stub
		String query = "SELECT t FROM TsscGame t where t.scheduledDate between :date1 and :date2";
		Query q = entityManager.createQuery(query);
		q.setParameter("date1", date1);
		q.setParameter("date2", date2);
		return q.getResultList();
	
	}

	@Override
	public List<TsscGame> findByDateTimeRange(LocalDate date1, LocalTime time1, LocalTime time2) {
		// TODO Auto-generated method stub
		String query = "SELECT t FROM TsscGame t where t.scheduledDate = :date1 and  t.scheduledTime between :time1 and :time2";
		Query q = entityManager.createQuery(query);
		q.setParameter("time1", time1);
		q.setParameter("time2", time2);
		return q.getResultList();
		
	}

	@Override
	public List<TsscGame> findByDateStoryTime(LocalDate date1) {
		// TODO Auto-generated method stub
		String jpql = "SELECT a FROM TsscGame a WHERE a.scheduledDate ='"+date1+"' AND (size(a.tsscStories)<10 " + "OR size(a.tsscTimecontrols) = 0)";
		Query query = entityManager.createQuery(jpql);

		@SuppressWarnings("unchecked")
		List<TsscGame> results = query.getResultList();
		return results;
	}

	@Override
	public List<TsscGame> findByDescriptioTopic(String description) {
		// TODO Auto-generated method stub
		
		String query = "SELECT t FROM TsscGame t where t.tsscTopic.description = :description";
		Query q = entityManager.createQuery(query);
		q.setParameter("description", description);
		return q.getResultList();
	}

	@Override
	public List<TsscGame> findAll() {
		String jpql = "Select t from TsscGame t";
		return 	entityManager.createQuery(jpql).getResultList();	
	}
	

	


}
