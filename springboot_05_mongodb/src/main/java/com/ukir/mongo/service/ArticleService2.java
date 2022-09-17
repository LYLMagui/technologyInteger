package com.ukir.mongo.service;


import com.ukir.mongo.pojo.Article;

import java.util.List;

public interface ArticleService2 {

    /**
     * 添加文章
     * @param article
     * @return
     */
    int create(Article article);

    /**
     * 删除文章
     */

    int delete(String id);


    /**
     * 根据id查询
     * @param id
     * @return
     */
    Article get(String id);



}
