package com.company;

public class Main {
    public static void main(String[] args){
        boolean triangleExist;
        double hyp;
        CheckableTriangle checkableTriangle = new CheckableTriangle(20, 30, 15);
        CheckableTriangle checkableTriangle2 = new CheckableTriangle(100, 50, 60);

        triangleExist = checkableTriangle.check();
        System.out.println(triangleExist);

        hyp = checkableTriangle.getHypotenus();
        System.out.println("Hypotenuse: " + hyp);

        System.out.println(checkValidity(checkableTriangle));

        //second triangle using anonymouse class of check
        System.out.println(checkableTriangle2.check());

        //creates the anonymous class. we define the interface methods within the anonymous class
        Checkable checkableObject = new Checkable() {
            @Override
            public boolean check() {
                if(checkableTriangle2.hypotenus > 0 && checkableTriangle2.base > 0) return true;
                return false;
            }
        };
    }


    private static String checkValidity(Checkable objects){
        if(objects.check() == true) return "valid";
        else
            return "invalid";

    }
}

