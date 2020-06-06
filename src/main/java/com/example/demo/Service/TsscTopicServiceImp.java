package com.example.demo.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.example.demo.Modelo.TsscTopic;
import com.example.demo.Repository.ITsscTopicRepository;

@Service
public class TsscTopicServiceImp  implements ITsscTopicService{
	/*
	 * Dependency injections
	 */
	
	private ITsscTopicRepository iTsscTopicRepository;
	@Autowired
	public TsscTopicServiceImp(ITsscTopicRepository iTsscTopicRepository) {
		this.iTsscTopicRepository = iTsscTopicRepository;
		// TODO Auto-generated constructor stub
	}
	/*
	 * _____________________________________ Save ______________________________________________
	 */
	@Override
	public TsscTopic saveTopic(TsscTopic tsscTopic) {
		// TODO Auto-generated method stub
		/*
		 * implementation
		 */
		if(tsscTopic.getDefaultGroups() >  0L && tsscTopic.getDefaultSprints() > 0L  ) {
			iTsscTopicRepository.save(tsscTopic);
		
			return tsscTopic;
		}
		
		return null;
	}

	/*
	 * _____________________________________ Update ____________________________________________
	 */

	@Override
	public TsscTopic updateTopicAmountDefaultSprints(Long idTsscTopic, Long amountDefaulSprintsTsscTopic) {
		// TODO Auto-generated method stub
		/*
		 * implementation
		 */
		
		if(iTsscTopicRepository.existsById(idTsscTopic)) {
			TsscTopic tsscTopic = iTsscTopicRepository.findById(idTsscTopic).get();

			if(amountDefaulSprintsTsscTopic >  0 ) {
				tsscTopic.setDefaultSprints(amountDefaulSprintsTsscTopic);
				iTsscTopicRepository.save(tsscTopic); //Check
				return tsscTopic;
			}else {
				return null;
			}
			
		}else {
			
			return null;
			
		}
	}

	@Override
	public TsscTopic updateTopicAmountDefaultGroups(Long idTsscTopic, Long amountDefaulGroupsTsscTopic) {
		// TODO Auto-generated method stub
		/*
		 * implementation
		 */
		if(iTsscTopicRepository.existsById(idTsscTopic)) {
	
			TsscTopic tsscTopic = iTsscTopicRepository.findById(idTsscTopic).get();
			
			
			if(amountDefaulGroupsTsscTopic > 0  ) {
				tsscTopic.setDefaultGroups(amountDefaulGroupsTsscTopic);
				iTsscTopicRepository.save(tsscTopic); //Check
				return tsscTopic;
			}else {
				System.out.println("RECHAZADO");
				return null;
			}
			
		}else {
			
			return null;
		}
	}
	
	public TsscTopic findByIdTsscTopic(Long idTsscTopic) {
		return iTsscTopicRepository.findById(idTsscTopic).get();
	}
	public boolean existByIdTsscTopic(Long idTsscTopic) {
		System.out.println(iTsscTopicRepository.existsById(idTsscTopic)+ " AJA");
		return iTsscTopicRepository.existsById(idTsscTopic);
	}
	
	public Iterable<TsscTopic> findAll(){
		return iTsscTopicRepository.findAll();
	}
	
	public void deleteTsscTopic(TsscTopic tsscTopic) {
		iTsscTopicRepository.delete(tsscTopic);
	}


}
