// TestFrame.java-------------------------------------
import junit.framework.TestCase;

public class TestFrame extends TestCase{
    public TestFrame(String name){
        super(name);
    }
    public void testAddOneThrow(){
        Frame f = new Frame();
        f.add(5); // 투구 -> 쓰러뜨린 핀수를 더한다.
        assertEquals(5, f.getScore()); // score가 5로 제대로 나오는 지 테스트
    }
}