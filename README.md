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
            l = [] #list is kept inside the while cause it should reset to empty after the break of inner while!
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


# Fizz Buzz

## Problem Statement

Given an integer `n`, return a list of strings from `1` to `n` where:

- If a number is divisible by `3`, return `"Fizz"`.
- If a number is divisible by `5`, return `"Buzz"`.
- If a number is divisible by both `3` and `5`, return `"FizzBuzz"`.
- Otherwise, return the number itself as a string.

---

## Approach

Iterate through all numbers from `1` to `n` and check:

1. If the number is divisible by both `3` and `5`, add `"FizzBuzz"`.
2. Else if divisible by `3`, add `"Fizz"`.
3. Else if divisible by `5`, add `"Buzz"`.
4. Otherwise, add the number as a string.
---

## Python Solution

```python
class Solution:
    def fizzBuzz(self, n: int) -> List[str]:
        l = []

        for i in range(1, n + 1):
            if i % 3 == 0 and i % 5 == 0:
                l.append("FizzBuzz")
                continue
            elif i % 3 == 0:
                l.append("Fizz")
                continue
            elif i % 5 == 0:
                l.append("Buzz")
                continue

            l.append(str(i))

        return l
```

---

## Example

### Input

```text
n = 15
```

### Output

```text
[
"1", "2", "Fizz", "4", "Buzz",
"Fizz", "7", "8", "Fizz", "Buzz",
"11", "Fizz", "13", "14", "FizzBuzz"
]
```

---

## Time Complexity

```text
O(n)
```

We iterate through the numbers from `1` to `n` exactly once.

---

## Space Complexity

```text
O(n)
```

The output list stores `n` strings.


# Power of Two

## Problem Statement

Given an integer `n`, return `True` if `n` is a power of two, otherwise return `False`.

A number is a power of two if it can be written as:

```text
2^0 = 1
2^1 = 2
2^2 = 4
2^3 = 8
2^4 = 16
...
```

---

## Initial Approach (Binary Search)

One possible approach is to use Binary Search on the exponent.

We try to find a value `mid` such that:

```text
2^mid = n
```

### Python Code

```python
class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        ans = 0
        low = 0
        high = n

        while(low <= high):
            mid = (low + high) // 2

            if(2 ** mid == n):
                return True

            elif(2 ** mid < n):
                low = mid + 1

            else:
                high = mid - 1

        return 2 ** mid == n
```

### Why this is not the preferred approach?

Although Binary Search works, it repeatedly calculates:

```python
2 ** mid
```

for different values of `mid`.

For very large inputs, this becomes less efficient than simply dividing the number by `2`.

Because of this, the division approach is usually preferred and is accepted more comfortably on coding platforms.

---

## Optimal Approach

A power of two can be repeatedly divided by `2` until it becomes `1`.

Example:

```text
16 → 8 → 4 → 2 → 1
```

If at any point we get an odd number greater than `1`, then it cannot be a power of two.

Example:

```text
6 → 3
```

Since `3` is odd and greater than `1`, the answer is `False`.

---

## Step-by-Step Algorithm

### Step 1

Check if the number is positive.

```python
if n <= 0:
    return False
```

Power of two numbers are always positive.

---

### Step 2

Keep dividing by `2` while the number is greater than `1`.

```python
while n > 1:
```

---

### Step 3

Check whether the number is divisible by `2`.

```python
if n % 2 != 0:
    return False
```

If the remainder is not `0`, the number is odd and cannot be a power of two.

---

### Step 4

Divide the number by `2`.

```python
n = n // 2
```

---

### Step 5

If the loop ends and `n` becomes `1`, return `True`.

```python
return True
```

---

## Dry Run

### Example 1

```text
n = 16
```

```text
16 → 8 → 4 → 2 → 1
```

Return:

```text
True
```

---

### Example 2

```text
n = 6
```

```text
6 → 3
```

Since `3` is odd:

```text
False
```

---

## Python Solution

```python
class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        if(n <= 0):
            return False

        while(n > 1):
            if(n % 2 != 0):
                return False

            n = n // 2

        return True
```

---

## Time Complexity

### Binary Search Approach

```text
O(log n)
```

### Division Approach

```text
O(log n)
```

Both are logarithmic, but the division approach is simpler and has less overhead.

---

## Space Complexity

```text
O(1)
```

Only a few variables are used.


# Fibonacci Number

## Problem Statement

The Fibonacci sequence is defined as:

```text
F(0) = 0
F(1) = 1
F(n) = F(n-1) + F(n-2), for n > 1
```

Given an integer `n`, return the `nᵗʰ` Fibonacci number.

### Example 1

Input:

```text
n = 2
```

Output:

```text
1
```

Explanation:

```text
F(2) = F(1) + F(0)
     = 1 + 0
     = 1
```

### Example 2

Input:

```text
n = 4
```

Output:

```text
3
```

Explanation:

```text
0, 1, 1, 2, 3
```

The 4ᵗʰ Fibonacci number is `3`.

---

## Approach

* Handle the base cases:

  * `F(0) = 0`
  * `F(1) = 1`
* Store Fibonacci numbers in a list.
* Start with `[0, 1]`.
* For each position from `2` to `n`, append the sum of the previous two numbers.
* Return the last element of the list.

### Time Complexity

```text
O(n)
```

### Space Complexity

```text
O(n)
```

---

## Python Solution

```python
class Solution:
    def fib(self, n: int) -> int:
        if n <= 0:
            return 0
        elif n == 1:
            return 1

        l = [0, 1]

        for i in range(2, n + 1):
            l.append(l[-1] + l[-2])

        return l[-1]
```


# Nim Game

## Problem Statement

You are playing the Nim Game with the following rules:

* There is a heap of `n` stones.
* Two players take turns removing `1`, `2`, or `3` stones.
* The player who removes the last stone wins.

Given `n`, return `True` if you can win the game assuming both players play optimally, otherwise return `False`.

---

## Example 1

Input:

```text
n = 4
```

Output:

```text
False
```

Explanation:

No matter whether you remove 1, 2, or 3 stones, your opponent can take the remaining stones and win.

---

## Example 2

Input:

```text
n = 5
```

Output:

```text
True
```

Explanation:

Remove 1 stone first, leaving 4 stones for your opponent. Since 4 is a losing position, you can force a win.

---

## Approach

Observe the pattern:

```text
1 → Win
2 → Win
3 → Win
4 → Lose
5 → Win
6 → Win
7 → Win
8 → Lose
```

Every multiple of `4` is a losing position.

* If `n % 4 == 0`, return `False`.
* Otherwise, return `True`.

### Time Complexity

```text
O(1)
```

### Space Complexity

```text
O(1)
```

---

## Python Solution

```python
class Solution:
    def canWinNim(self, n: int) -> bool:
        if n % 4 == 0:
            return False
        return True
```


# Decimal to Binary Conversion

## Problem Statement

Given a decimal (base-10) integer `n`, convert it into its binary (base-2) representation.

Binary numbers use only two digits:

```text
0 and 1
```

---

## Example 1

Input:

```text
n = 17
```

Output:

```text
10001
```

Explanation:

```text
17 ÷ 2 = 8  remainder 1
8  ÷ 2 = 4  remainder 0
4  ÷ 2 = 2  remainder 0
2  ÷ 2 = 1  remainder 0
1  ÷ 2 = 0  remainder 1
```

Reading the remainders from bottom to top:

```text
10001
```

---

## Example 2

Input:

```text
n = 10
```

Output:

```text
1010
```

---

## Approach

* Repeatedly divide the number by `2`.
* Store each remainder (`0` or `1`) in a list.
* Continue until the number becomes `0`.
* Since remainders are generated from least significant bit to most significant bit, reverse the list.
* Print the digits in order.

### Steps

1. Find `n % 2` and store the remainder.
2. Update `n = n / 2`.
3. Repeat until `n` becomes `0`.
4. Reverse the collected remainders.
5. Print the binary representation.

---

## Time Complexity

```text
O(log n)
```

The number is divided by `2` in each iteration.

---

## Space Complexity

```text
O(log n)
```

A list is used to store the binary digits.

---

## Python Solution

```python
n = 17
l = []

while n > 0:
    r = n % 2
    l.append(r)
    n = n // 2

l.reverse()

for i in l:
    print(i, end="")
```

### Output

```text
10001
```

# Missing Number

## Problem

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the only number in the range that is missing from the array.

### Example

Input:

nums = [0, 2, 3]

Output:

1

## Approach

The sum of numbers from `0` to `n` can be calculated using:

n * (n + 1) / 2

1. Find the expected sum from `0` to `n`.
2. Find the actual sum of all elements in the array.
3. Subtract the actual sum from the expected sum.
4. The result is the missing number.

## Python Code

```python
l = [0, 2, 3]

n = len(l)

expected = n * (n + 1) // 2

actual = 0
for i in range(n):
    actual += l[i]

res = expected - actual

print(res)
```

## Dry Run

```text
l = [0, 2, 3]

n = 3

expected = 3 * (3 + 1) / 2
         = 6

actual = 0 + 2 + 3
       = 5

res = 6 - 5
    = 1
```

Output:

```text
1
```

## Time Complexity

O(n)

## Space Complexity

O(1)


# Divisor Game

## Python Solution

```python
class Solution:
    def divisorGame(self, n: int) -> bool:
        if n % 2 == 0:
            return True
        return False
```

## Explanation

In the Divisor Game, the first player wins if the starting number `n` is even.

- If `n` is even, return `True`.
- If `n` is odd, return `False`.

### Time Complexity
- `O(1)`

### Space Complexity
- `O(1)`




# Sign of the Product of an Array

## Python Solution

```python
class Solution:
    def arraySign(self, nums: List[int]) -> int:
        mul = 1
        for i in range(len(nums)):
            mul *= nums[i]

        if mul == 0:
            return 0
        elif mul > 0:
            return 1
        return -1
```

## Explanation

The solution computes the product of all elements in the array and then determines its sign:

- Return `0` if the product is `0`.
- Return `1` if the product is positive.
- Return `-1` if the product is negative.

### Time Complexity
- `O(n)` — Traverse the array once.

### Space Complexity
- `O(1)` — Uses only a constant amount of extra space.


# Harshad Number

## Python Solution

```python
class Solution:
    def sumOfTheDigitsOfHarshadNumber(self, x: int) -> int:
        a = x
        digits = []

        while x > 0:
            digits.append(x % 10)
            x //= 10

        digit_sum = sum(digits)

        if a % digit_sum == 0:
            return digit_sum
        return -1
```

## Explanation

A **Harshad Number** is a number that is divisible by the sum of its digits.

Steps:
1. Extract each digit of the number.
2. Calculate the sum of the digits.
3. Check if the original number is divisible by this sum.
4. Return the digit sum if it is a Harshad number; otherwise, return `-1`.

### Example

Input:
```python
x = 18
```

Digits:
```python
1 + 8 = 9
```

Since:
```python
18 % 9 == 0
```

Output:
```python
9
```

### Time Complexity
- `O(d)` where `d` is the number of digits in `x`.

### Space Complexity
- `O(d)` for storing the digits.


# Ugly Number

## Python Solution

```python
class Solution:
    def isUgly(self, n: int) -> bool:
        if n <= 0:
            return False

        while n % 2 == 0:
            n //= 2

        while n % 3 == 0:
            n //= 3

        while n % 5 == 0:
            n //= 5

        return n == 1
```

## Explanation

An **Ugly Number** is a positive number whose prime factors are limited to **2, 3, and 5**.

Steps:
1. If `n <= 0`, return `False`.
2. Continuously divide `n` by `2` while it is divisible by `2`.
3. Continuously divide `n` by `3` while it is divisible by `3`.
4. Continuously divide `n` by `5` while it is divisible by `5`.
5. If the remaining value is `1`, the number is ugly; otherwise, it is not.

### Example

Input:
```python
n = 14
```

Process:
```python
14 ÷ 2 = 7
```

Since `7` cannot be divided by `2`, `3`, or `5` and is not `1`:

Output:
```python
False
```

### Time Complexity
- `O(log n)`

### Space Complexity
- `O(1)`

# Add Two Integers

## Python Solution

```python
class Solution:
    def sum(self, num1: int, num2: int) -> int:
        return num1 + num2
```

## Explanation

The task is to return the sum of two integers.

Steps:
1. Take two integers `num1` and `num2`.
2. Add them together using the `+` operator.
3. Return the result.

### Example

Input:
```python
num1 = -10
num2 = 7
```

Calculation:
```python
-10 + 7 = -3
```

Output:
```python
-3
```

### Time Complexity
- `O(1)`

### Space Complexity
- `O(1)`

# Power of Three

A simple program to check whether a given number is a power of 3.

## Problem Statement

Given an integer `n`, return `true` if it is a power of three. Otherwise, return `false`.

A number is a power of three if there exists an integer `x` such that:

```text
n = 3^x
```

## Examples

### Example 1

```text
Input: 27
Output: true

Explanation:
27 = 3 × 3 × 3 = 3³
```

### Example 2

```text
Input: 18
Output: false

Explanation:
18 cannot be expressed as 3 raised to an integer power.
```

### Example 3

```text
Input: 1
Output: true

Explanation:
1 = 3⁰
```

---

## Approach

1. If `n` is less than or equal to `0`, return `false`.
2. Continuously divide `n` by `3`.
3. If at any step `n` is not divisible by `3`, return `false`.
4. After repeated division:
   - If `n` becomes `1`, it is a power of three.
   - Otherwise, it is not.

### Time Complexity

```text
O(log₃ n)
```

### Space Complexity

```text
O(1)
```
## Python Solution

```python
class Solution:
    def isPowerOfThree(self, n: int) -> bool:

        if n <= 0:
            return False

        while n > 1:

            if n % 3 != 0:
                return False

            n = n // 3

        return n == 1
```

---

## Output

```text
Input: 18
Output: false
```

---

## Key Idea

Keep dividing the number by `3`. If every division is exact and the final value becomes `1`, the number is a power of three; otherwise, it is not.

# Power of Four

A simple program to check whether a given number is a power of 4.

## Problem Statement

Given an integer `n`, return `true` if it is a power of four. Otherwise, return `false`.

A number is a power of four if there exists an integer `x` such that:

```text
n = 4^x
```

## Examples

### Example 1

```text
Input: 16
Output: true

Explanation:
16 = 4 × 4 = 4²
```

### Example 2

```text
Input: 256
Output: true

Explanation:
256 = 4 × 4 × 4 × 4 = 4⁴
```

### Example 3

```text
Input: 12
Output: false

Explanation:
12 cannot be expressed as 4 raised to an integer power.
```

### Example 4

```text
Input: 1
Output: true

Explanation:
1 = 4⁰
```

---

## Approach

1. If `n` is less than or equal to `0`, return `False`.
2. Repeatedly divide `n` by `4`.
3. If at any step `n` is not divisible by `4`, return `False`.
4. If the final value becomes `1`, return `True`.

### Time Complexity

```text
O(log₄ n)
```

### Space Complexity

```text
O(1)
```

---

## Python Solution

```python
class Solution:
    def isPowerOfFour(self, n: int) -> bool:
        if(n <= 0):
            return False

        while(n > 1):
            if(n % 4 != 0):
                return False

            n = n // 4

        return n == 1
```

---

## Key Idea

A power of four can be divided by `4` repeatedly without leaving any remainder. If the number eventually becomes `1`, it is a power of four; otherwise, it is not.



# Valid Perfect Square

Given a positive integer `num`, return `true` if `num` is a perfect square; otherwise, return `false`.

A perfect square is a number that can be expressed as:

```text
n × n
```

for some integer `n`.

---

## Examples

### Example 1

```text
Input: 16
Output: true

Explanation:
4 × 4 = 16
```

### Example 2

```text
Input: 14
Output: false

Explanation:
No integer multiplied by itself equals 14.
```

### Example 3

```text
Input: 25
Output: true

Explanation:
5 × 5 = 25
```

---

# Step-by-Step Approach (Binary Search)

## Step 1: Define the Search Space

If a number is a perfect square, its square root must lie between:

```text
1 and num
```

So initialize:

```text
low = 1
high = num
```

---

## Step 2: Find the Middle Value

For every iteration:

```text
mid = (low + high) // 2
```

Now calculate:

```text
mid × mid
```

---

## Step 3: Check if We Found the Answer

If:

```text
mid × mid == num
```

then `num` is a perfect square.

Return:

```text
True
```

---

## Step 4: Search the Right Half

If:

```text
mid × mid < num
```

the square is too small.

The answer must be on the right side.

Move:

```text
low = mid + 1
```

---

## Step 5: Search the Left Half

If:

```text
mid × mid > num
```

the square is too large.

The answer must be on the left side.

Move:

```text
high = mid - 1
```

---

## Step 6: Continue Until Search Space Ends

Repeat the process while:

```text
low <= high
```

If the loop ends without finding an exact square:

```text
Return False
```

---

## Dry Run

### Input

```text
num = 16
```

### Iteration 1

```text
low = 1
high = 16

mid = 8
8 × 8 = 64
```

64 > 16

```text
high = 7
```

---

### Iteration 2

```text
low = 1
high = 7

mid = 4
4 × 4 = 16
```

Found the answer.

```text
Return True
```

---

## Time Complexity

```text
O(log n)
```

Binary Search cuts the search space in half during every iteration.

---

## Space Complexity

```text
O(1)
```

Only a few variables are used.

---

# Python Solution

```python
class Solution:
    def isPerfectSquare(self, num: int) -> bool:

        low = 1
        high = num

        while low <= high:

            mid = (low + high) // 2

            if mid * mid == num:
                return True

            elif mid * mid < num:
                low = mid + 1

            else:
                high = mid - 1

        return False
```

---

## Key Idea

Instead of checking every number from `1` to `num`, use Binary Search to repeatedly eliminate half of the remaining search space. This reduces the time complexity from `O(n)` to `O(log n)`.


# 🪃 Valid Boomerang (LeetCode 1037)

## 📌 Problem Statement

Given an array `points` where `points[i] = [xi, yi]` represents a point on a 2D plane, determine whether the three points form a **boomerang**.

A boomerang is a set of **three distinct points that are not on the same straight line**.

---

## 💡 Approach

Instead of calculating slopes (which may cause division by zero), this solution uses **cross multiplication**.

For three points:

- A = (x1, y1)
- B = (x2, y2)
- C = (x3, y3)

The points are collinear if:

```
(y2 - y1) × (x3 - x1) = (y3 - y1) × (x2 - x1)
```

If both sides are equal, the points lie on the same line.

If they are not equal, the points form a boomerang.

---
# 🐍 Python Solution

```python
def is_boomerang(points):
    return (points[1][1] - points[0][1]) * (points[2][0] - points[0][0]) != \
           (points[2][1] - points[0][1]) * (points[1][0] - points[0][0])


points = [[1, 1], [2, 2], [3, 3]]
print(is_boomerang(points))
```

---

## 📖 Example 1

### Input

```
points = [[1,1],[2,2],[3,3]]
```

### Output

```
false
```

### Explanation

All three points lie on the same straight line, so they do **not** form a boomerang.

---

## 📖 Example 2

### Input

```
points = [[1,1],[2,3],[3,2]]
```

### Output

```
true
```

### Explanation

The points are not collinear, so they form a valid boomerang.

---

## ⏱️ Complexity Analysis

| Operation | Complexity |
|------------|-----------|
| **Time Complexity** | **O(1)** |
| **Space Complexity** | **O(1)** |

---

## 🔑 Key Concepts

- 2D Arrays / Lists
- Coordinate Geometry
- Cross Multiplication
- Collinearity Check
- Constant Time Algorithm
- No Division (avoids divide-by-zero)

---

## 👨‍💻 Author

**Rahul Jain**

- Java
- Python
- Data Structures & Algorithms
- LeetCode Practice




# 258. Add Digits

## Problem Statement
Given an integer `num`, repeatedly add all its digits until the result has only one digit, and return it.

### Example

**Input**
```
num = 38
```

**Output**
```
2
```

**Explanation**
```
38 → 3 + 8 = 11
11 → 1 + 1 = 2
```

---

## Approach

1. Continue the process while the number has more than one digit (`num >= 10`).
2. Extract each digit using the modulo operator (`% 10`).
3. Store the digits in a list.
4. Calculate the sum of the list.
5. Assign the sum back to `num`.
6. Repeat until `num` becomes a single-digit number.
7. Return the final value.

---

## Python Solution

```python
class Solution:
    def addDigits(self, num: int) -> int:
        while num >= 10:
            l = []

            while num > 0:
                r = num % 10
                l.append(r)
                num = num // 10

            num = sum(l)

        return num
```

---

## Time Complexity

- **O(d × k)**
  - `d` = number of digits
  - `k` = number of iterations until a single digit is obtained

In practice, the number of iterations is very small.

## Space Complexity

- **O(d)**

where `d` is the number of digits stored in the list.

---

## Concepts Used

- While Loop
- Modulo Operator (`%`)
- Integer Division (`//`)
- Lists
- `sum()` Function
- Simulation


# Find Numbers with Even Number of Digits

## 📌 Problem Statement

Given an integer array `nums`, return the number of integers that contain an **even number of digits**.

### Example

**Input:**

```text
nums = [12, 345, 2, 6, 7896]
```

**Output:**

```text
2
```

**Explanation:**

* `12` → 2 digits ✅
* `345` → 3 digits ❌
* `2` → 1 digit ❌
* `6` → 1 digit ❌
* `7896` → 4 digits ✅

Therefore, the answer is **2**.

---

## 🚀 Approach

1. Initialize a counter to `0`.
2. Traverse through each element of the array.
3. Convert the number into a string.
4. Find the length of the string.
5. If the length is even, increment the counter.
6. Return the final count.

---

## ⏱️ Time Complexity

* **O(n × d)**

  * `n` = number of elements
  * `d` = number of digits (for string conversion)

## 💾 Space Complexity

* **O(d)** (temporary string representation)

---

## 🐍 Python Solution

```python
class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        count = 0
        for i in range(0, len(nums)):
            a = str(nums[i])
            b = len(a)
            if b % 2 == 0:
                count += 1
        return count
```

---

## 🎯 Topics Covered

* Arrays
* String Conversion
* Counting
* Iteration

---

## ✅ LeetCode Difficulty

**Easy**

# Two Sum

## Problem Statement

Given an array of integers `nums` and an integer `target`, return the **indices** of the two numbers such that they add up to the target.

You may assume that:

- Exactly one solution exists.
- You may not use the same element twice.
- The answer can be returned in any order.

### Example

**Input**

```python
nums = [2, 7, 11, 15]
target = 9
```

**Output**

```python
[0, 1]
```

Because:

```python
nums[0] + nums[1] = 2 + 7 = 9
```

---

# Python Solution

```python
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = set()
        d = {}

        for i in range(len(nums)):
            y = target - nums[i]

            if y in d:
                return [d[y], i]

            d[nums[i]] = i
```

---

# Approach

We use a **HashMap (Dictionary)** to store each number along with its index while traversing the array.

For every number:

1. Calculate the complement required to reach the target.
2. Check if the complement already exists in the dictionary.
3. If it exists, return the stored index and the current index.
4. Otherwise, store the current number and its index.

This allows us to find the answer in a single pass.

---

# Dry Run

```python
nums = [2, 7, 11, 15]
target = 9
```

| Current Number | Complement | Dictionary | Result |
|----------------|-----------|------------|--------|
| 2 | 7 | {2:0} | Continue |
| 7 | 2 | {2:0} | Return [0,1] |

---

# Time Complexity

```
O(n)
```

The array is traversed only once.

---

# Space Complexity

```
O(n)
```

The dictionary may store every element in the worst case.

---

## Key Concept

Instead of checking every pair (`O(n²)`), we remember the numbers we've already seen in a dictionary.

For each element:

```python
complement = target - current_number
```

If the complement is already present in the dictionary, we immediately return the two indices.

This makes the solution efficient and suitable for large inputs.


# Remove Element

## Problem
Given an integer array `nums` and an integer `val`, remove all occurrences of `val` **in-place** and return the number of remaining elements.

The order of the remaining elements can be changed, and the elements beyond the returned length are not important.

### Example

```python
nums = [0, 1, 2, 2, 3, 0, 4, 2]
val = 2

Output: 5
Modified nums = [0, 1, 3, 0, 4]
```

---

## Approach

- Create a pointer `k = 0`.
- Traverse the array.
- If the current element is **not** equal to `val`:
  - Copy it to index `k`.
  - Increment `k`.
- After the loop, `k` represents the number of valid elements.

### Time Complexity
- **O(n)**

### Space Complexity
- **O(1)**

---

## Python Solution

```python
def removeElement(nums, val):
    k = 0

    for i in range(len(nums)):
        if nums[i] != val:
            nums[k] = nums[i]
            k += 1

    return k


nums = [0, 1, 2, 2, 3, 0, 4, 2]
val = 2

k = removeElement(nums, val)

print(k)
print(nums[:k])
```

### Output

```python
5
[0, 1, 3, 0, 4]
```


# Single Number

## Problem

Given a **non-empty** integer array `nums`, every element appears **twice** except for one. Find and return that single element.

### Example

```python
nums = [2, 2, 1]

Output: 1
```

Another example:

```python
nums = [4, 1, 2, 1, 2]

Output: 4
```

---

## Approach

- Create a dictionary to store the frequency of each number.
- Traverse the array:
  - If the number is not in the dictionary, initialize its count to `0`.
  - Increment its count by `1`.
- Traverse the dictionary:
  - Return the key whose frequency is `1`.

---

## Time Complexity

- **O(n)**

## Space Complexity

- **O(n)**

---

## Python Solution

```python
def singleNumber(nums):
    d = {}

    for num in nums:
        if num not in d:
            d[num] = 0
        d[num] += 1

    for key in d:
        if d[key] == 1:
            return key


nums = [2, 2, 1, 1, 4]

print(singleNumber(nums))
```

### Output

```python
4
```

# Search Insert Position

## Problem

Given a sorted array of distinct integers and a target value, return the index if the target is found.

If the target is not found, return the index where it would be inserted in order.

### Example 1

```python
nums = [1, 3, 5, 6]
target = 5

Output: 2
```

### Example 2

```python
nums = [1, 3, 5, 6]
target = 2

Output: 1
```

### Example 3

```python
nums = [1, 3, 5, 6]
target = 7

Output: 4
```

---

## Approach

- Initialize two pointers:
  - `low = 0`
  - `high = len(nums) - 1`
- Perform Binary Search:
  - Find the middle index.
  - If the target is found, return its index.
  - If the target is greater than the middle element, search the right half.
  - Otherwise, search the left half.
- If the loop ends without finding the target, `low` will be the correct insertion position.
- Return `low`.

---

## Time Complexity

- **O(log n)**

## Space Complexity

- **O(1)**

---

## Python Solution

```python
def searchInsert(nums, target):
    low = 0
    high = len(nums) - 1

    while low <= high:
        mid = (low + high) // 2

        if nums[mid] == target:
            return mid
        elif nums[mid] < target:
            low = mid + 1
        else:
            high = mid - 1

    return low


nums = [1, 3, 5, 7]
target = 2

print(searchInsert(nums, target))
```

### Output

```python
1
```


# Majority Element

## Problem Statement

Given an integer array `nums` of size `n`, return the **majority element**.

The majority element is the element that appears **more than** `⌊n / 2⌋` times.

You may assume that the majority element always exists in the array.

---

## Approach

This solution uses a **HashMap (Dictionary)** to count the frequency of each element.

### Algorithm

1. Create an empty dictionary.
2. Traverse the array.
3. If the element is not present in the dictionary, initialize its count as `0`.
4. Increment its frequency.
5. Traverse the dictionary.
6. Return the key whose frequency is greater than `n // 2`.

---

## Time Complexity

- **O(n)**

One traversal to count frequencies and another traversal over the dictionary.

---

## Space Complexity

- **O(n)**

In the worst case, all elements are unique.

---

## Python Solution

```python
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        n = len(nums)
        d = {}

        for i in range(n):
            if nums[i] not in d:
                d[nums[i]] = 0
            d[nums[i]] += 1

        for i in d:
            if d[i] > n // 2:
                return i
```

---

## Example

**Input**

```text
nums = [2,2,1,1,1,2,2]
```

**Output**

```text
2
```

---

## Explanation

Frequency table:

| Element | Frequency |
|---------:|----------:|
| 1 | 3 |
| 2 | 4 |

Since the array length is **7**, the majority element must appear more than **7 // 2 = 3** times.

`2` appears **4** times, so it is the majority element.


# Remove Duplicates from Sorted Array

## Problem
Given a **sorted array**, remove the duplicate elements **in-place** such that each unique element appears only once.

The function should return the number of unique elements (`k`).

---

## Example

### Input
```python
nums = [1, 1, 2]
```

### Output
```python
2
```

### Modified Array
```python
nums = [1, 2, _]
```

Only the first `k` elements are considered.

---

# Approach (Two Pointers)

We use two pointers:

- `write` → Points to the position where the next unique element should be placed.
- `read` → Traverses the array from left to right.

### Steps

1. Initialize `write = 0`.
2. Traverse the array using `read`.
3. If the current element is different from `nums[write]`:
   - Move `write` one step ahead.
   - Copy the new unique element to `nums[write]`.
4. After traversal, the answer is `write + 1`.

---

# Python Implementation

```python
def remove_duplicates(nums):
    if not nums:
        return 0

    write = 0

    for read in range(len(nums)):
        if nums[write] != nums[read]:
            write += 1
            nums[write] = nums[read]

    return write + 1


nums = [1, 1, 2]
k = remove_duplicates(nums)

print("Unique Elements:", k)
print("Modified Array:", nums[:k])
```

---

# Time Complexity

```text
O(n)
```

Each element is visited exactly once.

---

# Space Complexity

```text
O(1)
```

No extra space is used since the array is modified in-place.

---

# Key Learning

- Two Pointer Technique
- In-place Array Modification
- Optimizing space complexity
- Working with sorted arrays


# Intersection of Two Arrays

## Python Solution

```python
class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        seen = set()
        s = set()

        # Store all elements of nums1 in a set
        for i in range(len(nums1)):
            seen.add(nums1[i])

        # Check which elements of nums2 are present in nums1
        for i in range(len(nums2)):
            if nums2[i] in seen:
                s.add(nums2[i])

        # Convert the set into a list and return it
        return list(s)
```

---

# How It Works

The goal is to return the **unique elements** that are present in both arrays.

We use two sets:

* **`seen`** → Stores all unique elements from `nums1`.
* **`s`** → Stores the common (intersection) elements.

Using a set allows us to check whether an element exists in **O(1)** average time.

---

## Step 1: Store the first array in a set

```python
seen = set()

for i in range(len(nums1)):
    seen.add(nums1[i])
```

Example:

```python
nums1 = [1, 2, 2, 1]
```

Iteration:

| Element | seen  |
| ------- | ----- |
| 1       | {1}   |
| 2       | {1,2} |
| 2       | {1,2} |
| 1       | {1,2} |

Notice that duplicate values are automatically removed because a **set only stores unique elements**.

Final:

```python
seen = {1, 2}
```

---

## Step 2: Find common elements

```python
s = set()

for i in range(len(nums2)):
    if nums2[i] in seen:
        s.add(nums2[i])
```

Example:

```python
nums2 = [2, 2]
```

Iteration:

| Current Element | Present in `seen`? | `s` |
| --------------- | ------------------ | --- |
| 2               | Yes                | {2} |
| 2               | Yes                | {2} |

Even though `2` appears twice, it is stored only once because `s` is also a set.

Final:

```python
s = {2}
```

---

## Step 3: Return the answer

```python
return list(s)
```

LeetCode expects a **list**, so we convert the set into a list.

Example:

```python
{2} → [2]
```

---

# Dry Run

### Input

```python
nums1 = [1,2,2,1]
nums2 = [2,2]
```

### After Step 1

```python
seen = {1,2}
```

### Step 2

* First `2` is found in `seen` → `s = {2}`
* Second `2` is also found, but `s` already contains `2`

Final:

```python
s = {2}
```

### Output

```python
[2]
```

---

# Time Complexity

* Building the `seen` set: **O(n)**
* Traversing `nums2`: **O(m)**

**Overall Time Complexity:** **O(n + m)**

---

# Space Complexity

* `seen` stores up to **n** unique elements.
* `s` stores the common unique elements.

**Overall Space Complexity:** **O(n + k)**

where **k** is the number of unique common elements.


# Intersection of Two Arrays II

## Python Solution

```python
class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        d = {}
        l = []

        # Count frequency of elements in nums1
        for i in range(len(nums1)):
            if nums1[i] not in d:
                d[nums1[i]] = 1
            else:
                d[nums1[i]] += 1

        # Find common elements
        for i in range(len(nums2)):
            if nums2[i] in d and d[nums2[i]] > 0:
                l.append(nums2[i])
                d[nums2[i]] -= 1

        return l
```

## How It Works

1. Create a dictionary `d` to store the frequency of every element in `nums1`.
2. Traverse `nums2`.
3. If an element exists in `d` and its count is greater than `0`:

   * Add it to the answer list `l`.
   * Decrease its count by `1` to avoid using it again.
4. Return the answer list.

### Example

```text
nums1 = [1,2,2,1]
nums2 = [2,2]

Frequency Map:
{1:2, 2:2}

2 → Found → l = [2], count becomes 1
2 → Found → l = [2,2], count becomes 0

Output:
[2,2]
```

## Complexity

* **Time:** O(n + m)
* **Space:** O(n)


# Count Common Words With One Occurrence

## Problem
Given two string arrays `words1` and `words2`, return the number of words that appear **exactly once** in **both** arrays.

### Example
```text
words1 = ["leetcode","is","amazing","as","is"]
words2 = ["amazing","leetcode","is"]

Output: 2

Explanation:
leetcode -> appears once in both arrays ✅
amazing  -> appears once in both arrays ✅
is        -> appears twice in words1 ❌
as        -> not present in words2 ❌
```

---

# Python Solution

```python
class Solution:
    def countWords(self, words1: List[str], words2: List[str]) -> int:
        d={}
        dd={}
        ans=0
        for i in range(0,len(words1)):
            if(words1[i] not in d):
                d[words1[i]]=1
            else:
                d[words1[i]]+=1
        for i in range(0,len(words2)):
            if(words2[i] not in dd):
                dd[words2[i]]=1
            else:
                dd[words2[i]]+=1
        for i in d:
            if(i in dd and d[i]==1 and dd[i]==1):
                ans+=1
        return ans
```

---

# Intuition

We need to count only those words that:

- Appear **exactly once** in `words1`
- Appear **exactly once** in `words2`

To know whether a word appears once, twice, or more, we must keep track of its frequency.

A **dictionary (hash map)** is perfect for this because it stores:

- **Key** → the word
- **Value** → number of times the word has appeared

Example:

```text
words1 = ["apple","cat","apple","dog"]
```

Dictionary after counting:

```text
{
    "apple": 2,
    "cat": 1,
    "dog": 1
}
```

Now we instantly know how many times every word appeared.

---

# Why Do We Use Two Dictionaries?

We have **two different arrays**.

Each array needs its own frequency count.

So we create:

```python
d = {}      # Frequency of words1
dd = {}     # Frequency of words2
```

Suppose

```text
words1 = ["a","b","b"]
words2 = ["a","c"]
```

After counting,

```text
d =
{
    "a":1,
    "b":2
}

dd =
{
    "a":1,
    "c":1
}
```

Now we can compare both dictionaries.

---

# Step-by-Step Working

## Step 1: Count frequencies in words1

```python
for i in range(0, len(words1)):
```

Visit every word.

If the word is not present,

```python
d[word] = 1
```

Otherwise,

```python
d[word] += 1
```

Example

```text
words1 = ["cat","dog","cat"]
```

Iteration 1

```text
cat

d = {
    "cat":1
}
```

Iteration 2

```text
dog

d = {
    "cat":1,
    "dog":1
}
```

Iteration 3

```text
cat

d = {
    "cat":2,
    "dog":1
}
```

---

## Step 2: Count frequencies in words2

Exactly the same process.

```python
for i in range(0, len(words2)):
```

Example

```text
words2 = ["dog","cat"]
```

Dictionary becomes

```text
dd = {
    "dog":1,
    "cat":1
}
```

---

## Step 3: Compare both dictionaries

Now we iterate through every word in `d`.

```python
for i in d:
```

For every word we check

```python
if (i in dd and d[i] == 1 and dd[i] == 1):
```

Let's understand each condition.

### Condition 1

```python
i in dd
```

The word must exist in the second array.

Example

```text
d =
{
    "apple":1,
    "cat":1
}

dd =
{
    "apple":1
}
```

Only `"apple"` exists in both.

---

### Condition 2

```python
d[i] == 1
```

The word should appear exactly once in the first array.

Example

```text
d =
{
    "apple":2,
    "cat":1
}
```

Only `"cat"` satisfies this condition.

---

### Condition 3

```python
dd[i] == 1
```

The word should also appear exactly once in the second array.

Example

```text
dd =
{
    "cat":1,
    "dog":3
}
```

Only `"cat"` satisfies this condition.

---

If all three conditions are true,

```python
ans += 1
```

because we found one valid common word.

---

# Dry Run

```text
words1 = ["leetcode","is","amazing","as","is"]

words2 = ["amazing","leetcode","is"]
```

After counting,

```text
d =
{
leetcode : 1
is       : 2
amazing  : 1
as       : 1
}

dd =
{
amazing  : 1
leetcode : 1
is       : 1
}
```

Checking each word:

### leetcode

```text
Present in dd ✔
Count in d = 1 ✔
Count in dd = 1 ✔

Answer = 1
```

### is

```text
Present in dd ✔
Count in d = 2 ✘

Ignore
```

### amazing

```text
Present in dd ✔
Count in d = 1 ✔
Count in dd = 1 ✔

Answer = 2
```

### as

```text
Not present in dd ✘

Ignore
```

Final Answer

```text
2
```

---

# Time Complexity

Building first dictionary:

```text
O(n)
```

Building second dictionary:

```text
O(m)
```

Checking common words:

```text
O(k)
```

where `k` is the number of unique words in `words1`.

Overall:

```text
O(n + m)
```

---

# Space Complexity

Two dictionaries store word frequencies.

```text
O(n + m)
```

where `n` and `m` are the number of unique words in both arrays.


# Intersection of Multiple Arrays

## Problem
Given multiple arrays, return all integers that are present in **every array**. The final answer should be in **sorted order**.

### Example

```text
Input:
[[7,34,45,10,12,27,13],
 [27,21,45,10,12,13]]

Output:
[10,12,13,27,45]
```

---

# Python Solution

```python
class Solution:
    def intersection(self, nums: List[List[int]]) -> List[int]:
        seen=set()
        for i in range(0,len(nums[0])):
            seen.add(nums[0][i])
        for i in range(1,len(nums)):
            temp_set=set()
            for j in range(len(nums[i])):
                if(nums[i][j] in seen):
                    temp_set.add(nums[i][j])
            seen=temp_set

        return sorted(list(seen)) # to maintain sorted order
```

---

# Intuition

We use a **set** because:

- Sets store **unique** elements.
- Searching in a set is very fast (`O(1)` on average).
- We only care about numbers that are common in every array.

The idea is to keep updating the common elements after checking each array.

---

# Step-by-Step

### Step 1: Store the first array in a set

```python
seen = set()

for i in range(len(nums[0])):
    seen.add(nums[0][i])
```

Example:

```text
nums[0] = [7,34,45,10,12,27,13]

seen =
{7,34,45,10,12,27,13}
```

---

### Step 2: Compare with the next array

Create a temporary set.

```python
temp_set = set()
```

If an element exists in both the current array and `seen`, add it to `temp_set`.

```python
if nums[i][j] in seen:
    temp_set.add(nums[i][j])
```

After finishing the current array,

```python
seen = temp_set
```

Now `seen` contains only the common elements so far.

Example:

```text
Second array:
[27,21,45,10,12,13]

seen becomes

{27,45,10,12,13}
```

Repeat this process for every remaining array.

---

### Step 3: Return the answer

The set is converted into a list and sorted.

```python
return sorted(list(seen))
```

This ensures the output is in ascending order.

---

# Time Complexity

- Visiting every element once:

```text
O(total number of elements)
```

- Sorting the final answer:

```text
O(k log k)
```

where `k` is the number of common elements.

---

# Space Complexity

```text
O(k)
```

where `k` is the number of elements stored in the set.


# Contains Duplicate II

## Problem
Given an integer array `nums` and an integer `k`, return `True` if there are two equal numbers whose indices differ by at most `k`. Otherwise, return `False`.

---

## Intuition

We need to know:

- Have we seen this number before?
- If yes, where did we last see it?

A dictionary is perfect because it stores:

```text
number -> latest index
```

Whenever we find the same number again, we calculate the distance between the current index and the previous index.

If the distance is less than or equal to `k`, we return `True`.

Otherwise, we update the index in the dictionary since the latest occurrence is more useful.

---

## Python Solution

```python
class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        d = {}

        for i in range(len(nums)):

            # Number seen for the first time
            if nums[i] not in d:
                d[nums[i]] = i

            # Duplicate found
            else:
                a = i - d[nums[i]]

                # Indices are within k distance
                if a <= k:
                    return True

                # Update with latest index
                else:
                    d[nums[i]] = i

        return False
```

---

## Explanation

### Step 1
Create an empty dictionary.

```python
d = {}
```

It stores:

```text
number -> latest index
```

---

### Step 2
Traverse the array.

```python
for i in range(len(nums)):
```

---

### Step 3
If the number is not in the dictionary, store its index.

```python
if nums[i] not in d:
    d[nums[i]] = i
```

Example:

```text
nums = [1,2,3]

Dictionary

1 -> 0
2 -> 1
3 -> 2
```

---

### Step 4
If the number already exists, calculate the distance.

```python
a = i - d[nums[i]]
```

Example:

```text
nums = [1,2,3,1]

Current index = 3
Previous index = 0

Distance = 3 - 0 = 3
```

---

### Step 5
If the distance is within `k`, return `True`.

```python
if a <= k:
    return True
```

---

### Step 6
Otherwise, update the dictionary with the latest index.

```python
d[nums[i]] = i
```

Example:

```text
nums = [1,0,1,1]

After checking index 2

Dictionary

1 -> 2
0 -> 1
```

Updating the latest index helps compare with the closest future duplicate.

---

## Time Complexity

- **O(n)**

Each element is processed once.

---

## Space Complexity

- **O(n)**

The dictionary stores at most one index for each distinct number.


# Third Maximum Number

## Problem
Given an integer array `nums`, return the **third distinct maximum** number in the array. If the third distinct maximum does not exist, return the **maximum** number.

### Example
```text
Input: nums = [3,2,1]
Output: 1

Input: nums = [1,2]
Output: 2

Input: nums = [2,2,3,1]
Output: 1
```

---

## Approach

1. Store all elements in a `set` to remove duplicates.
2. If there are at least three distinct numbers:
   - Convert the set to a list.
   - Sort the list.
   - Return the third largest element (`s[-3]`).
3. Otherwise, return the maximum element of the original array.

---

## Python Solution

```python
class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        rem_dup = set()

        for i in range(len(nums)):
            rem_dup.add(nums[i])

        if len(rem_dup) > 2:
            a = list(rem_dup)
            s = sorted(a)
            return s[-3]
        else:
            return max(nums)
```

---

## Time Complexity

- Building the set: **O(n)**
- Sorting distinct elements: **O(k log k)**, where `k` is the number of distinct elements (`k ≤ n`)
- Overall: **O(n + k log k)**

## Space Complexity

- Set stores distinct elements: **O(k)**


# Neither Minimum nor Maximum

## Problem

Given an integer array `nums` containing **distinct positive integers**, return **any** number that is **neither the minimum nor the maximum** element in the array.

If no such element exists, return `-1`.

### Example

```text
Input: nums = [3,2,1,4]
Output: 2 (3 is also a valid answer)

Input: nums = [1,2]
Output: -1

Input: nums = [2,1,3]
Output: 2
```

---

## Approach

1. Find the minimum and maximum values in the array.
2. Traverse the array and collect all elements that are neither the minimum nor the maximum.
3. If no such element exists, return `-1`.
4. Otherwise, return any one of the collected elements.

> **Note:** Since the problem accepts **any valid number**, returning `min(l)`, `max(l)`, or even `l[0]` will all be accepted as long as the returned value is neither the minimum nor the maximum of the original array.

---

## Python Solution

```python
class Solution:
    def findNonMinOrMax(self, nums: List[int]) -> int:
        l = []
        a = min(nums)
        b = max(nums)

        for i in range(len(nums)):
            if nums[i] != a and nums[i] != b:
                l.append(nums[i])

        if len(l) == 0:
            return -1

        return min(l)
```

---

## Time Complexity

- Finding minimum: **O(n)**
- Finding maximum: **O(n)**
- Traversing the array: **O(n)**
- Finding `min(l)`: **O(n)** (in the worst case)

**Overall Time Complexity:** **O(n)**

---

## Space Complexity

- Auxiliary list `l`: **O(n)**

**Overall Space Complexity:** **O(n)**

---

## Note

The final return statement can be any of the following and the solution will still be accepted:

```python
return min(l)
```

```python
return max(l)
```

```python
return l[0]
```

This is because the problem asks for **any** element that is neither the minimum nor the maximum of the original array.


# Max Consecutive Ones

## Problem
Given a binary array `nums`, return the maximum number of consecutive `1`s in the array.

### Example

**Input**
```text
nums = [1,1,0,1,1,1]
```

**Output**
```text
3
```

**Explanation**

The longest consecutive sequence of `1`s is:

```text
1 1 0 1 1 1
      └─────┘
         3
```

---

## Intuition

Instead of comparing adjacent elements, maintain a running count of consecutive `1`s.

- If the current element is `1`, increase the current streak.
- If the current element is `0`, the streak is broken, so reset it to `0`.
- Keep updating the maximum streak found so far.

---

## Algorithm

1. Initialize two variables:
   - `cur_count = 0`
   - `max_count = 0`
2. Traverse the array.
3. If the current element is `1`:
   - Increment `cur_count`.
   - Update `max_count` if needed.
4. Otherwise:
   - Reset `cur_count` to `0`.
5. Return `max_count`.

---

## Time Complexity

- **O(n)**

The array is traversed only once.

---

## Space Complexity

- **O(1)**

Only two integer variables are used.

---

## Python Solution

```python
class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        max_count = 0
        cur_count = 0

        for i in range(len(nums)):
            if nums[i] == 1:
                cur_count += 1
                if cur_count > max_count:
                    max_count = cur_count
            else:
                cur_count = 0

        return max_count
```


# Set Mismatch

## Problem

You have a set containing all integers from `1` to `n`. Due to an error, one number appears **twice** while another number is **missing**.

Return the duplicated number and the missing number in the form:

```text
[duplicate, missing]
```

---

## Example 1

**Input**

```text
nums = [1,2,2,4]
```

**Output**

```text
[2,3]
```

**Explanation**

- `2` appears twice.
- `3` is missing.

---

## Example 2

**Input**

```text
nums = [1,1]
```

**Output**

```text
[1,2]
```

---

## Intuition

There are two tasks to solve:

1. Find the number that appears more than once.
2. Find the missing number.

A dictionary (hash map) is used to store the frequency of every number.

- If a number's frequency becomes greater than `1`, it is the duplicate.
- A set stores only unique numbers.
- The sum of unique numbers is compared with the expected sum of numbers from `1` to `n`.
- The difference gives the missing number.

---

## Algorithm

1. Create a dictionary to store frequencies.
2. Create a set to store unique numbers.
3. Traverse the array.
   - If the number is not in the dictionary, add it with frequency `1` and insert it into the set.
   - Otherwise, increment its frequency.
4. Traverse the dictionary to find the duplicate number.
5. Compute the sum of unique numbers.
6. Compute the expected sum using:

```text
n × (n + 1) / 2
```

7. Missing number:

```text
expected_sum - unique_sum
```

8. Return:

```text
[duplicate, missing]
```

---

## Time Complexity

- **O(n)**

The array is traversed a constant number of times.

---

## Space Complexity

- **O(n)**

A dictionary and a set are used.

---

## Python Solution

```python
class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        d = {}
        seen = set()
        n = len(nums)

        for i in range(len(nums)):
            if nums[i] not in d:
                seen.add(nums[i])
                d[nums[i]] = 1
            else:
                d[nums[i]] += 1

        for i in d:
            if d[i] > 1:
                duplicate = i

        unique_sum = sum(seen)
        expected_sum = n * (n + 1) // 2
        missing = expected_sum - unique_sum

        return [duplicate, missing]
```


# 1446. Consecutive Characters

## Problem Statement

The **power** of a string is the length of the longest substring that contains only one unique character.

Given a string `s`, return its power.

### Example

**Input**

```text
s = "abbcccddddeeeeedcba"
```

**Output**

```text
5
```

**Explanation**

The longest consecutive group of the same character is `"eeeee"`, whose length is `5`.

---

# Intuition

Since we need the **longest consecutive sequence**, counting the total frequency of each character is not useful.

For example:

```text
s = "ababab"
```

The character `'a'` appears three times, but never consecutively. Therefore, a dictionary or hash map cannot solve this problem because it stores frequencies, not consecutive streaks.

Instead, we compare each character with its previous character.

- If both characters are the same, the current streak continues.
- If they are different, the current streak ends and a new streak begins.

While traversing the string, we keep track of:
- `cur_count` → Length of the current consecutive sequence.
- `max_count` → Maximum consecutive sequence found so far.

---

# Approach

1. Initialize both `cur_count` and `max_count` to `1` since the first character already forms a streak of length `1`.
2. Traverse the string from index `1`.
3. Compare the current character with the previous character.
   - If they are equal, increment `cur_count`.
   - Update `max_count` if the current streak becomes longer.
4. If the characters are different, reset `cur_count` to `1` because a new streak starts.
5. Return `max_count`.

---

# Dry Run

For:

```text
s = "abbccc"
```

| Index | Character | Current Streak | Maximum Streak |
|------:|:---------:|:--------------:|:--------------:|
| 0 | a | 1 | 1 |
| 1 | b | 1 | 1 |
| 2 | b | 2 | 2 |
| 3 | c | 1 | 2 |
| 4 | c | 2 | 2 |
| 5 | c | 3 | 3 |

Answer = **3**

---

# Time Complexity

- **O(n)**

The string is traversed only once.

---

# Space Complexity

- **O(1)**

Only two integer variables are used.

---

# Python Solution

```python
class Solution:
    def maxPower(self, s: str) -> int:
        max_count = 1
        cur_count = 1

        for i in range(1, len(s)):
            if s[i] == s[i - 1]:
                cur_count += 1
                if cur_count > max_count:
                    max_count = cur_count
            else:
                cur_count = 1

        return max_count
```


# Unique Number of Occurrences

## Problem Statement

Given an integer array `arr`, return `True` if the number of occurrences of each value in the array is unique. Otherwise, return `False`.

### Example 1

**Input:**
```text
arr = [1,2,2,1,1,3]
```

**Frequency:**
```text
1 → 3
2 → 2
3 → 1
```

**Output:**
```text
True
```

---

### Example 2

**Input:**
```text
arr = [1,2]
```

**Frequency:**
```text
1 → 1
2 → 1
```

**Output:**
```text
False
```

---

## Intuition

The question is **not asking whether the numbers are unique**.

Instead, it asks whether the **frequencies of those numbers are unique**.

For example,

```text
4 → 2
5 → 1
```

The frequencies are:

```text
2, 1
```

Since both frequencies are different, the answer is **True**.

Another example,

```text
1 → 2
2 → 2
3 → 1
```

The frequencies are:

```text
2, 2, 1
```

Here, the frequency **2** appears twice, so the answer is **False**.

---

## Approach

1. Use a dictionary to count the frequency of every number.
2. Create an empty set.
3. Traverse through all the frequencies.
4. If a frequency is already present in the set, return `False`.
5. Otherwise, add the frequency to the set.
6. If all frequencies are unique, return `True`.

---

## Python Code

```python
class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        d = {}
        seen = set()

        for num in arr:
            if num not in d:
                d[num] = 1
            else:
                d[num] += 1

        for freq in d.values():
            if freq in seen:
                return False
            seen.add(freq)

        return True
```

---

## Time Complexity

- Counting frequencies: **O(n)**
- Checking unique frequencies: **O(n)**

**Overall:** `O(n)`

---

## Space Complexity

- Dictionary stores the frequency of each number.
- Set stores the unique frequencies.

**Overall:** `O(n)`


# Maximum Product of Three Numbers

## Problem Statement

Given an integer array `nums`, return the **maximum product** that can be obtained by multiplying any **three numbers** from the array.

---

## Intuition

At first glance, it seems that multiplying the **three largest numbers** should always give the maximum product.

For example:

```python
nums = [1, 2, 3, 4]
```

The maximum product is:

```python
4 * 3 * 2 = 24
```

However, this approach fails when the array contains **negative numbers**.

Example:

```python
nums = [-100, -98, -1, 2, 3, 4]
```

If we multiply the three largest numbers:

```python
4 * 3 * 2 = 24
```

But if we multiply the two smallest (most negative) numbers with the largest number:

```python
(-100) * (-98) * 4 = 39200
```

Since the product of two negative numbers is positive, this becomes much larger.

Therefore, there are only **two possible candidates** for the maximum product:

1. Product of the three largest numbers.
2. Product of the two smallest numbers and the largest number.

The answer is the maximum of these two products.

---

## Approach

1. Sort the array.
2. Compute the product of the last three elements.
3. Compute the product of the first two elements and the last element.
4. Return the larger product.

---

## Python Solution

```python
class Solution:
    def maximumProduct(self, nums: List[int]) -> int:
        nums.sort()

        product1 = nums[-1] * nums[-2] * nums[-3]
        product2 = nums[0] * nums[1] * nums[-1]

        return max(product1, product2)
```

---

## Example

### Input

```python
nums = [-100, -98, -1, 2, 3, 4]
```

### Sorted Array

```python
[-100, -98, -1, 2, 3, 4]
```

### Candidate 1

```python
4 * 3 * 2 = 24
```

### Candidate 2

```python
(-100) * (-98) * 4 = 39200
```

### Output

```python
39200
```

---

## Time Complexity

- Sorting: **O(n log n)**
- Computing the two products: **O(1)**

**Overall:** `O(n log n)`

---

## Space Complexity

- Sorting in Python uses `O(1)` extra space (ignoring implementation details).

**Overall:** `O(1)`


# 1869. Longer Contiguous Segments of Ones than Zeros

## Problem
Given a binary string `s`, return `True` if the **longest contiguous segment of `1`s** is **strictly longer** than the **longest contiguous segment of `0`s**. Otherwise, return `False`.

---

## Intuition
The problem asks for the **longest consecutive streak** of `1`s and `0`s, **not** their total count.

We maintain:

- `cur1` → Current streak of consecutive `1`s.
- `cur0` → Current streak of consecutive `0`s.
- `max1` → Longest streak of `1`s seen so far.
- `max0` → Longest streak of `0`s seen so far.

Traverse the string once:

- If the current character is `'1'`:
  - Increase `cur1`.
  - Update `max1`.
  - Reset `cur0`.
- If the current character is `'0'`:
  - Increase `cur0`.
  - Update `max0`.
  - Reset `cur1`.

Finally, compare `max1` and `max0`.

---

## Approach
1. Initialize four variables:
   - `cur1`, `cur0`
   - `max1`, `max0`
2. Traverse the string.
3. Update the corresponding streak.
4. Reset the opposite streak.
5. Return `max1 > max0`.

---

## Python Code

```python
class Solution:
    def checkZeroOnes(self, s: str) -> bool:
        cur0 = 0
        cur1 = 0
        max0 = 0
        max1 = 0

        for i in range(len(s)):
            if s[i] == '1':
                cur1 += 1
                if cur1 > max1:
                    max1 = cur1
            else:
                cur1 = 0

            if s[i] == '0':
                cur0 += 1
                if cur0 > max0:
                    max0 = cur0
            else:
                cur0 = 0

        return max1 > max0
```

---

## Dry Run

### Input

```text
s = "1101000111110"
```

### Traversal

| Character | cur1 | max1 | cur0 | max0 |
|-----------|-----:|-----:|-----:|-----:|
|1|1|1|0|0|
|1|2|2|0|0|
|0|0|2|1|1|
|1|1|2|0|1|
|0|0|2|1|1|
|0|0|2|2|2|
|0|0|2|3|3|
|1|1|2|0|3|
|1|2|2|0|3|
|1|3|3|0|3|
|1|4|4|0|3|
|1|5|5|0|3|
|0|0|5|1|3|

Final:

```text
max1 = 5
max0 = 3
```

Return:

```text
True
```

---

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---

## Pattern Learned

This is a **Streak Counter** problem.

Use this pattern whenever the question contains words like:

- Longest
- Consecutive
- Continuous
- Segment
- Streak

General Pattern:

```python
current = 0
maximum = 0

for element in data:
    if streak continues:
        current += 1
    else:
        current = 0

    maximum = max(maximum, current)
```

This pattern is commonly used in many consecutive/continuous sequence problems on LeetCode.



# Valid Anagram

## Problem
Given two strings `s` and `t`, return `True` if `t` is an anagram of `s`, otherwise return `False`.

An **anagram** is a word or phrase formed by rearranging the letters of another word, using all the original letters exactly once.

### Examples

**Example 1**
```text
Input: s = "anagram", t = "nagaram"
Output: True
```

**Example 2**
```text
Input: s = "rat", t = "car"
Output: False
```

---

## Intuition

If two strings are anagrams:

- They must have the **same length**.
- Every character should appear the **same number of times** in both strings.

We use two dictionaries:

- `ds` stores the frequency of each character in `s`.
- `dt` stores the frequency of each character in `t`.

Finally, we verify that every character in `ds` exists in `dt` and that their frequencies are identical.

---

## Algorithm

1. If the lengths of the strings are different, return `False`.
2. Create two empty dictionaries.
3. Count the frequency of each character in `s`.
4. Count the frequency of each character in `t`.
5. Traverse the first dictionary:
   - If a character is missing in the second dictionary, return `False`.
   - If the frequencies differ, return `False`.
6. If all checks pass, return `True`.

---

## Python Solution

```python
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        ds = {}
        dt = {}

        if len(s) != len(t):
            return False

        for i in range(0, len(s)):
            if s[i] not in ds:
                ds[s[i]] = 1
            else:
                ds[s[i]] += 1

        for i in range(0, len(t)):
            if t[i] not in dt:
                dt[t[i]] = 1
            else:
                dt[t[i]] += 1

        for i in ds:
            if i not in dt:
                return False
            if ds[i] != dt[i]:
                return False

        return True
```

---

## Time Complexity

- Building `ds`: **O(n)**
- Building `dt`: **O(n)**
- Comparing frequencies: **O(n)**

**Overall Time Complexity:** **O(n)**

---

## Space Complexity

Two dictionaries are used to store character frequencies.

**Space Complexity:** **O(n)**

---

## Key Concepts

- Hash Map / Dictionary
- Frequency Counting
- String Traversal
- Character Matching
- Anagram Checking

# Minimum Index Sum of Two Lists

## Problem Statement

Given two arrays of strings `list1` and `list2`, return all the common strings with the minimum index sum.

A common string is a string that appears in both lists.

If multiple strings have the same minimum index sum, return all of them.

---

## Approach

1. Create a dictionary to store every restaurant from `list1` along with its index.
2. Traverse `list2`.
3. If the current restaurant exists in the dictionary, add its index from `list2` to the stored index.
4. Traverse the dictionary to find the minimum index sum.
5. If a smaller minimum is found:
   - Update the minimum.
   - Replace the answer list.
6. If another restaurant has the same minimum:
   - Append it to the answer list.
7. Return the answer.

---

## Time Complexity

- Building Dictionary: **O(n)**
- Traversing Second List: **O(m)**
- Finding Minimum: **O(n)**

**Overall:** `O(n + m)`

---

## Space Complexity

- Dictionary: **O(n)**
- Answer List: **O(k)**

Overall: **O(n)**

---

## Python Solution

```python
class Solution:
    def findRestaurant(self, list1: List[str], list2: List[str]) -> List[str]:
        d = {}
        l = []

        for i in range(len(list1)):
            if list1[i] not in d:
                d[list1[i]] = i

        for i in range(len(list2)):
            if list2[i] in d:
                d[list2[i]] += i

        minn = float('inf')

        for i in d:
            if i in list2:
                if d[i] < minn:
                    minn = d[i]
                    l = [i]
                elif d[i] == minn:
                    l.append(i)

        return l
```


# 704. Binary Search

## Approach

- Initialize two pointers:
  - `low` at the beginning of the array.
  - `high` at the end of the array.
- Find the middle element using `(low + high) // 2`.
- If the middle element is the target, return its index.
- If the target is greater, search the right half.
- Otherwise, search the left half.
- If the target is not found, return `-1`.

## Time Complexity
- **O(log n)**

## Space Complexity
- **O(1)**

## Python Solution

```python
class Solution:
    def search(self, nums: List[int], target: int) -> int:
        low = 0
        high = len(nums) - 1

        while low <= high:
            mid = (low + high) // 2

            if nums[mid] == target:
                return mid
            elif nums[mid] < target:
                low = mid + 1
            else:
                high = mid - 1

        return -1
```


# 2529. Maximum Count of Positive Integer and Negative Integer

## Approach

- Traverse the array once.
- Count the number of negative integers.
- Count the number of positive integers.
- Ignore zeros.
- Return the maximum of the two counts.

## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**

## Python Solution

```python
class Solution:
    def maximumCount(self, nums: List[int]) -> int:
        neg = 0
        pos = 0

        for num in nums:
            if num < 0:
                neg += 1
            elif num > 0:
                pos += 1

        return max(neg, pos)
```

# 1351. Count Negative Numbers in a Sorted Matrix

## Approach

- Traverse each row of the matrix.
- Traverse each element in the row.
- If an element is negative, increment the count.
- Return the total count of negative numbers.

## Time Complexity
- **O(m × n)**

## Space Complexity
- **O(1)**

## Python Solution

```python
class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        count = 0

        for row in grid:
            for num in row:
                if num < 0:
                    count += 1

        return count
```


# 🍬 Distribute Candies

## Problem Statement

Alice has `n` candies, where each candy has a type represented by an integer.

She is allowed to eat only **n / 2** candies.

Your task is to determine the **maximum number of different candy types** she can eat.

---

## Approach

The solution uses a **Python Set**.

A set stores only **unique** values, so duplicate candy types are automatically removed.

### Steps

1. Find the total number of candies.
2. Calculate how many candies Alice can eat (`n // 2`).
3. Store all candy types in a set to get the unique candy types.
4. Compare:
   - Number of unique candy types.
   - Number of candies Alice can eat.
5. Return the smaller value.

---

## Python Implementation

```python
def distributeCandies(candyType):
    unique = set(candyType)

    can_eat = len(candyType) // 2

    if len(unique) < can_eat:
        return len(unique)

    return can_eat
```

A shorter version:

```python
def distributeCandies(candyType):
    return min(len(set(candyType)), len(candyType) // 2)
```

---

## Example

### Input

```python
candyType = [1, 1, 2, 2, 3, 3]
```

### Process

```
Total candies = 6
Can eat = 3

Unique candy types = {1, 2, 3}
Unique count = 3
```

### Output

```
3
```

---

## Time Complexity

- Creating the set: **O(n)**
- Overall: **O(n)**

---

## Space Complexity

- Set stores unique candy types.
- Worst case: **O(n)**

---

## Key Concept

The answer is simply:

```
min(number of unique candy types, total candies // 2)
```

because Alice cannot eat more than `n / 2` candies, and she also cannot eat more different candy types than actually exist.



# Height Checker

## Problem Description

A school wants to arrange students in **non-decreasing order of their heights**.

You are given an array `heights` representing the current order of students.

Your task is to determine **how many students are not standing in the position they would occupy if the array were sorted**.

---

## Approach

1. Create a copy of the original array.
2. Sort the copied array.
3. Compare the original array with the sorted array element by element.
4. Count every index where the values differ.
5. Return the count.

---

## Python Solution

```python
def height_checker(heights):
    expected = sorted(heights)

    count = 0
    for i in range(len(heights)):
        if heights[i] != expected[i]:
            count += 1

    return count


heights = [1, 1, 4, 2, 1, 3]
print(height_checker(heights))
```

---

## Example

**Input**

```text
heights = [1,1,4,2,1,3]
```

**Sorted Order**

```text
[1,1,1,2,3,4]
```

**Comparison**

| Index | Original | Sorted | Match |
|------:|---------:|-------:|:-----:|
| 0 | 1 | 1 | ✅ |
| 1 | 1 | 1 | ✅ |
| 2 | 4 | 1 | ❌ |
| 3 | 2 | 2 | ✅ |
| 4 | 1 | 3 | ❌ |
| 5 | 3 | 4 | ❌ |

Output:

```text
3
```

---

## Time Complexity

- Sorting: **O(n log n)**
- Comparing arrays: **O(n)**

Overall:

```text
O(n log n)
```

---

## Space Complexity

A copy of the array is created.

```text
O(n)
```


# Running Sum of 1D Array

## Problem Description

Given an integer array `nums`, return the **running sum** of the array.

The running sum at index `i` is the sum of all the elements from index `0` to `i`.

Formally,

```text
runningSum[i] = nums[0] + nums[1] + ... + nums[i]
```

---

## Approach

1. Create a variable `sum` and initialize it to `0`.
2. Create a new array `result` of the same size as the input array.
3. Traverse the input array from left to right.
4. Add the current element to `sum`.
5. Store `sum` in the corresponding index of the `result` array.
6. Return the `result` array.

---

## Python Solution

```python
def running_sum(nums):
    total = 0
    result = []

    for num in nums:
        total += num
        result.append(total)

    return result


nums = [1, 2, 3, 4]
print(running_sum(nums))
```

---

## Example

**Input**

```text
nums = [1,2,3,4]
```

**Running Sum**

| Index | Calculation | Result |
|------:|-------------|-------:|
| 0 | 1 | 1 |
| 1 | 1 + 2 | 3 |
| 2 | 1 + 2 + 3 | 6 |
| 3 | 1 + 2 + 3 + 4 | 10 |

**Output**

```text
[1,3,6,10]
```

---

## Time Complexity

The array is traversed once.

```text
O(n)
```

---

## Space Complexity

A new array is created to store the running sums.

```text
O(n)
```


# 🍋 Lemonade Change

A Greedy Algorithm solution to the **LeetCode 860 - Lemonade Change** problem.

## 📖 Problem Description

At a lemonade stand, each lemonade costs **$5**.

Customers pay using either:

- $5
- $10
- $20

Initially, the seller has **no money**.

For every customer, determine whether it is possible to provide the correct change. Return **True** if every customer can be served successfully; otherwise return **False**.

---

## 💡 Approach

This problem is solved using the **Greedy Algorithm**.

Instead of storing every bill received, we only keep track of:

- Number of **$5 bills**
- Number of **$10 bills**

### Why Greedy?

Whenever a customer pays with **$20**, we need to return **$15**.

There are two possible ways:

1. **$10 + $5** ✅ (Preferred)
2. **$5 + $5 + $5**

The greedy choice is to always give **$10 + $5** first because **$5 bills are more valuable** for future transactions. Every customer paying with a $10 bill requires a $5 bill as change.

---

## 🔄 Algorithm

1. Initialize two counters:
   - `five = 0`
   - `ten = 0`

2. Traverse through each customer's bill.

### If the customer pays with **$5**
- No change is needed.
- Increase the number of $5 bills.

### If the customer pays with **$10**
- Give one $5 bill as change.
- Increase the number of $10 bills.
- If no $5 bill is available, return `False`.

### If the customer pays with **$20**
Try the following in order:

1. Give one $10 and one $5.
2. Otherwise, give three $5 bills.
3. If neither is possible, return `False`.

If all customers are processed successfully, return `True`.

---

## ⏱️ Time Complexity

- **O(n)**

Each customer is processed exactly once.

---

## 💾 Space Complexity

- **O(1)**

Only two integer variables are used regardless of input size.

---

## 📂 Repository Structure

```
Lemonade-Change/
│
├── solution.py
└── README.md
```

---

## 🐍 Python Solution

```python
class Solution:
    def lemonadeChange(self, bills: List[int]) -> bool:
        five = 0
        ten = 0

        for bill in bills:

            if bill == 5:
                five += 1

            if bill == 10:
                if five >= 1:
                    five -= 1
                    ten += 1
                else:
                    return False

            if bill == 20:
                if five >= 1 and ten >= 1:
                    five -= 1
                    ten -= 1
                elif five >= 3:
                    five -= 3
                else:
                    return False

        return True
```

---

## 🎯 Key Learning

This problem demonstrates an important Greedy principle:

> **Whenever multiple valid choices exist, make the choice that preserves the most valuable resource for future decisions.**

In this problem, **$5 bills are the most valuable resource**, so we preserve them whenever possible by giving **$10 + $5** instead of **three $5 bills**.



# Find Lucky Integer in an Array

## Problem Statement

Given an integer array `arr`, a **lucky integer** is an integer whose **frequency in the array is equal to its value**.

Return the **largest lucky integer** in the array. If no lucky integer exists, return `-1`.

### Example

**Input**
```text
arr = [2,2,3,4]
```

**Output**
```text
2
```

**Explanation**

- Frequency of `2` = 2 ✅
- Frequency of `3` = 1 ❌
- Frequency of `4` = 1 ❌

Hence, the answer is `2`.

---

## Approach

1. Create a dictionary to store the frequency of every number.
2. Traverse the array and count the occurrences of each element.
3. Iterate through the dictionary.
4. If a number is equal to its frequency, it is a lucky integer.
5. Store all lucky integers.
6. Return the largest lucky integer.
7. If no lucky integer exists, return `-1`.

---

## Time Complexity

- **Counting frequencies:** `O(n)`
- **Checking lucky integers:** `O(k)`

Overall:

```text
O(n)
```

where `n` is the length of the array.

---

## Space Complexity

```text
O(k)
```

where `k` is the number of distinct elements in the array.

---

## Python Solution

```python
class Solution:
    def findLucky(self, arr: List[int]) -> int:
        l = []
        f = 0
        d = {}

        for i in range(0, len(arr)):
            if arr[i] not in d:
                d[arr[i]] = 1
            else:
                d[arr[i]] += 1

        for i in d:
            if i == d[i]:
                f = 1
                l.append(i)

        if f == 1:
            return max(l)

        return -1
```

---

## Key Concepts Used

- Dictionary (Hash Map)
- Frequency Counting
- Array Traversal
- Conditional Checking
- Maximum Element



# Kids With the Greatest Number of Candies

## Problem Statement

There are `n` kids, where `candies[i]` represents the number of candies the `i`th kid has. You are also given an integer `extraCandies`, representing the number of extra candies you can give to a single kid.

Return a boolean array where each element is:

- `True` if giving all the extra candies to that kid makes them have the **greatest number of candies** among all kids.
- `False` otherwise.

---

## Example

**Input**

```text
candies = [2,3,5,1,3]
extraCandies = 3
```

**Output**

```text
[True, True, True, False, True]
```

**Explanation**

- Kid 1: 2 + 3 = 5 ✓
- Kid 2: 3 + 3 = 6 ✓
- Kid 3: 5 + 3 = 8 ✓
- Kid 4: 1 + 3 = 4 ✗
- Kid 5: 3 + 3 = 6 ✓

Hence, the result is:

```text
[True, True, True, False, True]
```

---

## Approach

1. Find the maximum number of candies any kid currently has.
2. Traverse the `candies` array.
3. For each kid, add `extraCandies` to their current candies.
4. Compare the result with the maximum value.
5. If it is greater than or equal to the maximum, append `True`; otherwise, append `False`.
6. Return the resulting boolean list.

---

## Time Complexity

- Finding the maximum element: `O(n)`
- Traversing the array: `O(n)`

Overall:

```text
O(n)
```

---

## Space Complexity

```text
O(n)
```

The output list stores one boolean value for each kid.

---

## Python Solution

```python
class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        l = []

        for i in candies:
            if i + extraCandies >= max(candies):
                l.append(True)
            else:
                l.append(False)

        return l
```

---

## Key Concepts Used

- Arrays (Lists)
- Traversal
- Maximum Element
- Conditional Statements
- Boolean Lists


# Unique Email Addresses

## Problem
Given a list of email addresses, return the number of unique email addresses after applying the following rules:

- Ignore all `.` (dots) in the local name (before `@`).
- Ignore everything after the first `+` in the local name.
- The domain name (after `@`) remains unchanged.

---

## Python Solution

```python
class Solution:
    def numUniqueEmails(self, emails: List[str]) -> int:
        lookup = set()

        for email in emails:
            local, domain = email.split('@')

            temp = []

            for ch in local:
                if ch == '.':
                    continue
                if ch == '+':
                    break
                temp.append(ch)

            lookup.add(''.join(temp) + '@' + domain)

        return len(lookup)
```

---

## Explanation

### Step 1: Create a set

```python
lookup = set()
```

A set stores only unique values. Duplicate emails are automatically ignored.

---

### Step 2: Traverse every email

```python
for email in emails:
```

Process each email one by one.

---

### Step 3: Split the email

```python
local, domain = email.split('@')
```

Example:

```
test.email+alex@leetcode.com
```

becomes

```
local  = "test.email+alex"
domain = "leetcode.com"
```

---

### Step 4: Create an empty list

```python
temp = []
```

This list stores the valid characters of the local name.

---

### Step 5: Traverse the local name

```python
for ch in local:
```

Read each character one by one.

---

### Step 6: Ignore dots

```python
if ch == '.':
    continue
```

`.` does not affect the email.

Example:

```
te.st.email
```

becomes

```
testemail
```

---

### Step 7: Stop at '+'

```python
if ch == '+':
    break
```

Everything after `+` is ignored.

Example:

```
test+alex
```

becomes

```
test
```

---

### Step 8: Store valid characters

```python
temp.append(ch)
```

Characters that are neither `.` nor after `+` are added to the list.

Example:

```
temp = ['t', 'e', 's', 't']
```

---

### Step 9: Build the normalized email

```python
lookup.add(''.join(temp) + '@' + domain)
```

`''.join(temp)` converts the list into a string.

Example:

```
['t', 'e', 's', 't']
```

becomes

```
"test"
```

Final email:

```
test@leetcode.com
```

This email is added to the set.

---

### Step 10: Return the answer

```python
return len(lookup)
```

The size of the set is the number of unique email addresses.

---

## Example

### Input

```python
emails = [
    "test.email+alex@leetcode.com",
    "test.e.mail+bob.cathy@leetcode.com",
    "testemail+david@lee.tcode.com"
]
```

### Processing

```
test.email+alex@leetcode.com
→ testemail@leetcode.com

test.e.mail+bob.cathy@leetcode.com
→ testemail@leetcode.com

testemail+david@lee.tcode.com
→ testemail@lee.tcode.com
```

### Unique Emails

```
testemail@leetcode.com
testemail@lee.tcode.com
```

### Output

```
2
```

---

## Time Complexity

```
O(n × m)
```

- `n` = Number of emails
- `m` = Average length of each email

---

## Space Complexity

```
O(n)
```

The set stores all unique normalized email addresses.


# Merge Sorted Array (LeetCode 88)

## Problem Statement
Uses 3 pointers!
You are given two sorted integer arrays `nums1` and `nums2`, and two integers `m` and `n` representing the number of valid elements in each array.

- `nums1` has a size of `m + n`.
- The first `m` elements are valid.
- The last `n` elements are `0` and are placeholders.
- Merge `nums2` into `nums1` so that the final array remains sorted in non-decreasing order.

The merge must be performed **in-place**.

---

## Approach

Instead of merging from the beginning, start from the **end** of both arrays.

### Steps

1. Point `x` to the last valid element of `nums1`.
2. Point `y` to the last element of `nums2`.
3. Point `z` to the last position of `nums1`.
4. Compare `nums1[x]` and `nums2[y]`.
5. Place the larger element at `nums1[z]`.
6. Move the corresponding pointer.
7. Continue until all elements of `nums2` have been merged.

This avoids shifting elements and achieves an optimal solution.

---

## Time Complexity

- **O(m + n)**

## Space Complexity

- **O(1)**

---

## Python Solution

```python
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """

        x = m - 1
        y = n - 1
        z = m + n - 1

        while y >= 0:
            if x >= 0 and nums1[x] >= nums2[y]:
                nums1[z] = nums1[x]
                x -= 1
            else:
                nums1[z] = nums2[y]
                y -= 1

            z -= 1
```

---

## Example

### Input

```text
nums1 = [1,2,3,0,0,0]
m = 3

nums2 = [2,5,6]
n = 3
```

### Output

```text
[1,2,2,3,5,6]
```

---

## Key Idea

The empty spaces are already available at the end of `nums1`.

By filling these positions from right to left using the largest remaining element from either array, we avoid shifting elements and perform the merge in linear time.


# Squares of a Sorted Array (LeetCode 977)

## Problem Statement

Given an integer array `nums` sorted in non-decreasing order, return an array of the squares of each number, also sorted in non-decreasing order.

---

## Approach

1. Create a new array to store the squared values.
2. Traverse the input array.
3. Square each element and store it in the new array.
4. Sort the new array.
5. Return the sorted squared array.

This is a straightforward approach that first computes all squares and then sorts the result.

---

## Time Complexity

- Squaring each element: **O(n)**
- Sorting the squared array: **O(n log n)**

**Overall:** **O(n log n)**

---

## Space Complexity

- Extra array for storing squares: **O(n)**

---

## Python Solution

```python
class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        result = []

        for num in nums:
            result.append(num * num)

        result.sort()
        return result
```

---

## Example

### Input

```text
nums = [-4,-1,0,3,10]
```

### Output

```text
[0,1,9,16,100]
```

---

## Explanation

The squares of the elements are:

```text
16, 1, 0, 9, 100
```

After sorting them:

```text
0, 1, 9, 16, 100
```

---

## Note

This solution is simple and easy to understand but is **not the most optimal**. Since the input array is already sorted, a two-pointer approach can solve the problem in **O(n)** time without using a sorting algorithm.



# Move Zeroes (LeetCode 283)

## Problem
Given an integer array `nums`, move all `0`s to the end while maintaining the relative order of the non-zero elements.

The operation must be performed **in-place**, without creating another array.

### Example

**Input**
```text
nums = [0,1,0,3,12]
```

**Output**
```text
[1,3,12,0,0]
```

---

# Intuition

Instead of creating a new array, we use **Two Pointers**.

- `i` → Scans every element of the array.
- `j` → Points to the position where the next non-zero element should be placed.

Whenever a non-zero element is found:

- Swap `nums[i]` with `nums[j]`.
- Increment `j`.

Zeroes are skipped automatically and end up at the back of the array.

---

# Dry Run

Initial Array

```text
[0,1,0,3,12]

i = 0
j = 0
```

### Iteration 1

```text
nums[i] = 0

Skip

Array:
[0,1,0,3,12]

i = 1
j = 0
```

---

### Iteration 2

```text
nums[i] = 1

Swap nums[1] and nums[0]

[1,0,0,3,12]

j = 1
```

---

### Iteration 3

```text
nums[i] = 0

Skip

[1,0,0,3,12]

j = 1
```

---

### Iteration 4

```text
nums[i] = 3

Swap nums[3] and nums[1]

[1,3,0,0,12]

j = 2
```

---

### Iteration 5

```text
nums[i] = 12

Swap nums[4] and nums[2]

[1,3,12,0,0]

j = 3
```

Final Answer

```text
[1,3,12,0,0]
```

---

# Algorithm

1. Initialize `j = 0`.
2. Traverse the array using pointer `i`.
3. If `nums[i]` is non-zero:
   - Swap `nums[i]` and `nums[j]`.
   - Increment `j`.
4. Continue until the end of the array.

---

# Python Code

```Python Code

class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        j=0
        for i in range(0,len(nums)):
            if(nums[i]!=0):
                temp=nums[i]
                nums[i]=nums[j]
                nums[j]=temp
                j+=1
        return nums
```

---

# Time Complexity

```text
O(n)
```

The array is traversed only once.

---

# Space Complexity

```text
O(1)
```

No extra array is used.

---

# Key Learning

This problem introduces the **Two Pointer** technique.

- `i` is the **scanner** that visits every element.
- `j` is the **destination pointer** where the next valid element should be placed.
- `i` always moves forward.
- `j` moves only after placing a non-zero element.

This pattern is commonly used in problems like:

- Remove Element
- Remove Duplicates from Sorted Array
- Sort Colors
- Partition Array
- Merge Sorted Arrays


# Baseball Game (LeetCode 682)

## Problem

You are given a list of operations representing scores in a baseball game.

Operations:

- Integer → Add a new score.
- `"+"` → Add the previous two scores.
- `"D"` → Add double the previous score.
- `"C"` → Remove the previous score.

Return the total score after performing all operations.

---

## Example

**Input**

```text
["5","-2","4","C","D","9","+","+"]
```

**Output**

```text
27
```

---

## Intuition

Use a **stack (list)** to store valid scores.

- Number → Push into the stack.
- `"C"` → Remove the last score.
- `"D"` → Push double of the last score.
- `"+"` → Push the sum of the last two scores.

Finally, return the sum of all values in the stack.

---

## Python Code

```python
class Solution:
    def calPoints(self, operations: List[str]) -> int:
        l = []

        for i in operations:

            if i not in ['C', 'D', '+']:
                l.append(int(i))

            elif i == 'C':
                l.pop()

            elif i == 'D':
                l.append(2 * l[-1])

            elif i == '+':
                l.append(l[-1] + l[-2])

        return sum(l)
```

---

## Time Complexity

```text
O(n)
```

Each operation is processed once.

---

## Space Complexity

```text
O(n)
```

The stack stores all valid scores.

---

## Key Learning

This problem uses the **Stack** data structure.

Useful stack operations:

- `append()` → Push
- `pop()` → Remove top element
- `l[-1]` → Top element
- `l[-2]` → Second top element

Whenever a problem repeatedly uses the **most recent element**, consider using a **stack**.



# 674. Longest Continuous Increasing Subsequence

## Problem Statement

Given an unsorted array of integers `nums`, return the length of the longest **continuous increasing subsequence**.

A continuous increasing subsequence satisfies:

```
nums[i] < nums[i + 1]
```

for every adjacent pair in the subsequence.

---

## Example

### Input

```python
nums = [1, 3, 5, 4, 7]
```

### Output

```python
3
```

### Explanation

The longest continuous increasing subsequence is:

```python
[1, 3, 5]
```

---

## Intuition

- Every element alone is an increasing subsequence of length **1**.
- Traverse the array from left to right.
- Compare the current element with the previous element.
- If the sequence is increasing:
  - Extend the current streak.
- Otherwise:
  - Start a new streak from the current element.
- Keep track of the maximum streak encountered.

---

## Time Complexity

- **O(n)**

## Space Complexity

- **O(1)**

---

## Python Solution

```python
class Solution:
    def findLengthOfLCIS(self, nums: List[int]) -> int:
        best = 1
        curr = 1

        for i in range(1, len(nums)):
            if nums[i] > nums[i - 1]:
                curr += 1
                if curr > best:
                    best = curr
            else:
                curr = 1

        return best
```



# 747. Largest Number At Least Twice of Others

## Problem Statement

Given an integer array `nums` where the largest element is unique, determine whether it is at least **twice as large** as every other number in the array.

- If the condition is satisfied, return the **index** of the largest element.
- Otherwise, return **-1**.

---

## Example 1

### Input

```python
nums = [3, 6, 1, 0]
```

### Output

```python
1
```

### Explanation

- Largest element = `6`
- Index of `6` = `1`
- `6 >= 2 × 3`
- `6 >= 2 × 1`
- `6 >= 2 × 0`

Hence, return `1`.

---

## Example 2

### Input

```python
nums = [1, 2, 3, 4]
```

### Output

```python
-1
```

### Explanation

- Largest element = `4`
- `4 < 2 × 3`

Hence, return `-1`.

---

## Intuition

- Find the largest element in the array.
- Store its index.
- Double every other element.
- If every doubled value is less than or equal to the largest element, return the index of the largest element.
- Otherwise, return `-1`.

---

## Time Complexity

- **O(n)**

## Space Complexity

- **O(n)**

---

## Python Solution

```python
class Solution:
    def dominantIndex(self, nums: List[int]) -> int:
        l = []
        f = 0

        a = max(nums)
        ind = nums.index(a)

        for i in nums:
            if i != a:
                l.append(2 * i)

        for i in range(len(l)):
            if l[i] <= a:
                f = 1
            else:
                return -1

        if f == 1:
            return ind
```


# 2154. Keep Multiplying Found Values by Two

## Problem

You are given an integer array `nums` and an integer `original`.

- If `original` is found in `nums`, multiply it by `2`.
- Repeat this process until `original` is no longer present in `nums`.

Return the final value of `original`.

---

## Python Solution

```python
class Solution:
    def findFinalValue(self, nums: List[int], original: int) -> int:
        while original in nums:
            for i in nums:
                if i == original:
                    original *= 2
        return original
```

---

## Intuition

- Keep checking whether `original` exists in the array.
- If it does, double its value.
- Repeat until the current value is no longer found.
- Return the final value.

---

## Complexity Analysis

- **Time Complexity:** `O(n × k)`
  - `n` = length of `nums`
  - `k` = number of times `original` is doubled

- **Space Complexity:** `O(1)`


# 3168. Minimum Number of Chairs in a Waiting Room

## Problem

You are given a string `s` where:

- `'E'` represents a person entering the waiting room.
- `'L'` represents a person leaving the waiting room.

Return the minimum number of chairs required so that every person who enters always has a chair.

---

## Python Solution

```python
class Solution:
    def minimumChairs(self, s: str) -> int:
        best = 0
        curr = 0

        for i in range(len(s)):
            if s[i] == 'E':
                curr += 1
                if curr > best:
                    best = curr

            if s[i] == 'L':
                curr -= 1

        return best
```

---

## Intuition

- Keep track of the number of people currently in the waiting room.
- Increase the count when someone enters (`'E'`).
- Decrease the count when someone leaves (`'L'`).
- The maximum number of people present at any point is the minimum number of chairs required.

---

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`



# 1646. Get Maximum in Generated Array

## Problem
Given an integer `n`, generate an array `nums` of length `n + 1` using the following rules:

- `nums[0] = 0`
- `nums[1] = 1`
- `nums[2 * i] = nums[i]` when `2 * i <= n`
- `nums[2 * i + 1] = nums[i] + nums[i + 1]` when `2 * i + 1 <= n`

Return the maximum value present in the generated array.

---

## Intuition

The array is **not given**. We have to generate it from scratch.

Start with:

```
nums[0] = 0
nums[1] = 1
```

For every valid index `i`:

- Copy the value to the even index (`2*i`).
- Add two previously generated values for the odd index (`2*i+1`).

Since every new value depends only on already generated values, we can build the array from left to right.

Finally, return the maximum element in the generated array.

---

## Algorithm

1. Handle the edge case when `n == 0`.
2. Create an array of size `n + 1`.
3. Initialize:
   - `nums[0] = 0`
   - `nums[1] = 1`
4. Traverse through the indices.
5. If `2*i <= n`, generate the even index.
6. If `2*i + 1 <= n`, generate the odd index.
7. Return the maximum element of the array.

---

## Python Solution

```python
class Solution:
    def getMaximumGenerated(self, n: int) -> int:
        if(n==0):
            return 0
        nums=[0]*(n+1)
        nums[0]=0
        nums[1]=1
        for i in range(0,n+2):
            if(2*i<=n):
                nums[2*i]=nums[i]
            if(2*i+1<=n):
                nums[2*i+1]=nums[i]+nums[i+1]
        return max(nums)
```

---

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

---

## Key Learning

- Building an array using previously computed values.
- Careful handling of array boundaries.
- Translating mathematical rules directly into code.
- Simple Dynamic Programming (Bottom-Up Construction).


# 1748. Sum of Unique Elements

## Problem

Given an integer array `nums`, return the **sum of all elements that appear exactly once** in the array.

---

## Intuition

We first count the frequency of every element using a dictionary.

- If an element appears for the first time, store it with a count of `1`.
- If it appears again, increase its frequency.

After counting all frequencies, traverse the dictionary and collect only the elements whose frequency is `1`.

Finally, return the sum of those unique elements.

---

## Algorithm

1. Create an empty dictionary to store frequencies.
2. Traverse the array:
   - If the element is not present in the dictionary, store it with frequency `1`.
   - Otherwise, increment its frequency.
3. Create an empty list.
4. Traverse the dictionary:
   - If an element has frequency `1`, add it to the list.
5. Return the sum of the list.

---

## Python Solution

```python
class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        d = {}
        l = []

        for i in range(len(nums)):
            if nums[i] not in d:
                d[nums[i]] = 1
            else:
                d[nums[i]] += 1

        for i in d:
            if d[i] == 1:
                l.append(i)

        return sum(l)
```

---

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

---

## Key Learning

- Counting element frequencies using a dictionary (hash map).
- Identifying unique elements based on their frequency.
- Using `sum()` to efficiently compute the total of all unique values.
- A hash map is an efficient choice for frequency counting problems.


# Min Cost Climbing Stairs

## Problem

You are given an integer array `cost` where `cost[i]` is the cost of stepping on the `i-th` stair.

You can either climb **1** or **2** stairs at a time, and you may start from stair `0` or stair `1`.

Return the minimum cost required to reach the top.

---

## Intuition

Instead of finding the minimum cost from the beginning, we solve the problem **from the end towards the beginning**.

The last position (the top) requires **0 cost**, so we append `0` to the array.

For every stair, there are only two choices:

- Move to the next stair.
- Skip one stair.

The minimum cost from the current stair is therefore:

```
cost[i] = cost[i] + min(cost[i+1], cost[i+2])
```

We update the array itself, so no extra DP array is needed.

Finally, since we can start from either stair `0` or stair `1`, the answer is

```
min(cost[0], cost[1])
```

---

## Python Solution

```python
class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        cost.append(0)

        for i in range(len(cost) - 3, -1, -1):
            cost[i] = min(cost[i] + cost[i + 1],
                          cost[i] + cost[i + 2])

        return min(cost[0], cost[1])
```

---

## Dry Run

Input

```
cost = [10, 15, 20]
```

After appending `0`

```
[10, 15, 20, 0]
```

Process from right to left:

```
i = 1

15 + min(20, 0)
= 15

Array:
[10, 15, 20, 0]
```

```
i = 0

10 + min(15, 20)
= 25

Array:
[25, 15, 20, 0]
```

Answer

```
min(25, 15) = 15
```

---

## Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

The input array is modified in-place, so no additional dynamic programming array is required.


# N-th Tribonacci Number

## Problem

The Tribonacci sequence is defined as:

- T₀ = 0
- T₁ = 1
- T₂ = 1

For every `n >= 0`,

```
Tₙ₊₃ = Tₙ + Tₙ₊₁ + Tₙ₊₂
```

Given an integer `n`, return the value of `Tₙ`.

---

## Intuition

The current Tribonacci number depends only on the previous three Tribonacci numbers.

We create a DP array where each index stores a Tribonacci number.

```
arr[0] = T0
arr[1] = T1
arr[2] = T2
```

Then, starting from index `3`, we compute every new Tribonacci number using the previous three values.

Since the loop computes values only up to `T(n-1)`, the answer `T(n)` is obtained by summing the last three computed Tribonacci numbers.

---

## Python Solution

```python
class Solution:
    def tribonacci(self, n: int) -> int:
        if n == 0:
            return 0
        if n == 1:
            return 1
        if n == 2:
            return 1

        arr = [0] * n
        arr[0] = 0
        arr[1] = 1
        arr[2] = 1

        for i in range(3, n):
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3]

        return arr[n-1] + arr[n-2] + arr[n-3]
```

---

## Dry Run

### Input

```
n = 4
```

Initial array

```
[0, 1, 1, 0]
```

### Iteration

```
i = 3

arr[3] = arr[2] + arr[1] + arr[0]
       = 1 + 1 + 0
       = 2
```

Array becomes

```
[0, 1, 1, 2]
```

### Answer

```
arr[3] + arr[2] + arr[1]
= 2 + 1 + 1
= 4
```

---

## Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(n)



# Number of Good Pairs

## Problem
Given an integer array `nums`, return the number of **good pairs**.

A pair `(i, j)` is considered **good** if:

- `nums[i] == nums[j]`
- `i < j`

---

## Approach

This solution uses the **Brute Force (Nested Loop)** approach.

1. Compare every element with all the elements after it.
2. If two elements are equal, store their indices as a pair.
3. Return the total number of stored pairs.

Since every possible pair is checked, the algorithm correctly counts all good pairs.

---

## Java Solution

```java
import java.util.ArrayList;
import java.util.List;

public class Number_of_Good_Pairs {
    public static int check(int[] nums){
        List<int[]> l = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    l.add(new int[]{i, j});
                }
            }
        }

        int count = 0;
        for(int[] p : l){
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,1,1,3};
        int g = check(a);
        System.out.println(g);
    }
}
```

---

## Python Solution

```python
class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        l = []

        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] == nums[j]:
                    l.append([i, j])

        return len(l)
```

---

## Example

**Input**

```text
nums = [1,2,3,1,1,3]
```

**Stored Pairs**

```text
(0,3)
(0,4)
(2,5)
(3,4)
```

**Output**

```text
4
```

---

## Complexity Analysis

### Time Complexity

```
O(n²)
```

Two nested loops compare every possible pair.

### Space Complexity

```
O(k)
```

where `k` is the number of good pairs stored in the list.

In the worst case (all elements are equal), `k = n(n-1)/2`, making the space complexity **O(n²)**.

---

## Note

This solution stores every good pair before counting them. An optimized solution using a **HashMap** can solve the problem in **O(n)** time with **O(n)** extra space.



# Find Greatest Common Divisor of an Array

## Problem
Given an integer array `nums`, return the **greatest common divisor (GCD)** of the smallest and largest numbers in the array.

---

## Approach

1. Find the **minimum** and **maximum** elements in the array.
2. Use the **Euclidean Algorithm** to compute their GCD.
3. Return the GCD.

The Euclidean Algorithm repeatedly replaces the larger number with the remainder obtained after dividing it by the smaller number until one number becomes `0`. The other number is the GCD.

---

## Time Complexity

- Finding minimum and maximum: **O(n)**
- Euclidean Algorithm: **O(log(min(nums)))**

**Overall:** `O(n)`

---

## Space Complexity

- **O(1)**

---

## Python Solution

```python
class Solution:
    def findGCD(self, nums: List[int]) -> int:
        mi = min(nums)
        ma = max(nums)

        while ma > 0 and mi > 0:
            if ma > mi:
                ma = ma % mi
            else:
                mi = mi % ma

        if ma == 0:
            return mi
        return ma
```

## Example

**Input**

```text
nums = [2,5,6,9,10]
```

**Output**

```text
2
```

**Explanation**

- Smallest element = `2`
- Largest element = `10`
- `GCD(2, 10) = 2`

---
**Algorithm Used:** Euclidean Algorithm


# Three Divisors

## Problem

Given an integer `n`, return `true` if `n` has **exactly three positive divisors**. Otherwise, return `false`.

---

## Approach

1. Traverse all numbers from `1` to `n`.
2. Check if the current number divides `n` evenly.
3. If it does, add it to a list of divisors.
4. After the traversal, check the size of the list.
5. If the list contains exactly **3** divisors, return `True`; otherwise, return `False`.

---

## Time Complexity

- **O(n)**

---

## Space Complexity

- **O(n)** (stores all divisors in a list)

---

## Python Solution

```python
class Solution:
    def isThree(self, n: int) -> bool:
        l = []

        for i in range(1, n + 1):
            if n % i == 0:
                l.append(i)

        return len(l) == 3
```

---

## Example

**Input**

```text
n = 4
```

**Output**

```text
True
```

**Explanation**

The divisors of `4` are:

```text
1, 2, 4
```

Since there are exactly **3** divisors, the answer is `True`.

---

## Another Example

**Input**

```text
n = 6
```

**Output**

```text
False
```

**Explanation**

The divisors of `6` are:

```text
1, 2, 3, 6
```

There are **4** divisors, so the answer is `False`.

---

**Algorithm Used:** Brute Force (Divisor Counting)
