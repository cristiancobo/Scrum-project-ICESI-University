package com.example.demo.Dao;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.VersionFinalTsscProjectCristianCoboApplication;
import com.example.demo.Modelo.TsscGame;
import com.example.demo.Modelo.TsscTopic;


@SpringBootTest(classes = VersionFinalTsscProjectCristianCoboApplication.class)
@ExtendWith(SpringExtension.class)
@TestMethodOrder(OrderAnnotation.class)
@Rollback(false)

class TsscTopicDaoTest {
	
	@Autowired
	TsscTopicDao tsscTopicDao ;
	@Autowired
	TsscGameDAO tsscGameDao ;

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@Order(1)
	void testSave() {
		TsscTopic tsscTopic = new TsscTopic();
		tsscTopic.setName("Topic");
		tsscTopic.setDefaultGroups(20);
		tsscTopic.setDefaultSprints(30);
		tsscTopic.setDescription("Best topic");
		tsscTopicDao.save(tsscTopic);
		assertEquals("Topic", tsscTopicDao.findById(tsscTopic.getId()).getName());
		assertEquals(1, tsscTopicDao.findAll().size());
		assertNotNull(tsscTopicDao.findAll());
		
		
	}

	@Test
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@Order(2)
	void testUpdate() {
		TsscTopic tsscTopic = new TsscTopic();
		tsscTopic.setName("Topic");
		tsscTopic.setDefaultGroups(20);
		tsscTopic.setDefaultSprints(30);
		tsscTopic.setDescription("Best topic");
		tsscTopicDao.save(tsscTopic);
		tsscTopicDao.findById(tsscTopic.getId()).setName("TopicUpdated");
		assertEquals("TopicUpdated", tsscTopicDao.findById(tsscTopic.getId()).getName());
	}
	@Test
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@Order(3)
	void testFindAll() {
		
		TsscTopic tsscTopic_1 = new TsscTopic();
		tsscTopic_1.setName("Topic 1");
		tsscTopic_1.setDefaultGroups(20);
		tsscTopic_1.setDefaultSprints(30);
		tsscTopic_1.setDescription("This is a topic");
		tsscTopicDao.save(tsscTopic_1);

		TsscTopic tsscTopic_2 = new TsscTopic();
		tsscTopic_2.setName("Topic 2");
		tsscTopic_2.setDefaultGroups(20);
		tsscTopic_2.setDefaultSprints(30);
		tsscTopic_2.setDescription("This is a topic");
		tsscTopicDao.save(tsscTopic_2);

		TsscTopic tsscTopic_3 = new TsscTopic();
		tsscTopic_3.setName("Topic 3");
		tsscTopic_3.setDefaultGroups(20);
		tsscTopic_3.setDefaultSprints(30);
		tsscTopic_3.setDescription("This is a topic");
		tsscTopicDao.save(tsscTopic_3);
		
		assertEquals(5, tsscTopicDao.findAll().size());
		assertNotNull(tsscTopicDao.findAll());
		
		
		
	}
	

	@Test
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@Order(4)
	void testDelete() {
		TsscTopic tsscTopic = new TsscTopic();
		tsscTopic.setName("Topic ");
		tsscTopic.setDefaultGroups(20);
		tsscTopic.setDefaultSprints(30);
		tsscTopic.setDescription("Best topic ");
		tsscTopicDao.save(tsscTopic);
		
		TsscTopic tsscTopic_1 = new TsscTopic();
		tsscTopic_1.setName("Topic 1");
		tsscTopic_1.setDefaultGroups(20);
		tsscTopic_1.setDefaultSprints(30);
		tsscTopic_1.setDescription("Best topic 1");
		tsscTopicDao.save(tsscTopic_1);
		
		TsscTopic tsscTopic_2 = new TsscTopic();
		tsscTopic_2.setName("Topic 2");
		tsscTopic_2.setDefaultGroups(20);
		tsscTopic_2.setDefaultSprints(30);
		tsscTopic_2.setDescription("Best topic 2");
		tsscTopicDao.save(tsscTopic_2);
		
		tsscTopicDao.delete(tsscTopic);
		assertNull(tsscTopicDao.findById(tsscTopic.getId()));
		assertNotNull(tsscTopicDao.findAll());
		assertEquals(7, tsscTopicDao.findAll().size());
	}

	@Test
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@Order(5)
	void testFindByName() {
		TsscTopic tsscTopic = new TsscTopic();
		tsscTopic.setName("Topic");
		tsscTopic.setDefaultGroups(20);
		tsscTopic.setDefaultSprints(30);
		tsscTopic.setDescription("Best topic");
		tsscTopicDao.save(tsscTopic);
		
		
		TsscTopic tsscTopic_1 = new TsscTopic();
		tsscTopic_1.setName("Topic");
		tsscTopic_1.setDefaultGroups(20);
		tsscTopic_1.setDefaultSprints(30);
		tsscTopic_1.setDescription("Best topic 1");
		tsscTopicDao.save(tsscTopic_1);
		
		assertNotNull(tsscTopicDao.findByName(tsscTopic.getName()));
		assertEquals(3,tsscTopicDao.findByName(tsscTopic.getName()).size() );
		
		
	}
	@Test
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@Order(6)
	void testFindById() {
		TsscTopic tsscTopic = new TsscTopic();
		tsscTopic.setName("Topic");
		tsscTopic.setDefaultGroups(20);
		tsscTopic.setDefaultSprints(30);
		tsscTopic.setDescription("Best topic");
		tsscTopicDao.save(tsscTopic);
		assertEquals("Topic", tsscTopicDao.findById(tsscTopic.getId()).getName());
	}

	@Test
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@Order(7)
	void testFindByDescription() {
		TsscTopic tsscTopic = new TsscTopic();
		tsscTopic.setName("Topic");
		tsscTopic.setDefaultGroups(20);
		tsscTopic.setDefaultSprints(30);
		tsscTopic.setDescription("Best topic");
		tsscTopicDao.save(tsscTopic);
		assertNotNull(tsscTopicDao.findByDescription(tsscTopic.getDescription()));
		assertEquals(5,tsscTopicDao.findByDescription(tsscTopic.getDescription()).size() );
	}

	@Test
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@Order(8)
	void testFindTopicsByGameDateOrderedByTime() {
		
		LocalDate localDate1 = LocalDate.of(2020,3,2);
		
		TsscGame tsscGame = new TsscGame();
		tsscGame.setName("Game 1");
		tsscGame.setNGroups(6);
		tsscGame.setNSprints(6);
		tsscGame.setAdminPassword("1234567890");
		tsscGame.setScheduledDate(localDate1);
		tsscGame.setStartTime(LocalTime.of(10,43,12));
		
		TsscGame tsscGame_1 = new TsscGame();
		tsscGame_1.setName("Game 2");
		tsscGame_1.setNGroups(6);
		tsscGame_1.setNSprints(6);
		tsscGame_1.setAdminPassword("1234567890");
		tsscGame_1.setScheduledDate(localDate1);
		tsscGame_1.setStartTime(LocalTime.of(9,43,12));

		TsscTopic tsscTopic = new TsscTopic();
		tsscTopic.setName("Topic");
		tsscTopic.setDefaultGroups(20);
		tsscTopic.setDefaultSprints(30);
		tsscTopic.setDescription("Best topic");
		List<TsscGame> tsscGames = new ArrayList<>();
		tsscGames.add(tsscGame);
		tsscGames.add(tsscGame_1);
		tsscTopic.setTsscGames(tsscGames);
		tsscTopicDao.save(tsscTopic);
		
		
		TsscTopic tsscTopic_1 = new TsscTopic();
		tsscTopic_1.setName("Topic 1");
		tsscTopic_1.setDefaultGroups(20);
		tsscTopic_1.setDefaultSprints(30);
		tsscTopic_1.setDescription("Best topic");
		List<TsscGame> tsscGames_1 = new ArrayList<>();
		tsscGames_1.add(tsscGame);
		tsscGames_1.add(tsscGame_1);
		tsscTopic.setTsscGames(tsscGames_1);
		tsscTopicDao.save(tsscTopic_1);
		
		tsscGame.setTsscTopic(tsscTopic);
		tsscGame_1.setTsscTopic(tsscTopic_1);
		tsscGameDao.save(tsscGame);
		tsscGameDao.save(tsscGame_1);
		
		
		TsscTopic tsscTopic_test_1  = (TsscTopic) tsscTopicDao.findTopicsByGameDateOrderedByTime(localDate1).get(0)[0];
		TsscTopic tsscTopic_test_2  = (TsscTopic) tsscTopicDao.findTopicsByGameDateOrderedByTime(localDate1).get(1)[0];
		assertNotNull(tsscTopic_test_1);
		assertNotNull(tsscTopic_test_2);
		assertEquals("Topic 1",  tsscTopic_test_1.getName());
		assertEquals("Topic",  tsscTopic_test_2.getName());
		assertEquals(2,tsscTopicDao.findTopicsByGameDateOrderedByTime(localDate1).size());
		
	}

}
