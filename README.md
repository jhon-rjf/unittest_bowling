# unit test (Bowling game)

---

<aside>
💡 개발환경

**OS :** MacOS Sonoma 14.4.1(23E224)

**Processor :** 3 GHz 6코어 Intel Core i5

**통합개발환경 :** IntelliJ IDEA 2024.1.1 (Ultimate Edition)

</aside>

[How to Setup_unittest](https://github.com/jhon-rjf/unittest_bowling/blob/master/Settings_intelij_unittest.md)

# Frame, TestFrame, TestThrow

---

![Untitled](README/Untitled.png)

![Untitled](README/Untitled%201.png)

![Untitled](README/Untitled%202.png)

![Untitled](README/Untitled%203.png)

$$
\large\color{magenta}━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
$$

# add 메소드

---

frame에 add메소드가 없어서 뜨는 컴파일 오류

![Untitled](README/Untitled%204.png)

![Untitled](README/Untitled%205.png)

$$
\large\color{magenta}━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
$$

# 메소드 정의

---

![Untitled](README/Untitled%206.png)

![Untitled](README/Untitled%207.png)

$$
\large\color{magenta}━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
$$

# throw → pins

---

![Untitled](README/Untitled%208.png)

![Untitled](README/Untitled%209.png)

$$
\large\color{magenta}━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
$$

# TestGame, TestGame

---

![Untitled](README/Untitled%2010.png)

![Untitled](README/Untitled%2011.png)

![Untitled](README/Untitled%2012.png)

$$
\large\color{magenta}━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
$$

# testTwoThrowsNoMark

---

![Untitled](README/Untitled%2013.png)

![Untitled](README/Untitled%2014.png)

$$
\large\color{magenta}━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
$$

# Four throws, add method

---

![Untitled](README/Untitled%2015.png)

![Untitled](README/Untitled%2016.png)

![Untitled](README/Untitled%2017.png)

컴파일은 됐지만, 테스트는 실패

$$
\large\color{magenta}━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
$$

# 투구 횟수, 프레임 계산 (단순 더하기)

---

![Untitled](README/Untitled%2018.png)

![Untitled](README/Untitled%2019.png)

$$
\large\color{magenta}━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
$$

# refector. loop→ simple

---

![Untitled](README/Untitled%2020.png)

![Untitled](README/Untitled%2021.png)

$$
\large\color{magenta}━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
$$

# refector. 가독성 증진

---

![Untitled](README/Untitled%2022.png)

![Untitled](README/Untitled%2023.png)

$$
\large\color{magenta}━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
$$

# Spare test case

---

![Untitled](README/Untitled%2024.png)

![Untitled](README/Untitled%2025.png)

컴파일 성공, 테스트는 실패

$$
\large\color{magenta}━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
$$

# 동작 가능하게

---

![Untitled](README/Untitled%2026.png)

![Untitled](README/Untitled%2027.png)

> 47번 라인을 주석처리해서 돌아간다.  g.score의 문제. Pointer 가 이미 넘어가서 그렇다.
> 

![Untitled](README/Untitled%2028.png)

![Untitled](README/Untitled%2029.png)

![Untitled](README/Untitled%2030.png)

1st commit

![Untitled](README/Untitled%2031.png)

2nd commit - **add method 'add' in to Frame.java**

![Untitled](README/Untitled%2032.png)

3rd commit - **throws -> pins**

![Untitled](README/Untitled%2033.png)

4th commit - **edit TestGame.java - testTwoThrowsNoMark**

![Untitled](README/Untitled%2034.png)

5th commit - **throws two -> throws four, add method 'scoreForFrame' in to Game.java**

![Untitled](README/Untitled%2035.png)

6th commit - **check how many throw**

![Untitled](README/Untitled%2036.png)

7th commit - **make loop simple**

![Untitled](README/Untitled%2037.png)

8th commit - **increase 'ga-dok sung'**

![Untitled](README/Untitled%2038.png)

9th commit -  **add Spare Test Case -> TestGame.java**

![Untitled](README/Untitled%2039.png)

10th commit - **spare test case -> fix**

![Untitled](README/Untitled%2040.png)

![Untitled](README/Untitled%2041.png)

> 코드의 왼쪽이 변경전 오른쪽이 변경 후 입니다.
>
---

볼링게임#2

# ball ++ → ball (outofbound)

![Untitled](README/Untitled%2042.png)

![Untitled](README/Untitled%2043.png)

![Untitled](README/Untitled%2044.png)

# scoreforframe 호출

![Untitled](README/Untitled%2045.png)

![Untitled](README/Untitled%2046.png)

![Untitled](README/Untitled%2047.png)

# two throw → not?

![Untitled](README/Untitled%2048.png)

![Untitled](README/Untitled%2049.png)

# fix g.scoreForFrame → g.CurrentFrame & do currentFrame

![Untitled](README/Untitled%2050.png)

![Untitled](README/Untitled%2051.png)

![Untitled](README/Untitled%2052.png)

# add() sep. adjustCurrentFrame() itsCurrentFrame → 1

![Untitled](README/Untitled%2053.png)

![Untitled](README/Untitled%2054.png)

![Untitled](README/Untitled%2055.png)

# getCurrentFrame -> spare*2 test

![Untitled](README/Untitled%2056.png)

![Untitled](README/Untitled%2057.png)

# call score  & del TestOntThrow

![Untitled](README/Untitled%2058.png)

![Untitled](README/Untitled%2059.png)

![Untitled](README/Untitled%2060.png)

# TestPerfectGame

![Untitled](README/Untitled%2061.png)

![Untitled](README/Untitled%2062.png)

# edit testgame for testperfectGame

![Untitled](README/Untitled%2063.png)

# [test]sample game, heart break, tenthFrameSpare

![Untitled](README/Untitled%2064.png)

![Untitled](README/Untitled%2065.png)

# Ref. scoreForFrame

![Untitled](README/Untitled%2066.png)

![Untitled](README/Untitled%2067.png)

# set private ~~~

![Untitled](README/Untitled%2068.png)

![Untitled](README/Untitled%2069.png)

# add if strike

![Untitled](README/Untitled%2070.png)

![Untitled](README/Untitled%2071.png)

# add if score

![Untitled](README/Untitled%2072.png)

![Untitled](README/Untitled%2073.png)

# ref. delete firstThrow, secondThrow, frameScore

![Untitled](README/Untitled%2074.png)

![Untitled](README/Untitled%2075.png)

# ref. function name

![Untitled](README/Untitled%2076.png)

![Untitled](README/Untitled%2077.png)

# ref advanceFrame. adjustFrameStrike()

![Untitled](README/Untitled%2078.png)

![Untitled](README/Untitled%2079.png)

# ref. [testGame] delete no longer use things

![Untitled](README/Untitled%2080.png)

![Untitled](README/Untitled%2081.png)

---

1. commit 1 : ball ++ → ball( outofbound)
    
    ![Untitled](README/Untitled%2082.png)
    
2. commit 2 : call scoreforframe()
    
    ![Untitled](README/Untitled%2083.png)
    
3. commit 3:  **two throw passwd -> but not?**
    
    ![Untitled](README/Untitled%2084.png)
    
4. commit 4: **fix g.scoreForFrame → g.CurrentFrame & do currentFrame**
    
    ![Untitled](README/Untitled%2085.png)
    
    ![Untitled](README/Untitled%2086.png)
    
5. commit 5: **getCurrentFrame -> spare*2 test**
    
    ![Untitled](README/Untitled%2087.png)
    
    ![Untitled](README/Untitled%2088.png)
    
    ![Untitled](README/Untitled%2089.png)
    
6. commit 6: **call score & del TestOntThrow**
    
    ![Untitled](README/Untitled%2090.png)
    
    ![Untitled](README/Untitled%2091.png)
    
    ![Untitled](README/Untitled%2092.png)
    
    ![Untitled](README/Untitled%2093.png)
    
7. commit 7: **add TestPerfectGame**
    
    ![Untitled](README/Untitled%2094.png)
    
8. commit 8: **edit testgame for testperfectGame**
    
    ![Untitled](README/Untitled%2095.png)
    
9. commit 9: **Ref. scoreForFrame**
    
    ![Untitled](README/Untitled%2096.png)
    
    ![Untitled](README/Untitled%2097.png)
    
10. commit 10: **set private ~~~**
    
    ![Untitled](README/Untitled%2098.png)
    
    ![Untitled](README/Untitled%2099.png)
    
11. commit 11: **add if strike**
    
    ![Untitled](README/Untitled%20100.png)
    
    ![Untitled](README/Untitled%20101.png)
    
    ![Untitled](README/Untitled%20102.png)
    
12. commit 12: **add if score**
    
    ![Untitled](README/Untitled%20103.png)
    
13. commit 13: **[ref. [del] firstThrow, secondThrow, FrameScore. ref. [rename] function name](https://github.com/jhon-rjf/unittest_bowling/commit/4c8fc05047511eaad18066587fc8211f93d84cb6)**
    
    ![Untitled](README/Untitled%20104.png)
    
    ![Untitled](README/Untitled%20105.png)
    
14. commit 14: **ref advanceFrame. adjustFrameStrike()**
    
    ![Untitled](README/Untitled%20106.png)
    
    ![Untitled](README/Untitled%20107.png)
    
    ![Untitled](README/Untitled%20108.png)
    
    ![Untitled](README/Untitled%20109.png)
    
    ![Untitled](README/Untitled%20110.png)
    
    ![Untitled](README/Untitled%20111.png)
    
    ![Untitled](README/Untitled%20112.png)
    
    ![Untitled](README/Untitled%20113.png)
    
15. commit 15: **ref. [testGame] delete no longer use things**
    
    ![Untitled](README/Untitled%20114.png)
    
    ![Untitled](README/Untitled%20115.png)
    
    ![Untitled](README/Untitled%20116.png)
    
    ![Untitled](README/Untitled%20117.png)
