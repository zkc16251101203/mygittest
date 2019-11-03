package zkc;

public class QuickSort {
public static void main(String[] args) {
	int s[]= {1,33,434,23123,654,454,22};
	for (int i=0;i<s.length-1;i++) {
		for (int j=0;j<s.length-i-1;j++) {
			if(s[j]>s[j+1]) {
				int temp=s[j];
				s[j]=s[j+1];
				s[j+1]=temp;
			}
		}
	}
	for(int d:s) {
		System.out.println(d);
	}
}
}
