package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Modelo.TsscSprint;


@Repository
public interface ITsscSprintRepository extends CrudRepository<TsscSprint,Long> {

}
