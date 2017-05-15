package Java.Practice12;

/**
 * Created by madoka on 2017/05/10.
 */
public abstract class TangibleAsset extends Asset implements Thing {
    private String color;
    private double weight;

    public TangibleAsset(String name, int price, String color){
        super(name,price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

}
