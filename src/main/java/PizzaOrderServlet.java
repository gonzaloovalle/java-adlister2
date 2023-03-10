import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("/pizza.jsp").forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) {
        String crust = req.getParameter("crust");
        String sauce = req.getParameter("sauce");
        String[] toppings = req.getParameterValues("topping");
        String size = req.getParameter("size");
        String address = req.getParameter("address");

        System.out.println("Crust type: " + crust);
        System.out.println("Sauce type: " + sauce);
        System.out.println("Toppings: ");
        for (String topping : toppings) {
            System.out.println(topping);
        }
        System.out.println("Size: " + size);
        System.out.println("Delivering to: " + address);
    }
}
