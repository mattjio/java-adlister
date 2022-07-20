import java.sql.Connection;
import java.util.List;

public class MySQLAdsDao implements Ads{
    @Override
    public List<Ad> all() {
        return null;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }

    // Define your constructor so that it accepts an instance of your Config class so that it can obtain the database credentials
    public MySQLAdsDao(Config config) {
        // Create a new instance of the MySQLConnection class
        Connection connection = new Connection(config);
        // Create a new instance of the MySQLAdsDao class
        MySQLAdsDao dao = new MySQLAdsDao(connection);
    }
}
