import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bowl {
    private List<Fruit> fruits;
    private Shapeofbowl shape;

    public Bowl(){
        fruits= new ArrayList<>();
    }

    public void addfruit(Fruit fruit){
        fruits.add(fruit);


    }
    public Bowl getAllApplesBowl(){
        Bowl bowlOfApples=new Bowl();
        for (Fruit fruit:fruits){
            if(fruit instanceof Apple){
                bowlOfApples.addfruit(fruit);
            }
        }
        return bowlOfApples;


    }
    public Bowl getAllOrangeBowl(){
        Bowl bowlOfOranges=new Bowl();
        for (Fruit fruit:fruits){
            if(fruit instanceof Orange){
                bowlOfOranges.addfruit(fruit);
            }
        }
        return bowlOfOranges;

    }
    public Bowl getAllBananasBowl(){
        Bowl bowlOfBananas=new Bowl();
        for (Fruit fruit:fruits){
            if(fruit instanceof Banana){
                bowlOfBananas.addfruit(fruit);
            }
        }
        return bowlOfBananas;

    }

    public int getCount() {
        return fruits.size();
    }
}
