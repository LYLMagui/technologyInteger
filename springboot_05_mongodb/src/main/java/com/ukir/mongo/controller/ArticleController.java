package com.ukir.mongo.controller;

import com.ukir.mongo.dao.ArticleRepository;
import com.ukir.mongo.pojo.Article;
import com.ukir.mongo.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Web层，实现操作MongoDB
 **/
@RestController
@RequestMapping("/article")
@Api(tags = "文章操作")
public class ArticleController {

    @Autowired
    private ArticleService articleService;


    @PostMapping("/create")
    @ApiOperation("创建文章")
    public String create(@RequestBody Article article) {
        int result = articleService.create(article);
        if (result > 0) {
            return "文章创建成功";
        } else {
            return "文章创建失败";
        }
    }


    @PostMapping("/delete")
    @ApiOperation("批量删除文章")
    public String delete(@RequestParam("ids") List<String> ids) {
        int count = articleService.delete(ids);
        if (count > 0) {
            return "删除了" + count + "篇文章";
        } else {
            return "删除文章失败";
        }
    }


    @PostMapping("/list")
    @ApiOperation("查询")
    public List<Article> list(String id) {
        List<Article> list = articleService.list(id);
        return list;
    }

}
