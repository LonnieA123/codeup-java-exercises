package DishStuff;

import DishStuff.Dish;

class DishTools{

    public static int average = 1300;

    public static String shoutDishName(Dish dish){
        return String.format("THIS IS THE DISH %S",dish.nameOfDish);

    };

    public static String analyzeDishCost(Dish dish){
        if (dish.costInCents > average){
            return String.format("YO THIS IS %.2f EXPENSIve",dish.costInCents);
        }else{
            return String.format("only %.2f?!!? YO this good ;)", dish.costInCents);
        }

    };

    public static boolean flipRec(Dish dish){

        return !dish.wouldRecommend;
    }




}



