package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        try {
            userService.createUsersTable();
            System.out.println("Table User create");

            userService.saveUser("Vasiliy", "Ivanov", (byte) 25);
            userService.saveUser("Alexey", "Chudikov", (byte) 22);
            userService.saveUser("Sergey", "Pelikanov", (byte) 40);
            userService.saveUser("Petr", "Vagapov", (byte) 21);

            userService.getAllUsers();
            System.out.println(userService.getAllUsers());

            userService.cleanUsersTable();
            System.out.println("Table User clean");

            userService.dropUsersTable();
            System.out.println("Table User drop");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
