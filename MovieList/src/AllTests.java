import org.junit.Test;

import junit.framework.JUnit4TestAdapter;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestMovieListWithOneMovie.class, TestMovieListWithTwoMovies.class, TestMovieListWithEmptyList.class })
public class AllTests {
	
}
