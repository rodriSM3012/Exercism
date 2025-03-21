
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] array = { 0, 2, 5, 3, 7, 8, 4 };
        return array;
    }

    public int getToday() {
        return this.birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int i = 0; i < this.birdsPerDay.length; i++) {
            if (this.birdsPerDay[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        if (numberOfDays > this.birdsPerDay.length) {
            numberOfDays = this.birdsPerDay.length;
        }
        for (int i = 0; i < numberOfDays; i++) {
            sum += this.birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int sum = 0;
        for (int i = 0; i < this.birdsPerDay.length; i++) {
            if (birdsPerDay[i] > 4) {
                sum++;
            }
        }
        return sum;
    }
}
