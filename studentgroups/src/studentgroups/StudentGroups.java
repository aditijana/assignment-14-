package studentgroups;
import java.util.Scanner;

public class StudentGroups {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's roll number: ");
        int rollNumber = scanner.nextInt();

        int groupNumber = (rollNumber - 1) % 4;

        String groupName;

        switch (groupNumber) {
            case 0:
                groupName = "Sapphire";
                break;
            case 1:
                groupName = "Perl";
                break;
            case 2:
                groupName = "Ruby";
                break;
            default:
                groupName = "Emerald";
                break;
        }

        System.out.printf("The student belongs to group %s", groupName);
    }
}