import junit.framework.TestCase;

public class TestGame extends TestCase {
    public TestGame(String name){
        super(name);
    }
    public void testTwoThrowsNoMark()
    {
        Game g = new Game();
        g.add(5);
        g.add(4);
        assertEquals(9, g.score());
    }
}
