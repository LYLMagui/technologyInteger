package com.ukir.mongo.dao;

import com.ukir.mongo.pojo.Article;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 继承 MongoRepository<实体类，主键类型>获得CRUD的能力
 **/

public interface ArticleRepository extends MongoRepository<Article,String> {


    List<Article> findByid(String id);


}
