import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.JUnit4TestAdapter;;


public class TestMovieListWithOneMovie{
	private MovieList movieList = null;
	private Movie starWars = null;

	@Before
	public void setUp() {
		starWars = new Movie("Star Wars");
		movieList = new MovieList();
		movieList.add(starWars);
	}

	@Test
	public void testSize() {
		assertEquals("Size of one item list should be 1.", 1, movieList.size());
	}

	
	public static junit.framework.Test suite(){
		return new JUnit4TestAdapter(TestMovieListWithOneMovie.class);
		
	}
	
	public static void main(String[] args) {
		junit.textui.TestRunner.run(suite());
	}
}