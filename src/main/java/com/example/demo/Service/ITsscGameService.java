package com.example.demo.Service;

import com.example.demo.Modelo.TsscGame;

public interface ITsscGameService {
	
	/*
	 * 
	 */
	public TsscGame saveGame(TsscGame tsscGame, boolean isTopic, Long idTsscTopic);
	/*
	 * 
	 */
	public TsscGame saveGameTwo(TsscGame tsscGame, Long idTsscTopic);
	/*
	 * 
	 */
	public TsscGame updateNameGame(Long idTsscGame, String tsscNameGame);
	/*
	 * 
	 */
	public TsscGame updateGameAmountNSprints(Long idTsscGame, int amountDefaulSprintsTsscGame);
	/*
	 * 
	 */
	public TsscGame updateGameAmountNGroups(Long idTsscGame, int amountDefaulGroupsTsscGame);
}
