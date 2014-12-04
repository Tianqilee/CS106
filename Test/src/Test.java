import java.util.ArrayList;
import java.util.Iterator;


/**
 * 
 */

/**
 * @author tli1
 *
 */
public class Test {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list =new ArrayList<String>();
	list.add("a");
	list.add("b");
	list.remove("a");
for(String s:list){
	System.out.println(s);	
}
ArrayList<String> list2 = new ArrayList<String>();
list2.add("c");
list2.add("d");
Iterator <String> i =  list2.iterator();
while(i.hasNext()){
System.out.println(i.next());
	}

}
}