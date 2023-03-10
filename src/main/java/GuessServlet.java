import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet("/guess")
public class GuessServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("/guess.jsp").forward(req,res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        Random rand = new Random();
        int randomNum = rand.nextInt(3 - 1 + 1) + 1;
        String guess = req.getParameter("guess");

        if (Integer.parseInt(guess) > 3 || Integer.parseInt(guess) < 1) {
            res.sendRedirect("/guess");
        } else if (randomNum == Integer.parseInt(guess)) {
            res.sendRedirect("/correct");
        } else if (randomNum != Integer.parseInt(guess)) {
            res.sendRedirect("/incorrect");
        }

    }
}
