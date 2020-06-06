package com.example.demo.Service;

import com.example.demo.Modelo.TsscTopic;

public interface ITsscTopicService  {
	

	public TsscTopic saveTopic(TsscTopic tsscTopic);

	public TsscTopic updateTopicAmountDefaultSprints(Long idTsscTopic, Long amountDefaultTsscTopic);

	public TsscTopic updateTopicAmountDefaultGroups(Long idTsscTopic, Long amountDefaulGroupsTsscTopic);
}
