/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.ArrayList;

/**
 *
 * @author Eoghan Kenny
 */
public class Question {
    
    private static ArrayList<String[]> list;
    
    public Question(){
        list = new ArrayList(){{
            add(new String[] {"1","1"});
            add(new String[] {"2","2"});
            add(new String[] {"3","3"});
            add(new String[] {"4","4"});
            add(new String[] {"5","5"});
            add(new String[] {"6","6"});
            add(new String[] {"7","7"});
            add(new String[] {"8","8"});
            add(new String[] {"9","9"});
            add(new String[] {"10","10"});
        }};
    }

    public static ArrayList<String[]> getList() {
        new Question();
        return list;
    }
}
