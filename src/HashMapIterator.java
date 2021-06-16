import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("Moumita", 1);
		hm.put("Mousumi", 2);
		hm.put("Sukant", 3);
		hm.put("Sobuj", 4);
		Iterator hmIterator=hm.entrySet().iterator();
		while(hmIterator.hasNext()) {
			Map.Entry entry=(Map.Entry)hmIterator.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}
