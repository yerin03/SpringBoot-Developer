

package me.kimyerin.springbootdeveloper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //spring boot에 필요한 기본 설정을 해준다.

public class SpringBootDeveloperApplication {
    public static void main(String[] args) { //자바의 main() 메서드 같은 역할 , 여기서 스프링 부트 시작
        SpringApplication.run(SpringBootDeveloperApplication.class, args); //첫번째 인수 : 메인 클래스 ,
                                                                           //두번째 인수 : 커맨드 라인의 인수들을 전달
    }
}


