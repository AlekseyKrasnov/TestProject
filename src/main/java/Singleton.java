import java.util.ArrayList;
import java.util.Random;

public class Singleton {

    private ArrayList<String> array;

    private static Singleton instance;

    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void populate() {
       if(array==null){array = new ArrayList<String>();
        Random random = new Random();
       for( int x=0; x<100; x++){
           int r = (random.nextInt(1));
              if ( r ==0) {
                array.add("Fail");
            }else if(r==1){
                array.add("Pass");
            }
       }}
    }

    public String get() {
        Random val = new Random();
        return array.get(val.nextInt(100));

    }

    public void change(int index, String value) {
        array.set(index,value);

    }
public String getValue(int index)
{return array.get(index);
}
};

