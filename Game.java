// Game.java --------------------------------------------
public class Game {

    public int score()
    {
        return itsScore;
    }

    public void add(int pins)
    {
        itsThrows[itsCurrentThrow++]=pins;
        //현재 투구에 pins 값 저장, 다음 투구로 ++해준다
        itsScore += pins;
    }

    public int scoreForFrame(int frame) // 배열 돌면서 계산
    {
        int score = 0;
        for (int ball=0; frame>0 && (ball<itsCurrentThrow); ball+=2,frame--) {
            score += itsThrows[ball] + itsThrows[ball+1];
            // 한 프레임의 점수 = 앞투구 + 뒤투구, 스트라이크와 스페어의 경우 고려 하지 않음
           // 1프레임에 2투구를 표현,
        }
        return score;
    }

    private int itsScore = 0; // 점수 계산
    private int[] itsThrows = new int[21]; // 프레임
    private int itsCurrentThrow = 0;// 투구 순번
}