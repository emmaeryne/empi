
package tn.esprit.MyDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import  static java.lang.System.*;


public class MyDataBase{
    private static MyDataBase instance;
    private final String URL="jdbc:mysql:// 127.0.0.1:3306/pidev";
    private final String USERNAME="root";
    private final String PASSWORD="";
    private Connection cnx;

    private MyDataBase (){
        try {
            cnx= DriverManager.getConnection(URL,USERNAME,PASSWORD);
            out.println("connected ....");
        }
        catch (SQLException e){
            out.println(e.getMessage());
            out.println("----- not connected");
        }
    }
    public static MyDataBase getInstnce() {
        if (instance == null) //lena idha ma3andouch instance yasna3o sinn yraj3o lel instance cree

            instance = new MyDataBase();
        return instance;

    }
    public void setCnx (Object cnx){
        this.cnx = (Connection) cnx;
    }

    public Connection getCnx() {
        return cnx;
    }
}
