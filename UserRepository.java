
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class UserRepository {
    public void getUserByUsername(String username) {
        // Existing SQL Injection vulnerability
        // Additional code not shown for brevity
    }

    // New method vulnerable to Directory Traversal
    public String readFileContent(String fileName) {
        String content = "";
        try {
            File file = new File("user_files/" + fileName);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = reader.readLine()) != null) {
                content += line + "\n";
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content;
    }
}
