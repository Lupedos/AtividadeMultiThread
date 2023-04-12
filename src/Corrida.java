package teste;
import java.util.Random;

class car1 extends Thread{
	int d =200 ;
	int a ;
	int i ;
	Random random = new Random();
	public void run() {
		for(i=0;i<d;) {
			 a = random.nextInt(50);
			 i = i + a;
			System.out.println("carro_1 andou:" + a +"metros"+ "    e já percorreu:"+i);
			if(i>d){
				System.out.println("chegou carro1 parabens"); }
			
			//try {Thread.sleep(1000);}catch(Exception e) {}//5 segundos
			
		}
	}
}

class car2 extends Thread{
	int d =200 ;
	int a ;
	int i ;
	Random random = new Random();
	public void run() {
		for(i=0;i<d;) {
			 a = random.nextInt(50);
			 i = i + a;
			System.out.println("carro_2 andou:" + a +"metros"+ "    e já percorreu:"+i);
			if(i>d){
				System.out.println("chegou carro2 parabens"); }
			
			//try {Thread.sleep(1000);}catch(Exception e) {}//5 segundos
			
		}
	}
}
class car3 extends Thread{
	int d =200 ;
	int a ;
	int i ;
	Random random = new Random();
	public void run() {
		for(i=0;i<d;) {
			 a = random.nextInt(50);
			 i = i + a;
			System.out.println("carro_3 andou:" + a +"metros"+ "    e já percorreu:"+i);
			if(i>d){
				System.out.println("chegou carro3 parabens"); }
			
			//try {Thread.sleep(1000);}catch(Exception e) {}//5 segundos
			
		}
	}
}
public class Corrida {
	public static void main(String[]args) {
		System.out.println("Ready");
		System.out.println("GO!");
		car1 obj1 =new car1();
		car2 obj2=new car2();
		car3 obj3=new car3();
		car4 obj4=new car4();
		car5 obj5=new car5();
		
		
		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
		obj5.start();
		
		
		//obj1.disp();
		//obj2.disp();
}
