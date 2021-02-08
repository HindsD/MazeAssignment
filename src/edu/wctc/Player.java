package edu.wctc;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int score;
    private List<String> inventory;

    public Player(){
        score = 0;
        inventory = new ArrayList<>();
    }

    public void addToInventory(String item){
        inventory.add(item);
    }

    public void addToScore(int points){
        score +=  points;
    }

    public String getInventory(){
        if(inventory.isEmpty())
            return "You have no items in your inventory";
        else {
            StringBuilder sb = new StringBuilder();
            sb.append("You have collected:\n");
            return inventory.toString();
        }
    }

    public int getScore(){
        score += getScore();
        return score;

    }







}
