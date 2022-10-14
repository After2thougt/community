/**
 * @author Oliver
 * @date 10/14/2022 4:52 PM
 */
package com.community;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
