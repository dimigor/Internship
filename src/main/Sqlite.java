package main;

import person.Student;
import person.consciousness.Knowledge;

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

    public void getStudentFromDatabase(){

        Dictionary dict = new Hashtable();
        Sqlite sqlite = new Sqlite();
        //Get all data from database in Dictionary
        dict = sqlite.select();

        //if database is not empty, we will get database data, else we will get standart data
        if ( dict.isEmpty() == false )
        {
            Object obj;
            int level;
            String name;
            for ( Enumeration e = dict.keys(); e.hasMoreElements();)
            {
                obj = e.nextElement();
                name = (String) obj;
                level = (int) dict.get(obj);

                university.addStudent(new Student(name, new Knowledge(level)));

            }
        }else

        {

        }
    }

}
