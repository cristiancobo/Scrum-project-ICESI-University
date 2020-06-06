package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Modelo.TsscAdmin;
@Repository
public interface IAdminRepository extends CrudRepository<TsscAdmin, Long>{
	TsscAdmin findByUsername(String user);
}
