package aws.spring.testing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@RestController
public class AppController {

    @RequestMapping(value="/entrance", method= RequestMethod.GET)
    public void entrance(
            HttpServletResponse response
    ) throws Exception {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Method of entrance</h1>");
        out.println("</body>");
        out.println("</html>");

    }
}
