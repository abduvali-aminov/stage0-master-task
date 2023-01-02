package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {

        for (int i=0; i<cathetusLength; i++){
            for (int j=1; j<=cathetusLength + i; j++){
                if (Math.abs(j - cathetusLength) <= i)
                    System.out.print(Math.abs(j - cathetusLength) + 1);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
