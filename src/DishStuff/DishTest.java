package DishStuff;

import DishStuff.Dish;

public class DishTest {
    public static void main(String[] args) {



        Dish dish0 = new Dish();

        Dish dish1 = new Dish(20000, "wings", false);

        Dish dish2 = new Dish(400, "PEEza", true);

        Dish dish3 = new Dish(700, "ice Cream", true);


        System.out.println(dish3.printSummary());
        dish1.setName("wongs");
        System.out.println(DishTools.shoutDishName(dish1));
        System.out.println(DishTools.shoutDishName(dish2));
        System.out.println(DishTools.analyzeDishCost(dish1));
        System.out.println(DishTools.analyzeDishCost(dish2));
        System.out.println(DishTools.flipRec(dish1));
    }




}



