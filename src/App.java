import Reflection.Reflection;
import MainVehicles.*;

public class App {
    public static void main(String[] args){
        System.out.println(Car.class.getName());
        Reflection.SetPriceByName(args[0], args[1], args[2], args[3]);
    }
}
