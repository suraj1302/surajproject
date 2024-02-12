import java.util.Scanner;

class User {
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = ref.nextLine();
        System.out.println("Enter date of birth:");
        int dob = ref.nextInt();
        System.out.println("Male or female:");
        ref.nextLine(); 
        String gender = ref.next();
        System.out.println("Enter the address:");
        String address = ref.nextLine();
        System.out.println("Phone number:");
        double no = ref.nextDouble();
        System.out.println("Enter age:");
        int age = ref.nextInt();
    }
}
