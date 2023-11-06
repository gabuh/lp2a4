package servlets;

import dao.impl.UserDaoImpl;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

import java.io.IOException;

@WebServlet("/registerUser")
public class RegisterUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("fname");
        String email = req.getParameter("email");
        String password = req.getParameter("password");


        if(name.length() >= 5 &&  email.contains("@") && email.contains(".") && password.length() >= 8){
            User user = new User(name,email, password);

            if (new UserDaoImpl().create(user)){
                RequestDispatcher dispatcher = req.getRequestDispatcher("/register.jsp");
                req.setAttribute("msg","You have been successfully registered !");
//            resp.getWriter().write("You have been successfully registered !");
                dispatcher.forward(req,resp);
                return;
            }

        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/register.jsp");
        req.setAttribute("msg","You had problem trying to register, please contact to us in order to solve it!");
        dispatcher.forward(req,resp);

    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/register.jsp").forward(req, resp);
    }
}
