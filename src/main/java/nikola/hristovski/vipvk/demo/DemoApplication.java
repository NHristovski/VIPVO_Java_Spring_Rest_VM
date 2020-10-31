package nikola.hristovski.vipvk.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

@RestController
class Controller{
    @GetMapping("/add")
    public Long add(@RequestParam Long num1, @RequestParam Long num2){
        return num1 + num2;
    }
}
