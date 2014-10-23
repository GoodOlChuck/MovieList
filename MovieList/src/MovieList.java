import java.util.ArrayList;
import java.util.Collection;

public class MovieList {
	private Collection<Movie> movies = new ArrayList();
	private int numberOfMovies;

	public int size() {
		return movies.size();
	}

	public void add(Movie aMovie) {
		numberOfMovies++;
		movies.add(aMovie);
	}

	public boolean contains(Movie aMovie) {
		return movies.contains(aMovie);
	}
}