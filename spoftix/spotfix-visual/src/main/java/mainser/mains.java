package mainser;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class mains extends HttpServlet{

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Form handling logic

    Query queries = new Query();
    String genre1 = request.getParameter("Submit-genero1");
    String genre2 = request.getParameter("Submit-genero2");
    String genre3 = request.getParameter("Submit-genero3");

    PrintWriter out = response.getWriter();
    for(String element : queries.search(genre1, genre2, genre3)){
        out.println(element);
    }
}

}
