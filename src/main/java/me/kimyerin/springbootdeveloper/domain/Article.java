package me.kimyerin.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;



@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article {

    @Id //기본키 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false) //Column:db의 칼럼과 필드 매핑
    private Long id;

    @Column(name = "title", updatable = false)
    private String title;

    @Column (name = "context" , updatable = false)
    private String context;
    
}
