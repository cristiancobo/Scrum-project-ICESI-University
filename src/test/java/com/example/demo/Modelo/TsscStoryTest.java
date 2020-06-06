package com.example.demo.Modelo;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Service.TsscGameServiceImp;
import com.example.demo.Service.TsscStoryServiceImp;
import com.example.demo.Service.TsscTopicServiceImp;

import lombok.extern.java.Log;

@SpringBootTest
@Log
class TsscStoryTest {

	
	/*
	 * Dependency injections ___________________________________________________
	 */
	@Autowired
	TsscGameServiceImp tsscGameServiceImp; 
	@Autowired
	TsscStoryServiceImp tsscStoryServiceImp;
	@Autowired
	TsscTopicServiceImp tsscTopicServiceImp;
	
	/*
	 * Objects test_____________________________________________________________
	 */
	
	TsscStory tsscStoryObjectTest_01;
	TsscStory tsscStoryObjectTest_02;
	TsscStory tsscStoryObjectTest_03;
	TsscStory tsscStoryObjectTest_04;
	TsscStory tsscStoryObjectTest_05;
	TsscStory tsscStoryObjectTest_06;
	TsscStory tsscStoryObjectTest_07;
	TsscStory tsscStoryObjectTest_08;
	TsscStory tsscStoryObjectTest_09;
	TsscStory tsscStoryObjectTest_10;
	TsscStory tsscStoryObjectTest_11;
	TsscStory tsscStoryObjectTest_12;
	TsscStory tsscStoryObjectTest_13;
	TsscStory tsscStoryObjectTest_14;
	TsscStory tsscStoryObjectTest_15;
	TsscStory tsscStoryObjectTest_16;
	TsscStory tsscStoryObjectTest_17;
	TsscStory tsscStoryObjectTest_18;
	TsscStory tsscStoryObjectTest_19;
	TsscStory tsscStoryObjectTest_20;
	TsscStory tsscStoryObjectTest_21;
	TsscStory tsscStoryObjectTest_22;
	TsscStory tsscStoryObjectTest_23;
	TsscStory tsscStoryObjectTest_24;
	TsscStory tsscStoryObjectTest_25;
	
	TsscGame tsscGameObjectTest_01;
	TsscGame tsscGameObjectTest_02;
	TsscGame tsscGameObjectTest_03;
	TsscGame tsscGameObjectTest_04;
	TsscGame tsscGameObjectTest_05;
	TsscGame tsscGameObjectTest_06;
	TsscGame tsscGameObjectTest_07;
	TsscGame tsscGameObjectTest_08;
	TsscGame tsscGameObjectTest_09;
	TsscGame tsscGameObjectTest_10;
	TsscGame tsscGameObjectTest_11;
	TsscGame tsscGameObjectTest_12;
	TsscGame tsscGameObjectTest_13;
	TsscGame tsscGameObjectTest_14;
	TsscGame tsscGameObjectTest_15;
	TsscGame tsscGameObjectTest_16;
	TsscGame tsscGameObjectTest_17;
	TsscGame tsscGameObjectTest_18;
	TsscGame tsscGameObjectTest_19;
	TsscGame tsscGameObjectTest_20;
	TsscGame tsscGameObjectTest_21;
	TsscGame tsscGameObjectTest_22;
	TsscGame tsscGameObjectTest_23;
	TsscGame tsscGameObjectTest_24;
	TsscGame tsscGameObjectTest_25;
	
	TsscTopic tsscTopicObjectTest_01;
	TsscTopic tsscTopicObjectTest_02;
	TsscTopic tsscTopicObjectTest_03;
	TsscTopic tsscTopicObjectTest_04;
	TsscTopic tsscTopicObjectTest_05;
	TsscTopic tsscTopicObjectTest_06;
	TsscTopic tsscTopicObjectTest_07;
	TsscTopic tsscTopicObjectTest_08;
	TsscTopic tsscTopicObjectTest_09;
	TsscTopic tsscTopicObjectTest_10;
	TsscTopic tsscTopicObjectTest_11;
	TsscTopic tsscTopicObjectTest_12;
	TsscTopic tsscTopicObjectTest_13;
	TsscTopic tsscTopicObjectTest_14;
	TsscTopic tsscTopicObjectTest_15;
	TsscTopic tsscTopicObjectTest_16;
	TsscTopic tsscTopicObjectTest_17;
	TsscTopic tsscTopicObjectTest_18;
	TsscTopic tsscTopicObjectTest_19;
	TsscTopic tsscTopicObjectTest_20;
	TsscTopic tsscTopicObjectTest_21;
	TsscTopic tsscTopicObjectTest_22;
	TsscTopic tsscTopicObjectTest_23;
	TsscTopic tsscTopicObjectTest_24;
	TsscTopic tsscTopicObjectTest_25;
	

	/*
	 * Test methods_____________________________________________________________
	 */
	
	
	@BeforeEach
	public void sutup() {
		
	 tsscStoryObjectTest_01 = new TsscStory();
	 tsscStoryObjectTest_01.setId(1L);
	 tsscStoryObjectTest_01.setBusinessValue(new BigDecimal(10));
	 tsscStoryObjectTest_01.setPriority(new BigDecimal(12));
	 tsscStoryObjectTest_01.setInitialSprint(new BigDecimal(13));
	 
	 
	 tsscStoryObjectTest_02 = new TsscStory();
	 tsscStoryObjectTest_02.setId(2L);
	 tsscStoryObjectTest_02.setBusinessValue(new BigDecimal(30));
	 tsscStoryObjectTest_02.setPriority(new BigDecimal(134));
	 tsscStoryObjectTest_02.setInitialSprint(new BigDecimal(4));
	 
	 tsscStoryObjectTest_03 = new TsscStory();
	 tsscStoryObjectTest_03.setId(3L);
	 tsscStoryObjectTest_03.setBusinessValue(new BigDecimal(-55));
	 tsscStoryObjectTest_03.setPriority(new BigDecimal(1));
	 tsscStoryObjectTest_03.setInitialSprint(new BigDecimal(0));
	 
	 tsscStoryObjectTest_04 = new TsscStory();
	 tsscStoryObjectTest_04.setId(4L);
	 tsscStoryObjectTest_04.setBusinessValue(new BigDecimal(0));
	 tsscStoryObjectTest_04.setPriority(new BigDecimal(100));
	 tsscStoryObjectTest_04.setInitialSprint(new BigDecimal(0));
	 
	 tsscStoryObjectTest_05 = new TsscStory();
	 tsscStoryObjectTest_05.setId(5L);
	 tsscStoryObjectTest_05.setBusinessValue(new BigDecimal(0));
	 tsscStoryObjectTest_05.setPriority(new BigDecimal(0));
	 tsscStoryObjectTest_05.setInitialSprint(new BigDecimal(0));

	 tsscStoryObjectTest_06 = new TsscStory();
	 tsscStoryObjectTest_06.setId(6L);
	 tsscStoryObjectTest_06.setBusinessValue(new BigDecimal(-1));
	 tsscStoryObjectTest_06.setPriority(new BigDecimal(-1));
	 tsscStoryObjectTest_06.setInitialSprint(new BigDecimal(0));

	 tsscGameObjectTest_01 = new TsscGame();
	 tsscGameObjectTest_01.setId(1);
	 tsscGameObjectTest_01.setNGroups(10);
	 tsscGameObjectTest_01.setNSprints(12);
	 
	 tsscGameObjectTest_02 = new TsscGame();
	 tsscGameObjectTest_02.setId(2);
	 tsscGameObjectTest_02.setNGroups(30);
	 tsscGameObjectTest_02.setNSprints(134);
	 
	 tsscGameObjectTest_03 = new TsscGame();
	 tsscGameObjectTest_03.setId(3);
	 tsscGameObjectTest_03.setNGroups(455);
	 tsscGameObjectTest_03.setNSprints(1);
	 
	 tsscGameObjectTest_04 = new TsscGame();
	 tsscGameObjectTest_04.setId(4);
	 tsscGameObjectTest_04.setNGroups(55);
	 tsscGameObjectTest_04.setNSprints(100);
	 
	 tsscGameObjectTest_05 = new TsscGame();
	 tsscGameObjectTest_05.setId(5);
	 tsscGameObjectTest_05.setNGroups(3);
	 tsscGameObjectTest_05.setNSprints(5);

	 tsscGameObjectTest_06 = new TsscGame();
	 tsscGameObjectTest_06.setId(6);
	 tsscGameObjectTest_06.setNGroups(13);
	 tsscGameObjectTest_06.setNSprints(14);
	 
	 tsscTopicObjectTest_01 = new TsscTopic();
	 tsscTopicObjectTest_01.setId(0001L);
	 tsscTopicObjectTest_01.setDefaultGroups(10L);
	 tsscTopicObjectTest_01.setDefaultSprints(12L);
	 
	 tsscTopicObjectTest_02 = new TsscTopic();
	 tsscTopicObjectTest_02.setId(0002L);
	 tsscTopicObjectTest_02.setDefaultGroups(30L);
	 tsscTopicObjectTest_02.setDefaultSprints(134L);
	 
	 tsscTopicObjectTest_03 = new TsscTopic();
	 tsscTopicObjectTest_03.setId(0003L);
	 tsscTopicObjectTest_03.setDefaultGroups(55L);
	 tsscTopicObjectTest_03.setDefaultSprints(1L);
	 
	 tsscTopicObjectTest_04 = new TsscTopic();
	 tsscTopicObjectTest_04.setId(0004L);
	 tsscTopicObjectTest_04.setDefaultGroups(1L);
	 tsscTopicObjectTest_04.setDefaultSprints(100L);
	 
	 tsscTopicObjectTest_05 = new TsscTopic();
	 tsscTopicObjectTest_05.setId(0005L);
	 tsscTopicObjectTest_05.setDefaultGroups(45L);
	 tsscTopicObjectTest_05.setDefaultSprints(54L);

	 tsscTopicObjectTest_06 = new TsscTopic();
	 tsscTopicObjectTest_06.setId(0006L);
	 tsscTopicObjectTest_06.setDefaultGroups(41L);
	 tsscTopicObjectTest_06.setDefaultSprints(31L);	
	}
	@BeforeEach
	public void startTests() {
		log.info("Test started");	
	}
	@AfterEach
	public void finishTests() {
		log.info("Test finished");
	}
	
	@Test
	public void saveStoryTest() { 
		
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_01);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_02);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_03);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_04);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_05);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_06);
		
		tsscGameServiceImp.saveGame(tsscGameObjectTest_01,true, 0001L);
		tsscGameServiceImp.saveGame(tsscGameObjectTest_02,true, 0002L);
		tsscGameServiceImp.saveGame(tsscGameObjectTest_03,true, 0003L);
		tsscGameServiceImp.saveGame(tsscGameObjectTest_04,true, 0004L);
		tsscGameServiceImp.saveGame(tsscGameObjectTest_05,true, 0005L);
		tsscGameServiceImp.saveGame(tsscGameObjectTest_06,true, 0006L);
		
		tsscStoryServiceImp.saveStory(tsscStoryObjectTest_01,  0001L);
		assertEquals(tsscStoryObjectTest_01.getId(), tsscStoryServiceImp.findByIdTsscStory(1L).getId());
		assertTrue(tsscStoryServiceImp.existByIdTsscStory(1L));
		tsscStoryServiceImp.saveStory(tsscStoryObjectTest_02,  0002L);
		assertEquals(tsscStoryObjectTest_02.getId(), tsscStoryServiceImp.findByIdTsscStory(2L).getId());
		assertTrue(tsscStoryServiceImp.existByIdTsscStory(2L));
		tsscStoryServiceImp.saveStory(tsscStoryObjectTest_03,  0003L);
		assertFalse(tsscStoryServiceImp.existByIdTsscStory(3L));
		tsscStoryServiceImp.saveStory(tsscStoryObjectTest_04 , 0004L);
		assertFalse(tsscStoryServiceImp.existByIdTsscStory(4L));
		tsscStoryServiceImp.saveStory(tsscStoryObjectTest_05 , 0005L);
		assertFalse(tsscStoryServiceImp.existByIdTsscStory(5L));
		tsscStoryServiceImp.saveStory(tsscStoryObjectTest_06 , 0006L);
		assertFalse(tsscStoryServiceImp.existByIdTsscStory(6L));
	}
	
	@Test
	void  updateBusinessValueStoryTest() {
		
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_01);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_02);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_03);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_04);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_05);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_06);
		
		tsscGameServiceImp.saveGame(tsscGameObjectTest_01,true, 0001L);
		tsscGameServiceImp.saveGame(tsscGameObjectTest_02,true, 0002L);
		tsscGameServiceImp.saveGame(tsscGameObjectTest_03,true, 0003L);
		tsscGameServiceImp.saveGame(tsscGameObjectTest_04,true, 0004L);
		tsscGameServiceImp.saveGame(tsscGameObjectTest_05,true, 0005L);
		tsscGameServiceImp.saveGame(tsscGameObjectTest_06,true, 0006L);

		
		tsscStoryServiceImp.saveStory(tsscStoryObjectTest_01, 0001L);
		tsscStoryServiceImp.updateBusinessValueStory(1L,new BigDecimal(-1));
		
		tsscStoryServiceImp.saveStory(tsscStoryObjectTest_02, 0002L);
		tsscStoryServiceImp.updateBusinessValueStory(2L,new BigDecimal(100));
		
		tsscStoryServiceImp.saveStory(tsscStoryObjectTest_03, 0003L);
		tsscStoryServiceImp.updateBusinessValueStory(3L,new BigDecimal(1));
		
		tsscStoryServiceImp.saveStory(tsscStoryObjectTest_04, 0004L);
		tsscStoryServiceImp.updateBusinessValueStory(4L,new BigDecimal(0));
		
		tsscStoryServiceImp.saveStory(tsscStoryObjectTest_05, 0005L);
		tsscStoryServiceImp.updateBusinessValueStory(5L,new BigDecimal(3));
		
		tsscStoryServiceImp.saveStory(tsscStoryObjectTest_06, 0006L);
		tsscStoryServiceImp.updateBusinessValueStory(6L,new BigDecimal(5));
		
		assertTrue(tsscStoryServiceImp.existByIdTsscStory(1L));
		assertTrue(tsscStoryServiceImp.existByIdTsscStory(2L));
		assertFalse(tsscStoryServiceImp.existByIdTsscStory(3L));
		assertFalse(tsscStoryServiceImp.existByIdTsscStory(4L));
		assertFalse(tsscStoryServiceImp.existByIdTsscStory(5L));
		assertFalse(tsscStoryServiceImp.existByIdTsscStory(6L));
	}
	
	@Test
	void  updatePriorityStoryTest() {
		
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_01);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_02);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_03);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_04);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_05);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_06);
		
		tsscGameServiceImp.saveGame(tsscGameObjectTest_01,true, 0001L);
		tsscGameServiceImp.saveGame(tsscGameObjectTest_02,true, 0002L);
		tsscGameServiceImp.saveGame(tsscGameObjectTest_03,true, 0003L);
		tsscGameServiceImp.saveGame(tsscGameObjectTest_04,true, 0004L);
		tsscGameServiceImp.saveGame(tsscGameObjectTest_05,true, 0005L);
		tsscGameServiceImp.saveGame(tsscGameObjectTest_06,true, 0006L);

		
		tsscStoryServiceImp.saveStory(tsscStoryObjectTest_01, 0001L);
		tsscStoryServiceImp.updatePriorityStory(1L,new BigDecimal(-1));
		
		tsscStoryServiceImp.saveStory(tsscStoryObjectTest_02, 0002L);
		tsscStoryServiceImp.updatePriorityStory(2L,new BigDecimal(100));
		
		tsscStoryServiceImp.saveStory(tsscStoryObjectTest_03, 0003L);
		tsscStoryServiceImp.updatePriorityStory(3L,new BigDecimal(1));
		
		tsscStoryServiceImp.saveStory(tsscStoryObjectTest_04, 0004L);
		tsscStoryServiceImp.updatePriorityStory(0004L,new BigDecimal(0));
		
		tsscStoryServiceImp.saveStory(tsscStoryObjectTest_05, 0005L);
		tsscStoryServiceImp.updatePriorityStory(0005L,new BigDecimal(3));
		
		tsscStoryServiceImp.saveStory(tsscStoryObjectTest_06, 0006L);
		tsscStoryServiceImp.updatePriorityStory(0006L,new BigDecimal(5));
		
		assertTrue(tsscStoryServiceImp.existByIdTsscStory(1L));
		assertTrue(tsscStoryServiceImp.existByIdTsscStory(2L));
		assertFalse(tsscStoryServiceImp.existByIdTsscStory(3L));
		assertFalse(tsscStoryServiceImp.existByIdTsscStory(4L));
		assertFalse(tsscStoryServiceImp.existByIdTsscStory(5L));
		assertFalse(tsscStoryServiceImp.existByIdTsscStory(6L));
	}
	

}
