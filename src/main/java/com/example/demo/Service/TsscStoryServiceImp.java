package com.example.demo.Service;



import java.math.BigDecimal;
import org.aspectj.util.IStructureModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Modelo.TsscGame;
import com.example.demo.Modelo.TsscStory;
import com.example.demo.Repository.ITsscGameRespository;
import com.example.demo.Repository.ITsscStoryRepository;
import com.sun.tools.sjavac.Log;



/*
 * 
 */

@Service
public class TsscStoryServiceImp implements ITsscStoryService {
	
	/*
	 * Dependency injections
	 */
	
	private ITsscStoryRepository iTsscStoryRepository;
	private ITsscGameRespository iTsscGameRespository;
	@Autowired
	public TsscStoryServiceImp(ITsscStoryRepository iTsscStoryRepository,ITsscGameRespository iTsscGameRespository) {
		// TODO Auto-generated constructor stub
		this.iTsscStoryRepository = iTsscStoryRepository;
		this.iTsscGameRespository = iTsscGameRespository;
	}

	/*
	 * 
	 */
	@Override
	public TsscStory saveStory(TsscStory tsscStory, Long idTsscGame) {
		// TODO Auto-generated method stub
		/*
		 * implementation
		 */
	
		if (iTsscGameRespository.existsById(idTsscGame)) {
			if(tsscStory.getBusinessValue().intValue() > 0 && tsscStory.getInitialSprint().intValue() > 0 && tsscStory.getPriority().intValue() > 0 ) {
				TsscGame tsscGame = iTsscGameRespository.findById(idTsscGame).get();
				tsscStory.setTsscGame(tsscGame);
				iTsscStoryRepository.save(tsscStory);
				
				return tsscStory;
			}else {
				
				return null;
			}
			
		}else {
			
				return null;
				
			}
		}


	/*
	 * 
	 */
	@Override
	public TsscStory updateDescriptionStory(Long idTsscStory, String tsscStoryDescription) {
		// TODO Auto-generated method stub
		/*
		 * implementation
		 */
		
		TsscStory tsscStory = iTsscStoryRepository.findById(idTsscStory).get();
		if(tsscStory.getBusinessValue().intValue() > 0 && tsscStory.getInitialSprint().intValue() > 0 && tsscStory.getPriority().intValue() > 0 ) {
			tsscStory.setDescription(tsscStoryDescription);
			iTsscStoryRepository.save(tsscStory);
			return tsscStory;
		}else {
			return null;
		}
	
	}

	/*
	 * 
	 */
	@Override
	public TsscStory updateBusinessValueStory(Long idTsscStory, BigDecimal tsscBusinessValue) {
		// TODO Auto-generated method stub
		/*
		 * implementation
		 */
		
		if(iTsscStoryRepository.existsById(idTsscStory)) {
			TsscStory tsscStory = iTsscStoryRepository.findById(idTsscStory).get();
			if( tsscBusinessValue.intValue() > 0  ) {
				tsscStory.setBusinessValue(tsscBusinessValue);
				iTsscStoryRepository.save(tsscStory);
				return tsscStory;
			}else {
				return null;
			}
			
		}else {
			return null;
		}
		
	}
	/*
	 * 
	 */
	@Override
	public TsscStory updatePriorityStory(Long idTsscStory, BigDecimal tsscStoryPriority) {
		// TODO Auto-generated method stub
		/*
		 * implementation
		 */
		
		if(iTsscStoryRepository.existsById(idTsscStory)) {
			TsscStory tsscStory = iTsscStoryRepository.findById(idTsscStory).get();
			if( tsscStoryPriority.intValue() > 0  ) {
				tsscStory.setBusinessValue(tsscStoryPriority);
				iTsscStoryRepository.save(tsscStory);
				return tsscStory;
			}else {
				return null;
			}
			
		}else {
			return null;
		}
	
	}
	
	public TsscStory findByIdTsscStory(Long iDTsscStory) {
		return iTsscStoryRepository.findById(iDTsscStory).get();
	}
	public boolean existByIdTsscStory(Long iDTsscStory) {
		return iTsscStoryRepository.existsById(iDTsscStory);
	}
	
	public Iterable<TsscStory> findAll(){
		return iTsscStoryRepository.findAll();
	}
	
	public void deleteTsscStory(TsscStory tsscStory) {
		iTsscStoryRepository.delete(tsscStory);
	}
	
	
	


}
