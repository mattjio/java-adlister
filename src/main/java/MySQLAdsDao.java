import java.sql.Connection;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{

    private Connection connection = null;

    public MySQLAdsDao(){
        try{
            Config config = new Config();
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        }catch(SQLException e){
            throw new RuntimeException("Error connecting to database.", e);
        }
    }
    @Override
    public List<Ad> all(){
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");
            List<Ad> ads = new ArrayList<>();
            while(rs.next()){
                ads.add(new Ad (
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                ));
            }
            return ads;
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public Long insert(Ad ad) {
        try{
            String query = "INSERT INTO ads (user_id, title, description) VALUES ('"
                    + ad.getUserId() + "', '"
                    + ad.getTitle() + "', '"
                    + ad.getDescription() + "')";

            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if(rs.next()){
                System.out.println("Inserted a new record! New id: " + rs.getLong(1));
            }
        }catch(SQLException e){
            throw new RuntimeException("Error found:" + e);
        }
        return ad.getUserId();
    }
}
