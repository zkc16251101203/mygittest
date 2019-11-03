package zkc;

public class SyncStack {
private String[] products=new String[10];
public String[] getProducts() {
	return products;
}
private int index=0;
public synchronized void push(String product)
{
	while(index==products.length) {
		try {
			wait();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	notify();
	products[index]=product;
	index++;
}
public synchronized String pop() {
	while(index==0) {
		try {
			wait();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	notify();
	index--;
	String product1=products[index];
	return product1;
}
public static void main(String agrs[]) {
	SyncStack s3=new SyncStack();
	Producer p=new Producer(s3);
	Consumer c=new Consumer(s3);
	Thread t1=new Thread(p);
	Thread t2=new Thread(c);
	t1.start();
	t2.start();
}
}
class Producer implements Runnable{
private SyncStack s1;
public Producer(SyncStack s){
	this.s1=s;
}
	@Override
	public void run() {
		for(int i=0;i<s1.getProducts().length;i++) {
			String product="产品"+i;
			s1.push(product);
			System.out.println("生产了:"+product);
			try {
				Thread.sleep(1);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}
}
class Consumer implements Runnable{
private SyncStack s2;
public Consumer(SyncStack s){
	this.s2=s;
}
	@Override
	public void run() {
		for(int i=0;i<s2.getProducts().length;i++) {
		String product=s2.pop();
		System.out.println("消费者消费了"+product);
		}
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}