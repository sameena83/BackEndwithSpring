package se.sda.web.demo.Topic;
import org.springframework.stereotype.Service;
import se.sda.web.demo.NewsArticle.NewsArticle;

import org.springframework.beans.factory.annotation.Autowired;
import se.sda.web.demo.Comment.Comment;
import se.sda.web.demo.Comment.CommentRepo;

import java.util.List;
import java.util.Optional;

@Service
public class TopicService {


    @Autowired
    private TopicRepo repo;


    public TopicService() {

    }

    public List<Topic> getAll() {
        return repo.findAll();

    }

    public Optional< Topic > getById(Long id) {
        return repo.findById(id);

    }

    public Topic create(Topic topic) {
        return repo.save(topic);

    }
    public Topic update(Topic updatedTopic){
        return repo.save(updatedTopic);
    }

    public  void delete(Long id){
        repo.deleteById(id);
    }
}


