package com.example.relationalDB;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.example.relationalDB.config.AppConfig;
import com.example.relationalDB.repositries.TaskRepo;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
  classes = { AppConfig.class }, 
  loader = AnnotationConfigContextLoader.class)
@Transactional
public class RelationalDbApplicationTests {

	@Resource
    private TaskRepo taskRepo;
	
    @Test
    public void contextLoads() {
    	
    	System.out.println("call.............");
    }

}
