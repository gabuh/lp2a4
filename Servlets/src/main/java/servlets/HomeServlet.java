package servlets;

import config.JpaFactoryConnection;
import dao.UserDao;
import dao.impl.UserDaoImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

import java.io.IOException;
import java.io.PrintWriter;

public class HomeServlet extends HttpServlet {
    static {
        JpaFactoryConnection.connect();
    }

//    UserDao userDao = new UserDaoImpl();



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {



        req.getRequestDispatcher("/index.html").forward(req,resp);

//        userDao.create( new User(req.getParameter("name"),req.getParameter("email")) );
//
//
//        PrintWriter writer = resp.getWriter();
//
//
//        for (User user : userDao.getUsers() ){
//            writer.println("<p>Well come "+ user.getName() +" !</p>");
//            writer.println("<p>Your email "+ user.getEmail()+" The notification will be sent to your email box! </p>");
//        }
//
    }

}
