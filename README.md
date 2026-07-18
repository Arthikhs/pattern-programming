# ⭐ Java Star & Pattern Programs

A collection of **26 Java pattern programs** using nested loops, covering rectangles, pyramids, hollow shapes, diamonds, and joined shapes.

---

## 📁 Project Structure

```
pattern programs/
└── basicstarpatterns/
    ├── Rectanglepattern.java
    ├── Squarepattern.java
    ├── Hollowrectangle.java
    ├── Hollowsquare.java
    ├── Righthalfpyramid.java
    ├── Leftthalfpyramid.java
    ├── Fullpyramidwithpositive.java
    ├── Fullpyramidnegative.java
    ├── Fullpyramidwithspace.java
    ├── Fullivertedpyramidwithspace.java
    ├── Invertedrighthalfpyramid.java
    ├── Invertedlefthalgpyramid.java
    ├── Invertedfullpyramidwithpositive.java
    ├── Invertedfullpyramidwithnegtive.java
    ├── Hollowpyramid.java
    ├── InvrtedHollowpyramid.java
    ├── fullholowpyramidwithpositive.java
    ├── fullinvetedholowpyramidwithpositive.java
    ├── diamond.java
    ├── hallowdiamond.java
    ├── crossdiamte.java
    ├── jion.java
    ├── jionplus.java
    ├── jiontshape.java
    ├── jiontwotringlewithonelin1.java
    └── jiontwotringlewithonelin2.java
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

## 📘 Pattern Guide

---

### 1. Rectangle Pattern
**File:** `Rectanglepattern.java`  
**Input:** rows `n`, columns `m`

```
Input: n=3, m=5

 x  x  x  x  x
 x  x  x  x  x
 x  x  x  x  x
```

---

### 2. Square Pattern
**File:** `Squarepattern.java`  
**Input:** size `n`

```
Input: n=4

 x  x  x  x
 x  x  x  x
 x  x  x  x
 x  x  x  x
```

---

### 3. Hollow Rectangle
**File:** `Hollowrectangle.java`  
**Input:** rows `n`, columns `m`

```
Input: n=4, m=6

xxxxxx
x    x
x    x
xxxxxx
```

---

### 4. Hollow Square
**File:** `Hollowsquare.java`  
**Input:** size `n`

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
**File:** `Righthalfpyramid.java`  
**Input:** size `n`

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
**File:** `Leftthalfpyramid.java`  
**Input:** size `n`

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
**File:** `Fullpyramidwithpositive.java`  
**Input:** size `n`

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
**File:** `Fullpyramidwithnegative.java`  
**Input:** size `n`

```
Input: n=5

        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
```

---

### 9. Full Pyramid with Space (Half-width)
**File:** `Fullpyramidwithspace.java`  
**Input:** size `n`

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
**File:** `Fullivertedpyramidwithspace.java`  
**Input:** size `n`

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
**File:** `Invertedrighthalfpyramid.java`  
**Input:** size `n`

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
**File:** `Invertedlefthalgpyramid.java`  
**Input:** size `n`

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

### 13. Inverted Full Pyramid (Positive / Odd count)
**File:** `Invertedfullpyramidwithpositive.java`  
**Input:** size `n`

```
Input: n=5

* * * * * * * * * * 
  * * * * * * * * 
    * * * * * * 
      * * * * 
        * * 
```

---

### 14. Inverted Full Pyramid (Negative / Even count)
**File:** `Invertedfullpyramidwithnegtive.java`  
**Input:** size `n`

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
**File:** `Hollowpyramid.java`  
**Input:** size `n`

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
**File:** `InvrtedHollowpyramid.java`  
**Input:** size `n`

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
**File:** `fullholowpyramidwithpositive.java`  
**Input:** size `n`

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
**File:** `fullinvetedholowpyramidwithpositive.java`  
**Input:** size `n`

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
**File:** `diamond.java`  
**Input:** size `n`

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
**File:** `hallowdiamond.java`  
**Input:** size `n`

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
**File:** `crossdiamte.java`  
**Input:** size `n`

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

### 22. Joined Diamond (Hollow with Center Line)
**File:** `jion.java`  
**Input:** size `n`

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
**File:** `jionplus.java`  
**Input:** size `n`

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
**File:** `jiontshape.java`  
**Input:** size `n`

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
**File:** `jiontwotringlewithonelin1.java`  
**Input:** size `n`

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
**File:** `jiontwotringlewithonelin2.java`  
**Input:** size `n`

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

## 🧠 Concepts Used

| Concept | Used In |
|---|---|
| Nested `for` loops | All patterns |
| `Scanner` for input | All patterns |
| Space padding | Pyramids, Left Half, Diamonds |
| Hollow border logic | Hollow Square/Rectangle/Pyramid/Diamond |
| Odd/Even star count | Full & Inverted Pyramids |
| Diamond shape logic | Diamond, Hollow Diamond, Cross Diamond |
| Joined shape logic | jion, jionplus, jiontshape, jiontwotringlwithonelin |

---

## 👤 Author

**Arthikhs**  
GitHub: [https://github.com/Arthikhs](https://github.com/Arthikhs)
