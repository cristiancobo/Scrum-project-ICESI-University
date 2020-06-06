package com.example.demo.Modelo;



import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Repository.ITsscGameRespository;
import com.example.demo.Repository.ITsscTopicRepository;
import com.example.demo.Service.TsscGameServiceImp;

import lombok.extern.java.Log;


/*
 * 
 */
@Log
@SpringBootTest
class TsscGameServiceImpTest {
	
	/*
	 * Dependency injections ___________________________________________________
	 */
	
	@InjectMocks
	TsscGameServiceImp tsscGameServiceImp;

	/*
	 * Mocks ___________________________________________________________________
	 */
	@Mock
	ITsscTopicRepository iTsscTopicRepository;
	@Mock
	ITsscGameRespository iTsscGameRespository;

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

	
	/*
	 * Test methods_____________________________________________________________
	 */
	
	@BeforeEach
	public void sutup() {

		MockitoAnnotations.initMocks(this);

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
	public void saveGameImpTest_1() {

		tsscGameObjectTest_01.setNGroups(-30);
		tsscGameObjectTest_02.setNGroups(-100);
		tsscGameObjectTest_03.setNGroups(-130);
		tsscGameObjectTest_04.setNGroups(-199);
		tsscGameObjectTest_05.setNGroups(-160);

		tsscGameObjectTest_06.setNGroups(-99);
		tsscGameObjectTest_07.setNGroups(-45);
		tsscGameObjectTest_08.setNGroups(-1);
		tsscGameObjectTest_09.setNGroups(-34);
		tsscGameObjectTest_10.setNGroups(-80);

		TsscGame tsscGameObjectTest_01_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_01,false,0L);
		TsscGame tsscGameObjectTest_02_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_02,false,0L);
		TsscGame tsscGameObjectTest_03_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_03,false,0L);
		TsscGame tsscGameObjectTest_04_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_04,false,0L);
		TsscGame tsscGameObjectTest_05_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_05,false,0L);
		TsscGame tsscGameObjectTest_06_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_06,false,0L);
		TsscGame tsscGameObjectTest_07_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_07,false,0L);
		TsscGame tsscGameObjectTest_08_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_08,false,0L);
		TsscGame tsscGameObjectTest_09_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_09,false,0L);
		TsscGame tsscGameObjectTest_10_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_10,false,0L);

		assertNull(tsscGameObjectTest_01_copy);
		assertNull(tsscGameObjectTest_02_copy);
		assertNull(tsscGameObjectTest_03_copy);
		assertNull(tsscGameObjectTest_04_copy);
		assertNull(tsscGameObjectTest_05_copy);
		assertNull(tsscGameObjectTest_06_copy);
		assertNull(tsscGameObjectTest_07_copy);
		assertNull(tsscGameObjectTest_08_copy);
		assertNull(tsscGameObjectTest_09_copy);
		assertNull(tsscGameObjectTest_10_copy);

		log.info("Test finished succesfully. ");
	}
	@Test
	public void saveGameImpTest_2() {

		tsscGameObjectTest_01.setNSprints(-30);
		tsscGameObjectTest_02.setNSprints(-100);
		tsscGameObjectTest_03.setNSprints(-130);
		tsscGameObjectTest_04.setNSprints(-199);
		tsscGameObjectTest_05.setNSprints(-160);

		tsscGameObjectTest_06.setNSprints(-99);
		tsscGameObjectTest_07.setNSprints(-45);
		tsscGameObjectTest_08.setNSprints(-1);
		tsscGameObjectTest_09.setNSprints(-34);
		tsscGameObjectTest_10.setNSprints(-80);

		TsscGame tsscGameObjectTest_01_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_01,false,0L);
		TsscGame tsscGameObjectTest_02_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_02,false,0L);
		TsscGame tsscGameObjectTest_03_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_03,false,0L);
		TsscGame tsscGameObjectTest_04_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_04,false,0L);
		TsscGame tsscGameObjectTest_05_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_05,false,0L);
		TsscGame tsscGameObjectTest_06_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_06,false,0L);
		TsscGame tsscGameObjectTest_07_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_07,false,0L);
		TsscGame tsscGameObjectTest_08_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_08,false,0L);
		TsscGame tsscGameObjectTest_09_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_09,false,0L);
		TsscGame tsscGameObjectTest_10_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_10,false,0L);

		assertNull(tsscGameObjectTest_01_copy);
		assertNull(tsscGameObjectTest_02_copy);
		assertNull(tsscGameObjectTest_03_copy);
		assertNull(tsscGameObjectTest_04_copy);
		assertNull(tsscGameObjectTest_05_copy);
		assertNull(tsscGameObjectTest_06_copy);
		assertNull(tsscGameObjectTest_07_copy);
		assertNull(tsscGameObjectTest_08_copy);
		assertNull(tsscGameObjectTest_09_copy);
		assertNull(tsscGameObjectTest_10_copy);

		log.info("Test finished succesfully. ");
	}
	
	@Test
	public void saveGameImpTest_3() {

		tsscGameObjectTest_01.setNSprints(30); 
		tsscGameObjectTest_02.setNSprints(100); 
		tsscGameObjectTest_03.setNSprints(130); 
		tsscGameObjectTest_04.setNSprints(199); 
		tsscGameObjectTest_05.setNGroups(160); 
		
		tsscGameObjectTest_06.setNGroups(99); 
		tsscGameObjectTest_07.setNGroups(45); 
		tsscGameObjectTest_08.setNGroups(1);
		tsscGameObjectTest_09.setNSprints(-34);
		tsscGameObjectTest_10.setNSprints(-80);

		when(iTsscTopicRepository.existsById(4565L)).thenReturn(true);
		when(iTsscTopicRepository.findById(4565L)).thenReturn(Optional.of(tsscTopicObjectTest_01));
		when(iTsscTopicRepository.existsById(8787L)).thenReturn(true);
		when(iTsscTopicRepository.findById(8787L)).thenReturn(Optional.of(tsscTopicObjectTest_02));
		when(iTsscTopicRepository.existsById(8181L)).thenReturn(false);
		when(iTsscTopicRepository.existsById(3943L)).thenReturn(false);
		when(iTsscTopicRepository.existsById(2020L)).thenReturn(true);
		when(iTsscTopicRepository.findById(2020L)).thenReturn(Optional.of(tsscTopicObjectTest_05));
		when(iTsscTopicRepository.existsById(3432L)).thenReturn(true);
		when(iTsscTopicRepository.findById(3432L)).thenReturn(Optional.of(tsscTopicObjectTest_06));
		when(iTsscTopicRepository.existsById(1111L)).thenReturn(false);
		when(iTsscTopicRepository.existsById(1999L)).thenReturn(false);
		when(iTsscTopicRepository.existsById(6767L)).thenReturn(true);
		when(iTsscTopicRepository.findById(6767L)).thenReturn(Optional.of(tsscTopicObjectTest_09));
		when(iTsscTopicRepository.existsById(0101L)).thenReturn(true);
		when(iTsscTopicRepository.findById(0101L)).thenReturn(Optional.of(tsscTopicObjectTest_10));

		TsscGame tsscGameObjectTest_01_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_01,true,4565L);
		TsscGame tsscGameObjectTest_02_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_02,true,8787L);
		TsscGame tsscGameObjectTest_03_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_03,true,8181L);
		TsscGame tsscGameObjectTest_04_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_04,true,3943L);
		TsscGame tsscGameObjectTest_05_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_05,true,2020L);
		TsscGame tsscGameObjectTest_06_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_06,true,3432L);
		TsscGame tsscGameObjectTest_07_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_07,true,1111L);
		TsscGame tsscGameObjectTest_08_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_08,true,1999L);
		TsscGame tsscGameObjectTest_09_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_09,true,6767L);
		TsscGame tsscGameObjectTest_10_copy = tsscGameServiceImp.saveGame(tsscGameObjectTest_10,true,0101L);

		assertNotNull(tsscGameObjectTest_01_copy);
		assertNotNull(tsscGameObjectTest_02_copy);
		assertNull(tsscGameObjectTest_03_copy);
		assertNull(tsscGameObjectTest_04_copy);
		assertNotNull(tsscGameObjectTest_05_copy);
		assertNotNull(tsscGameObjectTest_06_copy);
		assertNull(tsscGameObjectTest_07_copy);
		assertNull(tsscGameObjectTest_08_copy);
		assertNull(tsscGameObjectTest_09_copy);
		assertNull(tsscGameObjectTest_10_copy);

		
		log.info("Test finished succesfully. ");
	}
	
	public void saveGameImp_2_Test_1() {
		
		tsscGameObjectTest_01.setNSprints(0);
		tsscGameObjectTest_01.setNGroups(30); 
		
		tsscGameObjectTest_02.setNSprints(-1);
		tsscGameObjectTest_02.setNGroups(30); 
		
		tsscGameObjectTest_03.setNSprints(-1);
		tsscGameObjectTest_03.setNGroups(-4); 
		
		tsscGameObjectTest_04.setNSprints(199);
		tsscGameObjectTest_04.setNGroups(30); 
		
		tsscGameObjectTest_05.setNGroups(160);
		tsscGameObjectTest_05.setNGroups(30); 
		
		when(iTsscTopicRepository.existsById(4565L)).thenReturn(true);
		when(iTsscTopicRepository.findById(4565L)).thenReturn(Optional.of(tsscTopicObjectTest_01));
		
		when(iTsscTopicRepository.existsById(8787L)).thenReturn(true);
		when(iTsscTopicRepository.findById(8787L)).thenReturn(Optional.of(tsscTopicObjectTest_02));
		
		when(iTsscTopicRepository.existsById(4444L)).thenReturn(true);
		when(iTsscTopicRepository.findById(4444L)).thenReturn(Optional.of(tsscTopicObjectTest_03));
		
		when(iTsscTopicRepository.existsById(6666L)).thenReturn(true);
		when(iTsscTopicRepository.findById(6666L)).thenReturn(Optional.of(tsscTopicObjectTest_04));
		
		when(iTsscTopicRepository.existsById(8888L)).thenReturn(false);
		when(iTsscTopicRepository.findById(8888L)).thenReturn(Optional.of(tsscTopicObjectTest_05));
		
		TsscGame tsscGameObjectTest_01_copy = tsscGameServiceImp.saveGameTwo(tsscGameObjectTest_01,4565L);
		TsscGame tsscGameObjectTest_02_copy = tsscGameServiceImp.saveGameTwo(tsscGameObjectTest_02,8787L);
		TsscGame tsscGameObjectTest_03_copy = tsscGameServiceImp.saveGameTwo(tsscGameObjectTest_03,4444L);
		TsscGame tsscGameObjectTest_04_copy = tsscGameServiceImp.saveGameTwo(tsscGameObjectTest_04,6666L);
		TsscGame tsscGameObjectTest_05_copy = tsscGameServiceImp.saveGameTwo(tsscGameObjectTest_05,8888L);
		assertNull(tsscGameObjectTest_01_copy);
		assertNull(tsscGameObjectTest_02_copy);
		assertNull(tsscGameObjectTest_03_copy);
		assertNotNull(tsscGameObjectTest_04_copy);
		assertNotNull(tsscGameObjectTest_05_copy);
	
	}

	@Test
	public void updateAmountNSprintsGameImpTest() {

		when(iTsscGameRespository.existsById(4565L)).thenReturn(true);
		when(iTsscGameRespository.findById(4565L)).thenReturn(Optional.of(tsscGameObjectTest_01));
		when(iTsscGameRespository.existsById(8787L)).thenReturn(true);
		when(iTsscGameRespository.findById(8787L)).thenReturn(Optional.of(tsscGameObjectTest_02));
		when(iTsscGameRespository.existsById(2332L)).thenReturn(true);
		when(iTsscGameRespository.findById(2332L)).thenReturn(Optional.of(tsscGameObjectTest_03));
		when(iTsscGameRespository.existsById(9922L)).thenReturn(true);
		when(iTsscGameRespository.findById(9922L)).thenReturn(Optional.of(tsscGameObjectTest_04));
		when(iTsscGameRespository.existsById(2393L)).thenReturn(true);
		when(iTsscGameRespository.findById(2392L)).thenReturn(Optional.of(tsscGameObjectTest_05));
		when(iTsscGameRespository.existsById(8080L)).thenReturn(false);
		when(iTsscGameRespository.existsById(9999L)).thenReturn(false);

		TsscGame tsscGameObjectTest_01_resultMethod = tsscGameServiceImp.updateGameAmountNSprints(4565L, 19);
		TsscGame tsscGameObjectTest_02_resultMethod = tsscGameServiceImp.updateGameAmountNSprints(8787L, 255);
		TsscGame tsscGameObjectTest_03_resultMethod = tsscGameServiceImp.updateGameAmountNSprints(2332L, 0);
		TsscGame tsscGameObjectTest_04_resultMethod = tsscGameServiceImp.updateGameAmountNSprints(9922L, 30);
		TsscGame tsscGameObjectTest_05_resultMethod = tsscGameServiceImp.updateGameAmountNSprints(2392L, -1);
		TsscGame tsscGameObjectTest_06_resultMethod = tsscGameServiceImp.updateGameAmountNSprints(8080L, -1);
		TsscGame tsscGameObjectTest_07_resultMethod = tsscGameServiceImp.updateGameAmountNSprints(9999L, -98);

		assertEquals(19,tsscGameObjectTest_01_resultMethod.getNSprints() );
		assertNotNull(tsscGameObjectTest_01_resultMethod );
		assertEquals(255,tsscGameObjectTest_02_resultMethod.getNSprints() );
		assertNotNull(tsscGameObjectTest_02_resultMethod );
		assertNull(tsscGameObjectTest_03_resultMethod );
		assertEquals(30,tsscGameObjectTest_04_resultMethod.getNSprints() );
		assertNotNull(tsscGameObjectTest_04_resultMethod );
		assertNull(tsscGameObjectTest_05_resultMethod );
		assertNull(tsscGameObjectTest_06_resultMethod );
		assertNull(tsscGameObjectTest_07_resultMethod );

		log.info("Test finished succesfully. ");
		

	}

	@Test
	public void updateAmountNGroupsGameImpTest() {

		when(iTsscGameRespository.existsById(4565L)).thenReturn(true);
		when(iTsscGameRespository.findById(4565L)).thenReturn(Optional.of(tsscGameObjectTest_01));
		when(iTsscGameRespository.existsById(8787L)).thenReturn(true);
		when(iTsscGameRespository.findById(8787L)).thenReturn(Optional.of(tsscGameObjectTest_02));
		when(iTsscGameRespository.existsById(2332L)).thenReturn(true);
		when(iTsscGameRespository.findById(2332L)).thenReturn(Optional.of(tsscGameObjectTest_03));
		when(iTsscGameRespository.existsById(9922L)).thenReturn(true);
		when(iTsscGameRespository.findById(9922L)).thenReturn(Optional.of(tsscGameObjectTest_04));
		when(iTsscGameRespository.existsById(2393L)).thenReturn(true);
		when(iTsscGameRespository.findById(2392L)).thenReturn(Optional.of(tsscGameObjectTest_05));
		when(iTsscGameRespository.existsById(8080L)).thenReturn(false);
		when(iTsscGameRespository.existsById(9999L)).thenReturn(false);

		TsscGame tsscGameObjectTest_01_resultMethod = tsscGameServiceImp.updateGameAmountNGroups(4565L, 19);
		TsscGame tsscGameObjectTest_02_resultMethod = tsscGameServiceImp.updateGameAmountNGroups(8787L, 255);
		TsscGame tsscGameObjectTest_03_resultMethod = tsscGameServiceImp.updateGameAmountNGroups(2332L, 0);
		TsscGame tsscGameObjectTest_04_resultMethod = tsscGameServiceImp.updateGameAmountNGroups(9922L, 30);
		TsscGame tsscGameObjectTest_05_resultMethod = tsscGameServiceImp.updateGameAmountNGroups(2392L, -1);
		TsscGame tsscGameObjectTest_06_resultMethod = tsscGameServiceImp.updateGameAmountNGroups(8080L, -1);
		TsscGame tsscGameObjectTest_07_resultMethod = tsscGameServiceImp.updateGameAmountNGroups(9999L, -98);

		assertEquals(19,tsscGameObjectTest_01_resultMethod.getNGroups() );
		assertNotNull(tsscGameObjectTest_01_resultMethod );
		assertEquals(255,tsscGameObjectTest_02_resultMethod.getNGroups() );
		assertNotNull(tsscGameObjectTest_02_resultMethod );
		assertNull(tsscGameObjectTest_03_resultMethod );
		assertEquals(30,tsscGameObjectTest_04_resultMethod.getNGroups() );
		assertNotNull(tsscGameObjectTest_04_resultMethod );
		assertNull(tsscGameObjectTest_05_resultMethod );
		assertNull(tsscGameObjectTest_06_resultMethod );
		assertNull(tsscGameObjectTest_07_resultMethod );

		log.info("Test finished succesfully. ");
		
		
	}

}