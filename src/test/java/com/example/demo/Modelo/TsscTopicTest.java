package com.example.demo.Modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Service.TsscTopicServiceImp;

import lombok.extern.java.Log;

@SpringBootTest
@Log
class TsscTopicTest {
	
	
	/*
	 * Dependency injections ___________________________________________________
	 */

	@Autowired
	TsscTopicServiceImp tsscTopicServiceImp;

	/*
	 * Objects test_____________________________________________________________
	 */
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
	public void setup() {
		
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
	 tsscTopicObjectTest_03.setDefaultGroups(-55L);
	 tsscTopicObjectTest_03.setDefaultSprints(1L);
	 
	 tsscTopicObjectTest_04 = new TsscTopic();
	 tsscTopicObjectTest_04.setId(0004L);
	 tsscTopicObjectTest_04.setDefaultGroups(0L);
	 tsscTopicObjectTest_04.setDefaultSprints(100L);
	 
	 tsscTopicObjectTest_05 = new TsscTopic();
	 tsscTopicObjectTest_05.setId(0005L);
	 tsscTopicObjectTest_05.setDefaultGroups(0L);
	 tsscTopicObjectTest_05.setDefaultSprints(0L);

	 tsscTopicObjectTest_06 = new TsscTopic();
	 tsscTopicObjectTest_06.setId(0006L);
	 tsscTopicObjectTest_06.setDefaultGroups(-1L);
	 tsscTopicObjectTest_06.setDefaultSprints(1L);
	 

	 
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
	public void testSaveTopicImpTest() {
		
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_01);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_02);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_03);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_04);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_05);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_06);
		
		assertEquals(tsscTopicObjectTest_01.getId(), tsscTopicServiceImp.findByIdTsscTopic(0001L).getId());
		assertTrue(tsscTopicServiceImp.existByIdTsscTopic(0001L));
		assertEquals(tsscTopicObjectTest_02.getId(), tsscTopicServiceImp.findByIdTsscTopic(0002L).getId());
		assertTrue(tsscTopicServiceImp.existByIdTsscTopic(0002L));
		assertFalse(tsscTopicServiceImp.existByIdTsscTopic(0003L));
		assertFalse(tsscTopicServiceImp.existByIdTsscTopic(0004L));
		assertFalse(tsscTopicServiceImp.existByIdTsscTopic(0005L));
		assertFalse(tsscTopicServiceImp.existByIdTsscTopic(0006L));
	}
	@Test
	void testUpdateDefaultGroupsImpTest() {
		
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_01);
		tsscTopicServiceImp.updateTopicAmountDefaultGroups(0001L,-1L);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_02);
		tsscTopicServiceImp.updateTopicAmountDefaultGroups(0002L,100L);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_03);
		tsscTopicServiceImp.updateTopicAmountDefaultGroups(0003L,1L);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_04);
		tsscTopicServiceImp.updateTopicAmountDefaultGroups(0005L,0L);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_05);
		tsscTopicServiceImp.updateTopicAmountDefaultGroups(0005L,3L);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_06);
		tsscTopicServiceImp.updateTopicAmountDefaultGroups(0006L,5L);
		
		assertTrue(tsscTopicServiceImp.existByIdTsscTopic(0001L));
		assertEquals(tsscTopicObjectTest_01.getDefaultGroups(), tsscTopicServiceImp.findByIdTsscTopic(0001L).getDefaultGroups());
		assertTrue(tsscTopicServiceImp.existByIdTsscTopic(0002L));
		assertNotEquals(tsscTopicObjectTest_02.getDefaultGroups(), tsscTopicServiceImp.findByIdTsscTopic(0002L).getDefaultGroups());
		assertFalse(tsscTopicServiceImp.existByIdTsscTopic(0003L));
		assertFalse(tsscTopicServiceImp.existByIdTsscTopic(0004L));
		assertFalse(tsscTopicServiceImp.existByIdTsscTopic(0005L));
		assertFalse(tsscTopicServiceImp.existByIdTsscTopic(0006L));
	}
	
	
	@Test
	void testUpdateDefaultSprintsImpTest() {
		
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_01);
		tsscTopicServiceImp.updateTopicAmountDefaultSprints(0001L,-1L);
		tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_02);
		tsscTopicServiceImp.updateTopicAmountDefaultSprints(0002L,100L);
		tsscTopicServiceImp.updateTopicAmountDefaultSprints(0003L,1L);
		tsscTopicServiceImp.updateTopicAmountDefaultSprints(0004L,0L);
		tsscTopicServiceImp.updateTopicAmountDefaultSprints(0005L,3L);
		tsscTopicServiceImp.updateTopicAmountDefaultSprints(0006L,5L);
		
		assertTrue(tsscTopicServiceImp.existByIdTsscTopic(0001L));
		assertEquals(tsscTopicObjectTest_01.getDefaultSprints(), tsscTopicServiceImp.findByIdTsscTopic(0001L).getDefaultSprints());
		assertTrue(tsscTopicServiceImp.existByIdTsscTopic(0002L));
		assertNotEquals(tsscTopicObjectTest_02.getDefaultSprints(), tsscTopicServiceImp.findByIdTsscTopic(0002L).getDefaultSprints());
		assertFalse(tsscTopicServiceImp.existByIdTsscTopic(0003L));
		assertFalse(tsscTopicServiceImp.existByIdTsscTopic(0004L));
		assertFalse(tsscTopicServiceImp.existByIdTsscTopic(0005L));
		assertFalse(tsscTopicServiceImp.existByIdTsscTopic(0006L));
	}

}
