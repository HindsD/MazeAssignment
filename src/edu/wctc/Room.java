package edu.wctc;

public class Room {
    String room;
    String description;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private Room up;
    private Room down;


    public Room(String){


    }


    public Room getAdjoiningRoom(char direction){
        if (direction == 'U'){
            return up;
        }
        if (direction == 'D'){
            return down;
        }
        if (direction == 'N'){
            return north;
        }
        if (direction == 'S'){
            return south;
        }
        if (direction == 'E'){
            return east;
        }
        if (direction == 'W'){
            return west;
        }
        return null;

    }

    //public String getDescription(){

    //}

    public String getExits(){
        String exit = "";
        if (north != null){
            exit = exit + "north";
        }
        if (south != null){
            exit = exit + "south";
        }
        if (west != null){
            exit = exit + "west";
        }
        if (east != null){
            exit = exit + "east";
        }
        if (up != null){
            exit = exit + "up";
        }
        if (down != null){
            exit = exit + "down";
        }
        return exit;

    }

    public String getName(){
        return room;
    }

    public boolean isValidDirection(char direction) {
        if (direction == 'D') {
            if (down != null) {
                return true;
            }
            return false;
        } else if (direction == 'U') {
            if (up != null) {
                return true;
            }
            return false;
        } else if (direction == 'E') {
            if (east != null) {
                return true;
            }
            return false;
        }
        else if (direction == 'N'){
            if(north != null){
                return true;
            }
            return false;
        }
        else if (direction == 'S'){
            if(south != null){
                return true;
            }
            return false;
        }
        else if (direction == 'W'){
            if(west != null){
                return true;
            }
            return false;
        }
        return false;
    }

    public void setDown(Room D){
        down = D;
    }

    public void setUp(Room U){
        up = U;
    }

    public void setEast(Room E){
        east = E;
    }

    public void setNorth(Room N){
        north = N;
    }

    public void setSouth(Room S){
        south = S;
    }

    public void setWest(Room W){
        west = W;
    }














}
