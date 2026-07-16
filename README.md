# ⭐ Java Star & Pattern Programs

A collection of **14 Java pattern programs** using nested loops, covering rectangles, pyramids, hollow shapes, and inverted patterns.

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
    └── Invertedfullpyramidwithnegtive.java
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
        x  x
      x  x  x
    x  x  x  x
  x  x  x  x  x
```

---

### 7. Full Pyramid (Positive / Odd count)
**File:** `Fullpyramidwithpositive.java`  
**Input:** size `n`

```
Input: n=5

        * * *
      * * * * *
    * * * * * * *
  * * * * * * * * *
* * * * * * * * * * *
```

---

### 8. Full Pyramid (Negative / Even count)
**File:** `Fullpyramidnegative.java`  
**Input:** size `n`

> Same visual output as Fullpyramidwithpositive — uses `k <= (2*i+1)` loop condition.

```
Input: n=5

        * * *
      * * * * *
    * * * * * * *
  * * * * * * * * *
* * * * * * * * * * *
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

x  x  x  x  x  x
  x  x  x  x  x
    x  x  x  x
      x  x  x
        x  x
          x
```

---

### 13. Inverted Full Pyramid (Positive / Odd count)
**File:** `Invertedfullpyramidwithpositive.java`  
**Input:** size `n`

```
Input: n=5

* * * * * * * * * * *
  * * * * * * * * *
    * * * * * * *
      * * * * *
        * * *
```

---

### 14. Inverted Full Pyramid (Negative / Even count)
**File:** `Invertedfullpyramidwithnegtive.java`  
**Input:** size `n`

> Uses `k < (2*i+1)` — prints one fewer star per row compared to the positive version.

```
Input: n=5

* * * * * * * * * *
  * * * * * * * *
    * * * * * *
      * * * *
        * *
```

---

## 🧠 Concepts Used

| Concept | Used In |
|---|---|
| Nested `for` loops | All patterns |
| `Scanner` for input | All patterns |
| Space padding | Pyramids, Left Half |
| Hollow border logic | Hollow Square/Rectangle |
| Odd/Even star count | Full & Inverted Pyramids |

---

## 👤 Author

**Arthikhs**  
GitHub: [https://github.com/Arthikhs](https://github.com/Arthikhs)
