/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Eoghan Kenny
 */
public class FileIO {

    private final File file;
    private ArrayList<Player> scores;

    public FileIO() {
        file = new File("scores.dat");
        scores = new ArrayList<>();
    }

    public void saveScores(String name, int score) {
        readScores();
        this.scores.add(new Player(name, score));

        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(scores);
            out.close();
        } catch (IOException e) {
            System.out.println(e);
        } finally {

        }
    }

    public ArrayList<Player> readScores() {
        if (file.exists()) {
            try {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                scores = (ArrayList<Player>) ois.readObject();
                ois.close();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println(e);
            }
        }

        return scores;
    }
}
