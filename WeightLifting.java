class WeightLifting extends Activity {

    private int duration;
    private double weight;
    private int reps;


    public WeightLifting(int duration, double weight, int reps) {
        super(duration);
        this.weight = weight;
        this.reps = reps;
    }
    @Override
    public double  calculateCaloriesBurned() {
        return weight * reps * 0.5;
    }

    public void displayActivityInfo() {
        System.out.println("Duration: " + this.duration + " min");
        System.out.println("Weight: " + this.weight + "kg");
        System.out.println("Reps: " + this.reps);
        System.out.println("Calories " + this.calculateCaloriesBurned());
    }
}