import org.testng.Assert;
import org.testng.annotations.Test;
public class Shapeofbowl {
    @Test
    public void shouldSegregateApples() {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();



        Bowl mixedFruitBowl = new Bowl();
        mixedFruitBowl.addfruit(apple1);
        mixedFruitBowl.addfruit(apple1);



        Bowl bowlofApples = mixedFruitBowl.getAllApplesBowl();

        Assert.assertEquals(bowlofApples.getCount(), 2);
    }

        @Test
        public void shouldSegregateOranges(){
            Orange orange1=new Orange();
            Orange orange2=new Orange();
            Bowl mixedFruitBowl = new Bowl();
            mixedFruitBowl.addfruit(orange1);
            mixedFruitBowl.addfruit(orange2);
            Bowl bowlofOranges=mixedFruitBowl.getAllOrangeBowl();

            Assert.assertEquals(bowlofOranges.getCount(),2);
        }

    @Test
    public void shouldSegregateBananas(){
        Bowl mixedFruitBowl = new Bowl();
        Banana banana1 = new Banana();
        Banana banana2 = new Banana();
        mixedFruitBowl.addfruit(banana1);
        mixedFruitBowl.addfruit(banana2);


        Bowl bowlofBananas=mixedFruitBowl.getAllBananasBowl();

        Assert.assertEquals(bowlofBananas.getCount(),2);
    }
}
