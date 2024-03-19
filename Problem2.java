import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.next();
        int userAge = scanner.nextInt();
        int userHeight = scanner.nextInt();
        int userWeight = scanner.nextInt();

        String activityType = scanner.next();
        int duration = scanner.nextInt();


        Activity activity = new Activity(duration);


        String userType = scanner.nextLine();

        if(userType.equals("premium")){
            User user = new PremiumUser(userName, userAge, userHeight, userWeight, activity);
            user.displayUserInfo();
        }
        else{
            User user = new RegularUser(userName, userAge, userHeight, userWeight, activity);
            user.displayUserInfo();
        }



        Running runningActivity;
        if (activityType.equalsIgnoreCase("Running")) {
            double distance = scanner.nextDouble();
            runningActivity = new Running(duration, distance);

            double pace = duration / distance;
            double caloriesBurned = distance * 60;

            System.out.println("Activity: Running");
            System.out.println("Duration: " + duration + "minutes");
            System.out.println("Distance:" + distance + "kms");
            System.out.println("Pace:" + Math.round(pace * 10.0) / 10.0 + " min/km");
            System.out.println("Calories Burned: " + caloriesBurned + "cal");
        }

        if(userType.equals("premium")){
            User user = new PremiumUser(userName, userAge, userHeight, userWeight, activity);
            user.displayActivity();
        }
        else{
            User user = new RegularUser(userName, userAge, userHeight, userWeight, activity);
            user.displayActivity();
        }
    }
}