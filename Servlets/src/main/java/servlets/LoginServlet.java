package servlets;

import dao.impl.UserDaoImpl;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("fname");
        String password = req.getParameter("password");

        System.out.println(username + " " + password);

        // Verify user credentials against the database
        if (isValidUser(username, password)) {
            // Successful login

            req.getSession().setAttribute("username", username);
//            req.getRequestDispatcher("events.jsp").forward(req, resp);
//            resp.sendRedirect("/events"); // Redirect to a secure page
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("logged.jsp");
            req.setAttribute("username", username);
            requestDispatcher.forward(req,resp);
//            System.out.println((String)req.getSession().getAttribute("username"));
        } else {
            // Failed login
            resp.sendRedirect("login.jsp?error=1"); // Redirect back to the login page with an error parameter
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }



    public boolean isValidUser(String username, String password) {
        return new UserDaoImpl().isValidUser(username, password);
    }
}
