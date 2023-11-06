package servlets;

import config.JpaFactoryConnection;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;


public class HomeServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        JpaFactoryConnection.connect();
    }




    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        if (req.getSession().getAttribute("username") != null){
            req.getSession().setAttribute("username", null);
        }


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
