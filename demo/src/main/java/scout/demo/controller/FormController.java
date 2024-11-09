package scout.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormController {

    @GetMapping("/")
    public String showForm() {
        // Return the name of the HTML file (without .html extension) in the static folder
        return "form";  // This will serve form.html located in src/main/resources/static
    }
}
