package Repository;

import Models.Document;
import Models.House;
import Models.Transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHandler {


    protected static Connection connection;
    protected static Statement statement;


    public static void connect()
    {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/housing", "root", "");
            statement = (Statement) connection.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void insertDocument(Document document){
        String sqlUserpass = "INSERT INTO `documents`(`date`,`time`, `responsibleName`,`address`,`price`) VALUES ('" + document.getDate()+ "','" + document.getTime() + "','" + document.getResponsibleName()+ "','" +document.getAddress()+ "','" +document.getPrice()+"')";
        try {
            statement.execute(sqlUserpass);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public void insertTransaction(Transaction  transaction){
        String sqlUserpass = "INSERT INTO `transactions`(`houseType`,`type`, `date`,`time`,`sellerCode`,`buyerCode`,`sellerFatherCode`,`buyerFatherCode`,`finalPrice`) VALUES ('" + transaction.getHouseType()+ "','" + transaction.getType()+ "','" + transaction.getDate()+ "','" +transaction.getTime()+ "','" +transaction.getSellerCode()+ "','"+transaction.getBuyerCode()+ "','"+transaction.getSellerFatherCode()+ "','"+transaction.getBuyerFatherCode()+ "','"+transaction.getFinalPrice()+"')";
        try {
            statement.execute(sqlUserpass);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void insertHouse(House house){
        String sqlUserpass = "INSERT INTO `house`(`area`,`price`, `sellerName`,`address`,`properties`) VALUES ('" + house.getArea()+ "','" + house.getPrice()+ "','" + house.getSellerName()+ "','" +house.getAddress()+ "','" +house.getProperties()+ "')";
        try {
            statement.execute(sqlUserpass);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }











}
