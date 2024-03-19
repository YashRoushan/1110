public class RegularUser extends User{

    private String userName;
    private int age;
    private double height;
    private double weight;
    Activity activity;

    private String userType;


    public RegularUser(String userName, int age, double height, double weight, Activity activity){
        super(userName, age, height, weight, activity);
        userType = "Regular";
    }

    @Override
    public void displayUserInfo(){
        System.out.println("User Types: " + userType);
        System.out.println(this.userName);
        System.out.println(this.age);
    }
}
