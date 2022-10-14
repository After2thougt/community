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
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
