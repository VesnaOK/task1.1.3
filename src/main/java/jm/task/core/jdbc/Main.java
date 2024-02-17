package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import static jm.task.core.jdbc.util.Util.closeSession;


public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Ivan", "Ivanov", (byte) 20);
        userService.saveUser("Petr", "Petrov", (byte) 24);
        userService.saveUser("Pavel", "Pavlov", (byte) 33);
        userService.saveUser("Lesha", "Leshov", (byte) 54);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
        closeSession();
    }
}
