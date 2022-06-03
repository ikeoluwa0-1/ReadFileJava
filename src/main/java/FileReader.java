import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class FileReader {
    public static void main(String[] args) {

        Properties myProperties = new Properties();
        try{
            File file = new File("src/main/resources/application (1).properties");
            FileInputStream fis = new FileInputStream(file);
            myProperties.load(fis);

            System.out.println(myProperties.getProperty("port"));
            System.out.println(myProperties.getProperty("server"));
            System.out.println(myProperties.getProperty("application.name"));
            System.out.println(myProperties.get("application.db"));
        }
        catch(Exception E){
            System.out.println("file unavailable");
        };
    }
}
