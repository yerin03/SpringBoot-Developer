package me.kimyerin.springbootdeveloper.dto;

//dto : data transfer object
//      별도의 비즈니스 로직 없음 그냥 데이터를 옮기는 전달자 역할 이라고 생각!

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.kimyerin.springbootdeveloper.domain.Article;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class AddArticleRequest {

    private String title;
    private String content;

    public Article toEntity(){

        return Article.builder()
                .title(title)
                .content(content)
                .build();

    }
}

