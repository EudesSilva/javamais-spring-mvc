
package br.com.javamais.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/site")
public class JavaMaisController {
    
    
    @RequestMapping("/javamais")
    public String mySite(Model model) {
        model.addAttribute("site", "www.javamais.com.br");
        return "javamais";
    }    
    
    
}
