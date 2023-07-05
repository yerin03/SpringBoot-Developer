package me.kimyerin.springbootdeveloper.service;


import lombok.RequiredArgsConstructor;
import me.kimyerin.springbootdeveloper.domain.Article;
import me.kimyerin.springbootdeveloper.dto.AddArticleRequest;
import me.kimyerin.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor //생성자 추가
@Service //빈으로 등록
public class BlogService {

    private final BlogRepository blogRepository;

    //블로그 추가 메서드
    //save -> ArticleRequestClass에 저장된 값들을 article 데이터베이스에 저장

    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }


}
