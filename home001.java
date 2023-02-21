package home001;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Character;

public class home001 {
    public static void main(String[] args) {
        // 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        // Scanner newScan = new Scanner(System.in);   
        // System.out.printf("enter N: ");
        // int n = newScan.nextInt();
        // newScan.close();
        // int step1 = 0;
		// for (int i = 1; i <= n; i ++){
		// 	step1 = step1 + i;
		// }
        // System.out.printf("n-sum = %d\n", step1);
        // int step2 = 1;
		// for (int i = 1; i <= n; i ++){
		// 	step2 = step2 * i;
		// }
        // System.out.printf("n! = %d \n", step2);

        // 2. Вывести все простые числа от 1 до 1000
       /* 
        def eratosphen(array, num):       # мое решето Эратосфена на питоне, а на джаве не смогла
    for i in range(2, num):
        for el in array:
            elem = i**2
            while elem <= num:
                if elem in array:
                    array.remove(elem)
                elem += i
    return array
# prime_nums = eratosphen(list(range(2, N+1)), N)  # простые числа от 2 до N
        */

        
        //3. Реализовать простой калькулятор

        // Scanner calcScan = new Scanner(System.in);
        // System.out.println("1 for addition \n2 for subtraction \n3 for multiplication \n4 for division");
        // System.out.printf("choose operation: ");
        // int oper = calcScan.nextInt();
        // System.out.printf("enter first number: ");
        // Double firstnum = calcScan.nextDouble();
        // System.out.printf("enter second number: ");
        // Double secnum = calcScan.nextDouble();
        // calcScan.close();
        // Double res = 0.0;
    
        // switch (oper) {
        //     case 1:
        //         res = firstnum + secnum;
        //         System.out.printf("%.0f + %.0f = %.0f", firstnum, secnum, res);
        //         break;
        //     case 2:
        //         res = firstnum - secnum;
        //         System.out.printf("%.0f - %.0f = %.0f", firstnum, secnum, res);
        //         break;
        //     case 3:
        //         res = firstnum * secnum;
        //         System.out.printf("%.0f * %.0f = %.0f", firstnum, secnum, res);
        //         break;
        //     case 4:
        //         res = firstnum / secnum;
        //         System.out.printf("%.0f / %.0f = %.2f", firstnum, secnum, res);
        //         break;
        //     default:
        //         System.out.println("mistake");
        //         break;
        // }
        
		
        // 4. *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
        // могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется
        // восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
//не решено
        // String equality = "2? + ?5 = 69";
        // // equality = "?3 + 8? = 97"; // для проверки второго случая 
        // String [] arr = equality.split(" ");
        // // System.out.println(Arrays.toString(arr));
        // String num1string = arr[0];
        // String num2string = arr[2];
        // int sum = Integer.parseInt(arr[4]);

        // char[] num1ch = num1string.toCharArray();
        // char[] num2ch = num2string.toCharArray();
        
        // int ten = 0;
        // int un = 0;
        // if (Character.isDigit(num1ch[0]) & Character.isDigit(num2ch[1])){
        //     ten = Character.digit(num1ch[0], 10);
        //     un = Character.digit(num2ch[1], 10);
        //     System.out.println(ten*10 + un); //25
        // }
        // if (Character.isDigit(num1ch[1]) & Character.isDigit(num2ch[0])) {
        //     un = Character.digit(num1ch[1], 10);
        //     ten = Character.digit(num2ch[0], 10);
        //     System.out.println(ten*10+un); //83
        // }

//         // int b1 = Character.digit(num1ch[0], 10);
//         // int sumnum = 0;
//         // int a1 = 0;
//         // while (sumnum != sum){
//         //     a1 ++;
//         //     sumnum = a1*10 + b1;
//         // }
//         // System.out.println(a1);

    }
}
