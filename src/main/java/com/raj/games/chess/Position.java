package com.raj.games.chess;

import static java.lang.Math.*;

public class Position {

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isValid() {
        return isValid(x) && isValid(y);
    }

    private boolean isValid(int position) {
        return position > 8 || position < 1;
    }

    public double findDistance(Position destination){
        return sqrt(pow(x - destination.getX(), 2)+ pow(y - destination.getY(), 2));
    }

    public int findSlope(Position destination){

        return (y-destination.y)/ (x-destination.x);
    }




}
