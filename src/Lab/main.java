package Lab;

import java.util.Scanner;

public class main {

    public static void main (String[] args) {
        int N, M, x, y;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите параметры панели: ");
        N = in.nextInt();
        M = in.nextInt();
        if (N < 1 || M < 1) {
            System.out.println("Вы ввели неправильный размер панели! Завершение работы программы...");
            System.exit(-1);
        }
        ControlPanel panel = new ControlPanel(M, N);
        System.out.println("Сгенерирована панель управления.");
        panel.print();
        while(true) {
        	 System.out.println("Нажмите кнопку: __ (-1 - выход)");
        	 x = in.nextInt();
             if (x == -1) break;
             y = in.nextInt();
             if (y == -1) break;
             if (x < 0 || x >= N || y < 0 || y >= M) {
                 System.out.println("Вы ввели неправильные координаты! Введите ещё раз.");
                 continue;
             }
             panel.PressButton( M-1-y, x);
             panel.print();
             
        }
        System.out.println("Завершение работы программы...");  
        System.exit(0);
    }
}


