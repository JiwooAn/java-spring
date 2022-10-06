package web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import service.GreetingService;

@RestController
public class GreetingController {
    static String result;
    
    @GetMapping("/greeting")
    public static String greeting() {
        result = GreetingService.greeting();
        return result;
    }
}