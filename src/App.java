import java.io.*;
import Vehicle.*;
import Exceptions.*;

public class App {
    public static void main(String[] args) throws IOException, NoSuchModelNameException, DuplicateModelNameException, ClassNotFoundException, CloneNotSupportedException{
        
        //тест equals, clone
        Car car = new Car("BMW", 5);
        Car car2 = (Car)car.clone();
        System.out.println(car2.equals(car));
        car.setPrice("Car 1", 10);
        System.out.println(car.equals(car2));
        System.out.println(car);
        System.out.println(car2);

        Motorcycle moto = new Motorcycle("BMW", 5);
        Motorcycle moto1 = (Motorcycle)moto.clone();
        System.out.println(moto1.equals(moto));
        moto.deleteModel("Moto 0");
        System.out.println(moto.equals(moto1));
        System.out.println(moto);
        System.out.println(moto1);

        //тест toString
        System.out.println(car);

        //тест hashCode()
        System.out.println(moto.hashCode());
    }
}
