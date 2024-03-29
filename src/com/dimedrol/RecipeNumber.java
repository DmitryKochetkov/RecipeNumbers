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
        int n = 0;
        String s = "";

        do {
            int buf = num % 1000;
            digit0 = buf % 10;
            digit1 = buf / 10 % 10;
            digit2 = buf / 100;

            if (digit2 > 0)
                s += num2_masc[digit2 - 1];

            if (digit1 == 1 && digit0 == 0)
                s += " " + num1[digit1 - 1];

            if (digit1 == 1 && digit0 > 0)
                if (digit0 > 1)
                    if (digit0 > 3)
                        s += " " + num0_fem[digit0 - 1].substring(0, num0_fem[digit0 - 1].length() - 1) + "надцать";
                    else s += " " + num0_fem[digit0 - 1] + "надцать";
                else if (n != 1)
                    s += " " + num0_masc[digit0 - 1] + "надцать";
                else s += " " + num0_fem[digit0 - 1];
            else {
                if (digit1 > 1)
                    s += " " + num1[digit1 - 1];
                if (digit0 > 0)
                    if (n != 1)
                    s += " " + num0_masc[digit0 - 1];
                    else s += " " + num0_fem[digit0 - 1];

            }
            num /= 1000;
            if (n >= 1)
                s += " " + degree[n - 1];
            recipe = s.concat(" " + recipe);
            n++;
            s = "";
        } while (num > 0);

        }
    }
