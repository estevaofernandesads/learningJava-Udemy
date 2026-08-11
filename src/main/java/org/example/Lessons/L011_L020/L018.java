package org.example.Lessons.L011_L020;

import java.util.Locale;
import java.util.Scanner;

public class L018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int caso;
        String original = "abcd FGHIJ ABC abc DEFG     ";

        System.out.println(original);

        System.out.println("Informe o codigo desejado para realizar a mudança no texto original: ");
        caso = sc.nextInt();

        while (caso != 10){

            switch (caso){
                case 1:
                    String lowerCase = original.toLowerCase();  // CHANG THE STRING TO LOWER CASE
                    System.out.println(lowerCase);
                    break;
                case 2:
                    String upperCase = original.toUpperCase(); // CHANG THE STRING TO UPPER CASE
                    System.out.println(upperCase);
                    break;
                case 3:
                    String trim = original.trim();   // REMOVE FIRST AND LAST SPACE IN THE STRING
                    System.out.println(trim);
                    break;
                case 4:
                    String substring = original.substring(2); // CUT THE STRING TO AFTER INDEX NUMBER
                    System.out.println(substring);
                    break;
                case 5:
                    String substring2 = original.substring(2,9);   // CUT WITH THE START INDEX AND ENDING
                    System.out.println(substring2);
                    break;
                case 6:
                    String replace = original.replace('a', 'x'); // REPLACE THE OLD CHARACTER FOR A NEW CHARACTER
                    System.out.println(replace);
                    break;
                case 7:
                    int indexOf = original.indexOf("bc"); // RETURN A NUMBER OF FIRST INDEX ELEMENT
                    System.out.println(indexOf);
                    break;
                case 8:
                    int lastIndex = original.lastIndexOf("bc"); // RETURN A NUMBER OF LAST INDEX ELEMENT
                    System.out.println(lastIndex);
                    break;
                case 9:
                    String[] split = original.split(" ");
                    System.out.println(split[0]);
                    System.out.println(split[1]);
                    System.out.println(split[2]);
                    System.out.println(split[3]);
                    System.out.println(split[4]);
                    break;
                default:
                    System.out.println("Valor invalido!");
                    break;
            }
            System.out.println("Informe o novo caso: ");
            caso = sc.nextInt();

        }
            System.out.println("Fim!");

            sc.close();
    }
}
