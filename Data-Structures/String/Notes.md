# Java String Methods – Notes with Examples
    1. length()

    Use: Returns the number of characters in a string.

    String s = "Hello";

    System.out.println(s.length());

    Output:

    2. charAt(int index)

    Use: Returns the character at the specified index.

    String s = "Java";

    System.out.println(s.charAt(2));

    Output:

    
    3. substring(int beginIndex, int endIndex)

    Use: Extracts a part of the string.

    String s = "Programming";

    System.out.println(s.substring(3, 8));

    Output:

    gramm

    Start index is included, end index is excluded.

    4. contains(CharSequence s)

    Use: Checks whether a string contains a specific sequence of characters.

    String s = "Hello World";

    System.out.println(s.contains("World"));

    Output:

    true
    5. equals(Object o)

    Use: Compares two strings for exact equality.

    String s1 = "Java";
    String s2 = "Java";

    System.out.println(s1.equals(s2));

    Output:

    true
    6. equalsIgnoreCase(String s)

    Use: Compares two strings ignoring case differences.

    String s1 = "JAVA";
    String s2 = "java";

    System.out.println(s1.equalsIgnoreCase(s2));

    Output:

    true
    7. toUpperCase()

    Use: Converts all characters to uppercase.

    String s = "hello";

    System.out.println(s.toUpperCase());

    Output:

    HELLO
    8. toLowerCase()

    Use: Converts all characters to lowercase.

    String s = "HELLO";

    System.out.println(s.toLowerCase());

    Output:

    hello
    9. trim()

    Use: Removes leading and trailing spaces.

    String s = "   Java   ";

    System.out.println(s.trim());

    Output:

    Java
    10. split(String regex)

    Use: Splits a string into an array based on a delimiter.

    String s = "Apple,Banana,Mango";

    String[] arr = s.split(",");

    for(String item : arr)
    {
        System.out.println(item);
    }

    Output:

    Apple
    Banana
    Mango
    11. startsWith(String prefix)

    Use: Checks whether a string starts with a given prefix.

    String s = "Java Programming";

    System.out.println(s.startsWith("Java"));

    Output:

    true
    12. endsWith(String suffix)

    Use: Checks whether a string ends with a given suffix.

    String s = "report.pdf";

    System.out.println(s.endsWith(".pdf"));

    Output:

    true
    13. valueOf(any type)

    Use: Converts other data types into String.

    int num = 100;

    String s = String.valueOf(num);

    System.out.println(s);

    Output:

    100
    14. toCharArray()

    Use: Converts a string into a character array.

    String s = "Java";

    char[] arr = s.toCharArray();

    for(char ch : arr)
    {
        System.out.println(ch);
    }

    Output:

    J
    a
    v
    a
    15. isEmpty()

    Use: Checks whether a string is empty (length == 0).

    String s = "";

    System.out.println(s.isEmpty());

    Output:

    true
    Difference:
    String s = " ";

    System.out.println(s.isEmpty());

    Output:

    false

    (Because space is a character.)

    16. isBlank()

    Use: Checks whether a string is empty or contains only whitespace.

    String s = "   ";

    System.out.println(s.isBlank());

    Output:

    true
    Difference:
    String s = "";

    System.out.println(s.isBlank());

    Output:

    true
    17. replace(char oldChar, char newChar)

    Use: Replaces all occurrences of a character with another character.

    String s = "banana";

    System.out.println(s.replace('a', 'o'));

    Output:

    bonono



# StringBuilder result = new StringBuilder();

creates a StringBuilder object named result.

Why use StringBuilder?

In Java, strings are immutable, which means they cannot be changed after creation.

Example:

String str = "Hello";
str = str + " World";

When you do this, Java creates a new string "Hello World" instead of modifying the old one.

If you keep adding characters many times inside a loop, creating new strings repeatedly becomes inefficient.

StringBuilder Solution


Finally:

return result.toString();

converts the StringBuilder into a normal String and returns it.

Think of it like this
StringBuilder result = new StringBuilder();

means:

"Create an empty box where I can keep adding characters efficiently."

Then:

result.append(ch);

means:

"Put this character into the box."

And:

result.toString();

means:

"Give me the final string stored in the box."