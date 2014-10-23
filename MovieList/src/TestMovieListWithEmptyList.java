import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.JUnit4TestAdapter;;

public class TestMovieListWithEmptyList {

	private MovieList movieList = null;

	@Before
	public void setUp() {
		movieList = new MovieList();
	}

	@Test
	public void testSize() {
		assertEquals("Size of empty movie list should be 0.", 0,
				movieList.size());
	}

	public static junit.framework.Test suite(){
		return new JUnit4TestAdapter(TestMovieListWithEmptyList.class);
		
	}
	
	public static void main(String[] args) {
		junit.textui.TestRunner.run(suite());
	}
}
