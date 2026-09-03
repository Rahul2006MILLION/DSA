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



# Smallest Even Multiple

## Problem

Given a positive integer `n`, return the **smallest positive integer** that is a multiple of both `2` and `n`.

---

## Approach

1. Check whether `n` is even.
2. If `n` is even, it is already a multiple of `2`, so return `n`.
3. If `n` is odd, multiply it by `2` to get the smallest even multiple.

---

## Time Complexity

- **O(1)**

---

## Space Complexity

- **O(1)**

---

## Python Solution

```python
class Solution:
    def smallestEvenMultiple(self, n: int) -> int:
        if n % 2 == 0:
            return n
        else:
            return n * 2
```

---

## Example 1

**Input**

```text
n = 5
```

**Output**

```text
10
```

**Explanation**

- Multiples of `2`: `2, 4, 6, 8, 10, ...`
- Multiples of `5`: `5, 10, 15, ...`

The smallest common multiple is **10**.

---

## Example 2

**Input**

```text
n = 6
```

**Output**

```text
6
```

**Explanation**

Since `6` is already even, it is a multiple of both `2` and `6`.

---

**Algorithm Used:** Mathematical Observation
```


# Convert the Temperature

## Problem

Given a non-negative floating-point number `celsius`, convert it into **Kelvin** and **Fahrenheit**, and return the results as an array in the order:

```text
[kelvin, fahrenheit]
```

---

## Approach

1. Convert Celsius to Kelvin using the formula:
   ```text
   Kelvin = Celsius + 273.15
   ```
2. Convert Celsius to Fahrenheit using the formula:
   ```text
   Fahrenheit = Celsius × 1.80 + 32.00
   ```
3. Store both converted values in a list and return it.

---

## Time Complexity

- **O(1)**

---

## Space Complexity

- **O(1)**

---

## Python Solution

```python
class Solution:
    def convertTemperature(self, celsius: float) -> List[float]:
        l = []

        kelvin = celsius + 273.15
        fahrenheit = celsius * 1.80 + 32.00

        l.append(kelvin)
        l.append(fahrenheit)

        return l
```

---

## Example

**Input**

```text
celsius = 36.50
```

**Output**

```text
[309.65000, 97.70000]
```

**Explanation**

- Kelvin = `36.50 + 273.15 = 309.65`
- Fahrenheit = `36.50 × 1.80 + 32.00 = 97.70`

The converted temperatures are returned as:

```text
[309.65, 97.70]
```

---

## Formula Used

- **Kelvin** = `Celsius + 273.15`
- **Fahrenheit** = `Celsius × 1.80 + 32.00`

---

**Algorithm Used:** Mathematical Formula


***


# Minimum Cuts to Divide a Circle

## Problem

Given an integer `n`, return the **minimum number of cuts** needed to divide a circle into exactly `n` equal slices.

---

## Approach

1. If `n` is `1`, no cuts are needed, so return `0`.
2. If `n` is even, each cut can divide the circle into two equal parts passing through the center, so the minimum cuts required are `n / 2`.
3. If `n` is odd (greater than `1`), each slice requires a separate cut, so return `n`.

---

## Time Complexity

- **O(1)**

---

## Space Complexity

- **O(1)**

---

## Python Solution

```python
class Solution:
    def numberOfCuts(self, n: int) -> int:
        if n == 1:
            return 0
        if n % 2 == 0:
            return n // 2
        return n
```

---

## Example 1

**Input**

```text
n = 4
```

**Output**

```text
2
```

**Explanation**

Two cuts passing through the center divide the circle into four equal slices.

---

## Example 2

**Input**

```text
n = 3
```

**Output**

```text
3
```

**Explanation**

Since `3` is odd, three cuts are needed to create three equal slices.

---

## Example 3

**Input**

```text
n = 1
```

**Output**

```text
0
```

**Explanation**

No cuts are needed because the circle already consists of one whole piece.

---

**Algorithm Used:** Mathematical Observation



# Teemo Attacking

## Problem

Given an array `timeSeries` where each value represents the time Teemo attacks, and an integer `duration` representing how long the poison lasts after each attack, calculate the total time the target remains poisoned.

## Approach

For every attack except the last one:

* Calculate the time gap between the current attack and the next attack.
* The poison contributed by that attack is the smaller of:

  * the time gap
  * `duration`
* Add this value to `total`.

For the final attack, add the full `duration` because there is no later attack to overlap with it.

### Formula

```text
min(timeSeries[i + 1] - timeSeries[i], duration)
```

## Complexity

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(1)`

## Python Code

```python
class Solution:

    def findPoisonedDuration(self, timeSeries: List[int], duration: int) -> int:

        total = 0

        for i in range(0, len(timeSeries) - 1):

            a = min((timeSeries[i + 1] - timeSeries[i]), duration)

            total += a

        return total + duration
```

# LeetCode Solutions

---

# Can Place Flowers

## Problem

You are given a flowerbed represented by an array:

- `0` → empty plot
- `1` → plot already containing a flower

You need to determine whether `n` new flowers can be planted without violating the rule that no two flowers can be adjacent.

## Approach

We iterate through the flowerbed and check whether the current position is safe for planting.

A position `i` is valid when:

1. `flowerbed[i] == 0`
2. There is no flower on the left:
   `i == 0 or flowerbed[i-1] == 0`
3. There is no flower on the right:
   `i == len(flowerbed)-1 or flowerbed[i+1] == 0`

If all conditions are satisfied, we place a flower and decrease `n` by `1`.

If `n` becomes `0`, we return `True`.

## Python Solution

```python
class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        if n == 0:
            return True

        for i in range(0, len(flowerbed)):
            if (flowerbed[i] == 0 and
                (i == 0 or flowerbed[i-1] == 0) and
                (i == len(flowerbed)-1 or flowerbed[i+1] == 0)):

                flowerbed[i] = 1
                n -= 1

                if n == 0:
                    return True

        return False
```

## Complexity

```text
Time:  O(n)
Space: O(1)
```

---

# Maximum Product of Two Elements in an Array

## Problem

Given an integer array `nums`, choose two different elements from the array and return the maximum value of:

```text
(nums[i] - 1) * (nums[j] - 1)
```

## Approach

The maximum product will always come from the **two largest elements** in the array.

So:

1. Sort the array.
2. The largest element is at `nums[len(nums) - 1]`.
3. The second largest element is at `nums[len(nums) - 2]`.
4. Calculate:

```text
(largest - 1) * (secondLargest - 1)
```

## Example

```text
Input:
[3, 4, 5, 2]

After sorting:
[2, 3, 4, 5]

Largest = 5
Second largest = 4

(5 - 1) * (4 - 1)
= 4 * 3
= 12
```

## Python Solution

```python
class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        nums.sort()

        largest = nums[-1]
        secondLargest = nums[-2]

        return (largest - 1) * (secondLargest - 1)
```

## Complexity

```text
Time:  O(n log n)
Space: O(1)
```

---

# Range Sum Query - Immutable

## Problem

Find the sum of elements from index `lef` to index `rig`.

## Example

```text
nums = [-2, 0, 3, -5, 2, -1]

lef = 0
rig = 2

Answer = -2 + 0 + 3
       = 1
```

## Approach: Prefix Sum

Instead of calculating the range sum again, we create a **prefix sum array**.

For:

```text
nums = [-2, 0, 3, -5, 2, -1]
```

The prefix sum becomes:

```text
[-2, -2, 1, -4, -2, -3]
```

Each position stores the sum of all elements from index `0` up to that position.

For example:

```text
prefix[0] = -2

prefix[1] = -2 + 0
          = -2

prefix[2] = -2 + 0 + 3
          = 1

prefix[3] = -2 + 0 + 3 - 5
          = -4
```

## Finding the Answer

If `lef == 0`:

```text
answer = prefix[rig]
```

Because we want everything from index `0` to `rig`.

If `lef != 0`:

```text
answer = prefix[rig] - prefix[lef - 1]
```

### Why?

`prefix[rig]` contains everything from index `0` to `rig`.

`prefix[lef - 1]` contains everything before `lef`.

So subtracting them removes the unwanted part.

## Python Solution

```python
def g():
    nums = [-2, 0, 3, -5, 2, -1]
    lef = 0
    rig = 2

    l = []
    c = 0

    for i in range(0, len(nums)):
        c += nums[i]
        l.append(c)

    if lef == 0:
        ans = l[rig]
    else:
        ans = l[rig] - l[lef - 1]

    return ans


print(g())
```

## Output

```text
1
```

## Complexity

```text
Time:  O(n)
Space: O(n)
```

## Main Intuition

Build the prefix sum **once**.

Then:

```text
lef == 0
→ prefix[rig]

lef != 0
→ prefix[rig] - prefix[lef - 1]
```

This allows us to find a range sum in **O(1)** time after the prefix sum array has been created.




# Find Pivot Index

## Problem

Find an index where the **sum of all elements on the left** is equal to the **sum of all elements on the right**.

The pivot element itself is **not included** in either sum.

Example:

`[1, 7, 3, 6, 5, 6]`

Pivot index = `3`

Left sum = `1 + 7 + 3 = 11`
Right sum = `5 + 6 = 11`

So the answer is `3`.

## Approach

* First calculate the `total` sum of the entire array.
* Start `left_sum` as `0`.
* Initially, `right_sum` is the total sum.
* For every index:

  * Subtract the current element from `right_sum`.
  * Now `right_sum` represents the sum **after the current index**.
  * Compare `left_sum` and `right_sum`.
  * If they are equal, the current index is the pivot.
  * Otherwise, add the current element to `left_sum` and continue.
* If no pivot is found, return `-1`.

## Python Code

class Solution:
def pivotIndex(self, nums: List[int]) -> int:
total = sum(nums)
left_sum = 0
right_sum = total

```
    for i in range(len(nums)):
        right_sum -= nums[i]

        if right_sum == left_sum:
            return i

        left_sum += nums[i]

    return -1
```

## Complexity

Time: `O(n)`
Space: `O(1)`



# Maximum Difference Between Increasing Elements

## Approach

- Keep track of the smallest value seen so far.
- Calculate the difference between the current value and the smallest value.
- Keep updating the maximum difference.
- Return `-1` if no increasing pair exists.

## Pattern

This uses a pattern similar to **Best Time to Buy and Sell Stock**:
- Track the minimum value so far.
- Calculate the maximum possible difference/profit.

## Python Code

class Solution:
    def maximumDifference(self, nums: List[int]) -> int:
        maxx = 0
        start = nums[0]

        for i in range(len(nums)):
            cur = 0

            if nums[i] < start:
                start = nums[i]
            else:
                cur = nums[i] - start

                if cur > maxx:
                    maxx = cur

        if maxx == 0:
            return -1

        return maxx

# Two Furthest Houses With Different Colors

## Problem

Find the maximum distance between two houses that have different colors.

The distance between two houses is the difference between their indices.

## Approach

- Start with two pointers: `left` at the beginning and `right` at the end.
- First, keep `right` fixed and move `left` forward while both houses have the same color.
- Once the colors are different, calculate `right - left`.
- Reset both pointers.
- This time, keep `left` fixed and move `right` backward until the colors are different.
- Calculate the second possible distance.
- Return the maximum of the two distances.

## Key Idea

The farthest valid pair must involve one of the two ends of the array.

So we only need to check:

1. First house → a different-colored house from the right.
2. Last house → a different-colored house from the left.

This avoids checking every possible pair.

## Python Code

class Solution:
    def maxDistance(self, colors: List[int]) -> int:
        left = 0
        right = len(colors) - 1
        a1 = 0
        a2 = 0

        while colors[left] == colors[right]:
            left += 1

        a1 = right - left

        right = len(colors) - 1
        left = 0

        while colors[left] == colors[right]:
            right -= 1

        a2 = right - left

        return max(a1, a2)

## Complexity

- Time: `O(n)`
- Space: `O(1)`



First Unique Character in a String

Problem

Find the first character in a string that appears exactly once and
return its index. If no such character exists, return -1.

Method 1: Hash Table / Dictionary

Count the frequency of every character using a dictionary.

Traverse the string again.

Return the index of the first character whose frequency is 1.

class Solution:
    def firstUniqChar(self, s: str) -> int:
        d = {}

        for i in s:
            if i not in d:
                d[i] = 1
            else:
                d[i] += 1

        for i in d:
            if d[i] == 1:
                return s.index(i)

        return -1

Method 2: Using count()

Traverse the string from left to right.

Use count() to check how many times each character appears.

Return the index of the first character whose count is 1.

class Solution:
    def firstUniqChar(self, s: str) -> int:
        for i in range(len(s)):
            if s.count(s[i]) == 1:
                return i

        return -1



# Pascal's Triangle

## Problem

Given an integer `num_rows`, generate the first `num_rows` of Pascal's Triangle.

Each number in a row is calculated by adding the two numbers directly above it.

Example for `num_rows = 5`:

    [
        [1],
        [1, 1],
        [1, 2, 1],
        [1, 3, 3, 1],
        [1, 4, 6, 4, 1]
    ]

## Approach

1. Start with the first row `[1]`.
2. Store the triangle in `res`.
3. Generate the remaining rows using the previous row.
4. Add `0` to the beginning and end of the previous row.
5. Add adjacent elements to generate each value of the new row.
6. Add the new row to `res`.
7. Return the complete triangle.

### Example

Suppose the previous row is:

    [1, 3, 3, 1]

Add `0` to both sides:

    [0, 1, 3, 3, 1, 0]

Now add adjacent values:

    0 + 1 = 1
    1 + 3 = 4
    3 + 3 = 6
    3 + 1 = 4
    1 + 0 = 1

So the new row becomes:

    [1, 4, 6, 4, 1]

## Python Code

    def g():
        num_rows = 5
        res = [[1]]

        for i in range(num_rows - 1):
            temp = [0] + res[-1] + [0]
            row = []

            for j in range(len(res) + 1):
                row.append(temp[j] + temp[j + 1])

            res.append(row)

        return res


    print(g())

## Output

    [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]

## Time Complexity

**O(n²)**

We generate `n` rows, and each row contains up to `n` elements.

The total number of operations is approximately:

    1 + 2 + 3 + ... + n

Therefore:

**Time Complexity: O(n²)**

## Space Complexity

**O(n²)**

The complete Pascal's Triangle is stored in `res`.

Since all `n` rows are stored, the total space used is approximately `O(n²)`.

**Space Complexity: O(n²)**




# Concatenation of Array

## Problem Description

Given an integer array `nums`, create a new array that contains the original array followed by the same array again.

For example:

```text
Input:  nums = [1, 2, 1]

Output: [1, 2, 1, 1, 2, 1]
```

The result is simply:

```text
nums + nums
```

## Python Solution

```python
class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        return nums + nums
```

## Explanation

* `nums` is the original list.
* `nums + nums` concatenates the list with itself.
* The first `nums` provides the first half of the result.
* The second `nums` provides the second half.
* The resulting list contains `2 × len(nums)` elements.

### Example

```python
nums = [1, 2, 1]

nums + nums
```

Results in:

```text
[1, 2, 1, 1, 2, 1]
```

## Time Complexity

**O(n)**

Where `n` is the length of `nums`.

The elements of `nums` have to be copied into the new list twice. Since the resulting list contains `2n` elements, the operation is still **O(n)**.

## Space Complexity

**O(n)**

A new list containing `2n` elements is created.

Therefore, the extra space required is **O(n)**.

## Key Concept

**List concatenation**

```python
nums + nums
```

creates a new list containing both lists one after another.

So for:

```python
nums = [1, 2, 3]
```

we get:

```python
nums + nums
# [1, 2, 3, 1, 2, 3]
```



# Longest Palindrome

## Problem Description

Given a string `s`, find the **length of the longest palindrome** that can be built using the characters of `s`.

A palindrome reads the same forward and backward.

For example:

```text
"abccccdd"
```

The longest palindrome that can be formed has length:

```text
7
```

One possible palindrome is:

```text
"dccaccd"
```

## Python Solution

```python
class Solution:
    def longestPalindrome(self, s: str) -> int:
        c = 0
        d = {}
        flag = 0

        for i in range(0, len(s)):
            if s[i] not in d:
                d[s[i]] = 1
            else:
                d[s[i]] += 1

        for i in d:
            if d[i] % 2 == 0:
                c += d[i]
            else:
                flag = 1
                c += d[i] - 1

        if flag == 1:
            c += 1

        return c
```

## Explanation

### 1. Count the frequency of every character

The dictionary stores how many times each character appears.

For:

```python
s = "abccccdd"
```

we get:

```text
a → 1
b → 1
c → 4
d → 2
```

### 2. Handle even frequencies

If a character appears an even number of times, **all of its occurrences can be used**.

For example:

```text
c → 4
d → 2
```

Both can be completely used in the palindrome.

So:

```text
4 + 2 = 6
```

### 3. Handle odd frequencies

If a character appears an odd number of times, we cannot use the entire count on the two sides of the palindrome.

For example:

```text
a → 1
b → 1
```

There is no matching pair, so we use:

```text
1 - 1 = 0
```

For a frequency such as:

```text
x → 5
```

we can use:

```text
5 - 1 = 4
```

because `4` can form two matching pairs, while the remaining `1` can potentially become the center.

The `flag` records whether **at least one odd frequency** was found.

### 4. Add one character to the center

If at least one odd frequency exists:

```python
if flag == 1:
    c += 1
```

Only **one** odd character can occupy the center of a palindrome.

Therefore, for:

```text
a → 1
b → 1
c → 4
d → 2
```

we get:

```text
a → 0
b → 0
c → 4
d → 2

total = 6
```

Since an odd frequency exists:

```text
6 + 1 = 7
```

Therefore, the answer is:

```text
7
```

## Key Concept

A palindrome is built using **pairs of identical characters**:

```text
left side  ← pair →  right side
```

and optionally **one unpaired character in the center**.

So the general idea is:

```text
Even frequency → use everything
Odd frequency  → use frequency - 1
At least one odd frequency → add 1 for the center
```

## Time Complexity

**O(n)**

Where `n` is the length of the string.

* First loop counts all characters: `O(n)`
* Second loop goes through the distinct characters: `O(k)`, where `k ≤ n`

Therefore:

```text
O(n + k) = O(n)
```

## Space Complexity

**O(k)**

The dictionary stores each distinct character and its frequency.

Since the number of distinct characters is at most `n`:

```text
O(k) ≤ O(n)
```

So the worst-case space complexity is:

**O(n)**



# Matrix Diagonal Sum

## Problem

Given a square matrix, return the sum of the elements on both the primary diagonal and the secondary diagonal.

Example:

```text
1 2 3
4 5 6
7 8 9
```

Primary diagonal:

```text
1, 5, 9
```

Secondary diagonal:

```text
3, 5, 7
```

The center element `5` belongs to both diagonals, so it should only be counted once.

Final answer:

```text
1 + 5 + 9 + 3 + 7 = 25
```

## Approach

Instead of using two nested loops to visit every element of the matrix, we use only **one loop**.

For every row `i`, we already know the exact position of both diagonal elements:

- Primary diagonal → `mat[i][i]`
- Secondary diagonal → `mat[i][n - 1 - i]`

Therefore, one loop is enough to directly access both diagonal elements.

### Why Only One Loop?

For this matrix:

```text
1 2 3
4 5 6
7 8 9
```

For `i = 0`:

```text
Primary   → mat[0][0] = 1
Secondary → mat[0][2] = 3
```

For `i = 1`:

```text
Primary   → mat[1][1] = 5
Secondary → mat[1][1] = 5
```

For `i = 2`:

```text
Primary   → mat[2][2] = 9
Secondary → mat[2][0] = 7
```

So there is no need to check every `i, j` position in the matrix.

We can directly access the two required positions using one loop.

## Handling the Middle Element

When the matrix size is odd, the two diagonals meet at exactly one center element.

For example:

```text
1 2 3
4 5 6
7 8 9
```

The center is:

```text
mat[1][1] = 5
```

Since `5` is added once from each diagonal, it gets counted twice.

Therefore, when `n` is odd, subtract the center once:

```python
if n % 2 != 0:
    return summ - mat[n // 2][n // 2]
```

For an even-sized matrix, the diagonals do not share a single center element, so nothing needs to be subtracted.

## Python Code

```python
class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        summ = 0
        n = len(mat)

        for i in range(n):
            summ += mat[i][i]
            summ += mat[i][n - 1 - i]

        if n % 2 != 0:
            return summ - mat[n // 2][n // 2]

        return summ
```

## Complexity

### Time Complexity

**O(n)**

The loop runs `n` times.

Each iteration performs constant-time operations.

Therefore:

**Time Complexity: O(n)**

### Space Complexity

**O(1)**

Only a few variables such as `summ`, `n`, and `i` are used.

No additional data structure is created.

Therefore:

**Space Complexity: O(1)**



# Valid Parentheses

## Description

This solution checks whether a string containing `()`, `{}`, and `[]` has valid and properly matched parentheses.

A **stack** is used to store opening brackets.

- If the character is an opening bracket, it is added to the stack.
- If the character is a closing bracket, the stack must not be empty.
- The last opening bracket is removed from the stack and checked against the closing bracket.
- If the brackets do not match, the string is invalid.
- After processing the entire string, the stack must be empty for the string to be valid.

## Python Code


def g():

    d = {')': '(', '}': '{', ']': '['}
    s = "()[]{[]}"
    
    l = []
    
    for i in s:
        if i not in d:
            l.append(i)
        else:
            if not l:
                return False

            pop = l.pop()

            if pop != d[i]:
                return False

    return not l


print(g())

## Time Complexity

O(n)

Each character in the string is processed exactly once.

## Space Complexity

O(n)

In the worst case, all characters can be opening brackets and stored in the stack.

## Key Concept

Stack (LIFO - Last In, First Out)

The most recently encountered opening bracket must be the first one matched by a closing bracket.



# Find the Difference

## Description

Given two strings `s` and `t`, where `t` is formed by shuffling the characters of `s` and adding one extra character, find and return the extra character.

For example:

- `s = "a"`
- `t = "aa"`

Output:

`"a"`

The solution uses a dictionary (HashMap) to store the frequency of each character in `s`.

We then traverse `t` and decrease the frequency of each character.

- If a character does not exist in the dictionary, it is the extra character.
- If a character's frequency becomes negative, that character is the extra character.

## Approach

1. Create an empty dictionary `d`.
2. Traverse `s` and store the frequency of every character.
3. Traverse `t`:
   - If the character exists in `d`, decrease its frequency by `1`.
   - If the character does not exist in `d`, return that character.
4. After processing `t`, traverse the dictionary.
5. If any character has a frequency less than `0`, return that character.

## Time Complexity

**O(n)**

We traverse `s` and `t`, and then traverse the dictionary.

Therefore, the overall time complexity is **O(n)**.

## Space Complexity

**O(k)**

Where `k` is the number of distinct characters stored in the dictionary.

If the character set is fixed, the space complexity can be considered **O(1)**.

## Python Code

```python
class Solution:

    def findTheDifference(self, s: str, t: str) -> str:

        d={}

        for i in range(0,len(s)):

            if(s[i] not in d):

                d[s[i]]=1

            else:

                d[s[i]]+=1

        for i in range(0,len(t)):

            if(t[i] in d):

                d[t[i]]-=1

            if(t[i] not in d):

                return t[i]

        for i in d:

            if(d[i]<0):

                return i
```

# Find All Numbers Disappeared in an Array

## Description

Given an integer array `nums` of length `n` where each integer is in the range `[1, n]`, find all the integers in the range `[1, n]` that do not appear in `nums`.

The solution uses the values of the array to mark the corresponding indexes as negative.

For every number `x`, we access index `x - 1` and make that value negative. If the value at that index is already negative, the number has already been encountered, so we skip it.

After marking all numbers, the indexes whose values remain positive represent the missing numbers.

### Example

Input:
`[4,3,2,7,8,2,3,1]`

Output:
`[5,6]`

### Approach

1. Iterate through the array.
2. Use `abs(nums[i]) - 1` to convert the current value into a valid index.
3. If the value at that index is already negative, skip it.
4. Otherwise, make the value at that index negative.
5. Iterate through the array again.
6. If `nums[i]` is positive, `i + 1` is a missing number.
7. Store all missing numbers in the result list.

### Time Complexity

`O(n)`

The array is traversed twice, so the overall time complexity is `O(n)`.

### Space Complexity

`O(1)` extra space.

The input array itself is modified to store the marking information. The result list is not considered extra space for the algorithm's auxiliary-space analysis.

## Python Code

```python
def find_disappeared_numbers(nums):
    result = []

    for i in range(len(nums)):
        index = abs(nums[i]) - 1

        if nums[index] < 0:
            continue

        nums[index] *= -1

    for i in range(len(nums)):
        if nums[i] > 0:
            result.append(i + 1)

    return result


nums = [4, 3, 2, 7, 8, 2, 3, 1]
print(find_disappeared_numbers(nums))
```


# 3289. The Two Sneaky Numbers of Digitville

## Description

Given an integer array `nums` containing numbers from `0` to `n - 1`, every number should appear exactly once. However, two numbers appear twice.

Return the two numbers that appear twice.

### Approach

Use a `set` called `seen` to keep track of numbers that have already appeared.

- If the current number is not in `seen`, add it.
- If it is already in `seen`, it is one of the sneaky numbers, so add it to the result list.

### Python Code

```python
class Solution:

    def getSneakyNumbers(self, nums: List[int]) -> List[int]:

        seen = set()

        l = []

        for i in range(0, len(nums)):

            if nums[i] not in seen:

                seen.add(nums[i])

            else:

                l.append(nums[i])

        return l
```



# 7. Reverse Integer

## Description

Given a signed 32-bit integer `x`, reverse its digits and return the reversed integer.

If the reversed integer falls outside the signed 32-bit integer range:

`[-2^31, 2^31 - 1]`

return `0`.

The solution extracts the last digit using `% 10`, removes the last digit using integer division by `10`, and builds the reversed number digit by digit.

## Python Code

```python
class Solution:
    def reverse(self, x: int) -> int:
        a = x
        x = abs(x)

        if a < 0:
            sign = -1
        else:
            sign = 1

        reverse = 0

        while x > 0:
            r = x % 10
            x = x // 10

            reverse = reverse * 10 + r

        if reverse < -2**31 or reverse > 2**31 - 1:
            return 0

        return reverse * sign
```

# A Number After a Double Reversal
#
# Description:
# Reverse the digits of an integer twice and check whether
# the result is equal to the original number.
#
# Key idea:
# If a number ends with 0, that 0 disappears during reversal.
# Therefore, double reversal changes the number.
#
# Exception:
# 0 itself remains 0 after reversal, so it returns True.
#
# Time Complexity: O(1)
# Space Complexity: O(1)

```python
def check(num):
    if num == 0:
        return True

    elif num % 10 == 0:
        return False

    return True


d = 12008
c = check(d)
print(c)
```



# Valid Palindrome

## Description

Given a string `s`, determine whether it is a palindrome.

A palindrome is a string that reads the same forward and backward.

The approach:

1. Convert the string to lowercase.
2. Remove all characters that are not letters or digits.
3. Reverse the cleaned string.
4. Compare the cleaned string with its reverse.
5. If both are equal, return `True`; otherwise, return `False`.

### Example

```text
Input:
"A man, a plan, a canal: Panama"

After cleaning:
"amanaplanacanalpanama"

Reverse:
"amanaplanacanalpanama"

Output:
True
```

## Python Code

```python
class Solution:
    def g():
    s = "A man, a plan, a canal: Panama"
    new=''
    for i in s:
        if(i.isalnum()):
            new+=i
    d=new.lower()
    if d[::-1]==d:
        return True
    return False
print(g())
```

## Time Complexity

**O(n)**

* We traverse the string once to clean it.
* We reverse the cleaned string, which takes O(n).
* Comparing the two strings takes O(n).

Overall:

```text
O(n) + O(n) + O(n) = O(n)
```

## Space Complexity

**O(n)**

We create:

* `x` → cleaned string
* `rev` → reversed string

Both can contain up to `n` characters.

Therefore:

```text
O(n)
```


# 2108. Find First Palindromic String in the Array

## Problem Description

Given an array of strings `words`, return the **first palindromic string** in the array.

If there is no palindromic string, return an empty string `""`.

A string is **palindromic** if it reads the same forward and backward.

---

## Example 1

Input:
words = ["abc", "car", "ada", "racecar", "cool"]

Output:
"ada"

Explanation:

The first string that is palindromic is `"ada"`.

Note that `"racecar"` is also a palindrome, but it is not the first one.

---

## Example 2

Input:
words = ["notapalindrome", "racecar"]

Output:
"racecar"

---

## Example 3

Input:
words = ["def", "ghi"]

Output:
""

Explanation:

There are no palindromic strings, so the empty string is returned.

---

## Approach

- Traverse through every string in the array.
- Reverse the current string using `i[::-1]`.
- Compare the original string with its reversed version.
- If they are equal, the string is a palindrome.
- Immediately return the first palindrome found.
- If no palindrome is found, return an empty string.

---

## Python Code

    class Solution:

        def firstPalindrome(self, words: List[str]) -> str:

            new=''

            for i in words:

                if(i==i[::-1]):

                    new+=i

                    return i

            return new

---

## Time Complexity

O(n × m)

Where:
- `n` = number of strings in the array
- `m` = average length of each string

We may reverse and compare every string.

---

## Space Complexity

O(m)

The reversed string requires extra space proportional to the length of the current string.




# 58. Length of Last Word

## Problem Description

Given a string `s` consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

---

## Example 1

Input:
s = "Hello World"

Output:
5

Explanation:

The last word is "World", which has a length of 5.

---

## Example 2

Input:
s = "   fly me   to   the moon  "

Output:
4

Explanation:

The last word is "moon", which has a length of 4.

---

## Example 3

Input:
s = "luffy is still joyboy"

Output:
6

Explanation:

The last word is "joyboy", which has a length of 6.

---

## Approach

1. Split the string into individual words using `split()`.
2. Access the last word using `d[-1]`.
3. Use `len()` to find the length of the last word.
4. Return the result.

Python's `split()` automatically handles leading, trailing, and multiple spaces.



## Python Code
```
class Solution:

    def lengthOfLastWord(self, s: str) -> int:

        d = s.split()

        return len(d[-1])
```
---


## Time Complexity

O(n)

Where `n` is the length of the input string.

The string needs to be processed to split it into words.

---

## Space Complexity

O(n)

The `split()` operation creates a list containing the words from the string.



# Array Partition - README

Problem:
Given an integer array nums of 2n elements, divide the elements into n pairs
such that the sum of min(pair) for every pair is maximized.

Approach:
Instead of manually finding pairs and calculating:

min(num1, num2) + min(num3, num4) + ...

we can use a much simpler approach:

1. Sort the array.
2. After sorting, take every element at an even index.
3. Add those elements together.

Why does this work?

Once the array is sorted, the best way to maximize the sum of the minimum
values is to pair adjacent elements.

Example:

nums = [6, 2, 6, 5, 1, 2]

After sorting:

[1, 2, 2, 5, 6, 6]

Pair them:

(1, 2) -> min = 1
(2, 5) -> min = 2
(6, 6) -> min = 6

Answer:

1 + 2 + 6 = 9

Since the smaller element of every adjacent pair is always at the
even index, we only need to add:

nums[0] + nums[2] + nums[4] + ...

Python solution:
```
class Solution:

    def arrayPairSum(self, nums: List[int]) -> int:

        nums.sort()

        s = 0

        for i in range(0, len(nums), 2):

            s += nums[i]

        return s
```

Time Complexity:

Sorting takes O(n log n).
The loop takes O(n).

Therefore, the overall time complexity is:

O(n log n)

Space Complexity:

O(1) auxiliary space if we consider Python's in-place sorting
(ignoring the internal implementation details of Timsort).

Key idea:

Sort -> Pair adjacent elements -> Add elements at even indices.

This is much simpler than explicitly creating pairs and repeatedly
calculating min(num1, num2).


# Reverse String - README

Problem:
Given an array of characters s, reverse the array in-place.

You must modify the original array directly and should not create another
array to store the reversed result.

Example:

s = ['R', 'a', 'h', 'u', 'l']

After reversing:

['l', 'u', 'h', 'a', 'R']


Approach 1:
Using an Extra Array

We can create a new array and traverse the original array from right to left.

Example:

s = ['R', 'a', 'h', 'u', 'l']

Read from right to left:

'l'
'u'
'h'
'a'
'R'

New array:

['l', 'u', 'h', 'a', 'R']

Why we don't use this:

The problem requires the array to be modified in-place.
Creating another array requires extra memory.

Time Complexity:
O(n)

Space Complexity:
O(n)


Approach 2:
Using Python's Built-in Reverse

Python provides a built-in reverse() method:

s.reverse()

This reverses the list in-place.

Why we don't use this:

Although it satisfies the in-place requirement, it hides the actual
algorithm.

For a DSA problem, the goal is to understand how the reversal works
internally.

Time Complexity:
O(n)

Space Complexity:
O(1)


Approach 3:
Two Pointer Technique

This is the preferred approach for solving the problem manually.

We use two pointers:

left  -> starts at the beginning of the array
right -> starts at the end of the array

Then we swap the elements at left and right.

After every swap:

left  -> moves forward
right -> moves backward

We continue until left and right meet.


Why does this work?

Consider:

['R', 'a', 'h', 'u', 'l']

The first element needs to move to the last position:

R <-> l

The second element needs to move to the second-last position:

a <-> u

The middle element does not need to move:

h

So we process the array from both ends.


Step 1:

Initial array:

['R', 'a', 'h', 'u', 'l']

left = 0
right = 4

Swap:

R <-> l

Array becomes:

['l', 'a', 'h', 'u', 'R']


Step 2:

Move both pointers:

left += 1
right -= 1

Now:

left = 1
right = 3

Swap:

a <-> u

Array becomes:

['l', 'u', 'h', 'a', 'R']


Step 3:

Move both pointers:

left = 2
right = 2

Now:

left < right

becomes:

2 < 2

which is false.

Therefore, the loop stops.

Final array:

['l', 'u', 'h', 'a', 'R']


How the Swap Works:

We use a temporary variable because we need to preserve the original
value of s[left].

Suppose:

s[left] = 'R'
s[right] = 'l'

First:

temp = s[left]

Now:

temp = 'R'

Then:

s[left] = s[right]

Now:

s[left] = 'l'

Finally:

s[right] = temp

Now:

s[right] = 'R'

Therefore:

Before:

['R', 'a', 'h', 'u', 'l']

After:

['l', 'a', 'h', 'u', 'R']


The complete swap is:

temp = s[left]
s[left] = s[right]
s[right] = temp


Why use while left < right?

We only need to swap elements until the two pointers meet.

For example:

['l', 'u', 'h', 'a', 'R']
          ^
       left/right

When:

left == right

both pointers refer to the same element.

There is nothing left to swap.

Therefore:

while left < right:

is used.


Why is this In-Place?

The problem requires the original array to be modified.

We directly modify:

s[left]
s[right]

We do not create another array.

We only use a few variables:

left
right
temp

Therefore, the algorithm uses constant auxiliary space.


Python Solution:

```python
class Solution:

    def reverseString(self, s: List[str]) -> None:

        """
        Do not return anything, modify s in-place instead.
        """

        left = 0

        right = len(s) - 1

        while left < right:

            temp = s[left]

            s[left] = s[right]

            s[right] = temp

            left += 1

            right -= 1

```

# Add Strings

## Problem

Given two non-negative integers `num1` and `num2` represented as strings, return the sum of `num1` and `num2`, also represented as a string.

### Important

You cannot directly convert the entire strings into integers.

For example:

```text
num1 = "123"
num2 = "456"
```

Return:

```text
"579"
```

---

## Intuition

Think about how we normally add numbers manually.

For:

```text
   123
 + 456
 -----
   579
```

We start from the **rightmost digit** and move toward the left.

At every position:

1. Take the current digit from `num1`.
2. Take the current digit from `num2`.
3. Add both digits.
4. Add the `carry` from the previous position.
5. The last digit of the sum becomes our current answer digit.
6. The remaining part becomes the new `carry`.
7. Move both pointers one position to the left.

Since the result is generated from right to left, we reverse it at the end.

---

## Approach

We use two pointers:

```text
i → points to the last digit of num1
j → points to the last digit of num2
```

Initially:

```python
i = len(num1) - 1
j = len(num2) - 1
```

We also maintain:

```python
carry = 0
```

And store the result in:

```python
res = []
```

---

## Step-by-Step Logic

### 1. Get the current digits

If `i` is still inside `num1`, get its digit.

Otherwise, use `0`.

```python
cur_i = int(num1[i]) if i >= 0 else 0
```

Similarly for `num2`:

```python
cur_j = int(num2[j]) if j >= 0 else 0
```

This is important because the two numbers may have different lengths.

For example:

```text
   11
  123
```

When we reach the position where `11` has no digit left, we treat it as:

```text
0
```

---

### 2. Calculate the sum

```python
cur_sum = cur_i + cur_j + carry
```

For example:

```text
7 + 8 + 1 = 16
```

---

### 3. Extract the current digit

```python
digit = cur_sum % 10
```

For:

```text
16
```

we get:

```text
16 % 10 = 6
```

So `6` becomes the current result digit.

---

### 4. Calculate the carry

```python
carry = cur_sum // 10
```

For:

```text
16
```

we get:

```text
16 // 10 = 1
```

So:

```text
carry = 1
```

---

### 5. Store the digit

```python
res.append(str(digit))
```

We convert the digit to a string because the final answer needs to be a string.

---

### 6. Move both pointers

```python
i -= 1
j -= 1
```

We move from right to left.

---

### 7. Handle the final carry

After the loop, there may still be a carry.

For example:

```text
  99
+  1
----
 100
```

After processing all digits, we still have:

```text
carry = 1
```

So we append it:

```python
if carry == 1:
    res.append(str(carry))
```

---

### 8. Reverse the result

Because we process digits from right to left, `res` contains the answer backwards.

For:

```text
123 + 456
```

we build:

```text
['9', '7', '5']
```

So we reverse it:

```python
"".join(reversed(res))
```

Result:

```text
"579"
```

---

## Dry Run

Let's calculate:

```text
num1 = "11"
num2 = "123"
```

Expected:

```text
134
```

Initially:

```text
i = 1
j = 2
carry = 0
```

### Iteration 1

Digits:

```text
num1[i] = 1
num2[j] = 3
```

Sum:

```text
1 + 3 + 0 = 4
```

Digit:

```text
4 % 10 = 4
```

Carry:

```text
4 // 10 = 0
```

Result:

```text
['4']
```

Move pointers:

```text
i = 0
j = 1
```

---

### Iteration 2

Digits:

```text
num1[i] = 1
num2[j] = 2
```

Sum:

```text
1 + 2 + 0 = 3
```

Digit:

```text
3
```

Carry:

```text
0
```

Result:

```text
['4', '3']
```

Move pointers:

```text
i = -1
j = 0
```

---

### Iteration 3

`num1` has no digits left.

So:

```text
cur_i = 0
```

`num2` still has:

```text
num2[j] = 1
```

Sum:

```text
0 + 1 + 0 = 1
```

Result:

```text
['4', '3', '1']
```

Now:

```text
i = -2
j = -1
```

Loop ends.

---

### Reverse

Current result:

```text
['4', '3', '1']
```

Reverse:

```text
['1', '3', '4']
```

Final answer:

```text
"134"
```

---

## Why `% 10` and `// 10`?

These two operations are the heart of the addition.

Suppose:

```text
cur_sum = 17
```

The digit we want to put into the answer is:

```python
17 % 10
```

which gives:

```text
7
```

The carry is:

```python
17 // 10
```

which gives:

```text
1
```

So:

```text
17
 ↓
digit = 7
carry = 1
```

This is exactly how normal addition works.

---

## Python Code

```python
class Solution:
    def addStrings(self, num1: str, num2: str) -> str:
        i = len(num1) - 1
        j = len(num2) - 1
        carry = 0
        res = []

        while i >= 0 or j >= 0:
            cur_i = int(num1[i]) if i >= 0 else 0
            cur_j = int(num2[j]) if j >= 0 else 0

            cur_sum = cur_i + cur_j + carry

            digit = cur_sum % 10
            carry = cur_sum // 10

            res.append(str(digit))

            i -= 1
            j -= 1

        if carry == 1:
            res.append(str(carry))

        return "".join(reversed(res))
```

---

## Complexity

Let:

```text
n = length of num1
m = length of num2
```

We process every digit once.

### Time Complexity

```text
O(max(n, m))
```

### Space Complexity

```text
O(max(n, m))
```

The `res` list stores the resulting digits.

---

## Key Takeaways

### Two pointers

```python
i = len(num1) - 1
j = len(num2) - 1
```

Start from the **rightmost digit**.

### Handle different lengths

```python
cur_i = int(num1[i]) if i >= 0 else 0
cur_j = int(num2[j]) if j >= 0 else 0
```

If one number has no digit left, treat it as `0`.

### Calculate digit

```python
digit = cur_sum % 10
```

### Calculate carry

```python
carry = cur_sum // 10
```

### Reverse at the end

```python
return "".join(reversed(res))
```

The most important pattern to remember is:

```text
Take digits
    ↓
Add digits + carry
    ↓
digit = sum % 10
    ↓
carry = sum // 10
    ↓
Move pointers left
    ↓
Reverse answer
```



# LeetCode 205 - Isomorphic Strings

## Problem

Given two strings `s` and `t`, check whether they are isomorphic.

Two strings are isomorphic if:
- Each character in `s` always maps to the same character in `t`.
- Two different characters cannot map to the same character.

Example:

```text
s = "egg"
t = "add"

e -> a
g -> d

Output: true
```

---

## Intuition

We need to maintain a **one-to-one mapping** from `s` to `t`.

We use:

- `d` → dictionary to store `s[i] -> t[i]`
- `seen` → set to store characters of `t` that are already mapped

For every character:

1. If `s[i]` is new:
   - If `t[i]` is already in `seen`, return `False`.
   - Otherwise create the mapping.
2. If `s[i]` already exists:
   - Check that it maps to the same `t[i]`.
   - If not, return `False`.

If no conflict is found, return `True`.

---

## Python Code

```python
def g():
    s = "egg"
    t = "add"

    d = {}
    seen = set()

    for i in range(len(s)):
        if s[i] not in d:
            if t[i] in seen:
                return False

            d[s[i]] = t[i]
            seen.add(t[i])

        else:
            if d[s[i]] != t[i]:
                return False

    return True


print(g())
```

---

## Example

```text
s = "badc"
t = "baba"
```

Mappings:

```text
b -> b
a -> a
d -> b  ❌
```

`b` is already used, so `d` cannot also map to `b`.

Therefore:

```text
Output: false
```

---

## Complexity

**Time:** `O(n)`  
We traverse the string once.

**Space:** `O(n)`  
The dictionary and set can store up to `n` characters.

---

## Key Takeaway

```text
Dictionary = s -> t mapping
Set        = already-used characters in t
```

Two checks:

```python
t[i] in seen
```

→ Is this target character already taken?

```python
d[s[i]] != t[i]
```

→ Is an existing mapping being changed?




# LeetCode — Word Pattern

## Problem Description

Given a pattern and a string `s`, determine whether `s` follows the same pattern.

A string follows the pattern if there is a **one-to-one mapping** between each character in `pattern` and each word in `s`.

This means:

1. Each character must always map to the same word.
2. Two different characters cannot map to the same word.
3. The number of characters in `pattern` must equal the number of words in `s`.

### Example

```text
Input:
pattern = "abba"
s = "dog cat cat dog"

Output:
true
```

The mapping is:

```text
a → dog
b → cat
```

Therefore:

```text
a  b  b  a
↓  ↓  ↓  ↓
dog cat cat dog
```

So the pattern matches and the answer is `true`.

---

## Approach

We use two data structures:

- **Dictionary `d`** — stores the mapping from each pattern character to its corresponding word.
- **Set `seen`** — stores all words that have already been assigned to a pattern character.

### Why do we need both?

The dictionary checks that the same character always maps to the same word.

For example:

```text
a → dog
```

If we later see:

```text
a → cat
```

that is invalid.

However, the dictionary alone is not enough.

Consider:

```text
pattern = "ab"
s = "dog dog"
```

Without `seen`, we could create:

```text
a → dog
b → dog
```

But this is invalid because two different characters cannot map to the same word.

The `seen` set prevents this:

```text
a → dog
b → dog  ❌
```

Since `"dog"` is already in `seen`, we return `False`.

---

## Algorithm

### Step 1 — Split the string into words

```python
words = s.split()
```

For example:

```text
s = "dog cat cat dog"

words = ["dog", "cat", "cat", "dog"]
```

### Step 2 — Check the lengths

The number of words must equal the number of characters in the pattern.

```python
if len(words) != len(pattern):
    return False
```

For example:

```text
pattern = "abc"
s = "dog cat"
```

There are 3 pattern characters but only 2 words.

Therefore, return `False`.

### Step 3 — Iterate through every character and word

For every index:

```text
pattern[i] ↔ words[i]
```

If the pattern character has not been seen before:

1. Check whether the word is already used by another character.
2. If it is already used, return `False`.
3. Otherwise create the mapping.
4. Add the word to `seen`.

If the pattern character already has a mapping:

1. Check whether it maps to the current word.
2. If not, return `False`.

### Step 4 — Return `True`

If every character-word pair is valid, return `True`.

---

## Python Solution

```python
class Solution:

    def wordPattern(self, pattern: str, s: str) -> bool:

        d = {}

        seen = set()

        words = s.split()

        if len(words) != len(pattern):

            return False

        for i in range(len(words)):

            if pattern[i] not in d:

                if words[i] in seen:

                    return False

                d[pattern[i]] = words[i]

                seen.add(words[i])

            else:

                if d[pattern[i]] != words[i]:

                    return False

        return True
```

---

## Dry Run

### Input

```text
pattern = "abba"
s = "dog cat cat dog"
```

After splitting:

```text
words = ["dog", "cat", "cat", "dog"]
```

---

### Iteration 1

```text
pattern[0] = 'a'
words[0] = "dog"
```

`a` is not in the dictionary.

`dog` is not in `seen`.

So we create:

```text
d:
a → dog

seen:
dog
```

---

### Iteration 2

```text
pattern[1] = 'b'
words[1] = "cat"
```

`b` is not in the dictionary.

`cat` is not in `seen`.

So we create:

```text
d:
a → dog
b → cat

seen:
dog
cat
```

---

### Iteration 3

```text
pattern[2] = 'b'
words[2] = "cat"
```

`b` already exists in the dictionary.

Its mapping is:

```text
b → cat
```

The current word is also:

```text
cat
```

So this is valid.

---

### Iteration 4

```text
pattern[3] = 'a'
words[3] = "dog"
```

`a` already exists in the dictionary.

Its mapping is:

```text
a → dog
```

The current word is also:

```text
dog
```

So this is valid.

All iterations succeed.

Therefore:

```text
Output:
true
```

---

## Visual Mapping

```text
Pattern:

a  b  b  a
↓  ↓  ↓  ↓
dog cat cat dog

Mapping:

a → dog
b → cat
```

The same pattern character always produces the same word.

---

## Invalid Example

```text
pattern = "abba"
s = "dog cat cat fish"
```

The mappings start as:

```text
a → dog
b → cat
```

When we reach the last character:

```text
a → fish
```

But `a` was already mapped to:

```text
a → dog
```

Therefore:

```text
a → dog
a → fish
```

is inconsistent.

So the answer is:

```text
false
```

---

## Another Invalid Example

```text
pattern = "ab"
s = "dog dog"
```

First:

```text
a → dog
```

Then we try:

```text
b → dog
```

But `"dog"` is already present in `seen`.

Therefore:

```text
b → dog
```

is invalid because `dog` is already assigned to `a`.

So:

```text
Output:
false
```

---

## Time Complexity

Let `n` be the number of words in `s`.

We process every word exactly once.

Dictionary lookup, insertion, and set lookup are `O(1)` on average.

Therefore:

```text
Time Complexity: O(n)
```

---

## Space Complexity

We store:

- The words created by `s.split()`
- The character-to-word mappings in the dictionary
- The used words in the set

Therefore:

```text
Space Complexity: O(n)
```

---

## Key Insight

The important part of this problem is that the mapping must be **one-to-one**.

We need to guarantee:

```text
Pattern character → Word
```

is consistent.

For example:

```text
a → dog
b → cat
```

is valid.

But:

```text
a → dog
b → dog
```

is invalid.

So we use:

```text
Dictionary + Set
```

The **dictionary** checks:

```text
character → word
```

The **set** makes sure that:

```text
word → character
```

is also unique.

Together, they enforce a one-to-one mapping.

---

## Key Takeaway

When you see a problem asking whether two sequences follow the same **one-to-one pattern**, think:

```text
HashMap / Dictionary
        +
HashSet
```

The dictionary remembers the mapping, while the set prevents multiple pattern characters from mapping to the same value.




# LeetCode 345 — Reverse Vowels of a String

## Description

Given a string `s`, reverse only the vowels. All consonants and other characters remain in their original positions.

Vowels:
```text
a, e, i, o, u, A, E, I, O, U
```

## Example

```text
Input:  "hello"
Output: "holle"
```

The vowels `e` and `o` are swapped.

## Intuition

Use **two pointers**:

- `i` starts from the left.
- `j` starts from the right.
- Skip non-vowels.
- When both pointers find vowels, swap them.
- Move both pointers inward.

Since Python strings are immutable, convert the string to a list first.

## Code

```python
class Solution:
    def reverseVowels(self, s: str) -> str:
        s = list(s)
        vo = ['a','e','i','o','u','A','E','I','O','U']

        i = 0
        j = len(s) - 1

        while i < j:
            if s[i] in vo and s[j] in vo:
                temp = s[i]
                s[i] = s[j]
                s[j] = temp
                i += 1
                j -= 1

            if s[i] not in vo:
                i += 1

            if s[j] not in vo:
                j -= 1

        return "".join(s)
```

## Complexity

- **Time:** `O(n)`
- **Space:** `O(n)`

## Key Takeaway

```text
Two pointers
     ↓
Skip non-vowels
     ↓
Swap vowels
     ↓
Move inward
```
