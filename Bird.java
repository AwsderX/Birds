import java.awt.*;
import java.util.Calendar;
import java.util.Random;

public abstract class Bird {
    public int c;
    public int d;
    protected int x = 50;
    protected int y = 50;
    protected int size = 10;
    protected Color color = Color.black;
    private static int p = 0;
    public Bird(){
        System.out.println("Я птица");
        vremia();

        //p++;
        //System.out.println(p);
    }


        //public static void fly(){
        public void fly () {
        System.out.println("Я лечу!");

    }
    public void draw(Graphics g){
        int min = c;
        int max = d;
        int diff = max - min;
        Random random = new Random();
        int x = random.nextInt(diff + 1);
        x = x + min;
        int min1 = c;
        int max1 = d;
        int diff1 = max - min;
        Random random1 = new Random();
        int y = random1.nextInt(diff1 + 1);
        y = y + min1;
        g.setColor(color);
        g.fillOval(x,y,size,size);

    }



    public void vremia(){
        Calendar time1 = Calendar.getInstance();
        long t = time1.get(Calendar.HOUR_OF_DAY);
        if (23 <= t && t < 6){
            System.out.println("НОЧЬ");
        }
        if (6 <= t && t < 12){
            System.out.println("УТРО");
        }
        if (12 <= t && t < 18) {
            System.out.println("ДЕНЬ");
        }
        if (18 <= t && t < 23){
            System.out.println("ВЕЧЕР");
        }
    }

}


