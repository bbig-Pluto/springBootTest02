package aws.spring.testing;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@Controller
public class AppController {

    @RequestMapping(value="/entrance", method= RequestMethod.GET)
    public String entrance(
            HttpServletResponse response,
            Model model
    ) {
        System.out.println("/entrance route");
        return "/index.html";
    }

    @RequestMapping(value="/entrance/next", method = RequestMethod.GET)
    public String nextPage(
            Model model
    ) {
        System.out.println("/entrance/next route");
        model.addAttribute("binding", "바인딩 데이터");
        return "/nextpage.html";
    }
}
