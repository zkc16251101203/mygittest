package zkc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SuiJiChuTi {
public static void main(String[] args) {
	Random random=new Random();
	int i1 = 1;
	List<Integer> list1=new ArrayList<Integer>();
	List<Integer> list=new ArrayList<Integer>();
	for (int i=0;i<=20;i++) {
		list.add(new SuiJiChuTi().suijishu());
	}
	Object[] array = list.toArray();
	
	Object[] copyOf = Arrays.copyOf(array, array.length);
	for(Object o:copyOf) {
		System.out.println(o);
	}
}
public Integer suijishu() {
	
	return new Random().nextInt(1000)+1;
	
}
}
