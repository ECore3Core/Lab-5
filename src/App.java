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

        //Задание 4
        QuadBike quadBike = new QuadBike("Yamaha", 10);
        quadBike.printInfo();
        quadBike.deleteModel("QuadBike1");
        quadBike.printInfo();
        quadBike.setModelName("QuadBike4", "kal");
        quadBike.setPrice("QuadBike2", 15);
        quadBike.printInfo();
        quadBike.addModel("bab", 5);
        quadBike.printInfo();
        String[] quadBikeNames = quadBike.getModelsNames();
        for(String s : quadBikeNames){
            System.out.print(s + " ");
        }
    }
}
