package ArrayList.Movie;

public class Movie {
    private String name;
    private String hours;

    public Movie (String name, String hours) {
        this.name = name;
        this.hours = hours;
    }

    public static Movie createMovie (String name, String hours) {
        return new Movie(name, hours);
    }

    public String getName () {
        return name;
    }

    public String getHours () {
        return hours;
    }


}
