package spring.springbootdeveloper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.springbootdeveloper.domain.Article;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
