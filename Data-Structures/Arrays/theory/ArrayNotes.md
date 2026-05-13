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
                        