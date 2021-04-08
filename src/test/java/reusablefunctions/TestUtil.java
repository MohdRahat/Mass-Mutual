package reusablefunctions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.DriverManager;

public class TestUtil {
    public static InputStream takeScreenshot(){
        InputStream is = null;
        try{
            File src = (File)((TakesScreenshot)DriverManager.getDriver("")).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src,new File("screenshots/page2.png"));
            is= Files.newInputStream(Paths.get("screenshots/page2.png"));
        }catch (Exception e){
            e.printStackTrace();
        }return is;
    }

}
