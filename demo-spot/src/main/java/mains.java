
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
    String genre1 = request.getParameter("genero1");
    String genre2 = request.getParameter("genero2");
    String genre3 = request.getParameter("genero3");
    

    if(genre2 == "None"){
        genre2 = request.getParameter("genero1");

    }
    if(genre3 == "None"){
        genre3 = request.getParameter("genero1");

    }

    PrintWriter out = response.getWriter();
    for(String element : queries.search(genre1, genre2, genre3)){
        out.println(element);
    }



   out.println("Realizado Que tenga un Buen Dia");
   out.println(genre1);

}

}
