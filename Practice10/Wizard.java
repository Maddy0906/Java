package Java.Practice10;

/**
 * Created by madoka on 2017/04/30.
 */
public class Wizard {
    private int hp;
    private  int mp;
    private  String name;
    Wand wand;

    public void heal(Hero h){
        int basePoint = 10;
        int recovPoint = (int)(basePoint*this.getWand().getPowar());
        h.setHp(h.getHp()+recovPoint);
        System.out.println(h.getName()+"HPを"+recovPoint+"回復した");
    }



    public void getHp(){
        return this.hp;
    }

    public void setHp(int hp){
       if (hp <0){
           this.hp = 0;
       }else {
           this.hp = hp;
       }
    }

    public int getMp(){
        return this.mp;
    }
    public void setMp(int mp){
        if (mp <0){
            throw new IllegalAccessException("設定されようとしているMPが異常です")
        }
        this.mp = mp;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        if (name == null || name.length() < 3){
            throw  new  IllegalAccessException(
                    ("名前がnull。処理を中断");
        }
        this.name = name;
    }

    public Wand getWand(){
        return  this.wand;
    }
    public void setWand(Wand wand){
     if (wand == null){
         throw new IllegalAccessException("設定されようとしている杖がnullです")
     }
     this.wand = wand;
    }

    void  heal(Hero h){
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.wand.power);
        h.setHp(h.getHp()+recovPoint);
        System.out.println(h.getName()+"のHPを"+recovPoint+"回復した!");
    }
}
