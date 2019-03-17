package com.dimedrol;

import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        RecipeNumber r;
        for (int i = 1000; i < 1200; i++)
        {
            r = new RecipeNumber(i);
            System.out.println(i + " " + r.recipe);
        }
    }
}
