package servlets;

import dao.EventDao;
import dao.UserDao;
import dao.impl.EventDaoImpl;
import dao.impl.UserDaoImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;


@WebServlet("/events")
public class EventServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = (String) req.getSession(true).getAttribute("username");
        System.out.println("hi");
        System.out.println(username);
        if (username != null){
            if (username.length() > 5){
//                UserDao userDao = new UserDaoImpl();
//                User user = userDao.getUserByUsername(username);
//                for (Event e:
//                        user.getEvents()) {
//                    System.out.println(e.getId());
//                }
                EventDao eventDao = new EventDaoImpl();
                req.setAttribute("events", eventDao.getEvents(username));
                req.getRequestDispatcher("events.jsp").forward(req, resp);
            }
        }
//req.getRequestDispatcher("login.jsp").forward(req, resp);
    }




}
