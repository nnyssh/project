

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/BookingServlet")
public class BookingServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String date = request.getParameter("date");
        String time = request.getParameter("time");

        // Generate response
        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Booking Confirmation</h1>");
        response.getWriter().println("<p>Thank you, " + name + "! Your booking details are as follows:</p>");
        response.getWriter().println("<p>Email: " + email + "</p>");
        response.getWriter().println("<p>Date: " + date + "</p>");
        response.getWriter().println("<p>Time Slot: " + time + "</p>");
        response.getWriter().println("<a href='booking.html'>Back to Booking Page</a>");
        response.getWriter().println("</body></html>");
    }
}