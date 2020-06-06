package com.example.demo.Dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.util.Pair;

import com.example.demo.Modelo.TsscTopic;


public interface ITsscTopicDao {
	
	
	/*
	 * Generic Crud
	 */
	public void save(TsscTopic entity);
	public void update(TsscTopic entity);
	public void delete(TsscTopic  entity);
	public TsscTopic findById(Long id);
	public List<TsscTopic> findAll();
	
	/*
	 *Specific methods 
	 */
	
	public List<TsscTopic> findByName(String name);
	public List<TsscTopic> findByDescription(String description);
	
	public List<Object[]> findTopicsByGameDateOrderedByTime(LocalDate date);
	
	
	

}
