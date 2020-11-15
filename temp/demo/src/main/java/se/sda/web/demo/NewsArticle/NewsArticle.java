package se.sda.web.demo.NewsArticle;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import se.sda.web.demo.Comment.Comment;
import se.sda.web.demo.Topic.Topic;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class NewsArticle {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String body;

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Comment getComment() {
        return comment;
    }

    @ManyToOne
    private Comment comment;

   @ManyToMany(cascade = CascadeType.ALL)
   @JoinTable
   private Set<Topic> topics;

    public void setTopics(Set<Topic> topics) {
        this.topics = topics;
    }

    public Set<Topic> getTopics() {
        return topics;
    }

    private String authorName;





    public NewsArticle() {}

    public NewsArticle(Long id,String title,String body,String authorName){
        this.id=id;
        this.title=title;
        this.body=body;
        this.authorName=authorName;
    }


    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBody() {
        return body;
    }

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }
}
