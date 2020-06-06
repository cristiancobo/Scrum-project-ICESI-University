package com.example.demo.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Modelo.TsscGame;
import com.example.demo.Modelo.TsscStory;
import com.example.demo.Modelo.TsscTimecontrol;
import com.example.demo.Modelo.TsscTopic;
import com.example.demo.Repository.ITsscGameRespository;
import com.example.demo.Repository.ITsscTopicRepository;

import java.util.List;



@Service
public class TsscGameServiceImp implements ITsscGameService{
	
	
	/*
	 * Dependency injections
	 */
	
	private ITsscGameRespository iTsscGameRespository;
	private ITsscTopicRepository iTsscTopicRepository;
	@Autowired
	public TsscGameServiceImp(ITsscGameRespository iTsscGameRespository,ITsscTopicRepository iTsscTopicRepository) {
		// TODO Auto-generated constructor stub
		this.iTsscGameRespository = iTsscGameRespository;
		this.iTsscTopicRepository = iTsscTopicRepository;
	}
	
	/*
	 * @author Cristian Andrés Cobo Ramírez
	 * _____________________________________ Save ______________________________________________
	 */
	

	@Override
	public TsscGame saveGame(TsscGame tsscGame, boolean thereIsTopic, Long idTsscTopic) {
		/*
		 * implementation
		 */
		if(tsscGame.getNSprints() > 0 && tsscGame.getNGroups() > 0 ) {
			if(thereIsTopic) {
				if (iTsscTopicRepository.existsById(idTsscTopic)) {
					TsscTopic tsscTopic = iTsscTopicRepository.findById(idTsscTopic).get();
					tsscGame.setTsscTopic(tsscTopic);
					iTsscGameRespository.save(tsscGame);
					System.out.println("Guardado 1");
					return tsscGame;
					
				}else {
					return null;
				}

			}else {
				iTsscGameRespository.save(tsscGame);
				System.out.println("Guardado");
				return tsscGame;
				
			}
		}else {
			return null;
		}
			
	}
	

	@Override
	public TsscGame saveGameTwo(TsscGame tsscGame,Long idTsscTopic) {
		// TODO Auto-generated method stub
		/*
		 * implementation
		 */
		if(tsscGame.getNGroups() > 0 && tsscGame.getNSprints() > 0) {
				
				if(tsscGame.getTsscTopic() == null) {
					
					iTsscGameRespository.save(tsscGame);
					return tsscGame;
				
				}else {
					if(iTsscTopicRepository.existsById(idTsscTopic)) {
						
						List<TsscTimecontrol> timeLines = tsscGame.getTsscTopic().getTimelines();
						tsscGame.getTsscTimecontrols().addAll(timeLines);
						List<TsscStory> stories = tsscGame.getTsscTopic().getTsscStories();
						tsscGame.getTsscStories().addAll(stories);
						iTsscGameRespository.save(tsscGame);
						return tsscGame;
						
					}else {
						return null;
					}
				}
			

		}else {
			return null;
		}
		
	}


	

	/*
	 * _____________________________________ Update ____________________________________________
	 */
	@Override
	public TsscGame updateNameGame(Long idTsscGame, String tsscNameGame) {
		/*
		 * implementation
		 */
		TsscGame tsscGame = iTsscGameRespository.findById(idTsscGame).get();
		if(tsscGame.getNSprints() > 0 && tsscGame.getNGroups() > 0 ) {
				tsscGame.setName(tsscNameGame);
				iTsscGameRespository.save(tsscGame);
				return tsscGame;
		}else {
				return null;
		}

	}
	
	@Override
	public TsscGame updateGameAmountNSprints(Long idTsscGame, int amountDefaulSprintsTsscGame) {
		// TODO Auto-generated method stub
		/*
		 * implementation
		 */
		
		if(iTsscGameRespository.existsById(idTsscGame)) {
			TsscGame tsscGame = iTsscGameRespository.findById(idTsscGame).get();

			if(amountDefaulSprintsTsscGame >  0 ) {
				tsscGame.setNSprints(amountDefaulSprintsTsscGame);
				iTsscGameRespository.save(tsscGame); 
				return tsscGame;
			}else {
				return null;
			}
			
		}else {
			
			return null;
			
		}
	}
	
	@Override
	public TsscGame updateGameAmountNGroups(Long idTsscGame, int amountDefaulGroupsTsscGame) {
		// TODO Auto-generated method stub
		/*
		 * implementation
		 */
		
		if(iTsscGameRespository.existsById(idTsscGame)) {
			TsscGame tsscGame = iTsscGameRespository.findById(idTsscGame).get();

			if(amountDefaulGroupsTsscGame >  0 ) {
				tsscGame.setNGroups(amountDefaulGroupsTsscGame);
				iTsscGameRespository.save(tsscGame); 
				return tsscGame;
			}else {
				return null;
			}
			
		}else {
			
			return null;
			
		}
	}
	
	public TsscGame findByIdTsscGame(Long iDTsscGame) {
		return iTsscGameRespository.findById(iDTsscGame).get();
	}
	public boolean existByIdTsscGame(Long iDTsscGame) {
		return iTsscGameRespository.existsById(iDTsscGame);
	}
	
	public Iterable<TsscGame> findAll(){
		System.out.println(iTsscGameRespository.findAll());
		return iTsscGameRespository.findAll();
	}
	
	public void deleteTsscGame(TsscGame tsscGame) {
		iTsscGameRespository.delete(tsscGame);
	}



}
