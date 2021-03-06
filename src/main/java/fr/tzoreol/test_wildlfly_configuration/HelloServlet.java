package fr.tzoreol.test_wildlfly_configuration;

import java.io.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    @PersistenceContext(unitName = "default")
    EntityManager entityManager;

       public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + entityManager.isOpen() + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}