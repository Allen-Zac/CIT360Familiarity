
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Zac Allen
 */
@WebServlet(urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet{
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>CIT 360 Servlet Example</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>CIT 360 Servlet Example " + request.getContextPath() + "</h1>");
           
            String foodName = request.getParameter("Food Name");
            String calories = request.getParameter("Calories");
            String likeIt = request.getParameter("Like It?");
  
            out.println("Please enter a food");
            out.println("<p>Food Name: " + foodName + "</p>");
            out.println("<p>Calories: " + calories + "</p>");
            out.println("<p>Like It: " + likeIt + "</p>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "This servlet lets you add foods and food info.";
    }
}
