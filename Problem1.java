import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String activityType = scanner.next();
        int duration = scanner.nextInt();


        if (activityType.equalsIgnoreCase("Running")) {
            double distance = scanner.nextDouble();
            Running runningActivity = new Running(duration, distance);

            double pace = duration / distance;
            double caloriesBurned = distance * 60;

            System.out.println("Activity: Running");
            runningActivity.displayActivityInfo();
            System.out.println("Calories Burned: " + runningActivity.calculateCaloriesBurned() + "cal");
        }
        else if(activityType.equalsIgnoreCase("Weightlifting")){
            double weight = scanner.nextDouble();
            int reps = scanner.nextInt();
            WeightLifting weightLiftingActivity = new WeightLifting(duration, weight, reps);

            System.out.println("Activity: WeightLifting");
            weightLiftingActivity.displayActivityInfo();

            System.out.println("Calories Burned: " + weightLiftingActivity.calculateCaloriesBurned() + "cal");
        }
        else{
            double distance = scanner.nextDouble();
            String terrain = scanner.next();

            Cycling cycling = new Cycling(duration, distance, terrain);

            System.out.println("Activity: Cycling");
            cycling.displayActivityInfo();

            System.out.println("Calories Burned: " + cycling.calculateCaloriesBurned() + "cal");
        }
    }
}