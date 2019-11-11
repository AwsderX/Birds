import javax.swing.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.*;
import javax.swing.*;

public class Main {
       public static void main(String[] args) {
           //Bird a = new Bird();
            //a.fly();
            /* Macaw b = new Macaw();
            b.fly();
            Macaw c = new Macaw ("Петя");
            b.speak();
            c.speak();
            c.name = "Клепа";
            c.speak();
            c.setName("Клепа");
            c.speak();
            System.out.println(c.getName());
            c.dialog(b);
            //b.dialog(c);
           // b.answer(c);
            Penguin d = new Penguin();
            d.fly();
            c.dialog(d);

           Macaw m1 = new Macaw("Кеша");
           Macaw m2 = new Macaw("Гоша");
           m1 = m2;
           m2.setName("Боб");
           m1.speak();
           //private String name = "Петя";*/


           /* Bird[] f = new Bird[3];
            f[0] = new Macaw("Чижик");
            f[1] = new Macaw("Пыжик");
            f[2] = new Penguin();
            for (int i= 0; i< f.length; i++) {
                f[i].fly();
            }*/

           /*ArrayList<Bird> f = new ArrayList<>();
            f.add(new Macaw("Чижик"));
            f.add(new Macaw("Пыжик"));
            f.add(new Penguin());
            for(int i = 0; i<f.size(); i++){
                f.get(i).fly();
            }*/

           Flock t = new Flock();
          // t.fly();
           //Bird.fly();


           //Calend();


           /*JFrame w = new JFrame("Awsder");
           w.setSize(400,400);
           w.setVisible(true);
           w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/

           MyFrame w = new MyFrame(t);

       }
    public static void Calend() {
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Calendar.HOUR_OF_DAY, 15);
        calendar2.set(Calendar.MINUTE, 59);
        calendar2.set(Calendar.SECOND, 59);
        long h = calendar2.get(Calendar.HOUR_OF_DAY) - calendar1.get(Calendar.HOUR_OF_DAY);
        long m = calendar1.get(Calendar.MINUTE) - calendar2.get(Calendar.MINUTE);
        long s = calendar1.get(Calendar.SECOND) - calendar2.get(Calendar.SECOND);
        System.out.print (" Часов " + h + " Минут " + (m*(-1)) + " Секунд " + (s*(-1)+1));
    }


}
