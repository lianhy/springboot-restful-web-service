package cn.lianhy.demo.action;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class HelloWorld {

    @GetMapping(value = "sayHello.json")
    public String sayHello(String userName){
        return "Hello："+userName;
    }
}
