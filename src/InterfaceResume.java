import java.util.Scanner;

// Define the interface
interface Resume {
    // Abstract method (public and abstract by default)
    void biodata();
}

// Teacher class implementing the interface contract
class Teacher implements Resume {
    String name;
    String qualification;
    int experience;

    // Constructor to initialize teacher details
    Teacher(String name, String qualification, int experience) {
        this.name = name;
        this.qualification = qualification;
        this.experience = experience;
    }

    // Implementing the method from the Resume interface
    @Override
    public void biodata() {
        System.out.println("Name: " + name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Experience: " + experience + " years");
    }
}

public class InterfaceResume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading inputs as per the specified format
        String name = sc.nextLine();
        String qualification = sc.nextLine();
        int experience = sc.nextInt();

        // Create the Teacher object
        Teacher teacher = new Teacher(name, qualification, experience);

        // Invoke the biodata method
        teacher.biodata();

        sc.close();
    }
}
