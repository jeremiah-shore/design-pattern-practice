package net.jeremiahshore.patterns.creational.factory.improved.api;

import net.jeremiahshore.patterns.creational.factory.improved.api.model.*;
import net.jeremiahshore.patterns.creational.factory.improved.api.model.Bicycle;
import net.jeremiahshore.patterns.creational.factory.improved.api.model.Bicycle.Tires;

public class BicycleFactory {

    private static class SingletonHelper {
        private static final BicycleFactory INSTANCE = new BicycleFactory();
    }

    private BicycleFactory() {
        //nothing special here, just restricting constructor access for the BillPugh implementation of the Singleton design pattern
    }

    public static BicycleFactory getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public Bicycle getBicycle(int speed, Tires tires) {
        if(speed <= 0 || tires == null) {
            return null;
        }

        if(tires == Bicycle.Tires.ROAD) {
            if(speed == 1) {
                return new FixieBike();
            } else {
                return new RoadBike();
            }
        } else if(tires == Tires.OFFROAD) {
            if(speed == 1) {
                return new BmxBike();
            } else {
                return new MountainBike();
            }
        }

        return null;
    }
}
