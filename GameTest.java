import junit.framework.TestCase;

public class GameTest extends TestCase {
    public TestGame(String name){
        super(name);
    }
    public void testOneThrow() {
        Game g = new Game();
        g.add(5);
        assertEquals(5,g.score());
    }
}
