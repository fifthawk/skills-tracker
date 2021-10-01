package org.launchcode.skillstracker.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @GetMapping("")
    @ResponseBody
    public String skillDisplay() {
        String html = "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Here are the skills we should all learn:</h2>" +
                "<ol>" +
                "<li>Javascript</li>" +
                "<li>React</li>" +
                "<li>Rust</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
        return html;
    }



    @GetMapping("form")
    @ResponseBody
    public String skillForm(){
        String html =
                "<html>" +
                   "<body>" +
                     "<form method = 'post' action = '/form'>" +
                        "<label for ='coder'> <h2>Name:</h2> </label>" +
                        "<input type id = 'coder' = 'text' name = 'coder' />" +
                        "<label for ='technologies'> <h2>Favorite Language:</h2> </label>" +
                        "<select id='technologies' name= 'tech1'>" +
                        "<option value='Javascript'>Javascript</option>" +
                        "<option value='React'>React</option>" +
                        "<option value='Java'>Java</option>" +
                        "</select>" +
                        "<label for ='technologies'> <h2>2nd Favorite Language:</h2> </label>" +
                        "<select id='technologies' name= 'tech2'>" +
                        "<option value='Javascript'>Javascript</option>" +
                        "<option value='React'>React</option>" +
                        "<option value='Java'>Java</option>" +
                        "</select>" +
                        "<label for ='technologies'> <h2>3rd Favorite Language:</h2> </label>" +
                        "<select id='technologies' name= 'tech3'>" +
                        "<option value='Javascript'>Javascript</option>" +
                        "<option value='React'>React</option>" +
                        "<option value='Java'>Java</option>" +
                        "</select>" +
                        "<br />" +
                        "<input type = 'submit' value = 'Submit' />" +
                     "</form>" +
                    "</body>" +
                  "</html>";
        return html;
    }

    @PostMapping("form")
    @ResponseBody
    public String hello(@RequestParam String coder, @RequestParam String tech1, @RequestParam String tech2, @RequestParam String tech3) {
        String html = "<h1>" +coder + "</h1>" +
                "<h2>Favorite Language: " + tech1 + "</h2>" +
                "<h2>2nd Favorite Language: " + tech2 + "</h2>" +
                "<h2>3rd Favorite Language: " + tech3 + "</h2>"
                ;

        return html;
    }



}
