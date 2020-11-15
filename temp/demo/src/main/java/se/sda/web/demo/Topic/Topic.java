package se.sda.web.demo.Topic;

import se.sda.web.demo.NewsArticle.NewsArticle;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Topic {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String topicName;

    @ManyToMany(mappedBy = "topics")
    private Set<NewsArticle> newsArticles;

    public void setNewsArticles(Set<NewsArticle> newsArticles) {
        this.newsArticles = newsArticles;
    }

    public Set<NewsArticle> getNewsArticles() {
        return newsArticles;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicName() {
        return topicName;
    }



    public Topic(){
    }






    public Topic(Long id, String topicName){
        this.id=id;
        this.topicName=topicName;


    }


    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }




}

