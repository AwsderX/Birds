import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Flock {


    ArrayList<Bird> R = new ArrayList<>();
    public Flock() {
        Scanner in = new Scanner(System.in);
        //Flock f1 = new Flock();
        //Flock f2 = new Flock();
            System.out.print("Введите число 0 или 1:\r\n");
            int num = 0;
            while (num == 1 || num == 0 || num == 2) {
                num = in.nextInt();
                if (num == 0) {
                    R.add(new Macaw());
                }
                if (num == 1) {
                    R.add(new Penguin());
                }
                if (num == 2) {
                    R.add(new Vorobey());
                }
            }
        }



    /*public void fly(){
        for(int i = 0; i<R.size(); i++){
            R.get(i).fly();
        }
    }*/

    public void draw (Graphics g) {
        for (int i = 0; i < R.size(); i = i + 1) {
            R.get(i).draw(g);
        }
    }

}
