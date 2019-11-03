package zkc;

public class Android1 {

	public static void main(String[] args) {
		Android1 an=new Android1();
		an.shit();

	}
public  void call() {
	System.out.print("µğÄã");
}
public  void shit() {
	System.out.print("ÄãÂé±Ô");
	Android1 an=new Android1();
	an.call();
	call();
	cat2.yell();
}
}
class cat2{
	public static void yell() {
		System.out.print("ß÷ß÷ß÷");
	}
}
