package org.example.Strategy;

import org.example.Model.SpotAllotmentStrategy;

public class SpotAssignmentFactory {

    public static SpotAssigmentStrategy getSpotForType(SpotAllotmentStrategy spotAssigmentStrategy){
            return new RandomSpotAssignmentStrategy();
    }
}
