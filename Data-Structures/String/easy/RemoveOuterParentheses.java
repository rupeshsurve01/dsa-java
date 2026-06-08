class RemoveOuterParentheses {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int depth = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                if (depth > 0) {
                    result.append(ch);
                }
                depth++;
            } else {
                depth--;
                if (depth > 0) {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }
}

// Step 1: What is a valid parentheses string?

// A string is valid if every opening bracket ( has a matching closing bracket ).

// Examples:

// ()
// (())
// ()()
// (()())

// Invalid:

// (()
// ())
// )(
// Step 2: What is a primitive string?

// A primitive string is a valid parentheses string that cannot be split into two smaller valid strings.

// Primitive Examples
// (())
// (()())
// ()
// Not Primitive
// ()()

// Because:

// ()() = () + ()

// It can be split into two valid strings.

// Step 3: What does "remove outermost parentheses" mean?

// Take a primitive string and remove its first ( and last ).

// Example:

// (())

// Remove outermost pair:

// ()

// Another:

// (()())

// Remove first and last bracket:

// ()()
// Example 1

// Input:

// (()())(())
// Find primitive parts
// (()()) + (())
// Remove outermost brackets

// For:

// (()())

// remove outer layer:

// ()()

// For:

// (())

// remove outer layer:

// ()
// Join them back
// ()() + ()

// Result:

// ()()()