package com.codegym.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDAO {
    private static final String INSERT_PRODUCTS_SQL = "INSERT INTO `c3_demoindex`.`products` " +
            "(`id`, `productCode`, `productName`, `productPrice`, `productAmount`, `productDescription`, `productStatus`) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?);";
    private String jdbcURL = "jdbc:mysql://localhost:3306/c3_demoindex?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "Quangdv180729!!";

    private static final String INSERT_USERS_SQL = "INSERT INTO users" + "  (name, email, country) VALUES " +
            " (?, ?, ?);";

    private static final String SELECT_USER_BY_ID = "select id,name,email,country from users where id =?";
    private static final String SELECT_ALL_USERS = "select * from users";
    private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
    private static final String UPDATE_USERS_SQL = "update users set name = ?,email= ?, country =? where id = ?;";


    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }

    public void insertUser(Product product) throws SQLException {
        System.out.println(INSERT_USERS_SQL);
        // try-with-resource statement will auto close the connection.


        try (
                Connection connection = getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUCTS_SQL)
        )
        {
            preparedStatement.setInt(1, product.getId());
            preparedStatement.setString(2, product.getProductCode());
            preparedStatement.setString(3, product.getProductName());
            preparedStatement.setDouble(4, product.getProductPrice());
            preparedStatement.setInt(5, product.getProductAmount());
            preparedStatement.setString(6, product.getProductDescription());
            preparedStatement.setBoolean(7, true);

            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }



    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
