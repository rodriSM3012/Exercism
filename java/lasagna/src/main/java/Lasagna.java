public class Lasagna {
    private final int mins = 40;

    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return mins;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minsInOven) {
        return mins - minsInOven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int nLayers) {
        return nLayers * 2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int nLayers, int minsInOven) {
        return minsInOven + preparationTimeInMinutes(nLayers);
    }
}

