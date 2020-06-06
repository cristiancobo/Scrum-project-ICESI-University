package com.example.demo.Dao;

import java.util.List;

import com.example.demo.Modelo.TsscAdmin;

public interface ITsscAdminDao {
	
	/*
	 * Crud
	 */
	public void save(TsscAdmin entity);
	public void update(TsscAdmin entity);
	public void delete(TsscAdmin  entity);
	public TsscAdmin findById(Long id);
	public List<TsscAdmin> findAll();

}
