import java.util.LinkedList;

import org.neo4j.driver.*;
import org.neo4j.driver.Record;
public class Query {
        
        public LinkedList<String> search(String genre1, String genre2, String genre3){
        
        LinkedList<String> genero1 = new LinkedList<String>();
        LinkedList<String> genero2 = new LinkedList<String>();
        LinkedList<String> genero3 = new LinkedList<String>();
        LinkedList<String> rec = new LinkedList<String>();
        LinkedList<String> rec2 = new LinkedList<String>();

        // Configurar la conexiÃ³n con la base de datos Neo4j
        String uri = "neo4j+s://81c426cd.databases.neo4j.io";
        String username = "neo4j";
        String password = "SlJtv-qWUuE0XjlaRcfEv7ns-AMdK4QVDj9OFj6JS7M";

        // Crear una instancia de Driver para establecer la conexiÃ³n
        try (Driver driver = GraphDatabase.driver(uri, AuthTokens.basic(username, password))) {

            // Crear una sesiÃ³n para ejecutar las consultas
            try (Session session = driver.session()) {

                if (genre2 == null && genre3 == null){
                    // Ejecutar la consulta Cypher en Java
                    String query = "MATCH (song:Song)-[Genre_Type]-(:Genres {Type: '" + genre1 + "' }) RETURN song.title";
    
                    // Utilizar un try-with-resources para asegurarse de que se cierre la transacciÃ³n correctamente
                    try (Transaction tx = session.beginTransaction()) {
    
                        // Ejecutar la consulta y obtener el resultado
                        Result result = tx.run(query);
    
                        // Procesar los resultados
                        while (result.hasNext()) {
                            Record record = result.next();
                            // Acceder al valor del tÃ­tulo en el resultado
                            genero1.add(record.get("song.title").asString());
                            //String title = record.get("song.title").asString();
                            //System.out.println("TÃ­tulo de la canciÃ³n: " + title);
                        }
    
                        // Confirmar la transacciÃ³n
                        tx.commit();
                        return genero1;
                    }

                } else if (genre2 != null && genre3 == null) {
                    // Ejecutar la consulta Cypher en Java
                    String query = "MATCH (song:Song)-[Genre_Type]-(:Genres {Type: '" + genre1 + "' }) RETURN song.title";

                    // Utilizar un try-with-resources para asegurarse de que se cierre la transacciÃ³n correctamente
                    try (Transaction tx = session.beginTransaction()) {

                        // Ejecutar la consulta y obtener el resultado
                        Result result = tx.run(query);

                        // Procesar los resultados
                        while (result.hasNext()) {
                            Record record = result.next();
                            // Acceder al valor del tÃ­tulo en el resultado
                            genero1.add(record.get("song.title").asString());
                            //String title = record.get("song.title").asString();
                            //System.out.println("TÃ­tulo de la canciÃ³n: " + title);
                        }

                        // Confirmar la transacciÃ³n
                        tx.commit();
                        String query2 = "MATCH (song:Song)-[Genre_Type]-(:Genres {Type: '" + genre2 + "' }) RETURN song.title";

                        // Utilizar un try-with-resources para asegurarse de que se cierre la transacciÃ³n correctamente
                        try (Transaction tx2 = session.beginTransaction()) {

                            // Ejecutar la consulta y obtener el resultado
                            Result result2 = tx2.run(query2);

                            // Procesar los resultados
                            while (result2.hasNext()) {
                                Record record2 = result2.next();
                                // Acceder al valor del tÃ­tulo en el resultado
                                genero2.add(record2.get("song.title").asString());
                                //String title = record.get("song.title").asString();
                                //System.out.println("TÃ­tulo de la canciÃ³n: " + title);
                            }

                            // Confirmar la transacciÃ³n
                            tx2.commit();

                            for (String gen1 : genero1) {
                                for (String gen2 : genero2) {
                                    if (gen1.equalsIgnoreCase(gen2))
                                        rec.add(gen1);
                                }
                            }

                        }
                        return rec;
                    }
                } else if (genre2 != null && genre3 != null) {
                    // Ejecutar la consulta Cypher en Java
                    String query = "MATCH (song:Song)-[Genre_Type]-(:Genres {Type: '" + genre1 + "' }) RETURN song.title";

                    // Utilizar un try-with-resources para asegurarse de que se cierre la transacciÃ³n correctamente
                    try (Transaction tx = session.beginTransaction()) {

                        // Ejecutar la consulta y obtener el resultado
                        Result result = tx.run(query);

                        // Procesar los resultados
                        while (result.hasNext()) {
                            Record record = result.next();
                            genero1.add(record.get("song.title").asString());
                            //String title = record.get("song.title").asString();
                            //System.out.println("TÃ­tulo de la canciÃ³n: " + title);
                        }

                        // Confirmar la transacciÃ³n
                        tx.commit();

                        String query2 = "MATCH (song:Song)-[Genre_Type]-(:Genres {Type: '" + genre2 + "' }) RETURN song.title";

                        // Utilizar un try-with-resources para asegurarse de que se cierre la transacciÃ³n correctamente
                        try (Transaction tx2 = session.beginTransaction()) {

                            // Ejecutar la consulta y obtener el resultado
                            Result result2 = tx2.run(query2);

                            // Procesar los resultados
                            while (result2.hasNext()) {
                                Record record2 = result2.next();
                                // Acceder al valor del tÃ­tulo en el resultado
                                genero2.add(record2.get("song.title").asString());
                                //String title = record.get("song.title").asString();
                                //System.out.println("TÃ­tulo de la canciÃ³n: " + title);
                            }

                            // Confirmar la transacciÃ³n
                            tx2.commit();

                            for (String gen1 : genero1) {
                                for (String gen2 : genero2) {
                                    if (gen1.equalsIgnoreCase(gen2))
                                        rec.add(gen1);
                                }
                            }

                            String query3 = "MATCH (song:Song)-[Genre_Type]-(:Genres {Type: '" + genre3 + "' }) RETURN song.title";

                            // Utilizar un try-with-resources para asegurarse de que se cierre la transacciÃ³n correctamente
                            try (Transaction tx3 = session.beginTransaction()) {

                                // Ejecutar la consulta y obtener el resultado
                                Result result3 = tx3.run(query3);

                                // Procesar los resultados
                                while (result3.hasNext()) {
                                    Record record3 = result3.next();
                                    // Acceder al valor del tÃ­tulo en el resultado
                                    genero3.add(record3.get("song.title").asString());
                                    //String title = record.get("song.title").asString();
                                    //System.out.println("TÃ­tulo de la canciÃ³n: " + title);
                                }

                                // Confirmar la transacciÃ³n
                                tx3.commit();

                                for (String reco : rec) {
                                    for (String gen3 : genero3) {
                                        if (reco.equalsIgnoreCase(gen3))
                                            rec2.add(reco);
                                    }
                                }

                            }

                        }
                    }
                    return rec2;

                }

            }
        }
        return rec2;
    }

    public static  void add(String nombre){
        Driver driver = GraphDatabase.driver("neo4j+s://81c426cd.databases.neo4j.io",AuthTokens.basic("neo4j","SlJtv-qWUuE0XjlaRcfEv7ns-AMdK4QVDj9OFj6JS7M"));
        Session session = driver.session();

        String cypherAdd = "CREATE ("+nombre.strip()+":Person {Name: "+nombre+"})";

        session.run(cypherAdd);
    }

    public static void delete(String nombre){
        Driver driver = GraphDatabase.driver("neo4j+s://81c426cd.databases.neo4j.io",AuthTokens.basic("neo4j","SlJtv-qWUuE0XjlaRcfEv7ns-AMdK4QVDj9OFj6JS7M"));
        Session session = driver.session();
        String cypherDelete = "MATCH (n:Person {id: $id}) DELETE n";

        String cypherID = "MATCH (nPerson {propiedad: $valor}) RETURN id(n) AS nodeId";

        String propiedadBusqueda = "Name";
        String valorBusqueda = nombre;

        Record result = session.run(cypherID, Values.parameters("propiedad",propiedadBusqueda, "valor", valorBusqueda)).single();

        Value nodeIdValue = result.get("nodeId");
        long nodeId = nodeIdValue.asLong();

        session.run(cypherDelete, Values.parameters("id", nodeId));

    }
}
