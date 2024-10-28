import java.io.*;
import Vehicle.*;
import Exceptions.*;
import MainVehicles.Car;
import MainVehicles.Motorcycle;
import Reflection.Reflection;

public class App {
    public static void main(String[] args) throws IOException, NoSuchModelNameException, DuplicateModelNameException, ClassNotFoundException, CloneNotSupportedException{
        
        Car car = new Car("BMW", 10);
        car.printInfo();

        Reflection.SetPriceByName(car, "Car 3", 15);

        car.printInfo();
    }
}
