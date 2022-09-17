package com.ukir.mongo;

import com.ukir.mongo.dao.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot05MongodbApplicationTests {

	@Autowired
	private ArticleRepository articleRepository;

	@Test
	void testCreateCollection() {


	}

}
