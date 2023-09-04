package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Person;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(urlPatterns = {"/welcome","hello", "whatsupp"})
public class ExUm extends HttpServlet {




    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException {


        Person person = new Person(req.getParameter("name"),req.getParameter("email"));

        PrintWriter writer = resp.getWriter();

        writer.println("<p>Well come "+ person.getName() +" !</p>");
        writer.println("<p>Your email "+ person.getEmail()+" The notification will be sent to your email box! </p>");
    }

}
