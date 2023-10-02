import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


@WebServlet(value = "/login")
public class SessionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String usuario = req.getParameter("usuario");
        String senha = req.getParameter("senha");



        try {
            int a = 10/0;
        }catch (Exception e){
            resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR,"VAZA tA No Lugar Errado tio");
            return;
        }



        if (!usuario.equals("gabu") || !senha.equals("123")){
            resp.sendRedirect("/");
            return;
        }



        HttpSession session = req.getSession();

        String sessionId = null;
        Cookie[] cookies = req.getCookies();

        for (Cookie c: cookies) {
            if(c.getName().equals("sessionId")){
                sessionId = c.getValue();
                break;
            }
        }


        if(sessionId == null){
            sessionId = session.getId();
            Cookie sessionCookie = new Cookie("sessionId",sessionId);
            sessionCookie.setMaxAge(60*60);
            resp.addCookie(sessionCookie);

        }


        session.setAttribute("nomeUsuario",usuario);
        List<String> l = new ArrayList<String>();
        l.add(usuario);
        l.add(senha);

        session.setAttribute("lista",l);

        String nome = (String) session.getAttribute("nomeUsuaio");
        List<String> li = (List<String>) session.getAttribute("lista");

        PrintWriter writer = resp.getWriter();
        writer.println(usuario);





    }


}
