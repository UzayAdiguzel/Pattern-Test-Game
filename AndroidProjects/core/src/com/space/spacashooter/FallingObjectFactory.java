package com.space.spacashooter;

public class FallingObjectFactory {

    public static FallingObject getFallingObject(ObjectType objectType) {
        switch (objectType) {
            case MeteorObject:
                return new Meteor();
            case SateliteObject:
                return new Satelite();
            default:
                throw new UnsupportedOperationException();
        }


    }

    public enum ObjectType {
        MeteorObject,
        SateliteObject;
    }

}
