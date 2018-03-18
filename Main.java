package com.company;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name, fam;
        int i = 0;
        try {
            Class.forName("org.h2.Driver");
            Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "test", "test");
            Statement st = conn.createStatement();
           /* st.execute("create table exam(id int primary key, name varchar(255), family varchar(255))");
            st.execute("create table exam2(id int primary key, name varchar(255), family varchar(255))");*/
           Scanner s = new Scanner(System.in);
           while (i<10) {
               i++;
               System.out.println("Vvedite imya:");
               name = s.nextLine();
               System.out.println("Vvedite fam:");
               fam = s.nextLine();
               st.execute("insert into exam2 values("+i+",'" + name + "','" + fam + "')");
           }
            System.out.println("table created successfully");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
