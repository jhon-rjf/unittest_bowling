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

    public void testOneThrow()
    {
        g.add(5); // 1-1
        assertEquals(5, g.score()); // 1-1의 점수가 5인지 체크
        assertEquals(1, g.getCurrentFrame()); // 현재 프레임이 1인지 체크
    }

    public void testTwoThrowsNoMark()
    {
        g.add(5); // 1-1
        g.add(4); // 1-2
        assertEquals(9, g.score()); // 1-1 + 1-2 의 점수가 9인지 체크
        assertEquals(2, g.getCurrentFrame()); // itsCurrentFrame이 2인지 체크
    }

    public void testFourThrowsNoMark()
    {
        g.add(5); // 1-1
        g.add(4); // 1-2
        g.add(7); // 2-1
        g.add(2); // 2-2

        assertEquals(18, g.score()); // 1-1 + 1-2 + 2-1 + 2-2 의 점수가 18점인지 체크
        assertEquals(9, g.scoreForFrame(1)); // 프레임1의 점수가 9인지 체크
        assertEquals(18, g.scoreForFrame(2)); // 프레임1의 점수가 9인지 체크
        assertEquals(3, g.getCurrentFrame()); // itsCurrentFrame이 3인지 체크
    }
    public void testSimpleSpare()
    {
        g.add(3);
        g.add(7); // 스페어
        g.add(3); // 1차 -> 이전스코어(0) + 10 + 1차(3) = 13
        assertEquals(13, g.scoreForFrame(1));
        assertEquals(2, g.getCurrentFrame());
    }

    public void testSimpleFrameAfterSpare()
    {
        g.add(3); // 1/1
        g.add(7); // 1/2
        g.add(3); // 2/1
        g.add(2); // 2/2
        assertEquals(13, g.scoreForFrame(1)); // 통과
        assertEquals(18, g.scoreForFrame(2));
        assertEquals(3, g.getCurrentFrame());
    }


}
