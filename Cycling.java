class Cycling extends Activity {

    private int duration;
    private double distance;
    private String terrain;


    public Cycling (int duration, double distance, String terrain){
        super(duration);
        this.distance = distance;
        this.terrain = terrain;
    }
    @Override
    public double calculateCaloriesBurned() {
        double calsPerKm;
        if  (terrain.equalsIgnoreCase("flat")) {
            calsPerKm = 25;
        }else if(terrain.equalsIgnoreCase("hilly")) {
            calsPerKm = 40;
        }else if(terrain.equalsIgnoreCase("mountainous")) {
            calsPerKm = 70;
        }else {
            calsPerKm = 25;
        }
        return this.distance * calsPerKm;
    }

    public void displayActivityInfo() {
        System.out.println("Distance: " + this.distance + " kilometers");
        System.out.println("Pace: " + calculatePace() + "km/min");
    }

    public double calculatePace() {
        return (distance*60.0 / (duration)) ;
    }
}