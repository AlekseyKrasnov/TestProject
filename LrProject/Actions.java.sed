
import lrapi.lr;

public class Actions
{

	public int init() throws Throwable {
		return 0;
	}


	public int action() throws Throwable {
		GetTest ch= new GetTest();
		ch.before();
		ch.getTest();
		
		
		ChangeTest cg = new ChangeTest();
		cg.before();
		cg.changeTest(1,"test");
		cg.changeTest(2,"test");
		cg.changeTest(3,"test");
		cg.changeTest(4,"test");
	    return 0;
		
	}


	public int end() throws Throwable {
		return 0;
	}
}
