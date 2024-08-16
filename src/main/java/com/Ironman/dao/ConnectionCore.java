package com.Ironman.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionCore {
    public Connection getConnection(){
        //Attributes
        String hostName="localhost";
        String port="3306";
        String dbName="db_restaurantes";
        String userName="root";
        String password="";

        //Process
            try {
                //Load Driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                //url Connection
                String url = "jdbc:mysql://"+ hostName+":"+port+"/"+dbName;
                //Result
                return DriverManager.getConnection(url,userName,password);
            }catch (Exception e){
                System.out.println("ConnectionCore::Connection::Error "+e.getMessage());
            }
            return null;
    }
}
