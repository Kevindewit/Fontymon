package io.kevindewit.service.user.swagger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@Controller
public class HomeController {

    @RequestMapping(value = "/api")
    public String home() {
        return "redirect:/swagger-ui.html";
    }
}