public class PremiumUser extends User{

    private String userName;
    private int age;
    private double height;
    private double weight;
    Activity activity;

    private String userType;


    public PremiumUser(String userName, int age, double height, double weight, Activity activity){
        super(userName, age, height, weight, activity);
        userType = "premium";
    }

    @Override
    public void displayUserInfo(){
        System.out.println("User Type: " + userType + " \n" + userName + "\n " + age + "\n" + weight);
    }
}
