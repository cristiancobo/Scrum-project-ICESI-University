package com.example.demo.Service;



import java.math.BigDecimal;

import com.example.demo.Modelo.TsscStory;


public interface ITsscStoryService {
	
	
	/*
	 * 
	 */
	public TsscStory saveStory(TsscStory tsscStory, Long idTsscGame);
	/*
	 * 
	 */
	public TsscStory updateDescriptionStory(Long idTsscStory, String tsscSotryDescription);
	/*
	 * 
	 */
	public TsscStory updateBusinessValueStory(Long idTsscStory, BigDecimal tsscStoryBusinessValue);
	/*
	 * 
	 */
	
	public TsscStory updatePriorityStory(Long idTsscStory, BigDecimal tsscStoryPriority);
	

}
