package com.ukir.mongo.service.impl;

import com.ukir.mongo.pojo.Article;
import com.ukir.mongo.service.ArticleService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * ArticleService实现类
 **/
@Service
public class ArticleServiceImpl2 implements ArticleService2 {


    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 添加文章
     *
     * @param article
     * @return
     */
    @Override
    public int create(Article article) {
        Article save = mongoTemplate.save(article);
        return 1;
    }

    /**
     * 删除文章
     *
     * @param ids
     */
    @Override
    public int delete(String id) {
        List<Article> deleteList = new ArrayList<>();
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        mongoTemplate.remove(query,Article.class);
        return 1;
    }


    @Override
    public Article get(String id) {
        Article byId = mongoTemplate.findById(id, Article.class);
        return byId;
    }
}
