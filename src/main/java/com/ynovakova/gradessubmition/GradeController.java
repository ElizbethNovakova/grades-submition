package com.ynovakova.gradessubmition;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class GradeController {
    
    @GetMapping("/grades")
    public String GetGrades(Model model){
        Grade grade = new Grade("Harry", "Potions", "C-");
        model.addAttribute("grade", grade);
        return "grades";
    }

    @GetMapping("/shows")
    public String GetShows(){
        return "shows";
    }
}
