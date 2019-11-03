package zkc;

public  class Animal {
 
	public  void jiao() {
		System.out.print("¶¯Îï½º");
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
		System.out.print("Ã¨½Ð");
		
	}
	public static void pa() {
		System.out.print("ÅÀ");
	}
	
}
