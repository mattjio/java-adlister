import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaServlet", urlPatterns = "/pizza-order")
public class PizzaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zip = request.getParameter("zip");
        String size = request.getParameter("size");
        String crust = request.getParameter("crust");
        String[] toppings = request.getParameterValues("toppings");
        response.getWriter().println("Your order has been placed!");
        response.getWriter().println("Your order will be delivered to: " + address + " " + city + " " + state + " " + zip);
        response.getWriter().println("Your order will be " + size + " " + crust + " crust pizza with the following toppings: ");
        for (String topping : toppings) {
            response.getWriter().println(topping + " ");
        }
    }
}

