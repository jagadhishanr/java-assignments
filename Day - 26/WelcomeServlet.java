import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WelcomeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(false);

        if (session != null) {

            String username = (String) session.getAttribute("user");

            out.println("<h2>Welcome " + username + "</h2>");

        } else {
            out.println("Session expired. Please login again.");
        }
    }
}