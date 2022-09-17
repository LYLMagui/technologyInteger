package com.ukir.mongo.pojo;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;

/**
 * 文章实体类
 **/

@Data
@Document(collection = "article") //指定要对应的文档名（表名）
@Accessors(chain = true)
public class Article {
    @Id
    private String id; //文章主键

    private String articleName; //文章名

    private String content; //文章内容
}
