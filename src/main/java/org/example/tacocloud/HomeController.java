package org.example.tacocloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    //обрабатывает запросы с корневым путем /
    @GetMapping("/")
    public String home(){
        //возвращает имя представления (html)
        return "home";
    }
}
