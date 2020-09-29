package com.api.enrolment.student.utils;

import com.api.enrolment.student.config.Constants;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.*;

public class DbUtils {

    @Autowired
    Constants constants;

    private Connection con;

    /**
     * to load the database base driver
     *
     * @return a database connection
     * @throws SQLException throws an exception if an error occurs
     */
    public Connection getConnection() {
        if (con != null) {
            return con;
        }
        try {
            Class.forName(constants.getDatasourceDriver());
            try {
                con = DriverManager.getConnection(constants.getDatasourceURL(), constants.getDatasourceUser(), constants.getDatasourcePassword());
            } catch (SQLException ex) {
                System.out.println("Failed to create the database connection.");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not found.");
        }
        return con;
    }

    /**
     * to get a result set of a query
     *
     * @param query custom query
     * @return a result set of custom query
     * @throws SQLException throws an exception if an error occurs
     */
    public ResultSet getResultSet(String query) throws SQLException {
        System.out.println("Executing Query : " + query);
        ResultSet rs = getConnection()
                .createStatement()
                .executeQuery(query);
        if (rs != null) {
            printResultSet(rs);
        }else{
            System.out.println("No data in table");
        }
        return rs;
    }

    private void printResultSet(ResultSet rs) {
        try {
            int columns = rs.getMetaData().getColumnCount();
            StringBuilder data = new StringBuilder();
            while (rs.next()) {
                for (int i = 1; i <= columns; i++) {
                    data.append(rs.getString(i)).append(" | ");
                }
                data.append("\n");
            }
            System.out.println(data);  // print result set
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * to run an update query such as update, delete
     *
     * @param query custom query
     * @throws SQLException throws an exception if an error occurs
     */
    public void runQuery(String query) throws SQLException {
        getConnection()
                .createStatement()
                .executeUpdate(query);
    }
}
