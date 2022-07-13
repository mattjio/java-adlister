import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        //res.setContentType("text/html");
        //res.getWriter().println("<h1>Hello World!</h1>");

        String name = req.getParameter("name");
        if (name != null) {
            res.setContentType("text/html");
            try {
                PrintWriter out = res.getWriter();
                out.println("<h1>Hello " + name + "</h1>");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            res.setContentType("text/html");
            try {
                PrintWriter out = res.getWriter();
                out.println("<h1>Hello World</h1>");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

