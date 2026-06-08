package practice.level09;



public class task16 {
    public static void main(String[] args) {


        String emailOne = "User@Example.com";
        String emailTwo = "user@example.com";

        boolean emailEquals= emailOne.equalsIgnoreCase(emailTwo);

        String registrationMessage = "user@example.com is registered";

        boolean isDomen = registrationMessage.contains("example");

        System.out.println(emailEquals + " " + isDomen);

    }





}
