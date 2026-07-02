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
