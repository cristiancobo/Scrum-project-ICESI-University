package com.example.demo.Modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Service.TsscGameServiceImp;
import com.example.demo.Service.TsscTopicServiceImp;

import lombok.extern.java.Log;
@Log
@SpringBootTest
class TsscGameTest {

	
	
	/*
	 * Dependency injections ___________________________________________________
	 */
	@Autowired
	TsscGameServiceImp tsscGameServiceImp;
	@Autowired
	TsscTopicServiceImp tsscTopicServiceImp;


	/*
	 * Objects test_____________________________________________________________
	 */
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
	public void startTests() {
		log.info("Test started");
	}
	@AfterEach
	public void finishTests() {
		log.info("Test finished");
	}
	@BeforeEach
	public void setup() {
		
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
		 tsscGameObjectTest_03.setNGroups(-55);
		 tsscGameObjectTest_03.setNSprints(1);
		 
		 tsscGameObjectTest_04 = new TsscGame();
		 tsscGameObjectTest_04.setId(4);
		 tsscGameObjectTest_04.setNGroups(0);
		 tsscGameObjectTest_04.setNSprints(100);
		 
		 tsscGameObjectTest_05 = new TsscGame();
		 tsscGameObjectTest_05.setId(5);
		 tsscGameObjectTest_05.setNGroups(0);
		 tsscGameObjectTest_05.setNSprints(0);

		 tsscGameObjectTest_06 = new TsscGame();
		 tsscGameObjectTest_06.setId(6);
		 tsscGameObjectTest_06.setNGroups(-1);
		 tsscGameObjectTest_06.setNSprints(-1);
		 
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
	@Test
	public void test() {
		assertTrue(true);
	}
	
	@Test
	public void saveGameTest() {
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_01);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_02);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_03);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_04);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_05);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_06);
		
		tsscGameServiceImp.saveGame(tsscGameObjectTest_01, true, 0001L);
		assertEquals(tsscGameObjectTest_01.getId(), tsscGameServiceImp.findByIdTsscGame(0001L).getId());
		assertTrue(tsscGameServiceImp.existByIdTsscGame(0001L));
		tsscGameServiceImp.saveGame(tsscGameObjectTest_02, false, 0L);
		assertEquals(tsscGameObjectTest_02.getId(), tsscGameServiceImp.findByIdTsscGame(0002L).getId());
		assertTrue(tsscGameServiceImp.existByIdTsscGame(0002L));
		tsscGameServiceImp.saveGame(tsscGameObjectTest_03, true, 0003L);
		assertFalse(tsscGameServiceImp.existByIdTsscGame(0003L));
		tsscGameServiceImp.saveGame(tsscGameObjectTest_04,false , 0004L);
		assertFalse(tsscGameServiceImp.existByIdTsscGame(0004L));
		tsscGameServiceImp.saveGame(tsscGameObjectTest_05,false , 0005L);
		assertFalse(tsscGameServiceImp.existByIdTsscGame(0005L));
		tsscGameServiceImp.saveGame(tsscGameObjectTest_06,false , 0006L);
		assertFalse(tsscGameServiceImp.existByIdTsscGame(0006L));
	}
	@Test
	public void saveGameTest_2() {
		
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_01);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_02);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_03);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_04);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_05);
		
		tsscGameServiceImp.saveGameTwo(tsscGameObjectTest_01, 0001L);
		assertEquals(tsscGameObjectTest_01.getId(), tsscGameServiceImp.findByIdTsscGame(0001L).getId());
		assertTrue(tsscGameServiceImp.existByIdTsscGame(0001L));
		tsscGameServiceImp.saveGameTwo(tsscGameObjectTest_02, 0L);
		assertEquals(tsscGameObjectTest_02.getId(), tsscGameServiceImp.findByIdTsscGame(0002L).getId());
		assertTrue(tsscGameServiceImp.existByIdTsscGame(0002L));
		tsscGameServiceImp.saveGameTwo(tsscGameObjectTest_03, 0003L);
		assertFalse(tsscGameServiceImp.existByIdTsscGame(0003L));
		tsscGameServiceImp.saveGameTwo(tsscGameObjectTest_04, 0004L);
		assertFalse(tsscGameServiceImp.existByIdTsscGame(0004L));
		tsscGameServiceImp.saveGameTwo(tsscGameObjectTest_05, 0005L);

	}
	@Test
	void  updateNGroupsGameTest() {
		
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_01);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_02);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_03);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_04);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_05);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_06);
		
		tsscGameServiceImp.saveGame(tsscGameObjectTest_01, true,0001L);
		tsscGameServiceImp.updateGameAmountNGroups(0001L,-1);
		tsscGameServiceImp.saveGame(tsscGameObjectTest_02, true,0002L);
		tsscGameServiceImp.updateGameAmountNGroups(0002L,100);
		tsscGameServiceImp.updateGameAmountNGroups(0003L,1);
		tsscGameServiceImp.updateGameAmountNGroups(0004L,0);
		tsscGameServiceImp.updateGameAmountNGroups(0005L,3);
		tsscGameServiceImp.updateGameAmountNGroups(0006L,5);
		
		assertTrue(tsscGameServiceImp.existByIdTsscGame(0001L));
		assertEquals(tsscGameObjectTest_01.getNGroups(), tsscGameServiceImp.findByIdTsscGame(0001L).getNGroups());
		assertTrue(tsscGameServiceImp.existByIdTsscGame(0002L));
		assertNotEquals(tsscGameObjectTest_02.getNGroups(), tsscGameServiceImp.findByIdTsscGame(0002L).getNGroups());
		assertFalse(tsscGameServiceImp.existByIdTsscGame(0003L));
		assertFalse(tsscGameServiceImp.existByIdTsscGame(0004L));
		assertFalse(tsscGameServiceImp.existByIdTsscGame(0005L));
		assertFalse(tsscGameServiceImp.existByIdTsscGame(0006L));
	}
	
	@Test
	void  updateNSprintsGameTest() {
		
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_01);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_02);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_03);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_04);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_05);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_06);
		
		tsscGameServiceImp.saveGame(tsscGameObjectTest_01, true,0001L);
		tsscGameServiceImp.updateGameAmountNSprints(0001L,-1);
		tsscGameServiceImp.saveGame(tsscGameObjectTest_02, true,0002L);
		tsscGameServiceImp.updateGameAmountNSprints(0002L,100);
		tsscGameServiceImp.saveGame(tsscGameObjectTest_03, true,0003L);
		tsscGameServiceImp.updateGameAmountNSprints(0003L,1);
		tsscGameServiceImp.saveGame(tsscGameObjectTest_04, true,0004L);
		tsscGameServiceImp.updateGameAmountNSprints(0004L,0);
		tsscGameServiceImp.saveGame(tsscGameObjectTest_05, true,0005L);
		tsscGameServiceImp.updateGameAmountNSprints(0005L,3);
		tsscGameServiceImp.saveGame(tsscGameObjectTest_06, true,0006L);
		tsscGameServiceImp.updateGameAmountNSprints(0006L,6);
		
		assertTrue(tsscGameServiceImp.existByIdTsscGame(0001L));
		assertEquals(tsscGameObjectTest_01.getNSprints(), tsscGameServiceImp.findByIdTsscGame(0001L).getNSprints());
		assertTrue(tsscGameServiceImp.existByIdTsscGame(0002L));
		assertNotEquals(tsscGameObjectTest_02.getNSprints(), tsscGameServiceImp.findByIdTsscGame(0002L).getNSprints());
		assertFalse(tsscGameServiceImp.existByIdTsscGame(0003L));
		assertFalse(tsscGameServiceImp.existByIdTsscGame(0004L));
		assertFalse(tsscGameServiceImp.existByIdTsscGame(0005L));
		assertFalse(tsscGameServiceImp.existByIdTsscGame(0006L));
	}
	
	
}
