package com.kopnice.javaExample;

public class test {
	private static Scanner scanner;
	private static Sedan sedan;
	private static Bus bus;
	private static Truck truck;
	private static Car[] cars;
	static {
		scanner=new Scanner(System.in);
		sedan=new Sedan("小轿车","黑色");
		bus=new Bus("大巴车","绿色");
		truck=new Truck("卡车","蓝色",2);
		cars=new Car[3];
		cars[0]=sedan;
		cars[1]=bus;
		cars[2]=truck;
				
	}
	public void showCars() {
		System.out.println("车辆名称\t\t车辆颜色\t\t座位数\t\t载重量");
		Car car =null;
		for(int i=0;i<cars.length;i++) {
			car=cars[i];
			if(car instanceof Sedan) {
				Sedan sedan =(Sedan)car;
				System.out.println(sedan.getName()+"\t\t"+sedan.getColor()+"\t\t"+sedan.seatNum());
				
			}
			if(car instanceof Bus) {
				Bus bus =(Bus)car;
				System.out.println(bus.getName()+"\t\t"+bus.getColor()+"\t\t"+bus.seatNum());
				
			}
			if(car instanceof Truck) {
				Truck truck =(Truck)car;
				System.out.println(truck.getName()+"\t\t"+truck.getColor()+"\t\t"+truck.seatNum()+"\t\t"+truck.getweight());
				
			}
		}
		
	}
	public static void main(String[] args) {
		test tes=new test();
			tes.showCars();
	}
}

