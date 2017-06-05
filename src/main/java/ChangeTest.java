import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ChangeTest {
        Singleton X;


        @DataProvider(name = "Provider")
        public Object[][] DataProvaider2() {
            return new Object[][]{
                    {1, "test"},
                    {2, "test"},
                    {3, "test"},
                    {4, "test"}
            };
        }

        @BeforeMethod
        public void before() {
            X = Singleton.getInstance();
            X.populate();
        }

        @Test
    public void changeTest(int First, String Second){
            X.change(First,Second);
            assertTrue(X.getValue(First).equals("AMD"));
        }
    }
