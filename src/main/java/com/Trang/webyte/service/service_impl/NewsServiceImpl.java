package com.Trang.webyte.service.service_impl;

import com.Trang.webyte.mapper.NewsMapper;
import com.Trang.webyte.model.News;
import com.Trang.webyte.model.NewsExample;
import com.Trang.webyte.service.NewsService;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NewsServiceImpl implements NewsService {
   @Autowired
    NewsMapper newsMapper;
    @Override
    public List<News> getAllListNews() {
        NewsExample newsExample= new NewsExample();
        List<News> listNew= newsMapper.selectByExample(newsExample);
        if(listNew!=null){
            return  listNew;
        }
        return null;
    }

    @Override
    public News getNews(int key) {
        News news= newsMapper.selectbyid(key);
        if(news!= null){
                return  news;
        }
        return null;
    }

    @Override
    public News insertnews(News news) {
        int success= newsMapper.insertSelective(news);
        if(success>0){
            return  news;
        }
        return null;
    }

    @Override
    public News updateNews(News news) {
        NewsExample newsExample= new NewsExample();
        newsExample.createCriteria().andNewsidEqualTo(news.getNewsid());
        int success= newsMapper.updateByExampleSelective(news,newsExample);
        if(success>0){
            return  news;
        }
        else {
            return null;
        }

    }

    @Override
    public int deleteNews(int id) {
        NewsExample newsExample= new NewsExample();
        newsExample.createCriteria().andNewsidEqualTo(id);
        int success= newsMapper.deleteByExample(newsExample);
        if(success>0){
            return 1;
        }
        else {
            return 0;
        }

    }
}
