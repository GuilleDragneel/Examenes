package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import Entity.Operaciones;
import java.io.PrintWriter;
import java.util.List;

public class SumarServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Operaciones ope = new Operaciones() {
        };
        int result = 10;
        int num1, num2;
        ope.setNum1(Integer.parseInt(request.getParameter("num1")));
        ope.setNum2(Integer.parseInt(request.getParameter("num2")));
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>El resultado es: " + result + "</p>");
        out.println("</body>");
        out.println("</html>");
    }

}
