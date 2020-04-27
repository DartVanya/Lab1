package Lab;

import java.util.Random;
import java.util.Vector;

public class ControlPanel {
    String colors[] = {"�", "�", "�", "�", "�", "�", "�"};
    item items[][];
    int N, M;
    
    Vector<Point> Lamp_arr = new Vector<Point>();
    Vector<Point> Butt_arr = new Vector<Point>();
    Vector<Vector<Integer>> but_to_lamp;

    // ����������� ������
    public ControlPanel (int n, int m) {
    	N = n; M = m;
        int pos;
        items = new item[N][M];
        
        // ���������� ������, �������� ������ ��� �����
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                pos = rand.nextInt(2);
                if (pos == 1) {
                	pos = rand.nextInt(colors.length);
                	items[i][j] = new item(false, colors[pos]);
                }
                else {
                	items[i][j] = new item(true);
                }
            }
        }
        
        // �������� ������ � ����� � ������
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
            	if (items[i][j].get_type())
            		Butt_arr.add(new Point(i, j));
            	else
            		Lamp_arr.add(new Point(i, j));
            }
        }
        
        // ��������� ���������� ��� ��������� ����
        int l_cnt = Lamp_arr.size();
        int b_cnt = Butt_arr.size();
        
        but_to_lamp = new Vector<Vector<Integer>>(l_cnt);
        
        // ����������� ��������� ����� ���� � ������ ������, ������� �������
        for (int i = 0; i < b_cnt; i++) {
        	
        	but_to_lamp.add(i, new Vector<Integer>());
        	pos = rand.nextInt(l_cnt); // ��������� ����� ����
            for (int r = 0; r < pos; r++) { // ��������� ������� ����
            	but_to_lamp.get(i).add(rand.nextInt(l_cnt));
            }
        }

    }
    
    // ����� ������ �� �����
    void print() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
            	items[i][j].print();
            	if(j < M - 1)
            		System.out.print(" - ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // ��������� ������� �� ������� �� ����������� 
    int get_index(Vector<Point> vec, int x, int y) {
    	  for (int i = 0; i < vec.size(); i++) {
    		  Point temp = vec.get(i);
    		  if(temp.x == x && temp.y == y)
    			  return i;
    	  }
    	  return -1;
    }
    
    // ����� ������� ������
    void PressButton(int X, int Y) {
    	// �������� ������ ������ �� �����������
    	int res = this.get_index(Butt_arr, X, Y);
    	if(res == -1) {
    		 System.out.println("������! ��� �� ������! ������� ������!");
    		 return;
    	}
    	
    	int index;
    	for (int i = 0; i < but_to_lamp.get(res).size(); i++) { // ���������� ������� ����, �����������
    		// � ���� ������
    		index = but_to_lamp.get(res).get(i); // ��������� �������� ������� ���� �� �������
    		items[Lamp_arr.get(index).x][Lamp_arr.get(index).y].swith(); // ��������
    	}
    	items[X][Y].swith();
    		
    }
}