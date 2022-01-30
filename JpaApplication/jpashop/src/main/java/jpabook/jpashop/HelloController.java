package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){ //model은 data를 view로 넘길 수 있음
        model.addAttribute("data","hello!"); //name이 data인 key의 값을 hello로 넘김
            return "hello"; //return은 화면 이름, hello.html과 같으므로 hello.html을 보여줌
    }
}
