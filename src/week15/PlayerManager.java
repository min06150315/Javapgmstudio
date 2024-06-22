package week15;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PlayerManager {
    private List<SoccerPlayer> players;
    private String filename;

    public PlayerManager(String filename) {
        this.filename = filename;
        this.players = new ArrayList<>();
        loadFromFile();
    }

    public List<SoccerPlayer> getPlayers() {
        return players;
    }

    public void createPlayer(SoccerPlayer player) {
        players.add(player);
    }

    public void readPlayers() {
        for (SoccerPlayer player : players) {
            player.display();
        }
    }

    public void updatePlayer(int index, SoccerPlayer newPlayer) {
        if (index >= 0 && index < players.size()) {
            players.set(index, newPlayer);
        } else {
            System.out.println("Invalid player index.");
        }
    }

    public void deletePlayer(int index) {
        if (index >= 0 && index < players.size()) {
            players.remove(index);
        } else {
            System.out.println("Invalid player index.");
        }
    }

    public void searchPlayer(String name) {
        for (SoccerPlayer player : players) {
            if (player.getName().equalsIgnoreCase(name)) {
                player.display();
                return;
            }
        }
        System.out.println("Player not found.");
    }

    public void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (SoccerPlayer player : players) {
                writer.write(player.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving to file: " + e.getMessage());
        }
    }

    public void loadFromFile() {
        File file = new File(filename);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Error creating new file: " + e.getMessage());
                return;
            }
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                players.add(SoccerPlayer.fromString(line));
            }
        } catch (IOException e) {
            System.out.println("Error loading from file: " + e.getMessage());
        }
    }
}
