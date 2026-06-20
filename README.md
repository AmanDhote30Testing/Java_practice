# Java Practice

Core Java string exercises. Written while brushing up on Java before building automation frameworks.

## Stack
- Java 23
- Maven (no external dependencies)

## Problems covered

**CharacterAtIndex** — loop through a string and print the index of specific characters (`J` and `i`)

**CountCharacterInString** — count letters, spaces, digits, and special characters in a string using `Character` utility methods

**DuplicateCharacter** — find duplicate characters using nested loops. Done two ways: with a `char` variable and with a `char[]` array to compare both approaches

**ExtractData** — extract a substring by iterating characters manually (also shows the `split()` shortcut in a comment)

**ReverseString** — reverse a string three ways: `StringBuilder.append()`, string concatenation with `+=`, and prepending each character

## Run

```bash
mvn compile exec:java -Dexec.mainClass="Java_Practice.ReverseString"
# swap the class name for whichever you want to run
```

## Notes

Each file has a `main()` method and runs independently. No test classes here — the output was checked manually.
