# ⭐ Java Star & Number Pattern Programs

A collection of **42 Java pattern programs** using nested loops, covering rectangles, pyramids, hollow shapes, diamonds, joined shapes, butterfly, sandglass, plus, X patterns, and number patterns.

---

## 📁 Project Structure

```
pattern programs/
├── basicstarpatterns/
│   ├── Rectanglepattern.java
│   ├── Squarepattern.java
│   ├── Hollowrectangle.java
│   ├── Hollowsquare.java
│   ├── Righthalfpyramid.java
│   ├── Leftthalfpyramid.java
│   ├── Fullpyramidwithpositive.java
│   ├── Fullpyramidwithnegative.java
│   ├── Fullpyramidwithspace.java
│   ├── Fullivertedpyramidwithspace.java
│   ├── Invertedrighthalfpyramid.java
│   ├── Invertedlefthalgpyramid.java
│   ├── Invertedfullpyramidwithpositive.java
│   ├── Invertedfullpyramidwithnegtive.java
│   ├── Hollowpyramid.java
│   ├── InvrtedHollowpyramid.java
│   ├── fullholowpyramidwithpositive.java
│   ├── fullinvetedholowpyramidwithpositive.java
│   ├── diamond.java
│   ├── hallowdiamond.java
│   ├── crossdiamte.java
│   ├── jion.java
│   ├── jionplus.java
│   ├── jiontshape.java
│   ├── jiontwotringlewithonelin1.java
│   ├── jiontwotringlewithonelin2.java
│   ├── Butterflypattern.java
│   ├── Hollowbutterflypattern.java
│   ├── Sandglassstarglass.java
│   ├── pluspattern.java
│   └── xpattern.java
└── numberpatterns/
    ├── numbertriangle.java
    ├── numberivertedtriangle.java
    ├── problem1numberdiamod.java
    ├── problem2.java
    ├── problem3.java
    ├── problem4.java
    ├── problem5.java
    ├── problem6.java
    ├── problem7.java
    ├── problem8.java
    ├── problm9.java
    └── problem10.java
```

---

## ⚙️ Requirements

- Java JDK 8 or above
- Any IDE (VS Code, IntelliJ, Eclipse) or terminal

---

## ▶️ How to Run

```bash
# Compile
javac basicstarpatterns/Rectanglepattern.java

# Run
java basicstarpatterns.Rectanglepattern
```

> Each program reads input from the console using `Scanner`. Enter the size `n` (and `m` for rectangle) when prompted.

---

## 📘 Star Pattern Guide

---

### 1. Rectangle Pattern
**File:** `Rectanglepattern.java` | **Input:** rows `n`, columns `m`

```
Input: n=3, m=5

 x  x  x  x  x
 x  x  x  x  x
 x  x  x  x  x
```

---

### 2. Square Pattern
**File:** `Squarepattern.java` | **Input:** size `n`

```
Input: n=4

 x  x  x  x
 x  x  x  x
 x  x  x  x
 x  x  x  x
```

---

### 3. Hollow Rectangle
**File:** `Hollowrectangle.java` | **Input:** rows `n`, columns `m`

```
Input: n=4, m=6

xxxxxx
x    x
x    x
xxxxxx
```

---

### 4. Hollow Square
**File:** `Hollowsquare.java` | **Input:** size `n`

```
Input: n=5

x x x x x
x       x
x       x
x       x
x x x x x
```

---

### 5. Right Half Pyramid
**File:** `Righthalfpyramid.java` | **Input:** size `n`

```
Input: n=5

 x
 x  x
 x  x  x
 x  x  x  x
 x  x  x  x  x
```

---

### 6. Left Half Pyramid
**File:** `Leftthalfpyramid.java` | **Input:** size `n`

```
Input: n=5

            x
          x x
        x x x
      x x x x
    x x x x x
```

---

### 7. Full Pyramid (Positive / Odd count)
**File:** `Fullpyramidwithpositive.java` | **Input:** size `n`

```
Input: n=5

        * *
      * * * *
    * * * * * *
  * * * * * * * *
* * * * * * * * * *
```

---

### 8. Full Pyramid (Negative / Even count)
**File:** `Fullpyramidwithnegative.java` | **Input:** size `n`

```
Input: n=5

        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
```

---

### 9. Full Pyramid with Space
**File:** `Fullpyramidwithspace.java` | **Input:** size `n`

```
Input: n=5

    *
   * *
  * * *
 * * * *
* * * * *
```

---

### 10. Inverted Full Pyramid with Space
**File:** `Fullivertedpyramidwithspace.java` | **Input:** size `n`

```
Input: n=5

* * * * *
 * * * *
  * * *
   * *
    *
```

---

### 11. Inverted Right Half Pyramid
**File:** `Invertedrighthalfpyramid.java` | **Input:** size `n`

```
Input: n=5

 x  x  x  x  x  x
 x  x  x  x  x
 x  x  x  x
 x  x  x
 x  x
 x
```

---

### 12. Inverted Left Half Pyramid
**File:** `Invertedlefthalgpyramid.java` | **Input:** size `n`

```
Input: n=5

  x x x x x x
    x x x x x
      x x x x
        x x x
          x x
            x
```

---

### 13. Inverted Full Pyramid (Positive)
**File:** `Invertedfullpyramidwithpositive.java` | **Input:** size `n`

```
Input: n=5

* * * * * * * * * *
  * * * * * * * *
    * * * * * *
      * * * *
        * *
```

---

### 14. Inverted Full Pyramid (Negative)
**File:** `Invertedfullpyramidwithnegtive.java` | **Input:** size `n`

```
Input: n=5

* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
```

---

### 15. Hollow Pyramid
**File:** `Hollowpyramid.java` | **Input:** size `n`

```
Input: n=5

        x
      x   x
    x       x
  x           x
x x x x x x x x x
```

---

### 16. Inverted Hollow Pyramid
**File:** `InvrtedHollowpyramid.java` | **Input:** size `n`

```
Input: n=5

x x x x x x x x x
  x           x
    x       x
      x   x
        x
```

---

### 17. Full Hollow Pyramid (Positive)
**File:** `fullholowpyramidwithpositive.java` | **Input:** size `n`

```
Input: n=5

        x x
      x     x
    x         x
  x             x
x x x x x x x x x x
```

---

### 18. Inverted Full Hollow Pyramid (Positive)
**File:** `fullinvetedholowpyramidwithpositive.java` | **Input:** size `n`

```
Input: n=5

x x x x x x x x x x
  x             x
    x         x
      x     x
        x x
```

---

### 19. Diamond
**File:** `diamond.java` | **Input:** size `n`

```
Input: n=4

      *
    * * *
  * * * * *
* * * * * * *
  * * * * *
    * * *
      *
```

---

### 20. Hollow Diamond
**File:** `hallowdiamond.java` | **Input:** size `n`

```
Input: n=4

      *
    *   *
  *       *
*           *
  *       *
    *   *
      *
```

---

### 21. Cross Diamond
**File:** `crossdiamte.java` | **Input:** size `n`

```
Input: n=4

      *
    * * *
  *   *   *
* * * * * * *
  *   *   *
    * * *
      *
```

---

### 22. Joined Diamond
**File:** `jion.java` | **Input:** size `n`

```
Input: n=4

      *
    * * *
  *   *   *
* * * * * * *
  *   *   *
    * * *
      *
```

---

### 23. Joined Plus Shape
**File:** `jionplus.java` | **Input:** size `n`

```
Input: n=4

      *
      *
      *
* * * * * * *
      *
      *
      *
```

---

### 24. Joined T-Shape
**File:** `jiontshape.java` | **Input:** size `n`

```
Input: n=4

      *
      *
      *
* * * * * * *
      *
      *
      *
```

---

### 25. Joined Two Triangles with One Line (Style 1)
**File:** `jiontwotringlewithonelin1.java` | **Input:** size `n`

```
Input: n=4

      *
    *   *
  *       *
* * * * * * *
  *       *
    *   *
      *
```

---

### 26. Joined Two Triangles with One Line (Style 2)
**File:** `jiontwotringlewithonelin2.java` | **Input:** size `n`

```
Input: n=4

      *
    * * *
  *   *   *
*     *     *
  *   *   *
    * * *
      *
```

---

### 27. Butterfly Pattern
**File:** `Butterflypattern.java` | **Input:** size `n`

```
Input: n=4

*             *
* *         * *
* * *     * * *
* * * * * * * *
* * * * * * * *
* * *     * * *
* *         * *
*             *
```

---

### 28. Hollow Butterfly Pattern
**File:** `Hollowbutterflypattern.java` | **Input:** size `n`

```
Input: n=4

*             *
* *         * *
*   *     *   *
* * * * * * * *
* * * * * * * *
*   *     *   *
* *         * *
*             *
```

---

### 29. Sandglass Pattern
**File:** `Sandglassstarglass.java` | **Input:** size `n`

```
Input: n=4

* * * * * * *
  * * * * *
    * * *
      *
    * * *
  * * * * *
* * * * * * *
```

---

### 30. Plus Pattern
**File:** `pluspattern.java` | **Input:** size `n` (odd recommended)

```
Input: n=5

  *
  *
*****
  *
  *
```

---

### 31. X Pattern
**File:** `xpattern.java` | **Input:** size `n`

```
Input: n=5

*   *
 * *
  *
 * *
*   *
```

---

## 📘 Number Pattern Guide

---

### 32. Number Triangle
**File:** `numbertriangle.java` | **Input:** size `n`

```
Input: n=5

1
12
123
1234
12345
```

---

### 33. Inverted Number Triangle
**File:** `numberivertedtriangle.java` | **Input:** size `n`

```
Input: n=5

55555
4444
333
22
1
```

---

### 34. Number Diamond (Half)
**File:** `problem1numberdiamod.java` | **Input:** size `n`

```
Input: n=4

   1
  121
 12321
1234321
```

---

### 35. Same-Number Triangle
**File:** `problem2.java` | **Input:** size `n`

```
Input: n=5

1
22
333
4444
55555
```

---

### 36. Inverted Same-Number Triangle
**File:** `problem3.java` | **Input:** size `n`

```
Input: n=5

44444
333
22
1
```

---

### 37. Continuous Number Triangle
**File:** `problem4.java` | **Input:** size `n`

```
Input: n=4

1
23
456
78910
```

---

### 38. Descending Number Triangle
**File:** `problem5.java` | **Input:** size `n`

```
Input: n=5

1
21
321
4321
54321
```

---

### 39. Reverse Staircase
**File:** `problem6.java` | **Input:** size `n`

```
Input: n=5

5
54
543
5432
54321
```

---

### 40. Number Hourglass (Single Column)
**File:** `problem7.java` | **Input:** size `n`

```
Input: n=4

0
1
2
3
2
1
```

---

### 41. Number Palindrome Column
**File:** `problem8.java` | **Input:** size `n`

```
Input: n=4

1
2
3
4
3
2
1
```

---

### 42. Number Diamond (Full - Same Row Number)
**File:** `problm9.java` | **Input:** size `n`

```
Input: n=4

      1
    2 2 2
  3 3 3 3 3
4 4 4 4 4 4 4
  3 3 3 3 3
    2 2 2
      1
```

---

### 43. Number Diamond (Full - Sequential)
**File:** `problem10.java` | **Input:** size `n`

```
Input: n=4

      1
    1 2 3
  1 2 3 4 5
1 2 3 4 5 6 7
  1 2 3 4 5
    1 2 3
      1
```

---

## 🧠 Concepts Used

| Concept | Used In |
|---|---|
| Nested `for` loops | All patterns |
| `Scanner` for input | All patterns |
| Space padding | Pyramids, Left Half, Diamonds |
| Hollow border logic | Hollow Square/Rectangle/Pyramid/Diamond/Butterfly |
| Odd/Even star count | Full & Inverted Pyramids |
| Diamond shape logic | Diamond, Hollow Diamond, Cross Diamond |
| Joined shape logic | jion, jionplus, jiontshape, jiontwotringlwithonelin |
| Butterfly logic | Butterflypattern, Hollowbutterflypattern |
| Sandglass logic | Sandglassstarglass |
| Grid condition logic | pluspattern, xpattern |
| Number sequences | All numberpatterns |
| Continuous counters | problem4 |
| Palindrome rows | problem1numberdiamod |

---

## 👤 Author

**Arthikhs**  
GitHub: [https://github.com/Arthikhs](https://github.com/Arthikhs)
