package com.example.demo.Dao;

import java.util.List;

import com.example.demo.Modelo.TsscState;
import com.example.demo.Modelo.TsscStory;

public interface ITsscStoryDao {
	
	public void save(TsscStory entity);
	public void update(TsscStory entity);
	public void delete(TsscStory  entity);
	public TsscStory findById(Long id);
	public List<TsscStory> findAll();
	

}
