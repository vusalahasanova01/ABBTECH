package TaskFive;

public enum Species {
    CAT(false,4,true),
    DOG(false,4,false),
    BIRD(true,2,false),
    CHICKEN(false,2,false);

    private final boolean canFly;
    private final int numberOfLegs;
    private final boolean hasfur;

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

