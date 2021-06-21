package top.moma.arkexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TextController
 *
 * @author Ivan
 * @version 1.0 Created by Ivan at 2021/6/21.
 */
@RestController
public class TextController {
  @GetMapping("/ark/test/")
  public String testArk(String test) {
    return "test";
  }
}
