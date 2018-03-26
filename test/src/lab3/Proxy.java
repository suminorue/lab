package lab3;

import java.awt.*;
import java.util.HashMap;

public class Proxy implements ImageInterface {

    protected HashMap<String,Color> colorHashMap =new HashMap<String, Color>();
    private HashMap<String,ConcreteImage> compressedHashMap =new HashMap<String, ConcreteImage>();

    Proxy() {
        System.out.println("Proxy() "+this);
    }

    @Override
    public Color getColor(String name, int x, int y) {
        System.out.println("getColor() "+this);
        if(colorHashMap.containsKey(name)) {
            return colorHashMap.get(name);
        }
        ConcreteImage image =new ConcreteImage(name);
        colorHashMap.put(name,image.getColor(name, x, y));
        compressedHashMap.put(name,image);
        return colorHashMap.get(name);
    }

    public void getImage(int x, String name) {
        System.out.println("getImage"+this);
        if(x==0) {
            System.out.println("get compressed");
        }
        else{
            compressedHashMap.get(name).getImage();
        }
    }
}
