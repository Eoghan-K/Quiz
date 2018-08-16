/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.io.Serializable;
import java.util.Comparator;

/**
 *
 * @author Eoghan Kenny
 */
public class Player implements Serializable{
    private static final long serialVersionUID = 45287554L;
    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    public static Comparator<Player> pComparator = new Comparator<Player>() {
        @Override
        public int compare(Player o1, Player o2) {
            int score1 = o1.getScore();
            int score2 = o2.getScore();

            return score2 - score1;
        }
    };
}
