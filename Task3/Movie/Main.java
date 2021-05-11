package ArrayList.Movie;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieList movieList = new MovieList("phien dich vien xinh dep");

        int n = 0;
        while (n < 6) {
            System.out.println("Enter Movie menu :");
            System.out.println("1. Print Movie");
            System.out.println("2. Add Movie");
            System.out.println("3. Delete Movie");
            System.out.println("4. Update Movie");
            System.out.println("5. Sort Movie");
            System.out.println("6. and Movie");

            n = Integer.parseInt(sc.nextLine());

            switch (n) {
                case 1: {
                    movieList.printMovie();
                    break;
                }
                case 2: {
                    System.out.println("Enter name movie add : ");
                    String name = sc.nextLine();
                    System.out.println("Enter hours movie add :");
                    String hours = sc.nextLine();
                    Movie movie = new Movie(name, hours);
                    movieList.AddMovie(movie);
                    System.out.println("Name movie : " + name + ", Hours movie : " + hours);
                    break;
                }
                case 3: {
                    System.out.println("Enter name delete : ");
                    String name = sc.nextLine();
                    Movie movie = movieList.queryMovie(name);
                    if (movie == null) {
                        System.out.println("Movie not in found");
                    }
                    if (movieList.DeleteMovie(movie)) {
                        System.out.println("Movie delete");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Enter name oldMovie update :");
                    String name = sc.nextLine();
                    Movie movie = movieList.queryMovie(name);
                    if (movie == null) {
                        System.out.println("Movie not in found");
                    }
                    System.out.println("Enter name movie update : ");
                    String newName = sc.nextLine();
                    System.out.println("Enter hours movie update : ");
                    String hours = sc.nextLine();

                    Movie newMovie = Movie.createMovie(newName, hours);
                    if (movieList.UpdateMovie(movie, newMovie)) {
                        System.out.println("Movie of is update !!");
                    }
                    break;
                }
                case 5: {
                    movieList.SortMovie();
                    break;
                }
                case 6: {
                    System.out.println("Good buy !!!!");
                    break;
                }
                default:{
                    break;
                }
            }
        }
    }
}
