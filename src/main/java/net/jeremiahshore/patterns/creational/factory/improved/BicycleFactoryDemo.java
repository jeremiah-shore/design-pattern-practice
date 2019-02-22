package net.jeremiahshore.patterns.creational.factory.improved;

import net.jeremiahshore.patterns.creational.factory.improved.api.BicycleFactory;
import net.jeremiahshore.patterns.creational.factory.improved.api.model.Bicycle;
import net.jeremiahshore.patterns.creational.factory.improved.api.model.Bicycle.Tires;

import java.util.ArrayList;

public class BicycleFactoryDemo {

    public static void main(String[] args) {
        BicycleFactory factory = BicycleFactory.getInstance();

        ArrayList<Bicycle> bikes = new ArrayList<>();
        bikes.add(factory.getBicycle(1, Tires.ROAD));
        bikes.add(factory.getBicycle(1, Tires.OFFROAD));
        bikes.add(factory.getBicycle(18, Tires.ROAD));
        bikes.add(factory.getBicycle(18, Tires.OFFROAD));

        for(Bicycle bike : bikes) {
            bike.ride();
        }
    }

}
