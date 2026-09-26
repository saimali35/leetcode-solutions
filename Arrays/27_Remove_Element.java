/*# 27. Remove Element

## Problem

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` **in-place** and return the number of elements remaining.

The first `k` elements of `nums` should contain the elements that are not equal to `val`.

## Approach

Use two pointers:

* `i` scans through the entire array.
* `index` keeps track of the position where the next valid element should be placed.
* If `nums[i] != val`, copy it to `nums[index]` and increment `index`.
* Return `index` as `k`.

## Java Solution

```java
/*

class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}
/*
```

## Example

```text
Input:
nums = [3,2,2,3]
val = 3

Output:
k = 2

First k elements:
[2,2]
```

## Complexity

* Time: `O(n)`
* Extra Space: `O(1)`

## Technique

**Two Pointers — In-Place Array Modification**
/*