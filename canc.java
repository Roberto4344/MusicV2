

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class canc.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class canc
{
    private MusicOrganizer musicOrg1;
    private MusicPlayer musicPla1;

    /**
     * Default constructor for test class canc
     */
    public canc()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        musicOrg1 = new MusicOrganizer();
        musicPla1 = new MusicPlayer();
        musicOrg1.addFile("BigBillBroonzy-BabyPleaseDontGo1.mp3");
        musicOrg1.addFile("BlindBlake-EarlyMorningBlues.mp3");
        musicOrg1.addFile("BlindLemonJefferson-matchBoxBlues.mp3");
        musicOrg1.addFile("BlindLemonJefferson-OneDimeBlues.mp3");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
