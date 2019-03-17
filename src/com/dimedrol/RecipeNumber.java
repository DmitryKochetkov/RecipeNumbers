package com.dimedrol;

public class RecipeNumber {
    int num;
    String recipe = "";

    String[] num0_masc = {"один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
    String[] num0_fem = {"одна", "две", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
    String[] num1 = {"десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
    String[] num2_masc = {"сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
    String[] degree = {"тысяча", "миллион"};

    public RecipeNumber(int num) {
        this.num = num;
        int digit0;
        int digit1;
        int digit2;

        for (int i = 0; i < Integer.toString(num).length() / 3; i++) {
            int buf = num % 1000;
            digit0 = buf % 10;
            digit1 = buf / 10 % 10;
            digit2 = buf / 100;

            if (digit2 > 0)
                recipe += num2_masc[digit2 - 1];

            if (digit1 == 1 && digit0 > 0)
                recipe += " " + num0_masc[digit0 - 1] + "надцать";
            else {
                if (digit1 > 1)
                    recipe += " " + num1[digit1 - 1];
                if (digit0 > 0)
                    recipe += " " + num0_masc[digit0 - 1];
                num /= 1000;
            }
        }
    }
}
