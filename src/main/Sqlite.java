package main;

import java.sql.*;
import java.util.*;

public class Sqlite {

    private Connection connect() {
        // SQLite connection
        String url = "jdbc:sqlite:Intership.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }




    Dictionary select () {
        Dictionary dict = new Hashtable();

        String query = "Select * FROM Students";

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(query)){

            // loop through the result set
            while (rs.next()) {

                        dict.put(rs.getString("Name"), rs.getInt("KnowledgeLevel"));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return dict ;
    }

}
