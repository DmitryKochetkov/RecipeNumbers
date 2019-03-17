package com.dimedrol;

import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        RecipeNumber r = new RecipeNumber(x);
        System.out.print(r.recipe);
    }
}
