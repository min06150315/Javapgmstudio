package week15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlayerManager manager = new PlayerManager("./src/week15/players.txt");
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.print("\n1. Create Player 2. Read Players 3. Update Player 4. Delete Player 5. Search Player 6. Save and Quit >  ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();

                System.out.print("Enter age: ");
                int age = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter position: ");
                String position = scanner.nextLine();

                System.out.print("Enter nationality: ");
                String nationality = scanner.nextLine();

                System.out.print("Enter current team: ");
                String currentTeam = scanner.nextLine();

                manager.createPlayer(new SoccerPlayer(name, age, position, nationality, currentTeam));
            } else if (choice == 2) {
                manager.readPlayers();
            } else if (choice == 3) {
                System.out.print("Enter player index to update: ");
                int index = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter new name: ");
                String name = scanner.nextLine();

                System.out.print("Enter new age: ");
                int age = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter new position: ");
                String position = scanner.nextLine();

                System.out.print("Enter new nationality: ");
                String nationality = scanner.nextLine();

                System.out.print("Enter new current team: ");
                String currentTeam = scanner.nextLine();

                manager.updatePlayer(index, new SoccerPlayer(name, age, position, nationality, currentTeam));
            } else if (choice == 4) {
                System.out.print("Enter player index to delete: ");
                int index = scanner.nextInt();

                manager.deletePlayer(index);
            } else if (choice == 5) {
                System.out.print("Enter name to search: ");
                String name = scanner.nextLine();

                manager.searchPlayer(name);
            } else if (choice == 6) {
                manager.saveToFile();
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
