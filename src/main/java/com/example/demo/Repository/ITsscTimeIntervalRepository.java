package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Modelo.TsscTimeInterval;

@Repository
public interface ITsscTimeIntervalRepository extends CrudRepository<TsscTimeInterval, Long> {

}
