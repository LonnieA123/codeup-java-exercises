package movies;

import util.Input;

import java.util.Scanner;

public class selectMovie {

    public static void selectMovies(){
        Input newInput = new Input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("what would you like to do?");
        System.out.println(
                "0 - exit \n" +
                        "1 - view all movies\n" +
                        "2 - view movies in the animated category\n" +
                        "3 - view movies in the drama category\n" +
                        "4 - view movies in the horror category\n" +
                        "5 - view movies in the scifi category");

        String response = scanner.nextLine();


        if (response.equals("0")){
            System.out.println("Goodbye");
        }else if (response.equals("1")){

            System.out.printf("Your Choice %s %n",response);
            for (Movie movie : MoviesArray.findAll()){
                System.out.println(movie.getName() + " " + movie.getCategory());
            }

        }else if (response.equals("2")){
            System.out.printf("Your Choice %s %n",response);
            for(Movie movie : MoviesArray.findAll()){
                if(movie.getCategory().equals("animated")){
                    System.out.println(movie.getName() + " " + movie.getCategory());
                }
            }

        }else if (response.equals("3")){
            System.out.printf("Your Choice %s %n",response);
            for(Movie movie : MoviesArray.findAll()){
                if(movie.getCategory().equals("drama")){
                    System.out.println(movie.getName() + " " + movie.getCategory());
                }
            }
        }else if (response.equals("4")){
            System.out.printf("Your Choice %s %n",response);
            for(Movie movie : MoviesArray.findAll()){
                if(movie.getCategory().equals("horror")){
                    System.out.println(movie.getName() + " " + movie.getCategory());
                }
            }
        }else if (response.equals("5")){
            System.out.printf("Your Choice %s %n",response);
            for(Movie movie : MoviesArray.findAll()){
                if(movie.getCategory().equals("scifi")){
                    System.out.println(movie.getName() + " " + movie.getCategory());
                }
            }

        }

        System.out.println("/n would you like to continue?");
        String cont = scanner.nextLine();

        if (cont.startsWith("y")){
            selectMovies();
        }else {
            System.out.println("goodbye");
        }
    }
}
