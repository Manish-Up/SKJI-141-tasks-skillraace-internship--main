// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username, password, newName, newEmail, newPassword;

        // Login
        System.out.println("Enter username:");
        username = scanner.nextLine();
        System.out.println("Enter password:");
        password = scanner.nextLine();

        // Validate login (hardcoded for simplicity)
        if (username.equals("user") && password.equals("password")) {
            User currentUser = new User(username, password, "John Doe", "john.doe@example.com");
            System.out.println("Login successful. Welcome, " + currentUser.getName() + "!");
            
            // Quiz functionality
            Quiz quiz = new Quiz();
            quiz.displayQuestions();

            // Display score
            System.out.println("Your score is: " + quiz.getScore());

            // Update profile and password
            System.out.println("Do you want to update your profile? (yes/no)");
            String updateProfileChoice = scanner.nextLine();
            if (updateProfileChoice.equalsIgnoreCase("yes")) {
                System.out.println("Enter new name:");
                newName = scanner.nextLine();
                System.out.println("Enter new email:");
                newEmail = scanner.nextLine();
                currentUser.updateProfile(newName, newEmail);
            }

            System.out.println("Do you want to change your password? (yes/no)");
            String changePasswordChoice = scanner.nextLine();
            if (changePasswordChoice.equalsIgnoreCase("yes")) {
                System.out.println("Enter new password:");
                newPassword = scanner.nextLine();
                currentUser.changePassword(newPassword);
            }

            // Logout
            System.out.println("Logout successful.");
            quiz.closeQuiz();
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }

        scanner.close();
    }
}
