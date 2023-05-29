import java.util.LinkedList;

import org.neo4j.driver.*;
public class Query {
        
        public LinkedList<String> search(String genre1, String genre2, String genre3){
        
        LinkedList<String> genero1 = new LinkedList<String>();
        LinkedList<String> genero2 = new LinkedList<String>();
        LinkedList<String> genero3 = new LinkedList<String>();
        LinkedList<String> rec = new LinkedList<String>();
        LinkedList<String> rec2 = new LinkedList<String>();

        // Configurar la conexión con la base de datos Neo4j
        String uri = "bolt://54.210.119.36:7687";
        String username = "neo4j";
        String password = "sips-lumber-projectile";

        // Crear una instancia de Driver para establecer la conexión
        try (Driver driver = GraphDatabase.driver(uri, AuthTokens.basic(username, password))) {

            // Crear una sesión para ejecutar las consultas
            try (Session session = driver.session()) {

                if (genre2 == null && genre3 == null){
                    // Ejecutar la consulta Cypher en Java
                    String query = "MATCH (song:Song)-[Genre_Type]-(:Genres {Type: '" + genre1 + "' }) RETURN song.title";
    
                    // Utilizar un try-with-resources para asegurarse de que se cierre la transacción correctamente
                    try (Transaction tx = session.beginTransaction()) {
    
                        // Ejecutar la consulta y obtener el resultado
                        Result result = tx.run(query);
    
                        // Procesar los resultados
                        while (result.hasNext()) {
                            Record record = result.next();
                            // Acceder al valor del título en el resultado
                            genero1.add(recor.get("song.title").asString());
                            //String title = record.get("song.title").asString();
                            //System.out.println("Título de la canción: " + title);
                        }
    
                        // Confirmar la transacción
                        tx.commit();
                        return genero1;
                    }

                } else if (genre2 != null && genre3 == null) {
                    // Ejecutar la consulta Cypher en Java
                    String query = "MATCH (song:Song)-[Genre_Type]-(:Genres {Type: '" + genre1 + "' }) RETURN song.title";

                    // Utilizar un try-with-resources para asegurarse de que se cierre la transacción correctamente
                    try (Transaction tx = session.beginTransaction()) {

                        // Ejecutar la consulta y obtener el resultado
                        Result result = tx.run(query);

                        // Procesar los resultados
                        while (result.hasNext()) {
                            Record record = result.next();
                            // Acceder al valor del título en el resultado
                            genero1.add(recor.get("song.title").asString());
                            //String title = record.get("song.title").asString();
                            //System.out.println("Título de la canción: " + title);
                        }

                        // Confirmar la transacción
                        tx.commit();
                        String query2 = "MATCH (song:Song)-[Genre_Type]-(:Genres {Type: '" + genre2 + "' }) RETURN song.title";

                        // Utilizar un try-with-resources para asegurarse de que se cierre la transacción correctamente
                        try (Transaction tx2 = session.beginTransaction()) {

                            // Ejecutar la consulta y obtener el resultado
                            Result result2 = tx2.run(query2);

                            // Procesar los resultados
                            while (result2.hasNext()) {
                                Record record2 = result2.next();
                                // Acceder al valor del título en el resultado
                                genero2.add(recor2.get("song.title").asString());
                                //String title = record.get("song.title").asString();
                                //System.out.println("Título de la canción: " + title);
                            }

                            // Confirmar la transacción
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

                    // Utilizar un try-with-resources para asegurarse de que se cierre la transacción correctamente
                    try (Transaction tx = session.beginTransaction()) {

                        // Ejecutar la consulta y obtener el resultado
                        Result result = tx.run(query);

                        // Procesar los resultados
                        while (result.hasNext()) {
                            Record record = result.next();
                            genero1.add(recor.get("song.title").asString());
                            //String title = record.get("song.title").asString();
                            //System.out.println("Título de la canción: " + title);
                        }

                        // Confirmar la transacción
                        tx.commit();

                        String query2 = "MATCH (song:Song)-[Genre_Type]-(:Genres {Type: '" + genre2 + "' }) RETURN song.title";

                        // Utilizar un try-with-resources para asegurarse de que se cierre la transacción correctamente
                        try (Transaction tx2 = session.beginTransaction()) {

                            // Ejecutar la consulta y obtener el resultado
                            Result result2 = tx2.run(query2);

                            // Procesar los resultados
                            while (result2.hasNext()) {
                                Record record2 = result2.next();
                                // Acceder al valor del título en el resultado
                                genero2.add(recor2.get("song.title").asString());
                                //String title = record.get("song.title").asString();
                                //System.out.println("Título de la canción: " + title);
                            }

                            // Confirmar la transacción
                            tx2.commit();

                            for (String gen1 : genero1) {
                                for (String gen2 : genero2) {
                                    if (gen1.equalsIgnoreCase(gen2))
                                        rec.add(gen1);
                                }
                            }

                            String query3 = "MATCH (song:Song)-[Genre_Type]-(:Genres {Type: '" + genre3 + "' }) RETURN song.title";

                            // Utilizar un try-with-resources para asegurarse de que se cierre la transacción correctamente
                            try (Transaction tx3 = session.beginTransaction()) {

                                // Ejecutar la consulta y obtener el resultado
                                Result result3 = tx3.run(query3);

                                // Procesar los resultados
                                while (result3.hasNext()) {
                                    Record record3 = result3.next();
                                    // Acceder al valor del título en el resultado
                                    genero3.add(recor3.get("song.title").asString());
                                    //String title = record.get("song.title").asString();
                                    //System.out.println("Título de la canción: " + title);
                                }

                                // Confirmar la transacción
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
    }
}

