# unit test (Bowling game)

---

<aside>
💡 개발환경

**OS :** MacOS Sonoma 14.4.1(23E224)

**Processor :** 3 GHz 6코어 Intel Core i5

**통합개발환경 :** IntelliJ IDEA 2024.1.1 (Ultimate Edition)

</aside>

# Frame, TestFrame, TestThrow

---

![Untitled](README.md/Untitled.png)

![Untitled](README.md/Untitled%201.png)

![Untitled](README.md/Untitled%202.png)

![Untitled](README.md/Untitled%203.png)

$$
\large\color{magenta}━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
$$

# add 메소드

---

frame에 add메소드가 없어서 뜨는 컴파일 오류

![Untitled](README.md/Untitled%204.png)

![Untitled](README.md/Untitled%205.png)

$$
\large\color{magenta}━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
$$

# 메소드 정의

---

![Untitled](README.md/Untitled%206.png)

![Untitled](README.md/Untitled%207.png)

$$
\large\color{magenta}━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
$$

# throw → pins

---

![Untitled](README.md/Untitled%208.png)

![Untitled](README.md/Untitled%209.png)

$$
\large\color{magenta}━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
$$

# TestGame, TestGame

---

![Untitled](README.md/Untitled%2010.png)

![Untitled](README.md/Untitled%2011.png)

![Untitled](README.md/Untitled%2012.png)

$$
\large\color{magenta}━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
$$

# testTwoThrowsNoMark

---

![Untitled](README.md/Untitled%2013.png)

![Untitled](README.md/Untitled%2014.png)

$$
\large\color{magenta}━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
$$

# Four throws, add method

---

![Untitled](README.md/Untitled%2015.png)

![Untitled](README.md/Untitled%2016.png)

![Untitled](README.md/Untitled%2017.png)

컴파일은 됐지만, 테스트는 실패

$$
\large\color{magenta}━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
$$

# 투구 횟수, 프레임 계산 (단순 더하기)

---

![Untitled](README.md/Untitled%2018.png)

![Untitled](README.md/Untitled%2019.png)

$$
\large\color{magenta}━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
$$

# refector. loop→ simple

---

![Untitled](README.md/Untitled%2020.png)

![Untitled](README.md/Untitled%2021.png)

$$
\large\color{magenta}━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
$$

# refector. 가독성 증진

---

![Untitled](README.md/Untitled%2022.png)

![Untitled](README.md/Untitled%2023.png)

$$
\large\color{magenta}━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
$$

# Spare test case

---

![Untitled](README.md/Untitled%2024.png)

![Untitled](README.md/Untitled%2025.png)

컴파일 성공, 테스트는 실패

$$
\large\color{magenta}━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
$$

# 동작 가능하게

---

![Untitled](README.md/Untitled%2026.png)

![Untitled](README.md/Untitled%2027.png)

> 47번 라인을 주석처리해서 돌아간다.  g.score의 문제. Pointer 가 이미 넘어가서 그렇다.
> 

![Untitled](README.md/Untitled%2028.png)

![Untitled](README.md/Untitled%2029.png)

![Untitled](README.md/Untitled%2030.png)

1st commit

![Untitled](README.md/Untitled%2031.png)

2nd commit - **add method 'add' in to Frame.java**

![Untitled](README.md/Untitled%2032.png)

3rd commit - **throws -> pins**

![Untitled](README.md/Untitled%2033.png)

4th commit - **edit TestGame.java - testTwoThrowsNoMark**

![Untitled](README.md/Untitled%2034.png)

5th commit - **throws two -> throws four, add method 'scoreForFrame' in to Game.java**

![Untitled](README.md/Untitled%2035.png)

6th commit - **check how many throw**

![Untitled](README.md/Untitled%2036.png)

7th commit - **make loop simple**

![Untitled](README.md/Untitled%2037.png)

8th commit - **increase 'ga-dok sung'**

![Untitled](README.md/Untitled%2038.png)

9th commit -  **add Spare Test Case -> TestGame.java**

![Untitled](README.md/Untitled%2039.png)

10th commit - **spare test case -> fix**

![Untitled](README.md/Untitled%2040.png)

![Untitled](README.md/Untitled%2041.png)

> 코드의 왼쪽이 변경전 오른쪽이 변경 후 입니다.
>
