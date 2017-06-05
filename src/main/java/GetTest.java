

import org.testng.Assert.*;
import org.testng.annotations.*;

import static org.testng.Assert.assertTrue;

@Test
public class GetTest {
    Singleton X;

    @BeforeMethod
    public void before() {
        X = Singleton.getInstance();
        X.populate();
    }


    public void getTest()
    {String str = X.get();
     assertTrue(str.substring(1).equals ("ass"),"Строка"+str+"Не содержит ass" );
    }

}