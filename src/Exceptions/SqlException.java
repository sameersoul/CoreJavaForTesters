package Exceptions;

import java.sql.SQLException;

public class SqlException {
    public static void main(String[] args) throws SQLException {
        throw new SQLException("This is an SQLException.");
    }
}

