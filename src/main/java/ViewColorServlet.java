import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/viewcolor")
public class ViewColorServlet extends HttpServlet {
    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String color = req.getParameter("color");
        req.setAttribute("color", color);
        req.getRequestDispatcher("/view-color.jsp").forward(req,res);
    }
}