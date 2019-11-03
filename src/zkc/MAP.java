package zkc;
import java.util.*;
import java.util.Map.Entry;


public class MAP {

	public static void main(String[] args) {
		HashMap<String, String> map=new HashMap<String,String>();
		map.put("key1", "xiaoming");
		map.put("key2", "xiaohong");
		for(Map.Entry<String, String> entry :map.entrySet()) {
			System.out.print(entry.getKey());
			System.out.print(entry.getValue());
		}
	}

}
