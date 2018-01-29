package com.iesemilidarder.restaurants.web; /**
 * Importa els paquets necesaris
 */

import java.sql.*;
import java.util.ArrayList;


/**
 * Crea la classe publica ReadDB, amb sa que llegirem sa base de dades
 */
public class ReadDB {
    /**
     * Crea una arraylist on s'introduiran els restaurants que es llegeixen
     * @return
     */
    public static ArrayList readRestaurants(String consulta) {
        ArrayList al = new ArrayList();
        try {

            /**
             * Estableix la connexio a la base de dades.
             */
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@35.205.41.45:1521:XE", "usuari","usuari");

            /**
             * Declara el tipus de connexio
             */
            Statement stmt = con.createStatement();

            /**
             * Executa la query SQL que nosaltres definim

             */
            String query = "SELECT R.RES_NOM, R.RES_ADRECA, R.RES_WEB, R.RES_TELEFON, T.TRS_DESCRIPCIO " +
                    "FROM RESTAURANTS R, TRESTAURANTS T WHERE R.RES_TRS_CODI = T.TRS_CODI " +
                    "AND R.RES_NOM like '%"+consulta+"%'";
            System.out.println(query);

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                /**
                 * Obte les dades de les columnes que li deim
                 */
                String nom = rs.getString("RES_NOM");
                String address = rs.getString("RES_ADRECA");
                String web = rs.getString("RES_WEB");
                String telefon = rs.getString("RES_TELEFON");
                String type = rs.getString("TRS_DESCRIPCIO");

                /**
                 * Introdueix les dades obteses
                 */
                Restaurant std = new Restaurant();
                std.setNombre(nom);
                std.setAddress(address);
                std.setWeb(web);
                std.setTelefono(telefon);
                std.setType(type);

                /**
                 * Afegeix les dades a l'array
                 */
                al.add(std);
            }

            /**
             * Tanca la connexio
             */
            stmt.close();
            con.close();

        }
        /**
         * En cas d'errada mostra l'error
         */
        catch (Exception e) {
            System.out.println(e.toString());
        }
        /**
         * Retorna l'array
         */
        return al;
    }
}