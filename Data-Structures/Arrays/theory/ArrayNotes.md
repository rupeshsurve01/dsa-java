* Array:
    - An array is a collection of elements of the same data type stored in continuous memory locations.
    - Maximum size : 10e6(in main method)
                     10e7(For Global Declaration)


* Implementation of Array in Java

    1. Array Declaration

    Syntax:- datatype[] arrayName;

    Example:

    int[] arr;

    This only creates a reference variable.

    2. Array Creation

    Syntax:

    arrayName = new datatype[size];

    Example:

    arr = new int[5];

    Java allocates memory for 5 integers.

    Memory representation:

    Index : 0   1   2   3   4
    Value : 0   0   0   0   0

    All elements get default values 0 automatically.

    3. Array Initialization

    You can store values like this:

    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;

    Or directly:

    int[] arr = {10, 20, 30, 40, 50};



* Arrays.sort();

uses Dual-Pivot QuickSort(which is an optimized version of QuickSort.) internally for primitive arrays like:
    int[]
    double[]
    char[]
    long[]
    
Complexity:                    
Best	O(n log n)
Average	O(n log n)
Worst	O(n²)


- For Non- Primitive datatypes like String, Objects uses TimSort for Sortinng which is hybrid algorithm based on:
    Merge Sort
    Insertion Sort

- Why Not QuickSort for Objects?

    QuickSort has a problem:

    It is NOT stable
    Stable Sorting

    Stable means:

    If two elements are equal,
    their original order remains unchanged.

    Example:

    (Student1, age=20)
    (Student2, age=20)

    After stable sorting by age:

    Student1 remains before Student2

    QuickSort cannot guarantee this.

    TimSort can.



* temp[-1] = arr[0];

    In Java, negative indexes are invalid.
    To place the first element at the end use:

    temp[n - 1] = arr[0];



* Arrays.copyOfRange()
    Syntax
    Arrays.copyOfRange(array, from, to)
    Purpose

    Creates a new array by copying a portion of an existing array.

    Parameters
    Parameter	Meaning
    array	Original array
    from	Starting index (inclusive)
    to	Ending index (exclusive)

    Important Rule
    from  -> included
    to    -> NOT included

    Example Used
    int[] temp = Arrays.copyOfRange(arr, n - k, n);

    Meaning
    Copies elements from index:

    n-k  to  n-1

    So it stores the last k elements of the array into temp.

    Example
    int[] arr = {10, 20, 30, 40, 50};
    int n = arr.length; // 5
    int k = 2;

    int[] temp = Arrays.copyOfRange(arr, n-k, n);
    Calculation
    n-k = 5-2 = 3

    So:

    Arrays.copyOfRange(arr, 3, 5)

    Copies:

    40, 50

    Result:

    temp = {40, 50}
    Visual Representation
    Index:  0   1   2   3   4
    arr = {10, 20, 30, 40, 50}
                        ^   ^
                    from  to

    Copied part:

    {40, 50}