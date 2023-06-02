
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
    PrintWriter out = response.getWriter();
    String genre1 = request.getParameter("genero1");
    String genre2 = request.getParameter("genero2");
    String genre3 = request.getParameter("genero3");
    String agregar = request.getParameter("agregar"); //variables a utilizar para agregar y eliminar artista del Query
    String eliminar =  request.getParameter("eliminar");
    String artista =  request.getParameter("fname");
    

    if(genre2 == ""){
        genre2 = request.getParameter("genero1");
        out.println("Debido a que no hay genero 2 se establece al genero 1 como prioridad");

    }
    if(genre3 == ""){
        genre3 = request.getParameter("genero1");
        out.println("Debido a que no hay genero 3 se establece al genero 1 como prioridad");

    }
     //Se utiliza para desplegar serie de artistas recomendados por estos generos
  
     for(String element : queries.search(genre1, genre2, genre3)){
        out.println(element);
    }


    if(agregar != null){
        //nombre del motodo agregar como queries.search(genre1, genre2, genre3)


        out.println("el artista " + artista + " Ha sido agregdo a base de datos");
    }

    if(eliminar != null){
        //nombre del motodo agregar como queries.search(genre1, genre2, genre3)



        out.println("el artista " + artista + " Ha sido quitado de la base de datos");
    }





//Imprime es como el System.out.println pero sin System

   out.println("Realizado Que tenga un Buen Dia");
   

}

}
