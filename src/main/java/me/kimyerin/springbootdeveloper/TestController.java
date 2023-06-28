package me.kimyerin.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test") //라우터 역할: http 요청과 메서드를 연결하는 장치
    public String test(){
        return "Hello, World";
    }
}
