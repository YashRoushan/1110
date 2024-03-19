public class User {

    private String userName;
    private int age;
    private double height;
    private double weight;
    Activity activity;
    public User(String userName, int age, double height, double weight, Activity activity){
        this.userName = userName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.activity = activity;
    }

    public void displayUserInfo(){
        System.out.println("User Name: " + userName + "\n" + "Age: " + age + "\n" + "Height: " + height + " cm\n" + "Weight: " + weight );
    }

    public void displayActivity(){
        activity.displayActivityInfo();
    }
}
