import java.awt.*;

public class Macaw extends Bird{
    public String name = "Кеша";
    private static int num = 0;
    public Macaw(){
        System.out.println("Я попугай");
        color = Color.green;
        System.out.println("Я пингвин");
        size = 5;


        //num++;
        //System.out.println(num);
    }
    public Macaw(String name){
        this.name = name;
        //num++;
        //System.out.println(num);
    }

    public void speak(){
        System.out.println("Меня зовут " + this.name + "!");
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void dialog(Macaw name){
        System.out.println("Привет " + name.getName());
    }
    //public void answer(Macaw name){
     //   System.out.println("Привет " + name.getName());
    //}

    public void dialog(Penguin n){
        System.out.println("Ты глупенький ");
    }

}
