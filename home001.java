package home001;
import java.util.Scanner;

public class home001 {
    public static void main(String[] args) {
        // 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        Scanner newScan = new Scanner(System.in);   
        System.out.printf("enter N: ");
        int n = newScan.nextInt();
        newScan.close();
        int step1 = 0;
		for (int i = 1; i <= n; i ++){
			step1 = step1 + i;
		}
        System.out.printf("n-sum = %d\n", step1);
        int step2 = 1;
		for (int i = 1; i <= n; i ++){
			step2 = step2 * i;
		}
        System.out.printf("n! = %d \n", step2);

        // 2. Вывести все простые числа от 1 до 1000
       /* 
        def eratosphen(array, num):       #решето Эратосфена
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
        // Решето Эратосфена
        // for (int i = 0; i <= 1000; i++) {
        //     for (int j = 0; j < args.length; j++) {
                
        //     }
        // }
        
        //3. Реализовать простой калькулятор

        Scanner calcScan = new Scanner(System.in);
        System.out.println("1 for addition \n 2 for subtraction \n 3 for multiplication \n 4 for division");
        System.out.printf("choose operation: ");
        int oper = calcScan.nextInt();
        System.out.printf("enter first number: ");
        Double firstnum = calcScan.nextDouble();
        System.out.printf("enter second number: ");
        Double secnum = calcScan.nextDouble();
        calcScan.close();
        Double res = 0.0;
        if (oper == 1) {
            res = firstnum + secnum;
            System.out.printf("%.0f + %.0f = %.0f", firstnum, secnum, res);
        }
        if (oper == 2) {
            res = firstnum - secnum;
            System.out.printf("%.0f - %.0f = %.0f", firstnum, secnum, res);
        }
        if (oper == 3) {
            res = firstnum * secnum;
            System.out.printf("%.0f * %.0f = %.0f", firstnum, secnum, res);
        }
        if (oper == 4) {
            res = firstnum / secnum;
            System.out.printf("%.0f / %.0f = %.2f", firstnum, secnum, res);
        }
        
		
        // 4. *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
        // могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется
        // восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.


    }
}
