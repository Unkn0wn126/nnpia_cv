package cz.upce.fei.nnpia.cv02.nnpiaservletcv02;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "formServlet", value = "/form-servlet")
public class FormServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        ServletContext context = getServletContext();
        RequestDispatcher dispatcher = context.getRequestDispatcher("/form.jsp");
        dispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("text/html");
        String firstName = req.getParameter("fname");
        String lastName = req.getParameter("lname");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "Welcome" + "</h1>");
        out.println("<h2>" + firstName + " " + lastName + "</h2>");
        out.println("<a href=\"hello-servlet\">Hello Servlet</a>");
        out.println("</body></html>");
    }

    public void destroy(){

    }
}
