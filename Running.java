class Running extends Activity {


    private double distance;


    public Running (int duration, double distance) {
        super(duration);
        this.distance = distance;
    }
    @Override
    public double calculateCaloriesBurned(){
        return distance * 60;
    }

    @Override
    public void displayActivityInfo() {

        System.out.println("Distance: " + distance + " kilometers");
        System.out.println("Pace: " + calculatePace() + "km/min");

    }

    public double calculatePace() {
        double pace =  distance / duration;
        return Math.round(pace * 10.0) / 10.0;
    }
}