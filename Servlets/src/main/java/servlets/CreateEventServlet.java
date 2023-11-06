package servlets;

import dao.EventDao;
import dao.impl.EventDaoImpl;
import dao.impl.UserDaoImpl;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Event;
import model.User;
import util.Util;

import java.io.IOException;
import java.util.Date;

@WebServlet("/createEvent")
public class CreateEventServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String description = req.getParameter("description");
        Date date = Util.stringToDate( req.getParameter("date") );
        UserDaoImpl userDao = new UserDaoImpl();

        if(description.length() >= 5 || date.after(new Date())){
            Event event = new Event(date , description);
            String username = (String) req.getSession().getAttribute("username");
            User user = userDao.getUserByUsername(username);
            event.setUser(user);
            EventDao eventDao = new EventDaoImpl();
            eventDao.create(event);

            RequestDispatcher dispatcher = req.getRequestDispatcher("/createEvent.jsp");
            req.setAttribute("msg","The even has been created successfully !");
//            resp.getWriter().write("You have been successfully registered !");
            dispatcher.forward(req,resp);
            return;

        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/createEvent.jsp");
        req.setAttribute("msg","You had problem trying to create an event, please contact to us in order to solve it!");
        dispatcher.forward(req,resp);

    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/createEvent.jsp").forward(req, resp);
    }

}
