package zkc;

public  class Animal {
 
	public  void jiao() {
		System.out.print("���ｺ");
	}
	public static void main(String[] args) {
		Animal a=new Animal();
		a.jiao();
        cat.pa();
	}

}
class cat extends Animal{

	@Override
	public void jiao() {
		System.out.print("è��");
		
	}
	public static void pa() {
		System.out.print("��");
	}
	
}
