package pl.sda;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//api restowe
@RestController
public class HelloWorldRestController {
    @GetMapping("/hello")
    public Greeting Hello(){
        return new Greeting("hello world");

    }
}
