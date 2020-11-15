package se.sda.web.demo.Topic;
import se.sda.web.demo.NewsArticle.NewsArticle;

import org.springframework.data.jpa.repository.JpaRepository;
import se.sda.web.demo.Comment.Comment;

public interface TopicRepo extends JpaRepository<Topic, Long> {
}
