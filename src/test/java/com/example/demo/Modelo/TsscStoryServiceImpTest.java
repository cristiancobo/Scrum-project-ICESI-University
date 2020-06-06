package com.example.demo.Modelo;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Repository.ITsscGameRespository;
import com.example.demo.Repository.ITsscStoryRepository;
import com.example.demo.Service.TsscStoryServiceImp;

import lombok.extern.java.Log;



@Log
@SpringBootTest
class TsscStoryServiceImpTest {
	
	/*
	 * Dependency injections ___________________________________________________
	 */
	@InjectMocks
	TsscStoryServiceImp tsscStoryServiceImp;

	
	/*
	 * Mocks ___________________________________________________________________
	 */
	@Mock
	ITsscGameRespository iTsscGameRespository;
	@Mock
	ITsscStoryRepository iTsscStoryRepository ;


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

	
	/*
	 * Test methods_____________________________________________________________
	 */
	
	@BeforeEach
	public void sutup() {

		MockitoAnnotations.initMocks(this);

		 tsscStoryObjectTest_01 = new TsscStory();
		 tsscStoryObjectTest_02 = new TsscStory();
		 tsscStoryObjectTest_03 = new TsscStory();
		 tsscStoryObjectTest_04 = new TsscStory();
		 tsscStoryObjectTest_05 = new TsscStory();
		 tsscStoryObjectTest_06 = new TsscStory();
		 tsscStoryObjectTest_07 = new TsscStory();
		 tsscStoryObjectTest_08 = new TsscStory();
		 tsscStoryObjectTest_09 = new TsscStory();
		 tsscStoryObjectTest_10 = new TsscStory();
		 tsscStoryObjectTest_11 = new TsscStory();
		 tsscStoryObjectTest_12 = new TsscStory();
		 tsscStoryObjectTest_13 = new TsscStory();
		 tsscStoryObjectTest_14 = new TsscStory();
		 tsscStoryObjectTest_15 = new TsscStory();
		 tsscStoryObjectTest_16 = new TsscStory();
		 tsscStoryObjectTest_17 = new TsscStory();
		 tsscStoryObjectTest_18 = new TsscStory();
		 tsscStoryObjectTest_19 = new TsscStory();
		 tsscStoryObjectTest_20 = new TsscStory();
		 tsscStoryObjectTest_21 = new TsscStory();
		 tsscStoryObjectTest_22 = new TsscStory();
		 tsscStoryObjectTest_23 = new TsscStory();
		 tsscStoryObjectTest_24 = new TsscStory();
		 tsscStoryObjectTest_25 = new TsscStory();
		 
		 tsscGameObjectTest_01 = new TsscGame();
		 tsscGameObjectTest_02 = new TsscGame();
		 tsscGameObjectTest_03 = new TsscGame();
		 tsscGameObjectTest_04 = new TsscGame();
		 tsscGameObjectTest_05 = new TsscGame();
		 tsscGameObjectTest_06 = new TsscGame();
		 tsscGameObjectTest_07 = new TsscGame();
		 tsscGameObjectTest_08 = new TsscGame();
		 tsscGameObjectTest_09 = new TsscGame();
		 tsscGameObjectTest_10 = new TsscGame();
		 tsscGameObjectTest_11 = new TsscGame();
		 tsscGameObjectTest_12 = new TsscGame();
		 tsscGameObjectTest_13 = new TsscGame();
		 tsscGameObjectTest_14 = new TsscGame();
		 tsscGameObjectTest_15 = new TsscGame();
		 tsscGameObjectTest_16 = new TsscGame();
		 tsscGameObjectTest_17 = new TsscGame();
		 tsscGameObjectTest_18 = new TsscGame();
		 tsscGameObjectTest_19 = new TsscGame();
		 tsscGameObjectTest_20 = new TsscGame();
		 tsscGameObjectTest_21 = new TsscGame();
		 tsscGameObjectTest_22 = new TsscGame();
		 tsscGameObjectTest_23 = new TsscGame();
		 tsscGameObjectTest_24 = new TsscGame();
		 tsscGameObjectTest_25 = new TsscGame();
		 
		
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
	public void saveStoryImpTest_1() {
		
		
		tsscGameObjectTest_01.setId(1234L);
		tsscGameObjectTest_02.setId(5678L);
		tsscGameObjectTest_03.setId(1111L);
		tsscGameObjectTest_04.setId(3434L);
		tsscGameObjectTest_05.setId(2222L);
		tsscGameObjectTest_06.setId(8786L);
		tsscGameObjectTest_07.setId(2323L);
		tsscGameObjectTest_08.setId(9191L);
		tsscGameObjectTest_09.setId(7070L);
		tsscGameObjectTest_10.setId(1669L);
		tsscGameObjectTest_11.setId(4483L);
		tsscGameObjectTest_12.setId(6565L);
		tsscGameObjectTest_13.setId(4444L);
		tsscGameObjectTest_14.setId(5656L);
		tsscGameObjectTest_15.setId(0002L);
		tsscGameObjectTest_16.setId(2000L);
		tsscGameObjectTest_17.setId(3030L);
		tsscGameObjectTest_18.setId(1212L);
		tsscGameObjectTest_19.setId(1515L);
		tsscGameObjectTest_20.setId(5555L);
		tsscGameObjectTest_21.setId(9898L);
		tsscGameObjectTest_22.setId(3434L);
		tsscGameObjectTest_23.setId(2222L);
		tsscGameObjectTest_24.setId(5456L);
		tsscGameObjectTest_25.setId(3333L);

		tsscStoryObjectTest_01.setBusinessValue(new BigDecimal(-200));
		tsscStoryObjectTest_02.setBusinessValue(new BigDecimal(-100));
		tsscStoryObjectTest_03.setBusinessValue(new BigDecimal(-130));
		tsscStoryObjectTest_04.setBusinessValue(new BigDecimal(-199));
		tsscStoryObjectTest_05.setBusinessValue(new BigDecimal(-160));

		tsscStoryObjectTest_06.setBusinessValue(new BigDecimal(-99));
		tsscStoryObjectTest_07.setBusinessValue(new BigDecimal(-45));
		tsscStoryObjectTest_08.setBusinessValue(new BigDecimal(-1));
		tsscStoryObjectTest_09.setBusinessValue(new BigDecimal(-34));
		tsscStoryObjectTest_10.setBusinessValue(new BigDecimal(-80));

		tsscStoryObjectTest_11.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_12.setBusinessValue(new BigDecimal(4));
		tsscStoryObjectTest_13.setBusinessValue(new BigDecimal(20));
		tsscStoryObjectTest_14.setBusinessValue(new BigDecimal(100));
		tsscStoryObjectTest_15.setBusinessValue(new BigDecimal(50));
	
		tsscStoryObjectTest_16.setBusinessValue(new BigDecimal(101));
		tsscStoryObjectTest_17.setBusinessValue(new BigDecimal(200));
		tsscStoryObjectTest_18.setBusinessValue(new BigDecimal(150));
		tsscStoryObjectTest_19.setBusinessValue(new BigDecimal(120));
		tsscStoryObjectTest_20.setBusinessValue(new BigDecimal(199));
	
		tsscStoryObjectTest_21.setBusinessValue(new BigDecimal(230));
		tsscStoryObjectTest_22.setBusinessValue(new BigDecimal(1000));
		tsscStoryObjectTest_23.setBusinessValue(new BigDecimal(300));
		tsscStoryObjectTest_24.setBusinessValue(new BigDecimal(400));
		tsscStoryObjectTest_25.setBusinessValue(new BigDecimal(550));

		when(iTsscGameRespository.existsById(1234L)).thenReturn(false);
		when(iTsscGameRespository.existsById(5678L)).thenReturn(false);
		when(iTsscGameRespository.existsById(1111L)).thenReturn(false);
		when(iTsscGameRespository.existsById(3434L)).thenReturn(false);
		when(iTsscGameRespository.existsById(2222L)).thenReturn(false);
		when(iTsscGameRespository.existsById(8786L)).thenReturn(false);
		when(iTsscGameRespository.existsById(2323L)).thenReturn(false);
		when(iTsscGameRespository.existsById(9191L)).thenReturn(false);
		when(iTsscGameRespository.existsById(7070L)).thenReturn(false);
		when(iTsscGameRespository.existsById(1669L)).thenReturn(false);
		when(iTsscGameRespository.existsById(4483L)).thenReturn(false);
		when(iTsscGameRespository.existsById(6565L)).thenReturn(false);
		when(iTsscGameRespository.existsById(4444L)).thenReturn(false);
		when(iTsscGameRespository.existsById(5656L)).thenReturn(false);
		when(iTsscGameRespository.existsById(0002L)).thenReturn(false);
		when(iTsscGameRespository.existsById(2000L)).thenReturn(false);
		when(iTsscGameRespository.existsById(3030L)).thenReturn(false);
		when(iTsscGameRespository.existsById(1212L)).thenReturn(false);
		when(iTsscGameRespository.existsById(1515L)).thenReturn(false);
		when(iTsscGameRespository.existsById(5555L)).thenReturn(false);
		when(iTsscGameRespository.existsById(9898L)).thenReturn(false);
		when(iTsscGameRespository.existsById(3434L)).thenReturn(false);
		when(iTsscGameRespository.existsById(2222L)).thenReturn(false);
		when(iTsscGameRespository.existsById(5456L)).thenReturn(false);
		when(iTsscGameRespository.existsById(3333L)).thenReturn(false);

		TsscStory tsscStoryObjectTest_01_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_01, 1234L);
		TsscStory tsscStoryObjectTest_02_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_02,5678L);
		TsscStory tsscStoryObjectTest_03_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_03,1111L);
		TsscStory tsscStoryObjectTest_04_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_04,3434L);
		TsscStory tsscStoryObjectTest_05_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_05,2222L);
		TsscStory tsscStoryObjectTest_06_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_06,8786L);
		TsscStory tsscStoryObjectTest_07_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_07,2323L);
		TsscStory tsscStoryObjectTest_08_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_08,9191L);
		TsscStory tsscStoryObjectTest_09_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_09,7070L);
		TsscStory tsscStoryObjectTest_10_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_10,1669L);
		TsscStory tsscStoryObjectTest_11_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_11,4483L);
		TsscStory tsscStoryObjectTest_12_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_12,6565L);
		TsscStory tsscStoryObjectTest_13_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_13,4444L);
		TsscStory tsscStoryObjectTest_14_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_14,5656L);
		TsscStory tsscStoryObjectTest_15_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_15,0002L);
		TsscStory tsscStoryObjectTest_16_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_16,2000L);
		TsscStory tsscStoryObjectTest_17_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_17,3030L);
		TsscStory tsscStoryObjectTest_18_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_18,1212L);
		TsscStory tsscStoryObjectTest_19_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_19,1515L);
		TsscStory tsscStoryObjectTest_20_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_20,5555L);
		TsscStory tsscStoryObjectTest_21_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_21,9898L);
		TsscStory tsscStoryObjectTest_22_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_22,3434L);
		TsscStory tsscStoryObjectTest_23_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_23,2222L);
		TsscStory tsscStoryObjectTest_24_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_24,5456L);
		TsscStory tsscStoryObjectTest_25_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_25,3333L);

		assertNull(tsscStoryObjectTest_01_copy);
		assertNull(tsscStoryObjectTest_02_copy);
		assertNull(tsscStoryObjectTest_03_copy);
		assertNull(tsscStoryObjectTest_04_copy);
		assertNull(tsscStoryObjectTest_05_copy);
		assertNull(tsscStoryObjectTest_06_copy);
		assertNull(tsscStoryObjectTest_07_copy);
		assertNull(tsscStoryObjectTest_08_copy);
		assertNull(tsscStoryObjectTest_09_copy);
		assertNull(tsscStoryObjectTest_10_copy);
		assertNull(tsscStoryObjectTest_11_copy);
		assertNull(tsscStoryObjectTest_12_copy);
		assertNull(tsscStoryObjectTest_13_copy);
		assertNull(tsscStoryObjectTest_14_copy);
		assertNull(tsscStoryObjectTest_15_copy);
		assertNull(tsscStoryObjectTest_16_copy);
		assertNull(tsscStoryObjectTest_17_copy);
		assertNull(tsscStoryObjectTest_18_copy);
		assertNull(tsscStoryObjectTest_19_copy);
		assertNull(tsscStoryObjectTest_20_copy);
		assertNull(tsscStoryObjectTest_21_copy);
		assertNull(tsscStoryObjectTest_22_copy);
		assertNull(tsscStoryObjectTest_23_copy);
		assertNull(tsscStoryObjectTest_24_copy);
		assertNull(tsscStoryObjectTest_25_copy);
		
		
	}
	

	
	@Test
	public void saveStoryImpTest_2() {

		tsscGameObjectTest_01.setId(1234L);
		tsscGameObjectTest_02.setId(5678L);
		tsscGameObjectTest_03.setId(1111L);
		tsscGameObjectTest_04.setId(3434L);
		tsscGameObjectTest_05.setId(2222L);
		tsscGameObjectTest_06.setId(8786L);
		tsscGameObjectTest_07.setId(2323L);
		tsscGameObjectTest_08.setId(9191L);
		tsscGameObjectTest_09.setId(7070L);
		tsscGameObjectTest_10.setId(1669L);
		tsscGameObjectTest_11.setId(4483L);
		tsscGameObjectTest_12.setId(6565L);
		tsscGameObjectTest_13.setId(4444L);
		tsscGameObjectTest_14.setId(5656L);
		tsscGameObjectTest_15.setId(0002L);
		tsscGameObjectTest_16.setId(2000L);
		tsscGameObjectTest_17.setId(3030L);
		tsscGameObjectTest_18.setId(1212L);
		tsscGameObjectTest_19.setId(1515L);
		tsscGameObjectTest_20.setId(5555L);
		tsscGameObjectTest_21.setId(9898L);
		tsscGameObjectTest_22.setId(3434L);
		tsscGameObjectTest_23.setId(2222L);
		tsscGameObjectTest_24.setId(5456L);
		tsscGameObjectTest_25.setId(3333L);

		tsscStoryObjectTest_01.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_01.setBusinessValue(new BigDecimal(-200));
		tsscStoryObjectTest_01.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_02.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_02.setBusinessValue(new BigDecimal(-100));
		tsscStoryObjectTest_03.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_03.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_03.setBusinessValue(new BigDecimal(-130));
		tsscStoryObjectTest_03.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_04.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_04.setBusinessValue(new BigDecimal(-199));
		tsscStoryObjectTest_04.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_05.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_05.setBusinessValue(new BigDecimal(-160));
		tsscStoryObjectTest_05.setInitialSprint(new BigDecimal(0));
	
		tsscStoryObjectTest_06.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_06.setBusinessValue(new BigDecimal(-99));
		tsscStoryObjectTest_06.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_07.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_07.setBusinessValue(new BigDecimal(-45));
		tsscStoryObjectTest_07.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_08.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_08.setBusinessValue(new BigDecimal(-1));
		tsscStoryObjectTest_08.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_09.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_09.setBusinessValue(new BigDecimal(-34));
		tsscStoryObjectTest_09.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_10.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_10.setBusinessValue(new BigDecimal(-80));
		tsscStoryObjectTest_10.setInitialSprint(new BigDecimal(0));

		tsscStoryObjectTest_11.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_11.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_11.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_12.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_12.setBusinessValue(new BigDecimal(4));
		tsscStoryObjectTest_12.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_13.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_13.setBusinessValue(new BigDecimal(20));
		tsscStoryObjectTest_13.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_14.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_14.setBusinessValue(new BigDecimal(100));
		tsscStoryObjectTest_14.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_15.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_15.setBusinessValue(new BigDecimal(50));
		tsscStoryObjectTest_15.setInitialSprint(new BigDecimal(0));

		tsscStoryObjectTest_16.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_16.setBusinessValue(new BigDecimal(101));
		tsscStoryObjectTest_16.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_17.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_17.setBusinessValue(new BigDecimal(200));
		tsscStoryObjectTest_17.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_18.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_18.setBusinessValue(new BigDecimal(150));
		tsscStoryObjectTest_18.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_19.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_19.setBusinessValue(new BigDecimal(120));
		tsscStoryObjectTest_19.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_20.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_20.setBusinessValue(new BigDecimal(199));
		tsscStoryObjectTest_20.setInitialSprint(new BigDecimal(0));

		tsscStoryObjectTest_21.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_21.setBusinessValue(new BigDecimal(230));
		tsscStoryObjectTest_21.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_22.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_22.setBusinessValue(new BigDecimal(1000));
		tsscStoryObjectTest_22.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_23.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_23.setBusinessValue(new BigDecimal(300));
		tsscStoryObjectTest_23.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_24.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_24.setBusinessValue(new BigDecimal(400));
		tsscStoryObjectTest_24.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_25.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_25.setBusinessValue(new BigDecimal(550));
		tsscStoryObjectTest_25.setInitialSprint(new BigDecimal(0));

		when(iTsscGameRespository.existsById(1234L)).thenReturn(true);
		when(iTsscGameRespository.existsById(5678L)).thenReturn(true);
		when(iTsscGameRespository.existsById(1111L)).thenReturn(true);
		when(iTsscGameRespository.existsById(3434L)).thenReturn(true);
		when(iTsscGameRespository.existsById(2222L)).thenReturn(true);
		when(iTsscGameRespository.existsById(8786L)).thenReturn(true);
		when(iTsscGameRespository.existsById(2323L)).thenReturn(true);
		when(iTsscGameRespository.existsById(9191L)).thenReturn(true);
		when(iTsscGameRespository.existsById(7070L)).thenReturn(true);
		when(iTsscGameRespository.existsById(1669L)).thenReturn(true);
		when(iTsscGameRespository.existsById(4483L)).thenReturn(true);
		when(iTsscGameRespository.existsById(6565L)).thenReturn(true);
		when(iTsscGameRespository.existsById(4444L)).thenReturn(true);
		when(iTsscGameRespository.existsById(5656L)).thenReturn(true);
		when(iTsscGameRespository.existsById(0002L)).thenReturn(true);
		when(iTsscGameRespository.existsById(2000L)).thenReturn(true);
		when(iTsscGameRespository.existsById(3030L)).thenReturn(true);
		when(iTsscGameRespository.existsById(1212L)).thenReturn(true);
		when(iTsscGameRespository.existsById(1515L)).thenReturn(true);
		when(iTsscGameRespository.existsById(5555L)).thenReturn(true);
		when(iTsscGameRespository.existsById(9898L)).thenReturn(true);
		when(iTsscGameRespository.existsById(3434L)).thenReturn(true);
		when(iTsscGameRespository.existsById(2222L)).thenReturn(true);
		when(iTsscGameRespository.existsById(5456L)).thenReturn(true);
		when(iTsscGameRespository.existsById(3333L)).thenReturn(true);
		
		when(iTsscGameRespository.findById(6565L)).thenReturn(Optional.of(tsscGameObjectTest_12));
		when(iTsscGameRespository.findById(4444L)).thenReturn(Optional.of(tsscGameObjectTest_13));
		when(iTsscGameRespository.findById(5656L)).thenReturn(Optional.of(tsscGameObjectTest_14));
		when(iTsscGameRespository.findById(0002L)).thenReturn(Optional.of(tsscGameObjectTest_15));
		when(iTsscGameRespository.findById(2000L)).thenReturn(Optional.of(tsscGameObjectTest_16));
		when(iTsscGameRespository.findById(3030L)).thenReturn(Optional.of(tsscGameObjectTest_17));
		when(iTsscGameRespository.findById(1212L)).thenReturn(Optional.of(tsscGameObjectTest_18));
		when(iTsscGameRespository.findById(1515L)).thenReturn(Optional.of(tsscGameObjectTest_19));
		when(iTsscGameRespository.findById(5555L)).thenReturn(Optional.of(tsscGameObjectTest_20));
		when(iTsscGameRespository.findById(9898L)).thenReturn(Optional.of(tsscGameObjectTest_21));
		when(iTsscGameRespository.findById(3434L)).thenReturn(Optional.of(tsscGameObjectTest_22));
		when(iTsscGameRespository.findById(2222L)).thenReturn(Optional.of(tsscGameObjectTest_23));
		when(iTsscGameRespository.findById(5456L)).thenReturn(Optional.of(tsscGameObjectTest_24));
		when(iTsscGameRespository.findById(3333L)).thenReturn(Optional.of(tsscGameObjectTest_25));

		TsscStory tsscStoryObjectTest_01_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_01, 1234L);
		TsscStory tsscStoryObjectTest_02_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_02,5678L);
		TsscStory tsscStoryObjectTest_03_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_03,1111L);
		TsscStory tsscStoryObjectTest_04_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_04,3434L);
		TsscStory tsscStoryObjectTest_05_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_05,2222L);
		TsscStory tsscStoryObjectTest_06_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_06,8786L);
		TsscStory tsscStoryObjectTest_07_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_07,2323L);
		TsscStory tsscStoryObjectTest_08_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_08,9191L);
		TsscStory tsscStoryObjectTest_09_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_09,7070L);
		TsscStory tsscStoryObjectTest_10_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_10,1669L);
		TsscStory tsscStoryObjectTest_11_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_11,4483L);
		TsscStory tsscStoryObjectTest_12_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_12,6565L);
		TsscStory tsscStoryObjectTest_13_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_13,4444L);
		TsscStory tsscStoryObjectTest_14_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_14,5656L);
		TsscStory tsscStoryObjectTest_15_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_15,0002L);
		TsscStory tsscStoryObjectTest_16_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_16,2000L);
		TsscStory tsscStoryObjectTest_17_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_17,3030L);
		TsscStory tsscStoryObjectTest_18_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_18,1212L);
		TsscStory tsscStoryObjectTest_19_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_19,1515L);
		TsscStory tsscStoryObjectTest_20_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_20,5555L);
		TsscStory tsscStoryObjectTest_21_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_21,9898L);
		TsscStory tsscStoryObjectTest_22_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_22,3434L);
		TsscStory tsscStoryObjectTest_23_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_23,2222L);
		TsscStory tsscStoryObjectTest_24_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_24,5456L);
		TsscStory tsscStoryObjectTest_25_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_25,3333L);

		assertNull(tsscStoryObjectTest_01_copy);
		assertNull(tsscStoryObjectTest_02_copy);
		assertNull(tsscStoryObjectTest_03_copy);
		assertNull(tsscStoryObjectTest_04_copy);
		assertNull(tsscStoryObjectTest_05_copy);
		assertNull(tsscStoryObjectTest_06_copy);
		assertNull(tsscStoryObjectTest_07_copy);
		assertNull(tsscStoryObjectTest_08_copy);
		assertNull(tsscStoryObjectTest_09_copy);
		assertNull(tsscStoryObjectTest_10_copy);
		assertNull(tsscStoryObjectTest_11_copy);
		assertNull(tsscStoryObjectTest_12_copy);
		assertNull(tsscStoryObjectTest_13_copy);
		assertNull(tsscStoryObjectTest_14_copy);
		assertNull(tsscStoryObjectTest_15_copy);
		assertNull(tsscStoryObjectTest_16_copy);
		assertNull(tsscStoryObjectTest_17_copy);
		assertNull(tsscStoryObjectTest_18_copy);
		assertNull(tsscStoryObjectTest_19_copy);
		assertNull(tsscStoryObjectTest_20_copy);
		assertNull(tsscStoryObjectTest_21_copy);
		assertNull(tsscStoryObjectTest_22_copy);
		assertNull(tsscStoryObjectTest_23_copy);
		assertNull(tsscStoryObjectTest_24_copy);
		assertNull(tsscStoryObjectTest_25_copy);
		
		
	}
	
	
	@Test
	public void saveStoryImpTest_3() {
	
		tsscGameObjectTest_01.setId(1234L);
		tsscGameObjectTest_02.setId(5678L);
		tsscGameObjectTest_03.setId(1111L);
		tsscGameObjectTest_04.setId(3434L);
		tsscGameObjectTest_05.setId(2222L);
		tsscGameObjectTest_06.setId(8786L);
		tsscGameObjectTest_07.setId(2323L);
		tsscGameObjectTest_08.setId(9191L);
		tsscGameObjectTest_09.setId(7070L);
		tsscGameObjectTest_10.setId(1669L);
		tsscGameObjectTest_11.setId(4483L);
		tsscGameObjectTest_12.setId(6565L);
		tsscGameObjectTest_13.setId(4444L);
		tsscGameObjectTest_14.setId(5656L);
		tsscGameObjectTest_15.setId(0002L);
		tsscGameObjectTest_16.setId(2000L);
		tsscGameObjectTest_17.setId(3030L);
		tsscGameObjectTest_18.setId(1212L);
		tsscGameObjectTest_19.setId(1515L);
		tsscGameObjectTest_20.setId(5555L);
		tsscGameObjectTest_21.setId(9898L);
		tsscGameObjectTest_22.setId(3434L);
		tsscGameObjectTest_23.setId(2222L);
		tsscGameObjectTest_24.setId(5456L);
		tsscGameObjectTest_25.setId(3333L);

		tsscStoryObjectTest_01.setPriority(new BigDecimal(-200));
		tsscStoryObjectTest_01.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_01.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_02.setPriority(new BigDecimal(-100));
		tsscStoryObjectTest_02.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_03.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_03.setPriority(new BigDecimal(-130));
		tsscStoryObjectTest_03.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_03.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_04.setPriority(new BigDecimal(-199));
		tsscStoryObjectTest_04.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_04.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_05.setPriority(new BigDecimal(-160));
		tsscStoryObjectTest_05.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_05.setInitialSprint(new BigDecimal(0));
		
		/**
		 * setting [DefaultGroups attribute with negative values between -100 and 0]
		 */
		tsscStoryObjectTest_06.setPriority(new BigDecimal(-99));
		tsscStoryObjectTest_06.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_06.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_07.setPriority(new BigDecimal(-45));
		tsscStoryObjectTest_07.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_07.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_08.setPriority(new BigDecimal(-1));
		tsscStoryObjectTest_08.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_08.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_09.setPriority(new BigDecimal(-34));
		tsscStoryObjectTest_09.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_09.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_10.setPriority(new BigDecimal(-80));
		tsscStoryObjectTest_10.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_10.setInitialSprint(new BigDecimal(0));

		tsscStoryObjectTest_11.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_11.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_11.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_12.setPriority(new BigDecimal(4));
		tsscStoryObjectTest_12.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_12.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_13.setPriority(new BigDecimal(20));
		tsscStoryObjectTest_13.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_13.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_14.setPriority(new BigDecimal(100));
		tsscStoryObjectTest_14.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_14.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_15.setPriority(new BigDecimal(50));
		tsscStoryObjectTest_15.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_15.setInitialSprint(new BigDecimal(0));

		tsscStoryObjectTest_16.setPriority(new BigDecimal(101));
		tsscStoryObjectTest_16.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_16.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_17.setPriority(new BigDecimal(200));
		tsscStoryObjectTest_17.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_17.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_18.setPriority(new BigDecimal(150));
		tsscStoryObjectTest_18.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_18.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_19.setPriority(new BigDecimal(120));
		tsscStoryObjectTest_19.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_19.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_20.setPriority(new BigDecimal(199));
		tsscStoryObjectTest_20.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_20.setInitialSprint(new BigDecimal(0));

		tsscStoryObjectTest_21.setPriority(new BigDecimal(230));
		tsscStoryObjectTest_21.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_21.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_22.setPriority(new BigDecimal(1000));
		tsscStoryObjectTest_22.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_22.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_23.setPriority(new BigDecimal(300));
		tsscStoryObjectTest_23.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_23.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_24.setPriority(new BigDecimal(400));
		tsscStoryObjectTest_24.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_24.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_25.setPriority(new BigDecimal(550));
		tsscStoryObjectTest_01.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_01.setInitialSprint(new BigDecimal(0));

		when(iTsscGameRespository.existsById(1234L)).thenReturn(false);
		when(iTsscGameRespository.existsById(5678L)).thenReturn(false);
		when(iTsscGameRespository.existsById(1111L)).thenReturn(false);
		when(iTsscGameRespository.existsById(3434L)).thenReturn(false);
		when(iTsscGameRespository.existsById(2222L)).thenReturn(false);
		when(iTsscGameRespository.existsById(8786L)).thenReturn(false);
		when(iTsscGameRespository.existsById(2323L)).thenReturn(false);
		when(iTsscGameRespository.existsById(9191L)).thenReturn(false);
		when(iTsscGameRespository.existsById(7070L)).thenReturn(false);
		when(iTsscGameRespository.existsById(1669L)).thenReturn(false);
		when(iTsscGameRespository.existsById(4483L)).thenReturn(false);
		when(iTsscGameRespository.existsById(6565L)).thenReturn(false);
		when(iTsscGameRespository.existsById(4444L)).thenReturn(false);
		when(iTsscGameRespository.existsById(5656L)).thenReturn(false);
		when(iTsscGameRespository.existsById(0002L)).thenReturn(false);
		when(iTsscGameRespository.existsById(2000L)).thenReturn(false);
		when(iTsscGameRespository.existsById(3030L)).thenReturn(false);
		when(iTsscGameRespository.existsById(1212L)).thenReturn(false);
		when(iTsscGameRespository.existsById(1515L)).thenReturn(false);
		when(iTsscGameRespository.existsById(5555L)).thenReturn(false);
		when(iTsscGameRespository.existsById(9898L)).thenReturn(false);
		when(iTsscGameRespository.existsById(3434L)).thenReturn(false);
		when(iTsscGameRespository.existsById(2222L)).thenReturn(false);
		when(iTsscGameRespository.existsById(5456L)).thenReturn(false);
		when(iTsscGameRespository.existsById(3333L)).thenReturn(false);

		TsscStory tsscStoryObjectTest_01_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_01, 1234L);
		TsscStory tsscStoryObjectTest_02_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_02,5678L);
		TsscStory tsscStoryObjectTest_03_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_03,1111L);
		TsscStory tsscStoryObjectTest_04_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_04,3434L);
		TsscStory tsscStoryObjectTest_05_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_05,2222L);
		TsscStory tsscStoryObjectTest_06_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_06,8786L);
		TsscStory tsscStoryObjectTest_07_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_07,2323L);
		TsscStory tsscStoryObjectTest_08_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_08,9191L);
		TsscStory tsscStoryObjectTest_09_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_09,7070L);
		TsscStory tsscStoryObjectTest_10_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_10,1669L);
		TsscStory tsscStoryObjectTest_11_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_11,4483L);
		TsscStory tsscStoryObjectTest_12_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_12,6565L);
		TsscStory tsscStoryObjectTest_13_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_13,4444L);
		TsscStory tsscStoryObjectTest_14_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_14,5656L);
		TsscStory tsscStoryObjectTest_15_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_15,0002L);
		TsscStory tsscStoryObjectTest_16_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_16,2000L);
		TsscStory tsscStoryObjectTest_17_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_17,3030L);
		TsscStory tsscStoryObjectTest_18_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_18,1212L);
		TsscStory tsscStoryObjectTest_19_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_19,1515L);
		TsscStory tsscStoryObjectTest_20_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_20,5555L);
		TsscStory tsscStoryObjectTest_21_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_21,9898L);
		TsscStory tsscStoryObjectTest_22_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_22,3434L);
		TsscStory tsscStoryObjectTest_23_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_23,2222L);
		TsscStory tsscStoryObjectTest_24_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_24,5456L);
		TsscStory tsscStoryObjectTest_25_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_25,3333L);

		assertNull(tsscStoryObjectTest_01_copy);
		assertNull(tsscStoryObjectTest_02_copy);
		assertNull(tsscStoryObjectTest_03_copy);
		assertNull(tsscStoryObjectTest_04_copy);
		assertNull(tsscStoryObjectTest_05_copy);
		assertNull(tsscStoryObjectTest_06_copy);
		assertNull(tsscStoryObjectTest_07_copy);
		assertNull(tsscStoryObjectTest_08_copy);
		assertNull(tsscStoryObjectTest_09_copy);
		assertNull(tsscStoryObjectTest_10_copy);
		assertNull(tsscStoryObjectTest_11_copy);
		assertNull(tsscStoryObjectTest_12_copy);
		assertNull(tsscStoryObjectTest_13_copy);
		assertNull(tsscStoryObjectTest_14_copy);
		assertNull(tsscStoryObjectTest_15_copy);
		assertNull(tsscStoryObjectTest_16_copy);
		assertNull(tsscStoryObjectTest_17_copy);
		assertNull(tsscStoryObjectTest_18_copy);
		assertNull(tsscStoryObjectTest_19_copy);
		assertNull(tsscStoryObjectTest_20_copy);
		assertNull(tsscStoryObjectTest_21_copy);
		assertNull(tsscStoryObjectTest_22_copy);
		assertNull(tsscStoryObjectTest_23_copy);
		assertNull(tsscStoryObjectTest_24_copy);
		assertNull(tsscStoryObjectTest_25_copy);
		
		
	}
	@Test
	public void saveStoryImpTest_4() {

		tsscGameObjectTest_01.setId(1234L);
		tsscGameObjectTest_02.setId(5678L);
		tsscGameObjectTest_03.setId(1111L);
		tsscGameObjectTest_04.setId(3434L);
		tsscGameObjectTest_05.setId(2222L);
		tsscGameObjectTest_06.setId(8786L);
		tsscGameObjectTest_07.setId(2323L);
		tsscGameObjectTest_08.setId(9191L);
		tsscGameObjectTest_09.setId(7070L);
		tsscGameObjectTest_10.setId(1669L);
		tsscGameObjectTest_11.setId(4483L);
		tsscGameObjectTest_12.setId(6565L);
		tsscGameObjectTest_13.setId(4444L);
		tsscGameObjectTest_14.setId(5656L);
		tsscGameObjectTest_15.setId(0002L);
		tsscGameObjectTest_16.setId(2000L);
		tsscGameObjectTest_17.setId(3030L);
		tsscGameObjectTest_18.setId(1212L);
		tsscGameObjectTest_19.setId(1515L);
		tsscGameObjectTest_20.setId(5555L);
		tsscGameObjectTest_21.setId(9898L);
		tsscGameObjectTest_22.setId(3434L);
		tsscGameObjectTest_23.setId(2222L);
		tsscGameObjectTest_24.setId(5456L);
		tsscGameObjectTest_25.setId(3333L);

		tsscStoryObjectTest_01.setPriority(new BigDecimal(-200));
		tsscStoryObjectTest_01.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_01.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_02.setPriority(new BigDecimal(-100));
		tsscStoryObjectTest_02.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_03.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_03.setPriority(new BigDecimal(-130));
		tsscStoryObjectTest_03.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_03.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_04.setPriority(new BigDecimal(-199));
		tsscStoryObjectTest_04.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_04.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_05.setPriority(new BigDecimal(-160));
		tsscStoryObjectTest_05.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_05.setInitialSprint(new BigDecimal(0));

		tsscStoryObjectTest_06.setPriority(new BigDecimal(-99));
		tsscStoryObjectTest_06.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_06.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_07.setPriority(new BigDecimal(-45));
		tsscStoryObjectTest_07.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_07.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_08.setPriority(new BigDecimal(-1));
		tsscStoryObjectTest_08.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_08.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_09.setPriority(new BigDecimal(-34));
		tsscStoryObjectTest_09.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_09.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_10.setPriority(new BigDecimal(-80));
		tsscStoryObjectTest_10.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_10.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_11.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_11.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_11.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_12.setPriority(new BigDecimal(4));
		tsscStoryObjectTest_12.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_12.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_13.setPriority(new BigDecimal(20));
		tsscStoryObjectTest_13.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_13.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_14.setPriority(new BigDecimal(100));
		tsscStoryObjectTest_14.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_14.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_15.setPriority(new BigDecimal(50));
		tsscStoryObjectTest_15.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_15.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_16.setPriority(new BigDecimal(101));
		tsscStoryObjectTest_16.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_16.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_17.setPriority(new BigDecimal(200));
		tsscStoryObjectTest_17.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_17.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_18.setPriority(new BigDecimal(150));
		tsscStoryObjectTest_18.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_18.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_19.setPriority(new BigDecimal(120));
		tsscStoryObjectTest_19.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_19.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_20.setPriority(new BigDecimal(199));
		tsscStoryObjectTest_20.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_20.setInitialSprint(new BigDecimal(0));

		tsscStoryObjectTest_21.setPriority(new BigDecimal(230));
		tsscStoryObjectTest_21.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_21.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_22.setPriority(new BigDecimal(1000));
		tsscStoryObjectTest_22.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_22.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_23.setPriority(new BigDecimal(300));
		tsscStoryObjectTest_23.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_23.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_24.setPriority(new BigDecimal(400));
		tsscStoryObjectTest_24.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_24.setInitialSprint(new BigDecimal(0));
		
		tsscStoryObjectTest_25.setPriority(new BigDecimal(550));
		tsscStoryObjectTest_25.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_25.setInitialSprint(new BigDecimal(0));

		when(iTsscGameRespository.existsById(1234L)).thenReturn(true);
		when(iTsscGameRespository.existsById(5678L)).thenReturn(true);
		when(iTsscGameRespository.existsById(1111L)).thenReturn(true);
		when(iTsscGameRespository.existsById(3434L)).thenReturn(true);
		when(iTsscGameRespository.existsById(2222L)).thenReturn(true);
		when(iTsscGameRespository.existsById(8786L)).thenReturn(true);
		when(iTsscGameRespository.existsById(2323L)).thenReturn(true);
		when(iTsscGameRespository.existsById(9191L)).thenReturn(true);
		when(iTsscGameRespository.existsById(7070L)).thenReturn(true);
		when(iTsscGameRespository.existsById(1669L)).thenReturn(true);
		when(iTsscGameRespository.existsById(4483L)).thenReturn(true);
		when(iTsscGameRespository.existsById(6565L)).thenReturn(true);
		when(iTsscGameRespository.existsById(4444L)).thenReturn(true);
		when(iTsscGameRespository.existsById(5656L)).thenReturn(true);
		when(iTsscGameRespository.existsById(0002L)).thenReturn(true);
		when(iTsscGameRespository.existsById(2000L)).thenReturn(true);
		when(iTsscGameRespository.existsById(3030L)).thenReturn(true);
		when(iTsscGameRespository.existsById(1212L)).thenReturn(true);
		when(iTsscGameRespository.existsById(1515L)).thenReturn(true);
		when(iTsscGameRespository.existsById(5555L)).thenReturn(true);
		when(iTsscGameRespository.existsById(9898L)).thenReturn(true);
		when(iTsscGameRespository.existsById(3434L)).thenReturn(true);
		when(iTsscGameRespository.existsById(2222L)).thenReturn(true);
		when(iTsscGameRespository.existsById(5456L)).thenReturn(true);
		when(iTsscGameRespository.existsById(3333L)).thenReturn(true);

		TsscStory tsscStoryObjectTest_01_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_01, 1234L);
		TsscStory tsscStoryObjectTest_02_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_02,5678L);
		TsscStory tsscStoryObjectTest_03_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_03,1111L);
		TsscStory tsscStoryObjectTest_04_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_04,3434L);
		TsscStory tsscStoryObjectTest_05_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_05,2222L);
		TsscStory tsscStoryObjectTest_06_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_06,8786L);
		TsscStory tsscStoryObjectTest_07_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_07,2323L);
		TsscStory tsscStoryObjectTest_08_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_08,9191L);
		TsscStory tsscStoryObjectTest_09_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_09,7070L);
		TsscStory tsscStoryObjectTest_10_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_10,1669L);
		TsscStory tsscStoryObjectTest_11_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_11,4483L);
		TsscStory tsscStoryObjectTest_12_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_12,6565L);
		TsscStory tsscStoryObjectTest_13_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_13,4444L);
		TsscStory tsscStoryObjectTest_14_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_14,5656L);
		TsscStory tsscStoryObjectTest_15_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_15,0002L);
		TsscStory tsscStoryObjectTest_16_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_16,2000L);
		TsscStory tsscStoryObjectTest_17_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_17,3030L);
		TsscStory tsscStoryObjectTest_18_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_18,1212L);
		TsscStory tsscStoryObjectTest_19_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_19,1515L);
		TsscStory tsscStoryObjectTest_20_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_20,5555L);
		TsscStory tsscStoryObjectTest_21_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_21,9898L);
		TsscStory tsscStoryObjectTest_22_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_22,3434L);
		TsscStory tsscStoryObjectTest_23_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_23,2222L);
		TsscStory tsscStoryObjectTest_24_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_24,5456L);
		TsscStory tsscStoryObjectTest_25_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_25,3333L);

		assertNull(tsscStoryObjectTest_01_copy);
		assertNull(tsscStoryObjectTest_02_copy);
		assertNull(tsscStoryObjectTest_03_copy);
		assertNull(tsscStoryObjectTest_04_copy);
		assertNull(tsscStoryObjectTest_05_copy);
		assertNull(tsscStoryObjectTest_06_copy);
		assertNull(tsscStoryObjectTest_07_copy);
		assertNull(tsscStoryObjectTest_08_copy);
		assertNull(tsscStoryObjectTest_09_copy);
		assertNull(tsscStoryObjectTest_10_copy);
		assertNull(tsscStoryObjectTest_11_copy);
		assertNull(tsscStoryObjectTest_12_copy);
		assertNull(tsscStoryObjectTest_13_copy);
		assertNull(tsscStoryObjectTest_14_copy);
		assertNull(tsscStoryObjectTest_15_copy);
		assertNull(tsscStoryObjectTest_16_copy);
		assertNull(tsscStoryObjectTest_17_copy);
		assertNull(tsscStoryObjectTest_18_copy);
		assertNull(tsscStoryObjectTest_19_copy);
		assertNull(tsscStoryObjectTest_20_copy);
		assertNull(tsscStoryObjectTest_21_copy);
		assertNull(tsscStoryObjectTest_22_copy);
		assertNull(tsscStoryObjectTest_23_copy);
		assertNull(tsscStoryObjectTest_24_copy);
		assertNull(tsscStoryObjectTest_25_copy);
	}
	
	
	@Test
	public void saveStoryImpTest_5() {

		
		tsscGameObjectTest_01.setId(1234L);
		tsscGameObjectTest_02.setId(5678L);
		tsscGameObjectTest_03.setId(1111L);
		tsscGameObjectTest_04.setId(3434L);
		tsscGameObjectTest_05.setId(2222L);
		tsscGameObjectTest_06.setId(8786L);
		tsscGameObjectTest_07.setId(2323L);
		tsscGameObjectTest_08.setId(9191L);
		tsscGameObjectTest_09.setId(7070L);
		tsscGameObjectTest_10.setId(1669L);
		tsscGameObjectTest_11.setId(4483L);
		tsscGameObjectTest_12.setId(6565L);
		tsscGameObjectTest_13.setId(4444L);
		tsscGameObjectTest_14.setId(5656L);
		tsscGameObjectTest_15.setId(0002L);
		tsscGameObjectTest_16.setId(2000L);
		tsscGameObjectTest_17.setId(3030L);
		tsscGameObjectTest_18.setId(1212L);
		tsscGameObjectTest_19.setId(1515L);
		tsscGameObjectTest_20.setId(5555L);
		tsscGameObjectTest_21.setId(9898L);
		tsscGameObjectTest_22.setId(3434L);
		tsscGameObjectTest_23.setId(2222L);
		tsscGameObjectTest_24.setId(5456L);
		tsscGameObjectTest_25.setId(3333L);

		tsscStoryObjectTest_01.setPriority(new BigDecimal(-200));
		tsscStoryObjectTest_02.setPriority(new BigDecimal(-100));
		tsscStoryObjectTest_03.setPriority(new BigDecimal(-130));
		tsscStoryObjectTest_04.setPriority(new BigDecimal(-199));
		tsscStoryObjectTest_05.setPriority(new BigDecimal(-160));
		tsscStoryObjectTest_01.setBusinessValue(new BigDecimal(-200));
		tsscStoryObjectTest_02.setBusinessValue(new BigDecimal(-100));
		tsscStoryObjectTest_03.setBusinessValue(new BigDecimal(-130));
		tsscStoryObjectTest_04.setBusinessValue(new BigDecimal(-199));
		tsscStoryObjectTest_05.setBusinessValue(new BigDecimal(-160));

		tsscStoryObjectTest_06.setPriority(new BigDecimal(-99));
		tsscStoryObjectTest_07.setPriority(new BigDecimal(-45));
		tsscStoryObjectTest_08.setPriority(new BigDecimal(-1));
		tsscStoryObjectTest_09.setPriority(new BigDecimal(-34));
		tsscStoryObjectTest_10.setPriority(new BigDecimal(-80));
		tsscStoryObjectTest_06.setBusinessValue(new BigDecimal(-99));
		tsscStoryObjectTest_07.setBusinessValue(new BigDecimal(-45));
		tsscStoryObjectTest_08.setBusinessValue(new BigDecimal(-1));
		tsscStoryObjectTest_09.setBusinessValue(new BigDecimal(-34));
		tsscStoryObjectTest_10.setBusinessValue(new BigDecimal(-80));

		tsscStoryObjectTest_11.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_12.setPriority(new BigDecimal(4));
		tsscStoryObjectTest_13.setPriority(new BigDecimal(20));
		tsscStoryObjectTest_14.setPriority(new BigDecimal(100));
		tsscStoryObjectTest_15.setPriority(new BigDecimal(50));
		tsscStoryObjectTest_11.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_12.setBusinessValue(new BigDecimal(4));
		tsscStoryObjectTest_13.setBusinessValue(new BigDecimal(20));
		tsscStoryObjectTest_14.setBusinessValue(new BigDecimal(100));
		tsscStoryObjectTest_15.setBusinessValue(new BigDecimal(50));
	
		tsscStoryObjectTest_16.setPriority(new BigDecimal(101));
		tsscStoryObjectTest_17.setPriority(new BigDecimal(200));
		tsscStoryObjectTest_18.setPriority(new BigDecimal(150));
		tsscStoryObjectTest_19.setPriority(new BigDecimal(120));
		tsscStoryObjectTest_20.setPriority(new BigDecimal(199));
		tsscStoryObjectTest_16.setBusinessValue(new BigDecimal(101));
		tsscStoryObjectTest_17.setBusinessValue(new BigDecimal(200));
		tsscStoryObjectTest_18.setBusinessValue(new BigDecimal(150));
		tsscStoryObjectTest_19.setBusinessValue(new BigDecimal(120));
		tsscStoryObjectTest_20.setBusinessValue(new BigDecimal(199));

		tsscStoryObjectTest_21.setPriority(new BigDecimal(230));
		tsscStoryObjectTest_22.setPriority(new BigDecimal(1000));
		tsscStoryObjectTest_23.setPriority(new BigDecimal(300));
		tsscStoryObjectTest_24.setPriority(new BigDecimal(400));
		tsscStoryObjectTest_25.setPriority(new BigDecimal(550));
		tsscStoryObjectTest_21.setBusinessValue(new BigDecimal(230));
		tsscStoryObjectTest_22.setBusinessValue(new BigDecimal(1000));
		tsscStoryObjectTest_23.setBusinessValue(new BigDecimal(300));
		tsscStoryObjectTest_24.setBusinessValue(new BigDecimal(400));
		tsscStoryObjectTest_25.setBusinessValue(new BigDecimal(550));

		when(iTsscGameRespository.existsById(1234L)).thenReturn(false);
		when(iTsscGameRespository.existsById(5678L)).thenReturn(false);
		when(iTsscGameRespository.existsById(1111L)).thenReturn(false);
		when(iTsscGameRespository.existsById(3434L)).thenReturn(false);
		when(iTsscGameRespository.existsById(2222L)).thenReturn(false);
		when(iTsscGameRespository.existsById(8786L)).thenReturn(false);
		when(iTsscGameRespository.existsById(2323L)).thenReturn(false);
		when(iTsscGameRespository.existsById(9191L)).thenReturn(false);
		when(iTsscGameRespository.existsById(7070L)).thenReturn(false);
		when(iTsscGameRespository.existsById(1669L)).thenReturn(false);
		when(iTsscGameRespository.existsById(4483L)).thenReturn(false);
		when(iTsscGameRespository.existsById(6565L)).thenReturn(false);
		when(iTsscGameRespository.existsById(4444L)).thenReturn(false);
		when(iTsscGameRespository.existsById(5656L)).thenReturn(false);
		when(iTsscGameRespository.existsById(0002L)).thenReturn(false);
		when(iTsscGameRespository.existsById(2000L)).thenReturn(false);
		when(iTsscGameRespository.existsById(3030L)).thenReturn(false);
		when(iTsscGameRespository.existsById(1212L)).thenReturn(false);
		when(iTsscGameRespository.existsById(1515L)).thenReturn(false);
		when(iTsscGameRespository.existsById(5555L)).thenReturn(false);
		when(iTsscGameRespository.existsById(9898L)).thenReturn(false);
		when(iTsscGameRespository.existsById(3434L)).thenReturn(false);
		when(iTsscGameRespository.existsById(2222L)).thenReturn(false);
		when(iTsscGameRespository.existsById(5456L)).thenReturn(false);
		when(iTsscGameRespository.existsById(3333L)).thenReturn(false);

		TsscStory tsscStoryObjectTest_01_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_01, 1234L);
		TsscStory tsscStoryObjectTest_02_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_02,5678L);
		TsscStory tsscStoryObjectTest_03_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_03,1111L);
		TsscStory tsscStoryObjectTest_04_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_04,3434L);
		TsscStory tsscStoryObjectTest_05_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_05,2222L);
		TsscStory tsscStoryObjectTest_06_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_06,8786L);
		TsscStory tsscStoryObjectTest_07_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_07,2323L);
		TsscStory tsscStoryObjectTest_08_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_08,9191L);
		TsscStory tsscStoryObjectTest_09_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_09,7070L);
		TsscStory tsscStoryObjectTest_10_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_10,1669L);
		TsscStory tsscStoryObjectTest_11_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_11,4483L);
		TsscStory tsscStoryObjectTest_12_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_12,6565L);
		TsscStory tsscStoryObjectTest_13_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_13,4444L);
		TsscStory tsscStoryObjectTest_14_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_14,5656L);
		TsscStory tsscStoryObjectTest_15_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_15,0002L);
		TsscStory tsscStoryObjectTest_16_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_16,2000L);
		TsscStory tsscStoryObjectTest_17_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_17,3030L);
		TsscStory tsscStoryObjectTest_18_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_18,1212L);
		TsscStory tsscStoryObjectTest_19_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_19,1515L);
		TsscStory tsscStoryObjectTest_20_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_20,5555L);
		TsscStory tsscStoryObjectTest_21_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_21,9898L);
		TsscStory tsscStoryObjectTest_22_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_22,3434L);
		TsscStory tsscStoryObjectTest_23_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_23,2222L);
		TsscStory tsscStoryObjectTest_24_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_24,5456L);
		TsscStory tsscStoryObjectTest_25_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_25,3333L);

		assertNull(tsscStoryObjectTest_01_copy);
		assertNull(tsscStoryObjectTest_02_copy);
		assertNull(tsscStoryObjectTest_03_copy);
		assertNull(tsscStoryObjectTest_04_copy);
		assertNull(tsscStoryObjectTest_05_copy);
		assertNull(tsscStoryObjectTest_06_copy);
		assertNull(tsscStoryObjectTest_07_copy);
		assertNull(tsscStoryObjectTest_08_copy);
		assertNull(tsscStoryObjectTest_09_copy);
		assertNull(tsscStoryObjectTest_10_copy);
		assertNull(tsscStoryObjectTest_11_copy);
		assertNull(tsscStoryObjectTest_12_copy);
		assertNull(tsscStoryObjectTest_13_copy);
		assertNull(tsscStoryObjectTest_14_copy);
		assertNull(tsscStoryObjectTest_15_copy);
		assertNull(tsscStoryObjectTest_16_copy);
		assertNull(tsscStoryObjectTest_17_copy);
		assertNull(tsscStoryObjectTest_18_copy);
		assertNull(tsscStoryObjectTest_19_copy);
		assertNull(tsscStoryObjectTest_20_copy);
		assertNull(tsscStoryObjectTest_21_copy);
		assertNull(tsscStoryObjectTest_22_copy);
		assertNull(tsscStoryObjectTest_23_copy);
		assertNull(tsscStoryObjectTest_24_copy);
		assertNull(tsscStoryObjectTest_25_copy);
	}
	@Test
	public void saveStoryImpTest_6() {

			log.info("Test 6 STARTED");

		tsscGameObjectTest_01.setId(1234L);
		tsscGameObjectTest_02.setId(5678L);
		tsscGameObjectTest_03.setId(1111L);
		tsscGameObjectTest_04.setId(3434L);
		tsscGameObjectTest_05.setId(2222L);
		tsscGameObjectTest_06.setId(8786L);
		tsscGameObjectTest_07.setId(2323L);
		tsscGameObjectTest_08.setId(9191L);
		tsscGameObjectTest_09.setId(7070L);
		tsscGameObjectTest_10.setId(1669L);
		tsscGameObjectTest_11.setId(4483L);
		tsscGameObjectTest_12.setId(6565L);
		tsscGameObjectTest_13.setId(4444L);
		tsscGameObjectTest_14.setId(5656L);
		tsscGameObjectTest_15.setId(0002L);
		tsscGameObjectTest_16.setId(2000L);
		tsscGameObjectTest_17.setId(3030L);
		tsscGameObjectTest_18.setId(1212L);
		tsscGameObjectTest_19.setId(1515L);
		tsscGameObjectTest_20.setId(5555L);
		tsscGameObjectTest_21.setId(9898L);
		tsscGameObjectTest_22.setId(3434L);
		tsscGameObjectTest_23.setId(2222L);
		tsscGameObjectTest_24.setId(5456L);
		tsscGameObjectTest_25.setId(3333L);

		tsscStoryObjectTest_01.setPriority(new BigDecimal(-200));
		tsscStoryObjectTest_02.setPriority(new BigDecimal(-100));
		tsscStoryObjectTest_03.setPriority(new BigDecimal(-130));
		tsscStoryObjectTest_04.setPriority(new BigDecimal(-199));
		tsscStoryObjectTest_05.setPriority(new BigDecimal(-160));
		tsscStoryObjectTest_01.setBusinessValue(new BigDecimal(-200));
		tsscStoryObjectTest_02.setBusinessValue(new BigDecimal(-100));
		tsscStoryObjectTest_03.setBusinessValue(new BigDecimal(-130));
		tsscStoryObjectTest_04.setBusinessValue(new BigDecimal(-199));
		tsscStoryObjectTest_05.setBusinessValue(new BigDecimal(-160));

		tsscStoryObjectTest_06.setPriority(new BigDecimal(-99));
		tsscStoryObjectTest_07.setPriority(new BigDecimal(-45));
		tsscStoryObjectTest_08.setPriority(new BigDecimal(-1));
		tsscStoryObjectTest_09.setPriority(new BigDecimal(-34));
		tsscStoryObjectTest_10.setPriority(new BigDecimal(-80));
		tsscStoryObjectTest_06.setBusinessValue(new BigDecimal(-99));
		tsscStoryObjectTest_07.setBusinessValue(new BigDecimal(-45));
		tsscStoryObjectTest_08.setBusinessValue(new BigDecimal(-1));
		tsscStoryObjectTest_09.setBusinessValue(new BigDecimal(-34));
		tsscStoryObjectTest_10.setBusinessValue(new BigDecimal(-80));

		tsscStoryObjectTest_11.setPriority(new BigDecimal(0));
		tsscStoryObjectTest_12.setPriority(new BigDecimal(4));
		tsscStoryObjectTest_13.setPriority(new BigDecimal(20));
		tsscStoryObjectTest_14.setPriority(new BigDecimal(100));
		tsscStoryObjectTest_15.setPriority(new BigDecimal(50));
		
		tsscStoryObjectTest_11.setBusinessValue(new BigDecimal(0));
		tsscStoryObjectTest_12.setBusinessValue(new BigDecimal(4));
		tsscStoryObjectTest_13.setBusinessValue(new BigDecimal(20));
		tsscStoryObjectTest_14.setBusinessValue(new BigDecimal(100));
		tsscStoryObjectTest_15.setBusinessValue(new BigDecimal(50));
		
		tsscStoryObjectTest_11.setInitialSprint(new BigDecimal(-1));
		tsscStoryObjectTest_12.setInitialSprint(new BigDecimal(-56));
		tsscStoryObjectTest_13.setInitialSprint(new BigDecimal(-45));
		tsscStoryObjectTest_14.setInitialSprint(new BigDecimal(-100));
		tsscStoryObjectTest_15.setInitialSprint(new BigDecimal(-355));

		tsscStoryObjectTest_16.setPriority(new BigDecimal(101));
		tsscStoryObjectTest_17.setPriority(new BigDecimal(200));
		tsscStoryObjectTest_18.setPriority(new BigDecimal(150));
		tsscStoryObjectTest_19.setPriority(new BigDecimal(120));
		tsscStoryObjectTest_20.setPriority(new BigDecimal(199));
		tsscStoryObjectTest_16.setBusinessValue(new BigDecimal(101));
		tsscStoryObjectTest_17.setBusinessValue(new BigDecimal(200));
		tsscStoryObjectTest_18.setBusinessValue(new BigDecimal(150));
		tsscStoryObjectTest_19.setBusinessValue(new BigDecimal(120));
		tsscStoryObjectTest_20.setBusinessValue(new BigDecimal(199));
		tsscStoryObjectTest_16.setInitialSprint(new BigDecimal(101));
		tsscStoryObjectTest_17.setInitialSprint(new BigDecimal(200));
		tsscStoryObjectTest_18.setInitialSprint(new BigDecimal(150));
		tsscStoryObjectTest_19.setInitialSprint(new BigDecimal(120));
		tsscStoryObjectTest_20.setInitialSprint(new BigDecimal(199));

		tsscStoryObjectTest_21.setPriority(new BigDecimal(230));
		tsscStoryObjectTest_22.setPriority(new BigDecimal(1000));
		tsscStoryObjectTest_23.setPriority(new BigDecimal(300));
		tsscStoryObjectTest_24.setPriority(new BigDecimal(400));
		tsscStoryObjectTest_25.setPriority(new BigDecimal(550));
		tsscStoryObjectTest_21.setBusinessValue(new BigDecimal(230));
		tsscStoryObjectTest_22.setBusinessValue(new BigDecimal(1000));
		tsscStoryObjectTest_23.setBusinessValue(new BigDecimal(300));
		tsscStoryObjectTest_24.setBusinessValue(new BigDecimal(400));
		tsscStoryObjectTest_25.setBusinessValue(new BigDecimal(550));
		tsscStoryObjectTest_21.setInitialSprint(new BigDecimal(230));
		tsscStoryObjectTest_22.setInitialSprint(new BigDecimal(1000));
		tsscStoryObjectTest_23.setInitialSprint(new BigDecimal(300));
		tsscStoryObjectTest_24.setInitialSprint(new BigDecimal(400));
		tsscStoryObjectTest_25.setInitialSprint(new BigDecimal(550));

		when(iTsscGameRespository.existsById(1234L)).thenReturn(true);
		when(iTsscGameRespository.existsById(5678L)).thenReturn(true);
		when(iTsscGameRespository.existsById(1111L)).thenReturn(true);
		when(iTsscGameRespository.existsById(3434L)).thenReturn(true);
		when(iTsscGameRespository.existsById(2222L)).thenReturn(true);
		when(iTsscGameRespository.existsById(8786L)).thenReturn(true);
		when(iTsscGameRespository.existsById(2323L)).thenReturn(true);
		when(iTsscGameRespository.existsById(9191L)).thenReturn(true);
		when(iTsscGameRespository.existsById(7070L)).thenReturn(true);
		when(iTsscGameRespository.existsById(1669L)).thenReturn(true);
		when(iTsscGameRespository.existsById(4483L)).thenReturn(true);
		when(iTsscGameRespository.existsById(6565L)).thenReturn(true);
		when(iTsscGameRespository.existsById(4444L)).thenReturn(true);
		when(iTsscGameRespository.existsById(5656L)).thenReturn(true);
		when(iTsscGameRespository.existsById(0002L)).thenReturn(true);
		when(iTsscGameRespository.existsById(2000L)).thenReturn(true);
		when(iTsscGameRespository.existsById(3030L)).thenReturn(true);
		when(iTsscGameRespository.existsById(1212L)).thenReturn(true);
		when(iTsscGameRespository.existsById(1515L)).thenReturn(true);
		when(iTsscGameRespository.existsById(5555L)).thenReturn(true);
		when(iTsscGameRespository.existsById(9898L)).thenReturn(true);
		when(iTsscGameRespository.existsById(3434L)).thenReturn(true);
		when(iTsscGameRespository.existsById(2222L)).thenReturn(true);
		when(iTsscGameRespository.existsById(5456L)).thenReturn(true);
		when(iTsscGameRespository.existsById(3333L)).thenReturn(true);
		
		when(iTsscGameRespository.findById(6565L)).thenReturn(Optional.of(tsscGameObjectTest_12));
		when(iTsscGameRespository.findById(4444L)).thenReturn(Optional.of(tsscGameObjectTest_13));
		when(iTsscGameRespository.findById(5656L)).thenReturn(Optional.of(tsscGameObjectTest_14));
		when(iTsscGameRespository.findById(0002L)).thenReturn(Optional.of(tsscGameObjectTest_15));
		when(iTsscGameRespository.findById(2000L)).thenReturn(Optional.of(tsscGameObjectTest_16));
		when(iTsscGameRespository.findById(3030L)).thenReturn(Optional.of(tsscGameObjectTest_17));
		when(iTsscGameRespository.findById(1212L)).thenReturn(Optional.of(tsscGameObjectTest_18));
		when(iTsscGameRespository.findById(1515L)).thenReturn(Optional.of(tsscGameObjectTest_19));
		when(iTsscGameRespository.findById(5555L)).thenReturn(Optional.of(tsscGameObjectTest_20));
		when(iTsscGameRespository.findById(9898L)).thenReturn(Optional.of(tsscGameObjectTest_21));
		when(iTsscGameRespository.findById(3434L)).thenReturn(Optional.of(tsscGameObjectTest_22));
		when(iTsscGameRespository.findById(2222L)).thenReturn(Optional.of(tsscGameObjectTest_23));
		when(iTsscGameRespository.findById(5456L)).thenReturn(Optional.of(tsscGameObjectTest_24));
		when(iTsscGameRespository.findById(3333L)).thenReturn(Optional.of(tsscGameObjectTest_25));

		TsscStory tsscStoryObjectTest_01_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_01, 1234L);
		TsscStory tsscStoryObjectTest_02_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_02,5678L);
		TsscStory tsscStoryObjectTest_03_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_03,1111L);
		TsscStory tsscStoryObjectTest_04_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_04,3434L);
		TsscStory tsscStoryObjectTest_05_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_05,2222L);
		TsscStory tsscStoryObjectTest_06_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_06,8786L);
		TsscStory tsscStoryObjectTest_07_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_07,2323L);
		TsscStory tsscStoryObjectTest_08_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_08,9191L);
		TsscStory tsscStoryObjectTest_09_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_09,7070L);
		TsscStory tsscStoryObjectTest_10_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_10,1669L);
		TsscStory tsscStoryObjectTest_11_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_11,4483L);
		TsscStory tsscStoryObjectTest_12_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_12,6565L);
		TsscStory tsscStoryObjectTest_13_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_13,4444L);
		TsscStory tsscStoryObjectTest_14_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_14,5656L);
		TsscStory tsscStoryObjectTest_15_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_15,0002L);
		
		TsscStory tsscStoryObjectTest_16_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_16,2000L);
		TsscStory tsscStoryObjectTest_17_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_17,3030L);
		TsscStory tsscStoryObjectTest_18_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_18,1212L);
		TsscStory tsscStoryObjectTest_19_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_19,1515L);
		TsscStory tsscStoryObjectTest_20_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_20,5555L);
		TsscStory tsscStoryObjectTest_21_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_21,9898L);
		TsscStory tsscStoryObjectTest_22_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_22,3434L);
		TsscStory tsscStoryObjectTest_23_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_23,2222L);
		TsscStory tsscStoryObjectTest_24_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_24,5456L);
		TsscStory tsscStoryObjectTest_25_copy = tsscStoryServiceImp.saveStory(tsscStoryObjectTest_25,3333L);

		assertNull(tsscStoryObjectTest_01_copy);
		assertNull(tsscStoryObjectTest_02_copy);
		assertNull(tsscStoryObjectTest_03_copy);
		assertNull(tsscStoryObjectTest_04_copy);
		assertNull(tsscStoryObjectTest_05_copy);
		assertNull(tsscStoryObjectTest_06_copy);
		assertNull(tsscStoryObjectTest_07_copy);
		assertNull(tsscStoryObjectTest_08_copy);
		assertNull(tsscStoryObjectTest_09_copy);
		assertNull(tsscStoryObjectTest_10_copy);
		assertNull(tsscStoryObjectTest_11_copy);
		assertNull(tsscStoryObjectTest_12_copy);
		assertNull(tsscStoryObjectTest_13_copy);
		assertNull(tsscStoryObjectTest_14_copy);
		assertNull(tsscStoryObjectTest_15_copy);
		assertNotNull(tsscStoryObjectTest_16_copy);
		assertNotNull(tsscStoryObjectTest_17_copy);
		assertNotNull(tsscStoryObjectTest_18_copy);
		assertNotNull(tsscStoryObjectTest_19_copy);
		assertNotNull(tsscStoryObjectTest_20_copy);
		assertNotNull(tsscStoryObjectTest_21_copy);
		assertNotNull(tsscStoryObjectTest_22_copy);
		assertNotNull(tsscStoryObjectTest_23_copy);
		assertNotNull(tsscStoryObjectTest_24_copy);
		assertNotNull(tsscStoryObjectTest_25_copy);
	}
	@Test
	public void updatePriorityStortyImpTest() {

		tsscStoryObjectTest_01.setId(4565L);
		tsscStoryObjectTest_01.setBusinessValue(new BigDecimal(1));
		tsscStoryObjectTest_02.setId(8787L);
		tsscStoryObjectTest_02.setBusinessValue(new BigDecimal(33));
		tsscStoryObjectTest_03.setId(2332L);
		tsscStoryObjectTest_03.setBusinessValue(new BigDecimal(13));
		tsscStoryObjectTest_04.setId(9922L);
		tsscStoryObjectTest_04.setBusinessValue(new BigDecimal(20));
		tsscStoryObjectTest_05.setId(2393L);
		tsscStoryObjectTest_05.setBusinessValue(new BigDecimal(31));

		when(iTsscStoryRepository.existsById(4565L)).thenReturn(true);
		when(iTsscStoryRepository.findById(4565L)).thenReturn(Optional.of(tsscStoryObjectTest_01));
		when(iTsscStoryRepository.existsById(8787L)).thenReturn(true);
		when(iTsscStoryRepository.findById(8787L)).thenReturn(Optional.of(tsscStoryObjectTest_02));
		when(iTsscStoryRepository.existsById(2332L)).thenReturn(true);
		when(iTsscStoryRepository.findById(2332L)).thenReturn(Optional.of(tsscStoryObjectTest_03));
		when(iTsscStoryRepository.existsById(9922L)).thenReturn(true);
		when(iTsscStoryRepository.findById(9922L)).thenReturn(Optional.of(tsscStoryObjectTest_04));
		when(iTsscStoryRepository.existsById(2393L)).thenReturn(true);
		when(iTsscStoryRepository.findById(2392L)).thenReturn(Optional.of(tsscStoryObjectTest_05));
		when(iTsscStoryRepository.existsById(8080L)).thenReturn(false);
		when(iTsscStoryRepository.existsById(9999L)).thenReturn(false);

		TsscStory tsscStoryObjectTest_01_resultMethod = tsscStoryServiceImp.updateBusinessValueStory(4565L, new BigDecimal(19));
		TsscStory tsscStoryObjectTest_02_resultMethod = tsscStoryServiceImp.updateBusinessValueStory(8787L, new BigDecimal(255));
		TsscStory tsscStoryObjectTest_03_resultMethod = tsscStoryServiceImp.updateBusinessValueStory(2332L, new BigDecimal(0));
		TsscStory tsscStoryObjectTest_04_resultMethod = tsscStoryServiceImp.updateBusinessValueStory(9922L, new BigDecimal(30));
		TsscStory tsscStoryObjectTest_05_resultMethod = tsscStoryServiceImp.updateBusinessValueStory(2392L, new BigDecimal(-1));
		TsscStory tsscStoryObjectTest_06_resultMethod = tsscStoryServiceImp.updateBusinessValueStory(8080L, new BigDecimal(1));
		TsscStory tsscStoryObjectTest_07_resultMethod = tsscStoryServiceImp.updateBusinessValueStory(9999L, new BigDecimal(-98));

		assertNotNull(tsscStoryObjectTest_01_resultMethod );
		assertNotNull(tsscStoryObjectTest_02_resultMethod );
		assertNull(tsscStoryObjectTest_03_resultMethod );
		assertNotNull(tsscStoryObjectTest_04_resultMethod );
		assertNull(tsscStoryObjectTest_05_resultMethod );
		assertNull(tsscStoryObjectTest_06_resultMethod );
		assertNull(tsscStoryObjectTest_07_resultMethod );
	
		log.info("Test finished succesfully. ");
		

		
	}
	@Test
	public void updateBusinessValueStortyImpTest() {

		tsscStoryObjectTest_01.setId(4565L);
		tsscStoryObjectTest_01.setPriority(new BigDecimal(1));
		tsscStoryObjectTest_02.setId(8787L);
		tsscStoryObjectTest_02.setPriority(new BigDecimal(33));
		tsscStoryObjectTest_03.setId(2332L);
		tsscStoryObjectTest_03.setPriority(new BigDecimal(13));
		tsscStoryObjectTest_04.setId(9922L);
		tsscStoryObjectTest_04.setPriority(new BigDecimal(20));
		tsscStoryObjectTest_05.setId(2393L);
		tsscStoryObjectTest_05.setPriority(new BigDecimal(31));

		when(iTsscStoryRepository.existsById(4565L)).thenReturn(true);
		when(iTsscStoryRepository.findById(4565L)).thenReturn(Optional.of(tsscStoryObjectTest_01));
		when(iTsscStoryRepository.existsById(8787L)).thenReturn(true);
		when(iTsscStoryRepository.findById(8787L)).thenReturn(Optional.of(tsscStoryObjectTest_02));
		when(iTsscStoryRepository.existsById(2332L)).thenReturn(true);
		when(iTsscStoryRepository.findById(2332L)).thenReturn(Optional.of(tsscStoryObjectTest_03));
		when(iTsscStoryRepository.existsById(9922L)).thenReturn(true);
		when(iTsscStoryRepository.findById(9922L)).thenReturn(Optional.of(tsscStoryObjectTest_04));
		when(iTsscStoryRepository.existsById(2393L)).thenReturn(true);
		when(iTsscStoryRepository.findById(2392L)).thenReturn(Optional.of(tsscStoryObjectTest_05));
		when(iTsscStoryRepository.existsById(8080L)).thenReturn(false);
		when(iTsscStoryRepository.existsById(9999L)).thenReturn(false);

		TsscStory tsscStoryObjectTest_01_resultMethod = tsscStoryServiceImp.updatePriorityStory(4565L, new BigDecimal(19));
		TsscStory tsscStoryObjectTest_02_resultMethod = tsscStoryServiceImp.updatePriorityStory(8787L, new BigDecimal(255));
		TsscStory tsscStoryObjectTest_03_resultMethod = tsscStoryServiceImp.updatePriorityStory(2332L, new BigDecimal(0));
		TsscStory tsscStoryObjectTest_04_resultMethod = tsscStoryServiceImp.updatePriorityStory(9922L, new BigDecimal(30));
		TsscStory tsscStoryObjectTest_05_resultMethod = tsscStoryServiceImp.updatePriorityStory(2392L, new BigDecimal(-1));
		TsscStory tsscStoryObjectTest_06_resultMethod = tsscStoryServiceImp.updatePriorityStory(8080L, new BigDecimal(1));
		TsscStory tsscStoryObjectTest_07_resultMethod = tsscStoryServiceImp.updatePriorityStory(9999L, new BigDecimal(-98));

		assertNotNull(tsscStoryObjectTest_01_resultMethod );
		assertNotNull(tsscStoryObjectTest_02_resultMethod );
		assertNull(tsscStoryObjectTest_03_resultMethod );
		assertNotNull(tsscStoryObjectTest_04_resultMethod );
		assertNull(tsscStoryObjectTest_05_resultMethod );
		assertNull(tsscStoryObjectTest_06_resultMethod );
		assertNull(tsscStoryObjectTest_07_resultMethod );

		log.info("Test finished succesfully. ");
		

	}


}
