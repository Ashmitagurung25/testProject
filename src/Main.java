import java.util.Scanner;

public class Main {
public static void main (String args[]){
     String brandName=null;
     String engineType=null;
     String carType=null;
     int fuelConsume=0;
     String engine1="v6";
     String engine2="v4";
     String engine3="v2";
    int milage=0;

     Car car = new Car();
Scanner sc = new Scanner(System.in);
    System.out.println("print car details");
for(int i=0;i<3;i++){
    System.out.println("print brandName");
    brandName = sc.next();
    car.setBrandName(brandName);
    System.out.println("print carType");
    carType = sc.next();
    car.setCarType(carType);
    System.out.println("print engineType");
    engineType = sc.next();
    car.setEngineType(engineType);
    System.out.println("print fuelConsume");
    fuelConsume = sc.nextInt();
    car.setFuelConsume(fuelConsume);
    if(car.getEngineType().equals(engine1)){
        milage = fuelConsume * 20;
    }
    if(car.getEngineType().equals(engine2)){
        milage = fuelConsume * 30;
    }
    if(car.getEngineType().equals(engine3)){
        milage = fuelConsume * 40;
    }
    System.out.println(car.getBrandName()+" "+car.getCarType()+" "+car.getEngineType()+" "+car.getFuelConsume()+" gals"+milage+" miles driven");

}
System.out.println();
if(car.getEngineType().equals(engine3)){
    System.out.println(car.getBrandName()+" "+car.getCarType()+" "+car.getEngineType()+" "+car.getFuelConsume()+" gals "+milage+" miles driven and provides better milage");

}
sc.close();
}
}
