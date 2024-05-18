import junit.framework.TestCase;

public class TestGame extends TestCase {
    public TestGame(String name){
        super(name);
    }
    public void testFourThrowsNoMark()
    {
        Game g = new Game();
        // frame1
        g.add(5);
        g.add(4);
        // frame2
        g.add(7);
        g.add(2);

        assertEquals(18, g.score());
        assertEquals(9, g.scoreForFrame(1));
        // score1 = 9
        assertEquals(18, g.scoreForFrame(2));
        // score2 =  18
    }
}
