package ArrayList.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieList {
    List<Movie> movieList;
    private String myMovie;

    public MovieList (String myMovie) {
        this.myMovie = myMovie;
        this.movieList = new ArrayList<>();
    }

    public int findMovie (Movie movie) {
        return this.movieList.indexOf(movie);
    }

    private int findMovies (String movieName) {
        for (int i = 0; i <  this.movieList.size(); i++) {
            Movie movie = this.movieList.get(i);
            if (movie.getName().equals(movieName)) {
                return i;
            }
        }
        return -1;
    }

    public boolean AddMovie (Movie movie) {
        if (findMovies(movie.getName()) >= 0) {
            System.out.println("Movie is already on file");
            return false;
        }
        movieList.add(movie);
        return true;
    }

    public boolean UpdateMovie (Movie oldMovie, Movie newMovie) {
        int foundPosition = findMovie(oldMovie);
        if (foundPosition < 0) {
            System.out.println(oldMovie.getName());
            return false;
        }
        this.movieList.set(foundPosition, newMovie);
        System.out.println(oldMovie.getName() + "  " + newMovie.getName());
        return true;
    }

    public boolean DeleteMovie (Movie movie) {
        int foundPosition = findMovie(movie);
        if (foundPosition < 0) {
            System.out.println(movie.getName());
            return false;
        }
        this.movieList.remove(foundPosition);
        System.out.println(movie.getName() + "  ");
        return true;
    }

    public Movie queryMovie (String name) {
        int position = findMovies(name);
        if (position >= 0) {
            return this.movieList.get(position);
        }
        return null;
    }

    public void printMovie () {
        for (int i = 0; i < movieList.size(); i++) {
            System.out.println((i + 1) + "." + this.movieList.get(i).getName() + "  Hours : " + this.movieList.get(i).getHours() );
        }
    }

    public void SortMovie () {
        Collections.sort(movieList, Comparator.comparing(Movie :: getName));
        for (int i = 0; i < movieList.size(); i++) {
            System.out.println((i + 1) + "." + this.movieList.get(i).getName() + "  Hours : " + this.movieList.get(i).getHours() );
        }
    }

}
