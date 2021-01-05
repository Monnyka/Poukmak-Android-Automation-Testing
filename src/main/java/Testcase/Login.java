package Testcase;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.annotations.Test;
import java.io.IOException;

public class Login extends BaseClass{

    @Test
    public void testScreenShot() throws IOException, InterruptedException {
        takeScreenShot("TC001");
        Thread.sleep(5000);
        takeScreenShot("TC002");
        openNotification();
        Thread.sleep(5000);
        closeNotification();
        Thread.sleep(5000);
    }

}
