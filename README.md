# Data-Structures-Algorithms

A small collection of Java examples and exercises demonstrating basic data-structures, algorithms, and usage of the Java Streams API. This repository is intended for learning and experimentation.

## Repository structure

- `core/` - simple Java examples that demonstrate language features and small algorithms (default package).
	- `Abstract.java` - demonstrates abstract classes and method overriding.
	- `Interface.java` - demonstrates interfaces and implementation.
	- `AddTwoNumbersArray.java` - attempt to add two numbers represented as arrays (contains logic issues; see Known issues).
	- `ReverseNumber.java` - reverses an integer.
	- `StringLearn.java` - small string API examples.

- `stream/` - examples showing usage of the Streams API and functional-style processing.
	- `SortAndTransform.java` - sorts a list of strings and converts them to upper case.
	- `RemoveOddMultipleByTwo.java` - filters even numbers and multiplies by two.
	- `NumericStreamsAggregation.java` - numeric stream operations and aggregation.
	- `GroupingAggregationwithStreams.java` - uses DoubleSummaryStatistics for aggregations.
	- `FilterMapSortCollect.java` - map, filter, distinct, sort examples.
	- `CountOccurance.java` - counts occurrences of strings using groupingBy.
	- `CombinedNumbersStringsChallenge.java` - a small challenge combining products, filtering and mapping (uses a `record` type).

## Requirements

- Java 16+ recommended (this project uses `record` in `CombinedNumbersStringsChallenge`, which requires Java 16 or later). Java 17 or later is recommended.

## Build and run (PowerShell / Windows)

1. Compile all classes into an output directory:

```powershell
# from project root (this repository)
javac -d out core\*.java stream\*.java
```

2. Run a specific example. Examples below assume you compiled into `out`:

```powershell
# Run core examples (these are in the default package). Example:
java -cp out Abstract

# Run a stream example (these are in the `stream` package). Example:
java -cp out stream.SortAndTransform
```

Note: For stream package classes you must include the package name when running the class (e.g. `stream.CountOccurance`).

## Examples to try

- Sort and transform:
	- `java -cp out stream.SortAndTransform`
- Count occurrences:
	- `java -cp out stream.CountOccurance`
- Show summary stats for prices:
	- `java -cp out stream.GroupingAggregationwithStreams`
- Reverse an integer:
	- `java -cp out ReverseNumber`

## Known issues and notes

- `AddTwoNumbersArray.java` currently contains incorrect/unfinished logic: it attempts to convert digit arrays to numbers and add them, but the output loop is wrong and the method prints incorrect results. Consider rewriting it to work with lists of digits and handle carry properly (or use BigInteger for very large numbers).
- Several classes are in the default (unnamed) package while others are in the `stream` package. For a real project it's recommended to add proper package declarations for `core` files and adopt a build tool (Maven/Gradle).

## Suggestions / next steps

- Convert the project to a Maven or Gradle project (adds reproducible builds and makes running examples easier).
- Add unit tests (JUnit) for the algorithmic examples (happy path + edge cases).
- Fix `AddTwoNumbersArray` to correctly add arrays of digits with carries and produce the expected reversed-digit or normal-digit representation.
- Add README sections for contribution guidelines and license if you want to make the repository public.

## License

This repository doesn't include a license file. If you want to share it publicly, consider adding a license such as MIT.

---

If you'd like, I can also:
- Convert this project to Maven/Gradle and add a simple test harness.
- Fix and add tests for `AddTwoNumbersArray`.
- Add package declarations and tidy the project structure.

Tell me which of the above you'd like me to do next.
