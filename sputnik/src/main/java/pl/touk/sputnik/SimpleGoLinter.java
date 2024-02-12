package pl.touk.sputnik;

// Linter for the Go programming language
public class SimpleGoLinter {
    boolean isLineStartingWithTabs(String line)
    {
        // Go encourages the use of tabs over spaces
        for (int i = 0; i < line.length(); i++) {
            // if we detect a space before a letter
            if (line.charAt(i) == ' ') {
                return false;
            }
            // The first non tab character detected should be a letter or '{'
            if (Character.isLetter(line.charAt(i)) || line.charAt(i) == '{') {
                return true;
            }
        }
        return true;
    }

    boolean isVariableNameStartingWithNumber(String variableName) {
        if (variableName.length() == 0) {
            return false;
        }
        return Character.isDigit(variableName.charAt(0));
    }

    boolean isLineLengthValid(String line) {
        return line.length() < 80;
    }
}