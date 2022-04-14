package com.Trang.webyte.service;

import com.Trang.webyte.model.Medicine;
import com.Trang.webyte.model.News;

import java.util.List;

public interface NewsService {
    public List<News> getAllListNews();
    public News getNews(int key);
    public News insertnews(News news);
    public News updateNews(News news);
    public int deleteNews(int id);
}
