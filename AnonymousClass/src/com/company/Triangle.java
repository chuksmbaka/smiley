package com.company;
import static java.lang.Math.*;

public class Triangle {
    double base, adjacent, angle;
    double hypotenus;

    public Triangle(){
        base = adjacent = angle = 0;
    }
    public Triangle( double base, double adjacent, double angle){
        this.base = base;
        this.adjacent = adjacent;
        this.angle = angle;
    }
}
