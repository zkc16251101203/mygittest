package zkc;

import java.util.Random;

public class RandomTest {
public static void main(String[] args) {
	int ss[]= {1,2,3,4,5,6,7,8,9,10};
	int dd[]=new int[50];
	Random rd=new Random();
	
	for(int i=0;i<=ss.length;i++) {
		int index=rd.nextInt(ss.length);
		dd[i]=ss[index];
	}
	for(int d:dd) {
		if(d!=0) {
		System.out.println(d);
	}
}
}
}
