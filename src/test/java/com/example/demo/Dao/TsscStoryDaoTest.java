package com.example.demo.Dao;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

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
import com.example.demo.Modelo.TsscStory;

@SpringBootTest(classes = VersionFinalTsscProjectCristianCoboApplication.class)
@ExtendWith(SpringExtension.class)
@TestMethodOrder(OrderAnnotation.class)
@Rollback(false)
class TsscStoryDaoTest {
	
	@Autowired
	TsscStoryDao tsscStoryDao ;

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@Order(1)
	void testSave() {
		
		TsscStory tsscStory = new TsscStory();
		tsscStory.setDescription("The best story");
		tsscStory.setBusinessValue(new BigDecimal(39));
		tsscStory.setPriority(new BigDecimal(32));
		tsscStory.setInitialSprint(new BigDecimal(12));
		
		TsscStory tsscStory_1 = new TsscStory();
		tsscStory_1.setDescription("The best story 1");
		tsscStory_1.setBusinessValue(new BigDecimal(39));
		tsscStory_1.setPriority(new BigDecimal(32));
		tsscStory_1.setInitialSprint(new BigDecimal(12));
		
		tsscStoryDao.save(tsscStory);
		tsscStoryDao.save(tsscStory_1);
		tsscStoryDao.findById(tsscStory.getId());
		assertNotNull(tsscStoryDao.findById(tsscStory.getId()));
		assertNotNull(tsscStoryDao.findById(tsscStory_1.getId()));
		assertEquals(2,tsscStoryDao.findAll().size() );
		
		
		
	}
	@Test
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@Order(2)
	void testFindAll() {
		
		TsscStory tsscStory_1 = new TsscStory();
		tsscStory_1.setDescription("The best story 1");
		tsscStory_1.setBusinessValue(new BigDecimal(39));
		tsscStory_1.setPriority(new BigDecimal(32));
		tsscStory_1.setInitialSprint(new BigDecimal(12));
		tsscStoryDao.save(tsscStory_1);
		
		TsscStory tsscStory_2 = new TsscStory();
		tsscStory_2.setDescription("The best story 2");
		tsscStory_2.setBusinessValue(new BigDecimal(39));
		tsscStory_2.setPriority(new BigDecimal(32));
		tsscStory_2.setInitialSprint(new BigDecimal(12));
		tsscStoryDao.save(tsscStory_2);
		
		TsscStory tsscStory_3 = new TsscStory();
		tsscStory_3.setDescription("The best story 3");
		tsscStory_3.setBusinessValue(new BigDecimal(39));
		tsscStory_3.setPriority(new BigDecimal(32));
		tsscStory_3.setInitialSprint(new BigDecimal(12));
		tsscStoryDao.save(tsscStory_3);
		
		assertEquals(5, tsscStoryDao.findAll().size());
		assertNotNull(tsscStoryDao.findAll());

		
	}

	@Test
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@Order(3)
	void testUpdate() {
		
		TsscStory tsscStory = new TsscStory();
		tsscStory.setDescription("The best story");
		tsscStory.setBusinessValue(new BigDecimal(39));
		tsscStory.setPriority(new BigDecimal(32));
		tsscStory.setInitialSprint(new BigDecimal(12));
		tsscStoryDao.save(tsscStory);
		tsscStoryDao.findById(tsscStory.getId()).setDescription("Description updated");
		
		assertEquals("Description updated", tsscStoryDao.findById(tsscStory.getId()).getDescription());
		

	}

	@Test
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@Order(4)

	void testDelete() {
		
		TsscStory tsscStory = new TsscStory();
		tsscStory.setDescription("The best story");
		tsscStory.setBusinessValue(new BigDecimal(39));
		tsscStory.setPriority(new BigDecimal(32));
		tsscStory.setInitialSprint(new BigDecimal(12));
		tsscStoryDao.save(tsscStory);
		
		
		TsscStory tsscStory_1 = new TsscStory();
		tsscStory_1.setDescription("The best story");
		tsscStory_1.setBusinessValue(new BigDecimal(39));
		tsscStory_1.setPriority(new BigDecimal(32));
		tsscStory_1.setInitialSprint(new BigDecimal(12));
		tsscStoryDao.save(tsscStory_1);
		
		TsscStory tsscStory_2 = new TsscStory();
		tsscStory_2.setDescription("The best story");
		tsscStory_2.setBusinessValue(new BigDecimal(39));
		tsscStory_2.setPriority(new BigDecimal(32));
		tsscStory_2.setInitialSprint(new BigDecimal(12));
		tsscStoryDao.save(tsscStory_2);
		
		TsscStory tsscStory_3 = new TsscStory();
		tsscStory_3.setDescription("The best story");
		tsscStory_3.setBusinessValue(new BigDecimal(39));
		tsscStory_3.setPriority(new BigDecimal(32));
		tsscStory_3.setInitialSprint(new BigDecimal(12));
		tsscStoryDao.save(tsscStory_3);
		tsscStoryDao.delete(tsscStoryDao.findById(tsscStory.getId()));
		assertNull(tsscStoryDao.findById(tsscStory.getId()));
		assertEquals(9,tsscStoryDao.findAll().size() );
		assertNotNull(tsscStoryDao.findAll());
	}

}
