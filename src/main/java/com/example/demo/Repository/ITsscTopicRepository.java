package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Modelo.TsscTopic;

@Repository
public interface ITsscTopicRepository  extends CrudRepository<TsscTopic,Long>{

}
