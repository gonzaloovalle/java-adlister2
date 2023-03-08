import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = ("/hello-world"))
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        String name = req.getParameter("name");
        if (req.getQueryString() == null){
            out.println("<h1> Hello World</h1>");
        } else {
            out.println("<h1> Hello " + name + "</h1>");
        }
    }
}