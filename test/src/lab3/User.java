package lab3;

import java.util.Scanner;

public class User {

    Scanner scanner;

    public void action_1(ImageInterface image, String name, int x, int y) {
        System.out.println("action_1() "+this);
        image.getColor(name, x, y);
    }
    public void action_2(Proxy image, String name,int x, int y){
        System.out.println("action_2()"+this);
        image.getColor(name,x,y);
        image.getImage(1,name);
        image.getImage(0,name);
    }
}
