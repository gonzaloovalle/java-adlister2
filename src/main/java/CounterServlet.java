import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name ="CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {
    private int count = 0;
    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        String queryString = req.getQueryString();
        count++;
        if (queryString != null && queryString.contains("yes")) {
            count = 0;
            out.println("<h1> The page has been viewed " + count + " times </h1>");
        } else {
            out.println("<h1> The page has been viewed " + count + " times </h1>");

        }
    }
}
