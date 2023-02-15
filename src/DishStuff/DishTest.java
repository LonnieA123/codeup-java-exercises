package DishStuff;

import DishStuff.Dish;

public class DishTest {
    public static void main(String[] args) {

        Dish dish1 = new Dish();
        dish1.costInCents = 20000;
        dish1.nameOfDish = "WINGZZZ";
        dish1.wouldRecommend = true;

        Dish dish2 = new Dish();
        dish2.costInCents = 400;
        dish2.nameOfDish = "PEEEZAAAA";
        dish2.wouldRecommend = true;

        Dish dish3 = new Dish();
        dish3.costInCents = 700;
        dish3.nameOfDish = "ice cream";
        dish3.wouldRecommend = true;



        System.out.println(dish3.printSummary());

        System.out.println(DishTools.shoutDishName(dish1));
        System.out.println(DishTools.shoutDishName(dish2));
        System.out.println(DishTools.analyzeDishCost(dish1));
        System.out.println(DishTools.analyzeDishCost(dish2));

        System.out.println(DishTools.flipRec(dish1));
    }


}



