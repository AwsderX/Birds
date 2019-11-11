import java.awt.*;

public class Penguin extends Bird{

    public Penguin(){
        color = Color.blue;
        System.out.println("Я пингвин");
        size = 15;
    }
    @Override
    public void fly(){
        System.out.println("Я не умею летать!!!");
    }

}
