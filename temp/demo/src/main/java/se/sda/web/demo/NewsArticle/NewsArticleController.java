package se.sda.web.demo.NewsArticle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NewsArticleController {
    @Autowired
    private NewsArticleService newsService;


    public NewsArticleController() {
        this.newsService=new NewsArticleService();

    }

    @GetMapping("/newsArticles")
    public List<NewsArticle> getAll(){

        return newsService.getAll();

    }
    // Will write status code 200 if not found or will throw exception
    @GetMapping("/newsArticles/{id}")
    public NewsArticle getById(@PathVariable Long id){
        return newsService.getById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
            }


    @PostMapping("/newsArticles")
    public NewsArticle create(@RequestBody NewsArticle newsArticle) {
        return newsService.create(newsArticle);
        }


    @PutMapping("/newsArticles")
    public NewsArticle update(@RequestBody NewsArticle newsArticle ){
        return newsService.update(newsArticle );
    }


    @DeleteMapping("/newsArticles/{id}")
    public void delete(@PathVariable Long id ){
        newsService.delete(id );
    }

    }





