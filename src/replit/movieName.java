package replit;

public class movieName {
    public static void main(String[] args) {

        String movieName = "spider-men";
        String releaseDate = "12/17/2021";
        String genre = "Action/Adventure";
        String rating = "PG-13";
        int rottenTomatoesRating = 97;
        double duration = 2.5;
        boolean isSequel = true;
        boolean isOnDvd = false;
        System.out.println("------ Welcome to the Cinema ------");
        System.out.println("Tonight we are streaming " + movieName + " which was released on " + releaseDate + ".");
        System.out.println("This " + genre + " movie got a " + rottenTomatoesRating + " rating on Rotten Tomatoes.");
        System.out.println("The rating is " + rating  + " and it runs for " + duration + " hours.");
        System.out.println("This is a sequel " + isSequel + " and is on dvd " + isOnDvd + ".");

    }
}
