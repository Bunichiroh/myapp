package mypackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServerException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServerException, IOException {
        request.setCharacterEncoding("UTF-8");

        String s = request.getParameter("cname");

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head></head><body>");
        out.println("<p>こんなの入力したよね。 "+s+"</p>");
        out.println("<a href=\"./form.jsp\">戻る</a>");
        out.println("</body></html>");
    }

}
