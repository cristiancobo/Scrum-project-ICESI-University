package com.example.demo.Dao;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.VersionFinalTsscProjectCristianCoboApplication;
import com.example.demo.Modelo.TsscGame;
import com.example.demo.Modelo.TsscStory;
import com.example.demo.Modelo.TsscTopic;

@SpringBootTest(classes = VersionFinalTsscProjectCristianCoboApplication.class)
@ExtendWith(SpringExtension.class)
@TestMethodOrder(OrderAnnotation.class)
@Rollback(false)
class TsscGameDAOTest {
	
	@Autowired
	TsscGameDAO tsscGameDAO;
	@Autowired
	TsscTopicDao tsscTopicDao;
	@Autowired
	TsscStoryDao tsscStoryDao;
	

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@Order(1)
	void testSave() {
		
		TsscGame tsscGame = new TsscGame();
		tsscGame.setName("PokemonGo");
		tsscGame.setNGroups(6);
		tsscGame.setNSprints(6);
		tsscGame.setAdminPassword("1234567890");
		tsscGameDAO.save(tsscGame);
		
		assertEquals("PokemonGo", tsscGameDAO.findById(tsscGame.getId()).getName());
		assertEquals(1,tsscGameDAO.findAll().size());

	}
	@Test
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@Order(2)
	void findAll() {
		
		TsscGame tsscGame_1 = new TsscGame();
		tsscGame_1.setName("PokemonGo 1");
		tsscGame_1.setNGroups(6);
		tsscGame_1.setNSprints(6);
		tsscGame_1.setAdminPassword("1234567890");
		tsscGameDAO.save(tsscGame_1);
		
		TsscGame tsscGame_2 = new TsscGame();
		tsscGame_2.setName("PokemonGo 1");
		tsscGame_2.setNGroups(6);
		tsscGame_2.setNSprints(6);
		tsscGame_2.setAdminPassword("1234567890");
		tsscGameDAO.save(tsscGame_2);
		
		TsscGame tsscGame_3 = new TsscGame();
		tsscGame_3.setName("PokemonGo 1");
		tsscGame_3.setNGroups(6);
		tsscGame_3.setNSprints(6);
		tsscGame_3.setAdminPassword("1234567890");
		tsscGameDAO.save(tsscGame_3);
		
		assertEquals(5, tsscGameDAO.findAll().size());
		assertNotNull(tsscGameDAO.findAll());

		
	}

	@Test
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@Order(3)
	void testUpdate() {
		
		TsscGame tsscGame = new TsscGame();
		tsscGame.setName("PokemonGo");
		tsscGame.setNGroups(6);
		tsscGame.setNSprints(6);
		tsscGame.setAdminPassword("1234567890");
		tsscGameDAO.save(tsscGame);
		tsscGameDAO.findById(tsscGame.getId()).setName("PokemonGo_2");
		tsscGameDAO.update(tsscGame);
		
		assertEquals("PokemonGo_2",tsscGameDAO.findById(tsscGame.getId()).getName());
		assertEquals(15,tsscGameDAO.findAll().size());
	}

	@Test
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@Order(4)
	void testDelete() {

		TsscGame tsscGame = new TsscGame();
		tsscGame.setName("PokemonGo");
		tsscGame.setNGroups(6);
		tsscGame.setNSprints(6);
		tsscGame.setAdminPassword("1234567890");
		tsscGameDAO.save(tsscGame);
		tsscGameDAO.delete(tsscGame);
		
		TsscGame tsscGame_2 = new TsscGame();
		tsscGame_2.setName("PokemonGo");
		tsscGame_2.setNGroups(6);
		tsscGame_2.setNSprints(6);
		tsscGame_2.setAdminPassword("1234567890");
		tsscGameDAO.save(tsscGame_2);
		tsscGameDAO.delete(tsscGame_2);
		
		TsscGame tsscGame_3 = new TsscGame();
		tsscGame_3.setName("PokemonGo");
		tsscGame_3.setNGroups(6);
		tsscGame_3.setNSprints(6);
		tsscGame_3.setAdminPassword("1234567890");
		tsscGameDAO.save(tsscGame_3);
		tsscGameDAO.delete(tsscGame_3);
		
		
		assertNull(tsscGameDAO.findById(tsscGame.getId()));
		assertNull(tsscGameDAO.findById(tsscGame_2.getId()));
		assertNull(tsscGameDAO.findById(tsscGame_3.getId()));

	}

	@Test
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@Order(5)
	void testFindById() {
		
		TsscGame tsscGame = new TsscGame();
		tsscGame.setName("PokemonGo");
		tsscGame.setNGroups(6);
		tsscGame.setNSprints(4);
		tsscGame.setAdminPassword("1234567890");
		tsscGameDAO.save(tsscGame);
	
		assertNotNull(tsscGameDAO.findById(tsscGame.getId()));
		assertEquals("PokemonGo", tsscGameDAO.findById(tsscGame.getId()).getName());
	}

	@Test
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@Order(6)
	void testFindByIdTopic() {
	
		TsscTopic tsscTopic = new TsscTopic();
		tsscTopic.setName("Topic");
		tsscTopic.setDefaultGroups(20);
		tsscTopic.setDefaultSprints(30);
		tsscTopic.setDescription("Best topic");
		tsscTopicDao.save(tsscTopic);
		
		TsscGame tsscGame = new TsscGame();
		tsscGame.setName("PokemonGo");
		tsscGame.setNGroups(6);
		tsscGame.setNSprints(4);
		tsscGame.setAdminPassword("1234567890");
		tsscGame.setTsscTopic(tsscTopic);
		tsscGameDAO.save(tsscGame);
		
		assertEquals("PokemonGo",tsscGameDAO.findByIdTopic(tsscTopic.getId()).get(0).getName() );
		assertEquals("Topic", tsscGameDAO.findByIdTopic(tsscTopic.getId()).get(0).getTsscTopic().getName());

	}
	
	@Test
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@Order(7)
	void testFindByDescriptionTopic() {
	
		
		TsscTopic tsscTopic = new TsscTopic();
		tsscTopic.setName("Topic");
		tsscTopic.setDefaultGroups(20);
		tsscTopic.setDefaultSprints(30);
		tsscTopic.setDescription("Best topic");
		tsscTopicDao.save(tsscTopic);
		
		TsscGame tsscGame = new TsscGame();
		tsscGame.setName("PokemonGo");
		tsscGame.setNGroups(6);
		tsscGame.setNSprints(4);
		tsscGame.setAdminPassword("1234567890");
		tsscGame.setTsscTopic(tsscTopic);
		tsscGameDAO.save(tsscGame);
		
		
		tsscGameDAO.findByDescriptioTopic("Best topic");
		assertEquals("PokemonGo",tsscGameDAO.findByDescriptioTopic("Best topic").get(0).getName() );
		assertEquals("Best topic", tsscGameDAO.findByIdTopic(tsscTopic.getId()).get(0).getTsscTopic().getDescription());

		
	}

	@Test
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@Order(8)
	void testFindByName() {
		
		LocalDate localDate = LocalDate.of(2020,5,2);
		
		TsscGame tsscGame = new TsscGame();
		tsscGame.setName("PokemonGo");
		tsscGame.setNGroups(6);
		tsscGame.setNSprints(4);
		tsscGame.setAdminPassword("1234567890");
		tsscGame.setScheduledDate(localDate);
		tsscGameDAO.save(tsscGame);
		assertNotNull(tsscGameDAO.findByName("PokemonGo"));
		assertEquals(2,tsscGameDAO.findByName("PokemonGo").size());
	}



	@Test
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@Order(9)
	void testFindByDateRange() {
		
		LocalDate localDate = LocalDate.of(2020,5,2);
		
		TsscGame tsscGame = new TsscGame();
		tsscGame.setName("PokemonGo 1");
		tsscGame.setNGroups(6);
		tsscGame.setNSprints(4);
		tsscGame.setAdminPassword("1234567890");
		tsscGame.setScheduledDate(localDate);
		tsscGameDAO.save(tsscGame);
		
		TsscGame tsscGame_2 = new TsscGame();
		tsscGame_2.setName("PokemonGo 2");
		tsscGame_2.setNGroups(6);
		tsscGame_2.setNSprints(4);
		tsscGame_2.setAdminPassword("1234567890");
		tsscGame_2.setScheduledDate(localDate);
		tsscGameDAO.save(tsscGame_2);
		
		
		TsscGame tsscGame_3 = new TsscGame();
		tsscGame_3.setName("PokemonGo 3");
		tsscGame_3.setNGroups(6);
		tsscGame_3.setNSprints(4);
		tsscGame_3.setAdminPassword("1234567890");
		tsscGame_3.setScheduledDate(localDate);
		tsscGameDAO.save(tsscGame_3);
		
		TsscGame tsscGame_4 = new TsscGame();
		tsscGame_4.setName("PokemonGo 4");
		tsscGame_4.setNGroups(6);
		tsscGame_4.setNSprints(4);
		tsscGame_4.setAdminPassword("1234567890");
		tsscGame_4.setScheduledDate(localDate);
		tsscGameDAO.save(tsscGame_4);
		
		LocalDate localDate1 = LocalDate.of(2020,3,2);
		LocalDate localDate2 = LocalDate.of(2020,7,2);
		assertNotNull(tsscGameDAO.findByDateRange(localDate1, localDate2));
		assertEquals(7,tsscGameDAO.findByDateRange(localDate1, localDate2).size());

		
		
		
				
	}
	
	@Test
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@Order(10)
	void testFindByDateStoryTime() {
		
		
		TsscTopic tsscTopic = new TsscTopic();
		tsscTopic.setName("Topic");
		tsscTopic.setDefaultGroups(20);
		tsscTopic.setDefaultSprints(30);
		tsscTopic.setDescription("Best topic");
		tsscTopicDao.save(tsscTopic);
		
		TsscStory tsscStory_1 = new TsscStory();
		tsscStory_1.setBusinessValue(new BigDecimal(7));
		tsscStory_1.setPriority(new BigDecimal(6));
		tsscStory_1.setDescription("Story 1");
		tsscStory_1.setTsscTopic(tsscTopic);
		
		TsscStory tsscStory_2 = new TsscStory();
		tsscStory_2.setBusinessValue(new BigDecimal(7));
		tsscStory_2.setPriority(new BigDecimal(6));
		tsscStory_2.setDescription("Story 2");
		tsscStory_2.setTsscTopic(tsscTopic);
		
		
		TsscStory tsscStory_3 = new TsscStory();
		tsscStory_3.setBusinessValue(new BigDecimal(7));
		tsscStory_3.setPriority(new BigDecimal(6));
		tsscStory_3.setDescription("Story 3");
		tsscStory_3.setTsscTopic(tsscTopic);
		
		TsscStory tsscStory_4 = new TsscStory();
		tsscStory_4.setBusinessValue(new BigDecimal(7));
		tsscStory_4.setPriority(new BigDecimal(6));
		tsscStory_4.setDescription("Story 4");
		tsscStory_4.setTsscTopic(tsscTopic);
		
		TsscStory tsscStory_5 = new TsscStory();
		tsscStory_5.setBusinessValue(new BigDecimal(7));
		tsscStory_5.setPriority(new BigDecimal(6));
		tsscStory_5.setDescription("Story 5");
		tsscStory_5.setTsscTopic(tsscTopic);
		
		
		TsscStory tsscStory_6 = new TsscStory();
		tsscStory_6.setBusinessValue(new BigDecimal(7));
		tsscStory_6.setPriority(new BigDecimal(6));
		tsscStory_6.setDescription("Story 6");
		tsscStory_6.setTsscTopic(tsscTopic);
		
		TsscStory tsscStory_7 = new TsscStory();
		tsscStory_7.setBusinessValue(new BigDecimal(7));
		tsscStory_7.setPriority(new BigDecimal(6));
		tsscStory_7.setDescription("Story 7");
		tsscStory_7.setTsscTopic(tsscTopic);
		
		
		TsscStory tsscStory_8 = new TsscStory();
		tsscStory_8.setBusinessValue(new BigDecimal(7));
		tsscStory_8.setPriority(new BigDecimal(6));
		tsscStory_8.setDescription("Story 7");
		tsscStory_8.setTsscTopic(tsscTopic);
		
		
		TsscStory tsscStory_9 = new TsscStory();
		tsscStory_9.setBusinessValue(new BigDecimal(7));
		tsscStory_9.setPriority(new BigDecimal(6));
		tsscStory_9.setDescription("Story 9");
		tsscStory_9.setTsscTopic(tsscTopic);
		
		TsscStory tsscStory_10 = new TsscStory();
		tsscStory_10.setBusinessValue(new BigDecimal(7));
		tsscStory_10.setPriority(new BigDecimal(6));
		tsscStory_10.setDescription("Story 9");
		tsscStory_10.setTsscTopic(tsscTopic);
		
		
		LocalDate localDate = LocalDate.of(2020,5,2);
		
		TsscGame tsscGame = new TsscGame();
		tsscGame.setName("PokemonGo");
		tsscGame.setNGroups(6);
		tsscGame.setNSprints(4);
		tsscGame.setAdminPassword("1234567890");
		tsscGame.setScheduledDate(localDate);
		List <TsscStory> tsscStories = new ArrayList<>();
		tsscStories.add(tsscStory_1);
		tsscStories.add(tsscStory_2);
		tsscStories.add(tsscStory_3);
		tsscStories.add(tsscStory_4);
		tsscStories.add(tsscStory_5);
		tsscStories.add(tsscStory_6);
		tsscStories.add(tsscStory_7);
		tsscStories.add(tsscStory_8);
		tsscGame.setTsscStories(tsscStories);
		tsscGameDAO.save(tsscGame);
		
		TsscGame tsscGame_1 = new TsscGame();
		tsscGame_1.setName("PokemonGo 1");
		tsscGame_1.setNGroups(6);
		tsscGame_1.setNSprints(4);
		tsscGame_1.setAdminPassword("1234567890");
		tsscGame_1.setScheduledDate(localDate);
		tsscStories.add(tsscStory_9);
		tsscStories.add(tsscStory_10);
		tsscGame_1.setTsscStories(tsscStories);
		tsscGameDAO.save(tsscGame_1);
		
		
		assertEquals(3,tsscGameDAO.findByDateStoryTime(localDate).size());
		assertEquals("PokemonGo", tsscGameDAO.findByDateStoryTime(localDate).get(0).getName());
		assertEquals("PokemonGo 1", tsscGameDAO.findByDateStoryTime(localDate).get(2).getName());
		
		
	}



}
