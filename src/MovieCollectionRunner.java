import java.util.ArrayList;

public class MovieCollectionRunner
{
    public static void main(String args[])
    {
        MovieCollection myCollection = new MovieCollection("src/movie_data.txt");
        //myCollection.menu();
        System.out.println("Kevin Bacon Degree is: " + myCollection.kevinBaconCount("Emma Stone"));
    }
}