package com.company;

import com.company.Checkable;

import static java.lang.Math.sin;

public class CheckableTriangle extends Triangle implements Checkable {

    //Override the Triangle constructor
   public CheckableTriangle(double base, double adjacent, double angle){
        super(base, adjacent, angle);
    }

    @Override
    public boolean check(){
        boolean trueValue;

        if (base > 0 && adjacent > 0)
            trueValue = true;
        else
            trueValue = false;
        return trueValue;
    }


    public double getHypotenus(){
       if(this.check() == true)
           hypotenus = adjacent / sin(angle);
       else
           hypotenus = 0;
       return hypotenus;
    }

}
