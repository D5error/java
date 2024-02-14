public class Main {
    public static void main(String[] args) {
        Movie[] movies = new Movie[4];
        movies[0] = new Movie(1, "name1", 1, 1, "director1", "actor1", "info1");
        movies[1] = new Movie(2, "name2", 2, 2, "director2", "actor2", "info2");
        movies[2] = new Movie(3, "name3", 3, 3, "director3", "actor3", "info3");
        movies[3] = new Movie(4, "name4", 4, 4, "director4:", "actor4", "info4");

        MovieOperator operator = new MovieOperator(movies);
        operator.printAllMovies();
        operator.serachMovieById(1);
        operator.serachMovieById(2);
        operator.serachMovieById(3);
        operator.serachMovieById(4);
        operator.serachMovieById(5);
    }
}