package com.Trang.webyte.controller;

import com.Trang.webyte.model.News;
import com.Trang.webyte.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/webyte/news")
public class NewsController {
    @Autowired
    NewsService newsService;
    @GetMapping()
    public List<News> getAllNews(){
        List<News> newsList= newsService.getAllListNews();
        return  newsList;
    }
    @GetMapping({"id"})
    public News getNews(@PathVariable("id") int id){
        if(id>0){
            News news= newsService.getNews(id);
            return news;
        }
        else {
            return null;
        }


    }
}
