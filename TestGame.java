import junit.framework.TestCase;

public class TestGame extends TestCase {
    public TestGame(String name){
        super(name);
    }
    private Game g;

    public void setUp()
    {
        g = new Game();
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

    public void testSimpleSpare()
    {
        g.add(3);
        g.add(7); // 스페어
        g.add(3); // 1차 -> 이전스코어(0) + 10 + 1차(3) = 13
        assertEquals(13, g.scoreForFrame(1));
    }

    public void testSimpleFrameAfterSpare()
    {
        g.add(3); // 1/1
        g.add(7); // 1/2
        g.add(3); // 2/1
        g.add(2); // 2/2
        assertEquals(13, g.scoreForFrame(1)); // 통과
        assertEquals(18, g.scoreForFrame(2));
    }


}
