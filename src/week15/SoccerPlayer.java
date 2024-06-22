package week15;

public class SoccerPlayer implements Player {
    private String name;
    private int age;
    private String position;
    private String nationality;
    private String currentTeam;

    public SoccerPlayer(String name, int age, String position, String nationality, String currentTeam) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.nationality = nationality;
        this.currentTeam = currentTeam;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public String getNationality() {
        return nationality;
    }

    public String getCurrentTeam() {
        return currentTeam;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Position: " + position +
                ", Nationality: " + nationality + ", Current Team: " + currentTeam);
    }

    public String toString() {
        return name + "," + age + "," + position + "," + nationality + "," + currentTeam;
    }

    public static SoccerPlayer fromString(String str) {
        String[] parts = str.split(",");
        if (parts.length != 5) {
            throw new IllegalArgumentException("Invalid player data: " + str);
        }
        try {
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);
            String position = parts[2];
            String nationality = parts[3];
            String currentTeam = parts[4];
            return new SoccerPlayer(name, age, position, nationality, currentTeam);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid player data: " + str, e);
        }
    }
}
