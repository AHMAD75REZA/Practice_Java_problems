package OOPS.PracticeOOPS;

public class First {
    String name;
    String email;
    String password;
    int userId;

    public String User (String name, String useremail, String password, int userID){
        this.name = name;
        email = useremail;
        this.password = password;
       this.userID = userID;


    }
    public void getStudent (){
        System.out.println("The student" + this.name);

    }
    public static void main(String[] args){
        user user1 = new user("JAVA", "CODING NINJAS.COM", "1234",10);
        user1.getstudent();
    }

}
