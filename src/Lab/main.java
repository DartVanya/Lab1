package Lab;

import java.util.Scanner;

public class main {

    public static void main (String[] args) {
        int N, M, x, y;
        Scanner in = new Scanner(System.in);
        System.out.println("������� ��������� ������: ");
        N = in.nextInt();
        M = in.nextInt();
        ControlPanel panel = new ControlPanel(N, M);
        System.out.println("������������� ������ ����������.");
        panel.print();
        
        while(true) {
        	 System.out.println("������� ������: __ (-1 - �����)");
        	 x = in.nextInt();
             if (x == -1) break;
             y = in.nextInt();
             if (y == -1) break;
             panel.PressButton(x, y);
             panel.print();
             
        }
        System.out.println("���������� ������ ���������...");  
        System.exit(0);
    }
}


