package org.example;
import java.sql.*;


public class UserDao {

    public void addUser(User user) {
        String sql = "INSERT INTO users (email, username, password) VALUES (?, ?, ?)";
        try (Connection conn = DbUtil.connect();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, user.getEmail());
            ps.setString(2, user.getUsername());
            ps.setString(3, user.getPassword());

            int rows = ps.executeUpdate();
            System.out.println("Přidáno řádků: " + rows);

        } catch (SQLException e) {
            System.out.println("Chyba.");
            e.printStackTrace();
        }
    }
}

