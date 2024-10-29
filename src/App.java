import Reflection.Reflection;
import Vehicle.Vehicle;
import Exceptions.DuplicateModelNameException;
import Exceptions.NoSuchModelNameException;
import MainVehicles.*;

public class App {
    public static void main(String[] args)throws NoSuchModelNameException, DuplicateModelNameException{
        //Задание 1
        //Reflection.SetPriceByName(args[0], args[1], args[2], args[3]);

        //Задание 2
        Car car = new Car("", 0);
        Vehicle v = Vehicles.createVehicle("BMW", 10, car);
        System.out.println(v);

        //Задание 3
        Scooter scooter = new Scooter("Suzuki", 10);
        scooter.printInfo();
        scooter.deleteModel("Scooter2");
        scooter.setPrice("Scooter4", 50);
        scooter.printInfo();
    }
}
