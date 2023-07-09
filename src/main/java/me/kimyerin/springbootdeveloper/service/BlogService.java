package me.kimyerin.springbootdeveloper.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import me.kimyerin.springbootdeveloper.domain.Article;
import me.kimyerin.springbootdeveloper.dto.AddArticleRequest;
import me.kimyerin.springbootdeveloper.dto.ArticleResponse;
import me.kimyerin.springbootdeveloper.dto.UpdateArticleRequest;
import me.kimyerin.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor //생성자 추가
@Service //빈으로 등록
public class BlogService {

    private final BlogRepository blogRepository;

    //블로그 추가 메서드
    //save -> ArticleRequestClass에 저장된 값들을 article 데이터베이스에 저장

    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }

    //블로그 글 조회
    public List<Article> findAll() {
        return blogRepository.findAll();
    }

    public Article findById(long id) {
        return blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found : " + id));
    }


    public void delete(long id) {
        blogRepository.deleteById(id);
    }


    @Transactional
    public Article update(long id, UpdateArticleRequest request) {
        Article article = blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found : " + id));

        article.update(request.getTitle(), request.getContent());

        return article;
    }



}
