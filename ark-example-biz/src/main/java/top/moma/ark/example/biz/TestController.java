package top.moma.ark.example.biz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 *
 * @author Ivan
 * @version 1.0
 * Created by Ivan at 2021/6/21.
 **/
@RestController
public class TestController {
    @GetMapping("/ark/test2/")
    public String testArk(String test) {
        return "test2";
    }
}