# DSA
Here I solve DSA problems, I LOVE IT :)
-------------------------------

# Pattern Programming in Java

This repository contains solutions to basic pattern programming problems commonly asked in coding interviews and used to strengthen understanding of nested loops. Each pattern is implemented using two loops:

- Outer loop → controls rows
- Inner loop → controls columns/printing

---

# Pattern 1 - Rectangle Star Pattern

### Problem
Print a rectangle consisting of n rows and n columns of stars.

### Output (n = 5)

```text
*****
*****
*****
*****
*****
```

### Approach
- The outer loop controls the rows.
- The inner loop prints n stars in every row.
- Since both loops run n times, a square pattern is formed.

### Time Complexity
O(n²)

### Space Complexity
O(1)

---

# Pattern 2 - Right-Angled Triangle

### Problem
Print a triangle of stars where each row contains one more star than the previous row.

### Output (n = 5)

```text
*
**
***
****
*****
```

### Approach
- The outer loop controls the rows.
- The inner loop prints stars equal to the current row number.
- Row 1 prints 1 star, Row 2 prints 2 stars, and so on.

### Time Complexity
O(n²)

### Space Complexity
O(1)

---

# Pattern 3 - Number Triangle

### Problem
Print numbers in increasing order on each row.

### Output (n = 5)

```text
1
12
123
1234
12345
```

### Approach
- The outer loop controls the rows.
- The inner loop prints numbers from 1 to the current row number.
- Each new row extends the sequence by one number.

### Time Complexity
O(n²)

### Space Complexity
O(1)

---

# Pattern 4 - Repeated Number Triangle

### Problem
Print the row number repeatedly in each row.

### Output (n = 5)

```text
1
22
333
4444
55555
```

### Approach
- The outer loop represents the current row number.
- The inner loop prints the row number repeatedly.
- Row 3 prints three 3's, Row 4 prints four 4's, and so on.

### Time Complexity
O(n²)

### Space Complexity
O(1)

---

# Pattern 5 - Inverted Star Triangle

### Problem
Print stars in decreasing order.

### Output (n = 5)

```text
*****
****
***
**
*
```

### Approach
- The outer loop controls the rows.
- The inner loop prints fewer stars in each successive row.
- The first row prints n stars and the last row prints 1 star.

### Time Complexity
O(n²)

### Space Complexity
O(1)

# Pattern 6 - Inverted Number Pattern

## Description
This program prints an inverted number pattern. The first row prints numbers from 1 to 5, and each subsequent row prints one less number than the previous row.

## Output

```text
12345
1234
123
12
1
```

## How It Works

- The outer loop controls the rows.
- The inner loop prints numbers from 1 to the current row value.
- The number of digits printed decreases by one in each row.
- This creates an inverted number pattern.

## Complexity

- Time Complexity: O(n²)
- Space Complexity: O(1)

# Pattern 7 - Pyramid Star Pattern

## Problem Statement
Print a centered pyramid pattern using stars (`*`).

### Output for n = 4
```
   *
  ***
 *****
*******
```
Space:- n-i
Star:- 2*i-1

## Approach

- The outer loop controls the number of rows.
- The first inner loop prints spaces to center the pyramid.
- The second inner loop prints stars.
- The number of stars in each row follows the formula:

```
Stars = 2 × Row Number - 1
```

## Dry Run

| Row | Spaces | Stars |
|------|---------|---------|
| 1 | 3 | 1 |
| 2 | 2 | 3 |
| 3 | 1 | 5 |
| 4 | 0 | 7 |

## Time Complexity

```
O(n²)
```

## Space Complexity

```
O(1)
```

## Concepts Used

- Nested Loops
- Pattern Printing
- Space and Star Manipulation
- Mathematical Formula (`2*i - 1`)

This pattern is commonly referred to as the **Pyramid Pattern** in DSA pattern-printing problems.
