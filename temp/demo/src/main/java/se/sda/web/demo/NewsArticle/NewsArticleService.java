package se.sda.web.demo.NewsArticle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class NewsArticleService {

    @Autowired
    private NewsArticleRepo repo;


    public NewsArticleService() {

    }

    public List<NewsArticle> getAll() {
        return repo.findAll();

    }

    public Optional< NewsArticle > getById(Long id) {
        return repo.findById(id);

    }

    public NewsArticle create(NewsArticle newsArticle) {
        return repo.save(newsArticle);

    }
    public NewsArticle update(NewsArticle updatedNewsArticle){
        return repo.save(updatedNewsArticle);
    }

    public  void delete(Long id){
        repo.deleteById(id);
    }
}