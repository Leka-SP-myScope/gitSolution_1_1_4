package jm.task.core.jdbc.util;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.imageio.spi.ServiceRegistry;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DB_Driver = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/usertest?serverTimezone=UTC&useSSL=false";
    private static final String DB_UserName = "root";
    private static final String DB_Password = "ALEKA678022";

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DB_Driver);
            connection = DriverManager.getConnection(DB_URL, DB_UserName, DB_Password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
    serviceRegistryBuilder
            .applySetting("hibernate.connection.datasource", "usertest")
            .applySetting("hibernate.format_sql", "true")
            .applySetting("hibernate.use_sql_comments", "true")
            .applySetting("hibernate.hbm2ddl.auto", "create-drop");

    ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();


}
