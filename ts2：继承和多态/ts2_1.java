/* 
 * 编写一个java程序，设计一个汽车类Vehicle，包含的属性有车轮的个数wheels和车重weight。
 * 小汽车类Car是Vehicle的子类，包含的属性有载人数loader。卡车类Truck是Car类的子类，
 * 其中包含的属性有载重量payload。每个类都有构造方法和输出相关数据的方法。
 */ 

package ts2_1;

class Vehicle{
	int wheels = 0;
	int weight = 0;	
	public Vehicle(){
		
	}
	public Vehicle(int wheels, int weight){
		this.wheels = wheels;
		this.weight = weight;
	}
	public int getwheels(){
		return this.wheels;
	}
	public int getweight(){
		return this.weight;
	}
	public void print(){
		System.out.println("The vehicle has "+this.wheels+
				" wheels, its weight is "+this.weight+"kg.");
	}
}

class Car extends Vehicle{
	int loader = 0;
	public Car(){
		this.wheels = 4;
	}
	public Car(int loader){
		this.loader = loader;
		this.wheels = 4;
	}
	public Car(int loader, int wheels, int weight){
		this.loader = loader;
		this.wheels = wheels;
		this.weight = weight;
	}
	public void setweight(int weight){
		this.weight = weight; 
	}
	public void print(){
		System.out.println("The car's loader is "+this.loader+
				", it has "+ this.wheels + " wheels, its weight is "+
				this.weight+"kg.");
	}
}

class Truck extends Car{
	int payload = 0;
	public Truck(int payload){
		this.payload = payload;
	}
	public Truck(int payload, int wheels, int loader, int weight){
		this.payload = payload; 
		this.loader = loader;
		this.wheels = wheels;
		this.weight = weight;		
	}
	public void setloader(int loader){
		this.loader = loader;
	}
	public void setweight(int weight){
		this.weight = weight;
	}
	public void print(){
		System.out.print("The truck's payload is "+this.payload+"t"+
				", its loader is "+this.loader+", it has "+ this.wheels+
				" wheels, its weight is "+this.weight+"kg.");
	}
	
}

public class ts2_1 {
	public static void main(String[] args){
		Vehicle vehicle = new Vehicle(2,20);
		vehicle.print();
		Car car = new Car(5, 4, 3000);
		car.print();
		Truck truck = new Truck(5, 6, 2, 8000);
		truck.print();
	}
}
