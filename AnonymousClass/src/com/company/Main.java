package com.company;

public class Main {

    public static void main(String[] args) {
	// Using anonymous class to implement interfaces
        Triangle triangle1 = new Triangle(20, 40, 30);
        Triangle triangle2 = new Triangle(120, -40, 30);

        //triangle1 definition of check()
        Checkable checkableObject1 = new Checkable() {
            @Override
            public boolean check() {
                if(triangle1.base > 0 && triangle1.adjacent > 0) return true;
                else
                    return false;
            }
        };
        System.out.println(checkValidity(checkableObject1));

        //triangle2
        System.out.println(checkValidity(new Checkable() {
            @Override
            public boolean check() {
                if(triangle2.base > 0 && triangle2.adjacent > 0) return true;
                else
                    return false;
            };
        }));

    }

    public static String checkValidity(Checkable object){
        if(object.check() == true) return "valid";
        else
            return "invalid";
    }
}
