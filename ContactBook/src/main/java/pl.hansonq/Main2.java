package pl.hansonq;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.*;

/**
 * Created by lukasz on 2017-09-05.
 */
public class Main2 {

    public static void main(String[] args) {

        MysqlConnector connector = MysqlConnector.getInstance();
        try {
            PreparedStatement statement = connector.getConnection().prepareStatement("UPDATE book SET author = ? WHERE pages > ?");
            statement.setString(1,"Oskar Polak");
            statement.setInt(2,150);
            statement.execute();
/*
        PreparedStatement insertStat  = connector.getConnection().prepareStatement("INSERT INTO book VALUES (?, ?, ?, ?, ?)");
        insertStat.setInt(1, 0);
            insertStat.setString(2, "mojaKsiązka");
            insertStat.setString(3, "Tomek");
            insertStat.setInt(4, 999);
            insertStat.setString(5, "1985-05-25");
insertStat.execute();

            //Podstawiamy wartosci pod znak zapytania, indeksujemy od 1   !!!
            PreparedStatement statement2 = connector.getConnection().prepareStatement("SELECT * FROM book where PAGES > ? and TITLE LIKE ?");
            statement2.setInt(1,200);
            statement2.setString(2,"%a%");

            ResultSet result3 = statement2.executeQuery();
            while (result3.next()){
                //  System.out.println(resultSet.getString("title"));
                System.out.println(result3.getString("author"));
                // System.out.println(resultSet.getInt("pages"));
            }


            Statement statement = connector.getConnection().createStatement();
           // statement.execute("INSERT INTO book VALUES(0,'Książka z Javy','Lukasz Czereda',250,'2005-02-24')");  //INSERT
            ResultSet resultSet = statement.executeQuery("SELECT * FROM book WHERE pages < 250");
            while (resultSet.next()){
              //  System.out.println(resultSet.getString("title"));
                System.out.println(resultSet.getString("author"));
               // System.out.println(resultSet.getInt("pages"));
            }
            statement.execute("UPDATE book SET author='Mans' WHERE author = 'Mansom'");
            ResultSet resultSet3 = statement.executeQuery("SELECT * FROM book WHERE pages < 250");
            while (resultSet3.next()){
                //  System.out.println(resultSet.getString("title"));
                System.out.println(resultSet3.getString("author"));
                // System.out.println(resultSet.getInt("pages"));
            }

            ResultSet resultSet4 = statement.executeQuery("SELECT * FROM book");
            while (resultSet.next()){
                //  System.out.println(resultSet.getString("title"));
                System.out.println(resultSet.getString("titile")+ resultSet.getString("author")+resultSet4.getInt("pages"));
                // System.out.println(resultSet.getInt("pages"));
                */

        } catch (SQLException e) {
            e.printStackTrace();
        }


      //  Nigdy nie łączymy sie w ten sposów tylko przez webservice

    }

}
