package com.example.demo.Modelo;



import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Optional;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.Repository.ITsscTopicRepository;
import com.example.demo.Service.TsscTopicServiceImp;

import ch.qos.logback.classic.Logger;

import lombok.Data;
import lombok.extern.java.Log;



@Log
@SpringBootTest
class TsscTopicServiceImpTest {
	
	
	/*
	 * Dependency injections ___________________________________________________
	 */
	@InjectMocks
	TsscTopicServiceImp tsscTopicServiceImp;

	/*
	 * Mocks ___________________________________________________________________
	 */
	@Mock
	ITsscTopicRepository iTsscTopicRepository;

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

		MockitoAnnotations.initMocks(this);

		 tsscTopicObjectTest_01 = new TsscTopic();
		 tsscTopicObjectTest_02 = new TsscTopic();
		 tsscTopicObjectTest_03 = new TsscTopic();
		 tsscTopicObjectTest_04 = new TsscTopic();
		 tsscTopicObjectTest_05 = new TsscTopic();
		 tsscTopicObjectTest_06 = new TsscTopic();
		 tsscTopicObjectTest_07 = new TsscTopic();
		 tsscTopicObjectTest_08 = new TsscTopic();
		 tsscTopicObjectTest_09 = new TsscTopic();
		 tsscTopicObjectTest_10 = new TsscTopic();
		 tsscTopicObjectTest_11 = new TsscTopic();
		 tsscTopicObjectTest_12 = new TsscTopic();
		 tsscTopicObjectTest_13 = new TsscTopic();
		 tsscTopicObjectTest_14 = new TsscTopic();
		 tsscTopicObjectTest_15 = new TsscTopic();
		 tsscTopicObjectTest_16 = new TsscTopic();
		 tsscTopicObjectTest_17 = new TsscTopic();
		 tsscTopicObjectTest_18 = new TsscTopic();
		 tsscTopicObjectTest_19 = new TsscTopic();
		 tsscTopicObjectTest_20 = new TsscTopic();
		 tsscTopicObjectTest_21 = new TsscTopic();
		 tsscTopicObjectTest_22 = new TsscTopic();
		 tsscTopicObjectTest_23 = new TsscTopic();
		 tsscTopicObjectTest_24 = new TsscTopic();
		 tsscTopicObjectTest_25 = new TsscTopic();
	
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
	public void saveTopicImpTest_1() {

		tsscTopicObjectTest_01.setDefaultGroups(-200L);
		tsscTopicObjectTest_02.setDefaultGroups(-100L);
		tsscTopicObjectTest_03.setDefaultGroups(-130L);
		tsscTopicObjectTest_04.setDefaultGroups(-199L);
		tsscTopicObjectTest_05.setDefaultGroups(-160L);

		tsscTopicObjectTest_06.setDefaultGroups(-99L);
		tsscTopicObjectTest_07.setDefaultGroups(-45L);
		tsscTopicObjectTest_08.setDefaultGroups(-1L);
		tsscTopicObjectTest_09.setDefaultGroups(-34L);
		tsscTopicObjectTest_10.setDefaultGroups(-80L);

		tsscTopicObjectTest_11.setDefaultGroups(0L);
		tsscTopicObjectTest_12.setDefaultGroups(4L);
		tsscTopicObjectTest_13.setDefaultGroups(20L);
		tsscTopicObjectTest_14.setDefaultGroups(100L);
		tsscTopicObjectTest_01.setDefaultGroups(50L);

		tsscTopicObjectTest_15.setDefaultGroups(101L);
		tsscTopicObjectTest_16.setDefaultGroups(200L);
		tsscTopicObjectTest_17.setDefaultGroups(150L);
		tsscTopicObjectTest_18.setDefaultGroups(120L);
		tsscTopicObjectTest_19.setDefaultGroups(199L);

		tsscTopicObjectTest_20.setDefaultGroups(230L);
		tsscTopicObjectTest_21.setDefaultGroups(1000L);
		tsscTopicObjectTest_22.setDefaultGroups(300L);
		tsscTopicObjectTest_23.setDefaultGroups(400L);
		tsscTopicObjectTest_24.setDefaultGroups(550L);

		TsscTopic tsscTopicObjectTest_01_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_01);
		TsscTopic tsscTopicObjectTest_02_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_02);
		TsscTopic tsscTopicObjectTest_03_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_03);
		TsscTopic tsscTopicObjectTest_04_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_04);
		TsscTopic tsscTopicObjectTest_05_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_05);
		TsscTopic tsscTopicObjectTest_06_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_06);
		TsscTopic tsscTopicObjectTest_07_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_07);
		TsscTopic tsscTopicObjectTest_08_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_08);
		TsscTopic tsscTopicObjectTest_09_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_09);
		TsscTopic tsscTopicObjectTest_10_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_10);
		TsscTopic tsscTopicObjectTest_11_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_11);
		TsscTopic tsscTopicObjectTest_12_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_12);
		TsscTopic tsscTopicObjectTest_13_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_13);
		TsscTopic tsscTopicObjectTest_14_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_14);
		TsscTopic tsscTopicObjectTest_15_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_15);
		TsscTopic tsscTopicObjectTest_16_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_16);
		TsscTopic tsscTopicObjectTest_17_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_17);
		TsscTopic tsscTopicObjectTest_18_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_18);
		TsscTopic tsscTopicObjectTest_19_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_19);
		TsscTopic tsscTopicObjectTest_20_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_20);
		TsscTopic tsscTopicObjectTest_21_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_21);
		TsscTopic tsscTopicObjectTest_22_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_22);
		TsscTopic tsscTopicObjectTest_23_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_23);
		TsscTopic tsscTopicObjectTest_24_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_24);
		TsscTopic tsscTopicObjectTest_25_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_25);

		assertNull(tsscTopicObjectTest_01_copy);
		assertNull(tsscTopicObjectTest_02_copy);
		assertNull(tsscTopicObjectTest_03_copy);
		assertNull(tsscTopicObjectTest_04_copy);
		assertNull(tsscTopicObjectTest_05_copy);
		assertNull(tsscTopicObjectTest_06_copy);
		assertNull(tsscTopicObjectTest_07_copy);
		assertNull(tsscTopicObjectTest_08_copy);
		assertNull(tsscTopicObjectTest_09_copy);
		assertNull(tsscTopicObjectTest_10_copy);
		assertNull(tsscTopicObjectTest_11_copy);
		assertNull(tsscTopicObjectTest_12_copy);
		assertNull(tsscTopicObjectTest_13_copy);
		assertNull(tsscTopicObjectTest_14_copy);
		assertNull(tsscTopicObjectTest_15_copy);
		assertNull(tsscTopicObjectTest_16_copy);
		assertNull(tsscTopicObjectTest_17_copy);
		assertNull(tsscTopicObjectTest_18_copy);
		assertNull(tsscTopicObjectTest_19_copy);
		assertNull(tsscTopicObjectTest_20_copy);
		assertNull(tsscTopicObjectTest_21_copy);
		assertNull(tsscTopicObjectTest_22_copy);
		assertNull(tsscTopicObjectTest_23_copy);
		assertNull(tsscTopicObjectTest_24_copy);
		assertNull(tsscTopicObjectTest_25_copy);

		log.info("Test finished succesfully. ");
	}
	

	@Test
	public void saveTopicImpTest_2() {

		tsscTopicObjectTest_01.setDefaultSprints(-200L);
		tsscTopicObjectTest_02.setDefaultSprints(-100L);
		tsscTopicObjectTest_03.setDefaultSprints(-130L);
		tsscTopicObjectTest_04.setDefaultSprints(-199L);
		tsscTopicObjectTest_05.setDefaultSprints(-160L);

		tsscTopicObjectTest_06.setDefaultSprints(-99L);
		tsscTopicObjectTest_07.setDefaultSprints(-45L);
		tsscTopicObjectTest_08.setDefaultSprints(-1L);
		tsscTopicObjectTest_09.setDefaultSprints(-34L);
		tsscTopicObjectTest_10.setDefaultSprints(-80L);

		tsscTopicObjectTest_11.setDefaultSprints(0L);
		tsscTopicObjectTest_12.setDefaultSprints(4L);
		tsscTopicObjectTest_13.setDefaultSprints(20L);
		tsscTopicObjectTest_14.setDefaultSprints(100L);
		tsscTopicObjectTest_15.setDefaultSprints(50L);

		tsscTopicObjectTest_16.setDefaultSprints(101L);
		tsscTopicObjectTest_17.setDefaultSprints(200L);
		tsscTopicObjectTest_18.setDefaultSprints(150L);
		tsscTopicObjectTest_19.setDefaultSprints(120L);
		tsscTopicObjectTest_20.setDefaultSprints(199L);

		tsscTopicObjectTest_21.setDefaultSprints(230L);
		tsscTopicObjectTest_22.setDefaultSprints(1000L);
		tsscTopicObjectTest_23.setDefaultSprints(300L);
		tsscTopicObjectTest_24.setDefaultSprints(400L);
		tsscTopicObjectTest_25.setDefaultSprints(550L);

		TsscTopic tsscTopicObjectTest_01_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_01);
		TsscTopic tsscTopicObjectTest_02_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_02);
		TsscTopic tsscTopicObjectTest_03_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_03);
		TsscTopic tsscTopicObjectTest_04_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_04);
		TsscTopic tsscTopicObjectTest_05_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_05);
		TsscTopic tsscTopicObjectTest_06_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_06);
		TsscTopic tsscTopicObjectTest_07_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_07);
		TsscTopic tsscTopicObjectTest_08_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_08);
		TsscTopic tsscTopicObjectTest_09_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_09);
		TsscTopic tsscTopicObjectTest_10_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_10);
		TsscTopic tsscTopicObjectTest_11_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_11);
		TsscTopic tsscTopicObjectTest_12_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_12);
		TsscTopic tsscTopicObjectTest_13_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_13);
		TsscTopic tsscTopicObjectTest_14_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_14);
		TsscTopic tsscTopicObjectTest_15_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_15);
		TsscTopic tsscTopicObjectTest_16_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_16);
		TsscTopic tsscTopicObjectTest_17_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_17);
		TsscTopic tsscTopicObjectTest_18_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_18);
		TsscTopic tsscTopicObjectTest_19_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_19);
		TsscTopic tsscTopicObjectTest_20_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_20);
		TsscTopic tsscTopicObjectTest_21_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_21);
		TsscTopic tsscTopicObjectTest_22_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_22);
		TsscTopic tsscTopicObjectTest_23_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_23);
		TsscTopic tsscTopicObjectTest_24_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_24);
		TsscTopic tsscTopicObjectTest_25_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_25);

		assertNull(tsscTopicObjectTest_01_copy);
		assertNull(tsscTopicObjectTest_02_copy);
		assertNull(tsscTopicObjectTest_03_copy);
		assertNull(tsscTopicObjectTest_04_copy);
		assertNull(tsscTopicObjectTest_05_copy);
		assertNull(tsscTopicObjectTest_06_copy);
		assertNull(tsscTopicObjectTest_07_copy);
		assertNull(tsscTopicObjectTest_08_copy);
		assertNull(tsscTopicObjectTest_09_copy);
		assertNull(tsscTopicObjectTest_10_copy);
		assertNull(tsscTopicObjectTest_11_copy);
		assertNull(tsscTopicObjectTest_12_copy);
		assertNull(tsscTopicObjectTest_13_copy);
		assertNull(tsscTopicObjectTest_14_copy);
		assertNull(tsscTopicObjectTest_15_copy);
		assertNull(tsscTopicObjectTest_16_copy);
		assertNull(tsscTopicObjectTest_17_copy);
		assertNull(tsscTopicObjectTest_18_copy);
		assertNull(tsscTopicObjectTest_19_copy);
		assertNull(tsscTopicObjectTest_20_copy);
		assertNull(tsscTopicObjectTest_21_copy);
		assertNull(tsscTopicObjectTest_22_copy);
		assertNull(tsscTopicObjectTest_23_copy);
		assertNull(tsscTopicObjectTest_24_copy);
		assertNull(tsscTopicObjectTest_25_copy);

	}
	
	@Test
	public void saveTopicImpTest_3() {

		tsscTopicObjectTest_01.setDefaultGroups(-200L);
		tsscTopicObjectTest_02.setDefaultGroups(-100L);
		tsscTopicObjectTest_03.setDefaultGroups(-130L);
		tsscTopicObjectTest_04.setDefaultGroups(-199L);
		tsscTopicObjectTest_05.setDefaultGroups(-160L);
		
		tsscTopicObjectTest_01.setDefaultSprints(-200L);
		tsscTopicObjectTest_02.setDefaultSprints(-100L);
		tsscTopicObjectTest_03.setDefaultSprints(-130L);
		tsscTopicObjectTest_04.setDefaultSprints(-199L);
		tsscTopicObjectTest_05.setDefaultSprints(-160L);

		tsscTopicObjectTest_06.setDefaultGroups(-99L);
		tsscTopicObjectTest_07.setDefaultGroups(-45L);
		tsscTopicObjectTest_08.setDefaultGroups(-1L);
		tsscTopicObjectTest_09.setDefaultGroups(-34L);
		tsscTopicObjectTest_10.setDefaultGroups(-80L);
		
		tsscTopicObjectTest_06.setDefaultSprints(-99L);
		tsscTopicObjectTest_07.setDefaultSprints(-45L);
		tsscTopicObjectTest_08.setDefaultSprints(-1L);
		tsscTopicObjectTest_09.setDefaultSprints(-34L);
		tsscTopicObjectTest_10.setDefaultSprints(-80L);

		tsscTopicObjectTest_11.setDefaultGroups(0L);
		tsscTopicObjectTest_12.setDefaultGroups(4L);
		tsscTopicObjectTest_13.setDefaultGroups(20L);
		tsscTopicObjectTest_14.setDefaultGroups(100L);
		tsscTopicObjectTest_15.setDefaultGroups(50L);

		tsscTopicObjectTest_11.setDefaultSprints(1L);
		tsscTopicObjectTest_12.setDefaultSprints(4L);
		tsscTopicObjectTest_13.setDefaultSprints(20L);
		tsscTopicObjectTest_14.setDefaultSprints(100L);
		tsscTopicObjectTest_15.setDefaultSprints(50L);

		tsscTopicObjectTest_16.setDefaultGroups(101L);
		tsscTopicObjectTest_17.setDefaultGroups(200L);
		tsscTopicObjectTest_18.setDefaultGroups(150L);
		tsscTopicObjectTest_19.setDefaultGroups(120L);
		tsscTopicObjectTest_20.setDefaultGroups(199L);

		tsscTopicObjectTest_16.setDefaultSprints(101L);
		tsscTopicObjectTest_17.setDefaultSprints(200L);
		tsscTopicObjectTest_18.setDefaultSprints(150L);
		tsscTopicObjectTest_19.setDefaultSprints(120L);
		tsscTopicObjectTest_20.setDefaultSprints(199L);

		tsscTopicObjectTest_21.setDefaultGroups(230L);
		tsscTopicObjectTest_22.setDefaultGroups(1000L);
		tsscTopicObjectTest_23.setDefaultGroups(300L);
		tsscTopicObjectTest_24.setDefaultGroups(400L);
		tsscTopicObjectTest_25.setDefaultGroups(550L);
		
		tsscTopicObjectTest_21.setDefaultSprints(230L);
		tsscTopicObjectTest_22.setDefaultSprints(1000L);
		tsscTopicObjectTest_23.setDefaultSprints(300L);
		tsscTopicObjectTest_24.setDefaultSprints(400L);
		tsscTopicObjectTest_25.setDefaultSprints(550L);

		TsscTopic tsscTopicObjectTest_01_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_01);
		TsscTopic tsscTopicObjectTest_02_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_02);
		TsscTopic tsscTopicObjectTest_03_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_03);
		TsscTopic tsscTopicObjectTest_04_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_04);
		TsscTopic tsscTopicObjectTest_05_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_05);
		TsscTopic tsscTopicObjectTest_06_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_06);
		TsscTopic tsscTopicObjectTest_07_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_07);
		TsscTopic tsscTopicObjectTest_08_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_08);
		TsscTopic tsscTopicObjectTest_09_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_09);
		TsscTopic tsscTopicObjectTest_10_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_10);
		TsscTopic tsscTopicObjectTest_11_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_11);
		TsscTopic tsscTopicObjectTest_12_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_12);
		TsscTopic tsscTopicObjectTest_13_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_13);
		TsscTopic tsscTopicObjectTest_14_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_14);
		TsscTopic tsscTopicObjectTest_15_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_15);
		TsscTopic tsscTopicObjectTest_16_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_16);
		TsscTopic tsscTopicObjectTest_17_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_17);
		TsscTopic tsscTopicObjectTest_18_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_18);
		TsscTopic tsscTopicObjectTest_19_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_19);
		TsscTopic tsscTopicObjectTest_20_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_20);
		TsscTopic tsscTopicObjectTest_21_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_21);
		TsscTopic tsscTopicObjectTest_22_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_22);
		TsscTopic tsscTopicObjectTest_23_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_23);
		TsscTopic tsscTopicObjectTest_24_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_24);
		TsscTopic tsscTopicObjectTest_25_copy = tsscTopicServiceImp.saveTopic(tsscTopicObjectTest_25);

		assertNull(tsscTopicObjectTest_01_copy);
		assertNull(tsscTopicObjectTest_02_copy);
		assertNull(tsscTopicObjectTest_03_copy);
		assertNull(tsscTopicObjectTest_04_copy);
		assertNull(tsscTopicObjectTest_05_copy);
		assertNull(tsscTopicObjectTest_06_copy);
		assertNull(tsscTopicObjectTest_07_copy);
		assertNull(tsscTopicObjectTest_08_copy);
		assertNull(tsscTopicObjectTest_09_copy);
		assertNull(tsscTopicObjectTest_10_copy);
		assertNull(tsscTopicObjectTest_11_copy);

		assertNotNull(tsscTopicObjectTest_12_copy);
		assertNotNull(tsscTopicObjectTest_13_copy);
		assertNotNull(tsscTopicObjectTest_14_copy);
		assertNotNull(tsscTopicObjectTest_15_copy);
		assertNotNull(tsscTopicObjectTest_16_copy);
		assertNotNull(tsscTopicObjectTest_17_copy);
		assertNotNull(tsscTopicObjectTest_18_copy);
		assertNotNull(tsscTopicObjectTest_19_copy);
		assertNotNull(tsscTopicObjectTest_20_copy);
		assertNotNull(tsscTopicObjectTest_21_copy);
		assertNotNull(tsscTopicObjectTest_22_copy);
		assertNotNull(tsscTopicObjectTest_23_copy);
		assertNotNull(tsscTopicObjectTest_24_copy);
		assertNotNull(tsscTopicObjectTest_25_copy);

		log.info("Test finished succesfully. ");
	}

	@Test
	public void updateAmountDefaultGroupsTopicImpTest() {

		tsscTopicObjectTest_01.setId(4565L);
		tsscTopicObjectTest_01.setDefaultGroups(1L);
		tsscTopicObjectTest_02.setId(8787L);
		tsscTopicObjectTest_02.setDefaultGroups(33L);
		tsscTopicObjectTest_03.setId(2332L);
		tsscTopicObjectTest_03.setDefaultGroups(13L);
		tsscTopicObjectTest_04.setId(9922L);
		tsscTopicObjectTest_04.setDefaultGroups(20L);
		tsscTopicObjectTest_05.setId(2393L);
		tsscTopicObjectTest_05.setDefaultGroups(31L);

		when(iTsscTopicRepository.existsById(4565L)).thenReturn(true);
		when(iTsscTopicRepository.findById(4565L)).thenReturn(Optional.of(tsscTopicObjectTest_01));
		when(iTsscTopicRepository.existsById(8787L)).thenReturn(true);
		when(iTsscTopicRepository.findById(8787L)).thenReturn(Optional.of(tsscTopicObjectTest_02));
		when(iTsscTopicRepository.existsById(2332L)).thenReturn(true);
		when(iTsscTopicRepository.findById(2332L)).thenReturn(Optional.of(tsscTopicObjectTest_03));
		when(iTsscTopicRepository.existsById(9922L)).thenReturn(true);
		when(iTsscTopicRepository.findById(9922L)).thenReturn(Optional.of(tsscTopicObjectTest_04));
		when(iTsscTopicRepository.existsById(2393L)).thenReturn(true);
		when(iTsscTopicRepository.findById(2392L)).thenReturn(Optional.of(tsscTopicObjectTest_05));

		TsscTopic tsscTopicObjectTest_01_resultMethod = tsscTopicServiceImp.updateTopicAmountDefaultGroups(4565L, 19L);
		TsscTopic tsscTopicObjectTest_02_resultMethod = tsscTopicServiceImp.updateTopicAmountDefaultGroups(8787L, 255L);
		TsscTopic tsscTopicObjectTest_03_resultMethod = tsscTopicServiceImp.updateTopicAmountDefaultGroups(2332L, 0L);
		TsscTopic tsscTopicObjectTest_04_resultMethod = tsscTopicServiceImp.updateTopicAmountDefaultGroups(9922L, 30L);
		TsscTopic tsscTopicObjectTest_05_resultMethod = tsscTopicServiceImp.updateTopicAmountDefaultGroups(2392L, -1L);

		assertEquals(19L,tsscTopicObjectTest_01_resultMethod.getDefaultGroups() );
		assertNotNull(tsscTopicObjectTest_01_resultMethod );
		assertEquals(255L,tsscTopicObjectTest_02_resultMethod.getDefaultGroups() );
		assertNotNull(tsscTopicObjectTest_02_resultMethod );
		assertNull(tsscTopicObjectTest_03_resultMethod );
		assertEquals(30L,tsscTopicObjectTest_04_resultMethod.getDefaultGroups() );
		assertNotNull(tsscTopicObjectTest_04_resultMethod );
		assertNull(tsscTopicObjectTest_05_resultMethod );

		log.info("Test finished succesfully. ");
	}
	
	@Test
	public void updateAmountDefaultSprintsTopicImpTest() {

		tsscTopicObjectTest_01.setId(4565L);
		tsscTopicObjectTest_01.setDefaultSprints(1L);
		tsscTopicObjectTest_02.setId(8787L);
		tsscTopicObjectTest_02.setDefaultSprints(33L);
		tsscTopicObjectTest_03.setId(2332L);
		tsscTopicObjectTest_03.setDefaultSprints(13L);
		tsscTopicObjectTest_04.setId(9922L);
		tsscTopicObjectTest_04.setDefaultSprints(20L);
		tsscTopicObjectTest_05.setId(2393L);
		tsscTopicObjectTest_05.setDefaultSprints(31L);

		when(iTsscTopicRepository.existsById(4565L)).thenReturn(true);
		when(iTsscTopicRepository.findById(4565L)).thenReturn(Optional.of(tsscTopicObjectTest_01));
		when(iTsscTopicRepository.existsById(8787L)).thenReturn(true);
		when(iTsscTopicRepository.findById(8787L)).thenReturn(Optional.of(tsscTopicObjectTest_02));
		when(iTsscTopicRepository.existsById(2332L)).thenReturn(true);
		when(iTsscTopicRepository.findById(2332L)).thenReturn(Optional.of(tsscTopicObjectTest_03));
		when(iTsscTopicRepository.existsById(9922L)).thenReturn(true);
		when(iTsscTopicRepository.findById(9922L)).thenReturn(Optional.of(tsscTopicObjectTest_04));
		when(iTsscTopicRepository.existsById(2393L)).thenReturn(true);
		when(iTsscTopicRepository.findById(2392L)).thenReturn(Optional.of(tsscTopicObjectTest_05));
		when(iTsscTopicRepository.existsById(8080L)).thenReturn(false);
		when(iTsscTopicRepository.existsById(9999L)).thenReturn(false);

		TsscTopic tsscTopicObjectTest_01_resultMethod = tsscTopicServiceImp.updateTopicAmountDefaultSprints(4565L, 19L);
		TsscTopic tsscTopicObjectTest_02_resultMethod = tsscTopicServiceImp.updateTopicAmountDefaultSprints(8787L, 255L);
		TsscTopic tsscTopicObjectTest_03_resultMethod = tsscTopicServiceImp.updateTopicAmountDefaultSprints(2332L, 0L);
		TsscTopic tsscTopicObjectTest_04_resultMethod = tsscTopicServiceImp.updateTopicAmountDefaultSprints(9922L, 30L);
		TsscTopic tsscTopicObjectTest_05_resultMethod = tsscTopicServiceImp.updateTopicAmountDefaultSprints(2392L, -1L);
		TsscTopic tsscTopicObjectTest_06_resultMethod = tsscTopicServiceImp.updateTopicAmountDefaultSprints(8080L, 1L);
		TsscTopic tsscTopicObjectTest_07_resultMethod = tsscTopicServiceImp.updateTopicAmountDefaultSprints(9999L, -98L);

		assertEquals(19L,tsscTopicObjectTest_01_resultMethod.getDefaultSprints() );
		assertNotNull(tsscTopicObjectTest_01_resultMethod );
		assertEquals(255L,tsscTopicObjectTest_02_resultMethod.getDefaultSprints() );
		assertNotNull(tsscTopicObjectTest_02_resultMethod );
		assertNull(tsscTopicObjectTest_03_resultMethod );
		assertEquals(30L,tsscTopicObjectTest_04_resultMethod.getDefaultSprints() );
		assertNotNull(tsscTopicObjectTest_04_resultMethod );
		assertNull(tsscTopicObjectTest_05_resultMethod );
		assertNull(tsscTopicObjectTest_06_resultMethod );
		assertNull(tsscTopicObjectTest_07_resultMethod );

		log.info("Test finished succesfully. ");
		
	}

}
