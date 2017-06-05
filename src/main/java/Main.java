/**
 * Created by екатерина и анатолий on 02.06.2017.
 */
public class Main {
    public static void main(String[] args){
        GetTest ch= new GetTest();
        ch.before();
        ch.getTest();


        ChangeTest cg = new ChangeTest();
        cg.before();
        cg.changeTest(1,"test");
        cg.changeTest(2,"test");
        cg.changeTest(3,"test");
        cg.changeTest(4,"test");
    }
}
