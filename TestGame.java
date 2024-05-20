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

//    public void testOneThrow()
//    {
//        g.add(5); // 1-1
//        assertEquals(5, g.score()); // 1-1의 점수가 5인지 체크
//        assertEquals(1, g.getCurrentFrame()); // 현재 프레임이 1인지 체크
//    }

    public void testTwoThrowsNoMark()
    {
        g.add(5); // 1-1
        g.add(4); // 1-2
        assertEquals(9, g.score()); // 1-1 + 1-2 의 점수가 9인지 체크
    }

    public void testFourThrowsNoMark()
    {
        Game g  = new Game();
        g.add(5); // 1-1
        g.add(4); // 1-2
        g.add(7); // 2-1
        g.add(2); // 2-2

        assertEquals(18, g.score()); // 1-1 + 1-2 + 2-1 + 2-2 의 점수가 18점인지 체크
        assertEquals(9, g.scoreForFrame(1)); // frame#1의 점수가 9?
        assertEquals(18, g.scoreForFrame(2)); // frame#2의 점수가 18?
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
        assertEquals(13, g.scoreForFrame(1));
        assertEquals(18, g.scoreForFrame(2));
        assertEquals(18, g.score());
    }
    public void testSimpleStrike() {
        g.add(10); // 스트라이크
        g.add(3);
        g.add(6);
        assertEquals(19, g.scoreForFrame(1));
        assertEquals(28, g.score());
    }

    public void testPerfectGame()
    {
        for (int i=0; i<12; i++)
        {
            g.add(10);
        }
        assertEquals(300, g.score());
        // 기대값 : 10 * 30 = 300
        // 실제값 : 330
    }

    public void testEndOfArray()
    {
        for (int i=0; i<9; i++)
        {
            g.add(0);
            g.add(0);
        }
        g.add(2);
        g.add(8); // 10번째 프레임의 스페어
        g.add(10); // 배열 마지막 위치에서의 스트라이크
        assertEquals(20, g.score());
    }

    public void testSampleGame()
    {
        // frame#1
        g.add(1);
        g.add(4);
        // frame#2
        g.add(4);
        g.add(5);
        // frame#3
        g.add(6);
        g.add(4);
        // frame#4
        g.add(5);
        g.add(5);
        // frame#5
        g.add(10);
        // frame#6
        g.add(0);
        g.add(1);
        // frame#7
        g.add(7);
        g.add(3);
        // frame#8
        g.add(6);
        g.add(4);
        // frame#9
        g.add(10);
        g.add(2);
        // frame#10
        g.add(8);
        g.add(6);

        assertEquals(133, g.score());
    } // 모두 pass

    public void testHeartBreak()
    {
        // 11개의 스트라이크
        for (int i=0; i<11; i++)
            g.add(10);

        // 추가 투구
        g.add(9);
        assertEquals(299, g.score());
    } // all pass
    public void testTenthFrameSpare()
    {
        // 9개의 스트라이크
        for (int i=0; i<9; i++)
            g.add(10);

        // 10번 쨰 투구가 스페어
        g.add(9);
        g.add(1);
        // 추가 투구
        g.add(1);

        assertEquals(270, g.score());
    } // all pass

}













