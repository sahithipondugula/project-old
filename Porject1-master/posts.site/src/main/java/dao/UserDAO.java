package dao;

import java.sql.SQLException;
import java.util.List;

import model.Comment;
import model.User;

public interface UserDAO {

	boolean login(String User_name,String Password);

	boolean signUp(User user);

}