public class Activity {
    protected int duration;



    public Activity (int duration) {
        this.duration = duration;
    }

    public double calculateCaloriesBurned() {
        return duration * 5;
    }

    public void displayActivityInfo() {
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Calories burned: " + calculateCaloriesBurned() + " cal");
    }
}