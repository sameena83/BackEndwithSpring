package se.sda.web.demo.NewsArticle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsArticleRepo extends JpaRepository<NewsArticle, Long> {}

