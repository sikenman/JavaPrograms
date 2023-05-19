import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletGetToday extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy");
        String formattedDate = formatter.format(currentDate);
        
        out.println("<html><body>");
        out.println("<h2>Current Date: " + formattedDate + "</h2>");
        out.println("</body></html>");
    }
}
