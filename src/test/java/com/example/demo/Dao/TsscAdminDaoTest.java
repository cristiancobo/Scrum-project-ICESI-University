package com.example.demo.Dao;

import static org.junit.jupiter.api.Assertions.*;

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
import com.example.demo.Modelo.TsscAdmin;



@SpringBootTest(classes = VersionFinalTsscProjectCristianCoboApplication.class)
@ExtendWith(SpringExtension.class)
@TestMethodOrder(OrderAnnotation.class)
@Rollback(false)
class TsscAdminDaoTest {
	
	@Autowired
	TsscAdminDao tsscAdminDao;

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@Order(1)

	void testSave() {
		TsscAdmin tsscAdmin_1 = new TsscAdmin();
		tsscAdmin_1.setUser("ArmandoPerez");
		tsscAdmin_1.setPassword("99012104282");
		tsscAdmin_1.setSuperAdmin("superAdministrator");
		tsscAdminDao.save(tsscAdmin_1);
		
		
		TsscAdmin tsscAdmin_2 = new TsscAdmin();
		tsscAdmin_2.setUser("CristianCobo");
		tsscAdmin_2.setPassword("12345678");
		tsscAdmin_2.setSuperAdmin("administrator");
		tsscAdminDao.save(tsscAdmin_2);
		
		
		assertEquals("ArmandoPerez", tsscAdminDao.findById(tsscAdmin_1.getId()).getUser());
		assertEquals("CristianCobo", tsscAdminDao.findById(tsscAdmin_2.getId()).getUser());
		assertEquals(7, tsscAdminDao.findAll().size());
		
		
		
	}

	@Test
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@Order(2)

	void testUpdate() {
		
		TsscAdmin tsscAdmin = new TsscAdmin();
		tsscAdmin.setUser("ArmandoPerez");
		tsscAdmin.setPassword("99012104282");
		tsscAdmin.setSuperAdmin("superAdministrator");
		tsscAdminDao.save(tsscAdmin);
		tsscAdminDao.findById(tsscAdmin.getId()).setUser("ArmandoLeon");
		tsscAdminDao.update(tsscAdmin);
		
		assertEquals("ArmandoLeon", tsscAdminDao.findById(tsscAdmin.getId()).getUser());
		assertEquals("superAdministrator", tsscAdminDao.findById(tsscAdmin.getId()).getSuperAdmin());
		assertEquals(11, tsscAdminDao.findAll().size());



	}

	@Test
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@Order(3)

	void testDelete() {
		
		
		TsscAdmin tsscAdmin = new TsscAdmin();
		tsscAdmin.setUser("ArmandoPerez");
		tsscAdmin.setPassword("99012104282");
		tsscAdmin.setSuperAdmin("superAdministrator");
		tsscAdminDao.save(tsscAdmin);
		tsscAdminDao.delete(tsscAdminDao.findById(tsscAdmin.getId()));
		
		TsscAdmin tsscAdmin_2 = new TsscAdmin();
		tsscAdmin_2.setUser("CristianCobo");
		tsscAdmin_2.setPassword("12345678");
		tsscAdmin_2.setSuperAdmin("administrator");
		tsscAdminDao.save(tsscAdmin_2);
		
		
		TsscAdmin tsscAdmin_3 = new TsscAdmin();
		tsscAdmin_3.setUser("FelipeLeon");
		tsscAdmin_3.setPassword("87654321");
		tsscAdmin_3.setSuperAdmin("administrator");
		tsscAdminDao.save(tsscAdmin_3);
		
		assertNull(tsscAdminDao.findById(tsscAdmin.getId()));
		assertEquals(10, tsscAdminDao.findAll().size());

	}

	@Test
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@Order(4)

	void testFindById() {
		TsscAdmin tsscAdmin = new TsscAdmin();
		tsscAdmin.setUser("ArmandoPerez");
		tsscAdmin.setPassword("99012104282");
		tsscAdmin.setSuperAdmin("superAdministrator");
		tsscAdminDao.save(tsscAdmin);
		
		assertNotNull(tsscAdminDao.findById(tsscAdmin.getId()).getUser());
		assertEquals("ArmandoPerez",tsscAdminDao.findById(tsscAdmin.getId()).getUser());
		
	}
	
	
	@Test
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	@Order(5)
	void testFindAll() {
		
		TsscAdmin tsscAdmin_1 = new TsscAdmin();
		tsscAdmin_1.setUser("ArmandoRamirez");
		tsscAdmin_1.setPassword("49356456");
		tsscAdmin_1.setSuperAdmin("superAdministrator");
		tsscAdminDao.save(tsscAdmin_1);
		
		TsscAdmin tsscAdmin_2 = new TsscAdmin();
		tsscAdmin_2.setUser("CristianTamayo");
		tsscAdmin_2.setPassword("33436786");
		tsscAdmin_2.setSuperAdmin("superAdministrator");
		tsscAdminDao.save(tsscAdmin_2);

		TsscAdmin tsscAdmin_3 = new TsscAdmin();
		tsscAdmin_3.setUser("JoeHernandez");
		tsscAdmin_3.setPassword("90949985");
		tsscAdmin_3.setSuperAdmin("superAdministrator");
		tsscAdminDao.save(tsscAdmin_3);
		
		assertNotNull(tsscAdminDao.findAll());
		assertEquals(5,tsscAdminDao.findAll().size());
	
		
	}

}
