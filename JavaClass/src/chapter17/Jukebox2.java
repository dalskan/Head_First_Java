package chapter17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Jukebox2 {
    ArrayList<String> songList = new ArrayList<String>();

    public static void main(String[] args) {
        new Jukebox2().go();
    }

    public void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }

    void getSongs() {
        try {
            File file = new File("C:\\Users\\sa\\IdeaProjects\\JavaClass\\src\\chapter17\\SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception ex) { ex.printStackTrace(); }
    }

    void addSong(String lineToParse) {
        String[]tokens = lineToParse.split("/");
        songList.add(tokens[0]);
    }
}
