package taskSeven.enums;

public enum Species {
    FISH(false, 0, false),
    DOG(false, 4, false),
    ROBOCAT(false, 4, true),
    DOMESTICCAT(false, 4, true),
    UNKNOWN;

    private boolean canFly;
    private  int numberOfLegs;
    private boolean hasfur;

    Species() {
    }

    Species(boolean canFly, int numberOfLegs, boolean hasfur) {
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasfur = hasfur;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public boolean isHasfur() {
        return hasfur;
    }
}

