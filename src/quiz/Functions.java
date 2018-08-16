/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Eoghan Kenny
 */
public class Functions {

    Player player;
    
    public Functions() {
    }
    
    public void saveScore(String name, int score, ArrayList<Player> scores){
        player = new Player(name, score);
        scores.add(player);
        File f;
        FileOutputStream fout;
        ObjectOutputStream out;
        
        try {
            f = new File("scores.dat");
            fout = new FileOutputStream(f);
            out = new ObjectOutputStream(fout);
            out.writeObject(scores);
            out.close();
        } catch ( Exception e) {
            System.out.println(e);
        }
    }
    
    public ArrayList<Player> readFile(ArrayList<Player> scores){
        File f;
        FileInputStream fin;
        ObjectInputStream oin;
        try {
            f = new File("scores.dat");
            fin = new FileInputStream(f);
            oin = new ObjectInputStream(fin);
            scores = (ArrayList<Player>)oin.readObject();
            oin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return scores;
    }
}
