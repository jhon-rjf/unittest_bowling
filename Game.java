// Game.java --------------------------------------------
public class Game {

    public int score()
    {
        return itsScore;
    }



    public int getCurrentFrame()
    {
        return itsCurrentFrame;
        // 현재 프레임인 itsCurrentFrame을 반환
    }
    public void add(int pins)
    {
        itsThrows[itsCurrentThrow++]=pins;
        itsScore += pins;
        if (firstThrow == true)	{ // 첫 투구시,
            firstThrow = false; 		// 첫 투구
            itsCurrentFrame++; 			// 프레임 조정
        }
        else { 					  // 첫 투구 아닐 시
            firstThrow=true;; 			// 첫 투구
        }
    }
    private int itsCurrentFrame = 0; // 현재 프레임 번호
    private boolean firstThrow = true; // 각 프레임에서 첫번째 투구 여부
    public int scoreForFrame(int theFrame)
    {
        int ball = 0;
        int score=0;

        for (int currentFrame = 0; currentFrame < theFrame;	currentFrame++)
        {
            int firstThrow = itsThrows[ball++]; // 첫 번째 투구 계산
            int secondThrow = itsThrows[ball++]; // 두 번째 투구 계산
            int frameScore = firstThrow + secondThrow; // 두 투구를 더한 값

            // 스페어인 경우, 다음 프레임의 첫 번째 투구가 필요하다.
            if ( frameScore == 10 )
                score += frameScore + itsThrows[ball]; // 다음의 투구를 더한 값
            else
                score += frameScore; // 스페어가 아닌 경우
        } // end for-loop

        return score; // 프레임 점수 반환!
    }

    private int itsScore = 0; // 점수 계산
    private int[] itsThrows = new int[21]; // 프레임
    private int itsCurrentThrow = 0;// 투구 순번
}