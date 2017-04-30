package Java.Practice10;

/**
 * Created by madoka on 2017/04/30.
 */
public class Wand {
    private String name;
    private double power;

    public void getName(){
        return this.name;
    }
    public void setName(String name){
        if (name == null || name.length() < 3){
            throw new IllegalAccessException("杖に設定されようとしている名前が異常です")
        }
        this.name = name;
    }

    public double getPower{
        return this.power;
    }

    public void setPower(double power){
        if (power<0.5 || power > 100_0){
            throw new  IllegalAccessException("杖に設定されようとしている魔力が異常です")
        }
        this.power = power;
    }
}
