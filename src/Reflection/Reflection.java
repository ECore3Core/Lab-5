package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import MainVehicles.Car;

public class Reflection {
    public static void SetPriceByName(Car car, String name, double price){
        try{
            Method method = car.getClass().getMethod("setPrice", String.class, double.class);
            method.invoke(car, name, price);
        }
        catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e){
            e.printStackTrace();
        }
    }
}
