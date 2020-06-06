
package com.example.demo.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Modelo.TsscStory;




@Repository
public interface ITsscStoryRepository  extends CrudRepository<TsscStory,Long>{

}
