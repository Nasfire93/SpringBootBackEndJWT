package WebRoutes;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class WebLogin {

@RequestMapping("/login2")
    public String getLogin(Model model){
        model.addAttribute("login2","hola");
        return "books";
    }
}
