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

# Pattern 8 - Inverted Pyramid Star Pattern

## Problem Statement
Print an inverted centered pyramid pattern using stars (`*`).

### Output for n = 4
```
*******
 *****
  ***
   *
```
Space:- n-i

Star:- 2*i-1

## Approach

- The outer loop starts from `n` and decreases to `1`.
- The first inner loop prints increasing spaces on each row.
- The second inner loop prints decreasing odd numbers of stars.
- The number of stars in each row follows the formula:

```
Stars = 2 × Row Number - 1
```

## Dry Run

| Row | Spaces | Stars |
|------|---------|---------|
| 4 | 0 | 7 |
| 3 | 1 | 5 |
| 2 | 2 | 3 |
| 1 | 3 | 1 |

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
- Reverse Iteration
- Space and Star Manipulation
- Mathematical Formula (`2*i - 1`)

This pattern is commonly referred to as the **Inverted Pyramid Pattern** in DSA pattern-printing problems.

# Pattern 9 - Diamond Star Pattern

## Problem Statement
Print a diamond pattern using stars (`*`).

### Output for n = 4

```
   *
  ***
 *****
*******
*******
 *****
  ***
   *
```

## Approach

The pattern is created in two parts:

### Upper Half (Pyramid)
- Spaces decrease with each row.
- Stars increase with each row.
- Stars follow the formula:

```
Stars = 2 × Row Number - 1
```

### Lower Half (Inverted Pyramid)
- Spaces increase with each row.
- Stars decrease with each row.
- The same formula is used in reverse order.

Combining both halves forms a diamond-like shape.

## Dry Run

### Upper Half

| Row | Spaces | Stars |
|------|---------|---------|
| 1 | 3 | 1 |
| 2 | 2 | 3 |
| 3 | 1 | 5 |
| 4 | 0 | 7 |

### Lower Half

| Row | Spaces | Stars |
|------|---------|---------|
| 4 | 0 | 7 |
| 3 | 1 | 5 |
| 2 | 2 | 3 |
| 1 | 3 | 1 |

## Pattern Structure

```
   *        ← Increasing
  ***
 *****
*******
*******
 *****
  ***
   *        ← Decreasing
```

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
- Pyramid Pattern
- Inverted Pyramid Pattern
- Symmetry in Patterns
- Mathematical Formula (`2*i - 1`)

This pattern is commonly referred to as the **Diamond Star Pattern** in DSA pattern-printing problems.

# Pattern 10 - Half Diamond Star Pattern

## Problem Statement
Print a half diamond pattern using stars (`*`).

### Output for n = 4

```
*
**
***
****
***
**
*
```

## Approach

The pattern is divided into two parts:

### Upper Half
- The number of stars increases by one in each row.
- Row number and star count are the same.

### Lower Half
- The number of stars decreases by one in each row.
- Starts from `n - 1` stars and ends with `1` star.

Combining both halves creates a half diamond shape.

## Dry Run

### Upper Half

| Row | Stars |
|------|--------|
| 1 | 1 |
| 2 | 2 |
| 3 | 3 |
| 4 | 4 |

### Lower Half

| Row | Stars |
|------|--------|
| 1 | 3 |
| 2 | 2 |
| 3 | 1 |

## Pattern Structure

```
*
**
***
****
***
**
*
```

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
- Incremental Star Patterns
- Decremental Star Patterns
- Symmetry in Patterns

This pattern is commonly referred to as the **Half Diamond Star Pattern** in DSA pattern-printing problems.


# Palindrome Number Checker (Java)

## Description
This Java program checks whether a given integer is a palindrome.

A palindrome number remains the same when its digits are reversed.

### Examples
- 121 → Palindrome ✅
- 1331 → Palindrome ✅
- 123 → Not Palindrome ❌

---

## How It Works

1. Store the original number.
2. Reverse the digits using a `while` loop.
3. Compare the reversed number with the original number.
4. If both are equal, print `true`; otherwise print `false`.

---

## Code Logic

```java
while(n > 0){
    int r = n % 10;      // Extract last digit
    n = n / 10;          // Remove last digit
    reverse = (reverse * 10) + r; // Build reversed number
}
```

# Plus One (Java)

## Description

This Java program adds **1** to a number represented as an array of digits.

Each element in the array represents a single digit of the number.

### Examples

- `[1, 2, 3]` → `[1, 2, 4]`
- `[4, 3, 2, 1]` → `[4, 3, 2, 2]`
- `[9, 9, 9]` → `[1, 0, 0, 0]`

---

## Approach

The program starts from the last digit and moves backward:

1. If the current digit is less than `9`, increment it by `1` and return the array.
2. If the digit is `9`, change it to `0` and continue to the previous digit.
3. If all digits are `9`, create a new array with one extra digit.
4. Set the first element to `1` and return the new array.

---

## Code Logic

```java
for(int i = n - 1; i >= 0; i--) {
    if(d[i] < 9) {
        d[i] += 1;
        return d;
    }
    d[i] = 0;
}
```

# Roman to Integer (Java)

## Description

This Java program converts a Roman numeral into its corresponding integer value.

Roman numerals use the following symbols:

| Symbol | Value |
|----------|-------|
| I | 1 |
| V | 5 |
| X | 10 |
| L | 50 |
| C | 100 |
| D | 500 |
| M | 1000 |

### Examples

- `"III"` → `3`
- `"LVIII"` → `58`
- `"MCMXCIV"` → `1994`

---

## Approach

The program traverses the Roman numeral from left to right.

### Rules

1. If the current symbol has a value **less than** the next symbol, subtract it.
2. Otherwise, add it.
3. After the loop, add the value of the last symbol.

This handles special Roman numeral cases such as:

| Roman | Calculation | Value |
|---------|------------|---------|
| IV | 5 - 1 | 4 |
| IX | 10 - 1 | 9 |
| XL | 50 - 10 | 40 |
| XC | 100 - 10 | 90 |
| CD | 500 - 100 | 400 |
| CM | 1000 - 100 | 900 |

---

## Code Logic

```java
for(int i = 0; i < n - 1; i++) {

    int cur = d.get(s.charAt(i));
    int nxt = d.get(s.charAt(i + 1));

    if(cur < nxt) {
        ans -= cur;
    } else {
        ans += cur;
    }
}

```



# Square Root Using Binary Search

## Overview
This program finds the **integer square root** of a given number using the **Binary Search** algorithm.

The integer square root of a number is the largest integer whose square is less than or equal to the given number.

### Example
- Input: `8`
- Output: `2`

Because:
- 2 × 2 = 4
- 3 × 3 = 9

Since 9 is greater than 8, the integer square root of 8 is 2.

---

## Algorithm Used
The solution applies **Binary Search** on the range from `1` to the given number.

### Steps
1. Initialize the search range.
2. Find the middle value of the current range.
3. Calculate the square of the middle value.
4. If the square is less than or equal to the target number:
   - Store the middle value as a potential answer.
   - Search in the right half for a larger valid square root.
5. Otherwise:
   - Search in the left half.
6. Continue until the search range becomes invalid.
7. Return the last valid value found.

---

## Time Complexity
- **O(log n)**

The search space is reduced by half in every iteration, making the solution very efficient for large inputs.

---

## Space Complexity
- **O(1)**

Only a few variables are used regardless of the input size.

---

## Concepts Practiced
- Binary Search
- Integer Square Root
- Efficient Searching
- Time Complexity Optimization

---

## Use Cases
- Mathematical computations
- Competitive programming
- Technical interviews
- Problems involving square roots without using built-in functions

---

## Output

For the provided input:

`8`

The program prints:

`2`



# Excel Sheet Column Number

## Problem

Given an Excel column title, return its corresponding column number.

### Examples

| Column Title | Column Number |
|-------------|--------------|
| A | 1 |
| Z | 26 |
| AA | 27 |
| AB | 28 |
| XY | 649 |
| ZY | 701 |

---

## Approach

Excel columns follow a **Base-26 Number System**:

```text
A = 1
B = 2
...
Z = 26
```

For example:

```text
XY

X = 24
Y = 25

XY = 24 × 26¹ + 25 × 26⁰
   = 624 + 25
   = 649
```

Instead of explicitly calculating powers of 26, we can build the answer incrementally.

### Formula

```java
result = result * 26 + currentLetterValue;
```

This is the same pattern used in:

- Binary to Decimal Conversion
- Decimal String to Integer Conversion
- Any Positional Number System Conversion

---

## Dry Run

Input:

```java
String a = "XY";
```

### Iteration 1

```text
X → 24

result = 0 * 26 + 24
       = 24
```

### Iteration 2

```text
Y → 25

result = 24 * 26 + 25
       = 649
```

Output:

```text
649
```
---

## Complexity Analysis

### Time Complexity

```text
O(n)
```

where `n` is the length of the column title.

### Space Complexity

```text
O(1)
```

No extra data structure is used.

---

## Key Observation

Whenever characters represent digits in a positional number system, use:

```java
answer = answer * base + currentDigit;
```

Examples:

```text
Binary       → base 2
Decimal      → base 10
Excel Column → base 26
```


# Binary to Decimal Conversion

## Pattern Recognition

This problem follows the same pattern as the **Excel Sheet Column Number** problem.

### Excel Sheet Column Number

```text
A = 1
B = 2
...
Z = 26

AB = 1 × 26 + 2 = 28
XY = 24 × 26 + 25 = 649
```

The number is built using:

```text
result = result × 26 + currentLetterValue
```

### Binary to Decimal Conversion

```text
1011

1 × 2³ + 0 × 2² + 1 × 2¹ + 1 × 2⁰
= 8 + 0 + 2 + 1
= 11
```

The number is built using:

```text
result = result × 2 + currentDigit
```

### Key Observation

Whenever a string represents digits in a positional number system, use:

```text
result = result × base + currentDigit
```

Examples:

| Number System | Base |
|--------------|------|
| Binary | 2 |
| Decimal | 10 |
| Excel Columns | 26 |

---

## Problem

Convert a binary number represented as a string into its decimal equivalent.

### Example

Input:

```text
1011
```

Output:

```text
11
```

---

## Approach

Traverse the binary string from left to right.

For each digit:

1. Convert the character into its numeric value.
2. Multiply the current result by 2.
3. Add the current digit.

This continuously shifts the existing value one binary position to the left and inserts the new digit.

---

## Dry Run

Input:

```text
1011
```

### Step 1

```text
result = 0

Digit = 1

result = 0 × 2 + 1
       = 1
```

### Step 2

```text
Digit = 0

result = 1 × 2 + 0
       = 2
```

### Step 3

```text
Digit = 1

result = 2 × 2 + 1
       = 5
```

### Step 4

```text
Digit = 1

result = 5 × 2 + 1
       = 11
```

Final Answer:

```text
11
```

---

## Complexity Analysis

### Time Complexity

```text
O(n)
```

where `n` is the length of the binary string.

### Space Complexity

```text
O(1)
```

No extra data structure is used.

---

## Key Takeaway

If a problem involves converting a sequence of symbols into a number and each symbol has a positional value, think:

```text
result = result × base + currentValue
```

This pattern appears frequently in:

- Binary to Decimal Conversion
- Decimal String to Integer Conversion
- Excel Sheet Column Number
- Base-N Number System Conversions
- Custom Encoding Problems


# Excel Sheet Column Title

## Approach

The idea is to repeatedly convert the given column number into characters from `A` to `Z`.

Unlike a normal base-26 system, Excel columns are **1-based**:

- A → 1
- B → 2
- ...
- Z → 26
- AA → 27
- AB → 28

Because there is no digit `0`, we subtract `1` before taking the remainder.

### Steps

1. Subtract `1` from the current number.
2. Find the remainder when divided by `26`.
3. Convert the remainder to a character (`A` to `Z`).
4. Store the character in a list.
5. Divide the number by `26`.
6. Repeat until the number becomes `0`.
7. Reverse the collected characters.
8. Build the final string using `StringBuilder`.

---

## Python Logic

```python
def convertToTitle(self, columnNumber: int) -> str:
    l = []

    while columnNumber > 0:
        columnNumber -= 1
        r = columnNumber % 26
        d = chr(65 + r)
        l.append(d)
        columnNumber //= 26

    l.reverse()
    return "".join(l)
```

# Happy Number

## Problem Statement

A **happy number** is a number defined by the following process:

1. Starting with any positive integer, replace the number by the sum of the squares of its digits.
2. Repeat the process until:
   - the number equals **1** (happy number), or
   - it loops endlessly in a cycle that does not include **1** (not a happy number).

Return `true` if the number is happy, otherwise return `false`.

### Example

Input:
```
19
```

Process:
```
1² + 9² = 82
8² + 2² = 68
6² + 8² = 100
1² + 0² + 0² = 1
```

Output:
```
true
```

---

## Approach

- Use a `HashSet` (Java) or `set` (Python) to store previously seen numbers.
- For each iteration:
  - Extract each digit.
  - Square it.
  - Add the squares together.
- If the number becomes `1`, return `true`.
- If the number repeats, a cycle exists, so return `false`.

### Time Complexity
- **O(log n)** per iteration

### Space Complexity
- **O(log n)** for storing seen numbers

---

## Python Solution

```python
class Solution:
    def isHappy(self, n: int) -> bool:
        seen = set()

        while n != 1 and n not in seen:
            l = []
            seen.add(n)

            while n > 0:
                r = n % 10
                l.append(r ** 2)
                n = n // 10

            n = sum(l)

        return n == 1
```

---

## Key Insight

The sequence generated by repeatedly summing the squares of digits can only:

1. Reach `1` → Happy Number
2. Enter a cycle → Not Happy Number

Using a set helps detect cycles efficiently.





