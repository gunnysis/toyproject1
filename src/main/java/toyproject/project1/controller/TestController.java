package toyproject.project1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/example")
@RestController
public class TestController {

    @GetMapping("test")
    public String getTest(){
        return "Test";
    }
}
