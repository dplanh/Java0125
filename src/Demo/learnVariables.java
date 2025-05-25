package Demo;

public class learnVariables {
    //Bien toan cuc
    String address = "HCM City";
    int postcode = 12345;

    public void login(String email, String password) {
        System.out.println(email + " - " + password);
    }

    public static void main(String[] args) {
        String name = "Anh";
        int age = 5;
        //String name = "Test";
        System.out.println(name);
        System.out.println("age = " + age);

        learnVariables vab = new learnVariables();
        vab.login("","");
    }
}

