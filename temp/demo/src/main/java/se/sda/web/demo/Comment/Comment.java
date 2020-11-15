package se.sda.web.demo.Comment;


import se.sda.web.demo.NewsArticle.NewsArticle;

import javax.persistence.*;
import java.util.List;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String authorName;
    private String body;

    @OneToMany
    private List<NewsArticle> newsArticles;

    public Comment(){
    }




    public void setBody(String body) {
        this.body = body;
    }



    public String getBody() {
        return body;
    }

    public Comment(Long id, String authorName, String body){
        this.id=id;
        this.authorName=authorName;
        this.body=body;

    }


    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }


}
