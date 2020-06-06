package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Modelo.TsscGroup;


@Repository
public interface ITsscGroupRepository extends CrudRepository<TsscGroup, Long> {

}
