package device;

import  device.Device;
public class Car  extends Device{
   public String color;

     public String fuelType;
     public Double millage;

    public Car(String producer, String model, Integer yearOfProduction, String fuelType, String color) {
        super("Audi", " 2010 ", "vw");
        this.millage = 0.0;
        this.fuelType =  fuelType;
        this.color = color;



    }

    @Override
    public String toString() {
        return "device.Car{" +
                "color='" + color + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", millage=" + millage +
                '}';
    }


    public void turnOn() {
        System.out.println("Przekręcam kluczyk");
        System.out.println("Przekręcam kluczyk");
        System.out.println("Odpalam");
    }
}