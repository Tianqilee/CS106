import java.util.Iterator;
import java.util.LinkedList;

/**
 * 
 */

/**
 * @author tli1
 *
 */
public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> list= new LinkedList<String>();
list.add("a");
list.add("b");
for(String s: list){
	System.out.println(s);
}
list.remove("a");
list.remove("b");
list.add("c");
Iterator <String> i =  list.iterator();
while(i.hasNext()){
System.out.println(i.next());
	}

}
}