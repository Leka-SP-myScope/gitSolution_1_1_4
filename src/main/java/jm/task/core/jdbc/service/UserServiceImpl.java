package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;


import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl extends UserDaoJDBCImpl implements UserService {


    public void createUsersTable() throws SQLException {
        super.createUsersTable();
    }

    public void dropUsersTable() throws SQLException {
        super.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {

    }

    public void removeUserById(long id) {

    }

    public List<User> getAllUsers() {
        return null;
    }

    public void cleanUsersTable() {

    }
}
