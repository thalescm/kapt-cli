# kapt-cli

A tool for invoking the **Kotlin Annotation Processor** (kapt) from the command line. This project is a work in progress.

## Requirements
Kotlin 1.1.3+

### Directions:
1. Modify the `args` file and provide values for all variables:

* `KOTLIN_HOME` -> Path where all kotlin jars resides

Annotation processor plugin specific ([click here for the oficial documentation](https://kotlinlang.org/docs/reference/kapt.html#using-in-cli)):
* `SOURCES` -> (required) An output path for the generated files.
* `CLASSES` -> (required) An output path for the generated class files and resources.
* `STUBS` -> (required) An output path for the stub files. In other words, some temporary directory.
* `INCREMENTAL_DATA` -> An output path for the binary stubs.
* `AP_CLASSPATH` -> (repeatable) A path to the annotation processor JAR. Pass as many apclasspath options as many JARs you have.
* `AP_OPTIONS` -> A base64-encoded list of the annotation processor options. See [AP/javac options encoding](https://kotlinlang.org/docs/reference/kapt.html#apjavac-options-encoding) for more information.
* `JAVAC_ARGUMENTS` -> A base64-encoded list of the options passed to javac. See [AP/javac options encoding](https://kotlinlang.org/docs/reference/kapt.html#apjavac-options-encoding) for more information.

2. Modify the `module-template.xml` file and add values. (TODO: provide an xml generator for fields set in `args`)
3. Patch your `kotlinc` file to add java `tools.jar` to the compiler classpath. (TODO: provide this as an arg)
4. *Optional*: If you've run step 4 previously, you may choose to run `./clean` to start fresh.
5. Invoke `./kapt`. (TODO: complete all steps)

### References
https://kotlinlang.org/docs/reference/kapt.html

https://stackoverflow.com/questions/45217399/how-to-use-kapt-from-command-line-with-kotlinc

https://github.com/facebook/buck/issues/956

https://github.com/JetBrains/kotlin-web-site/blob/ee466cc3109fc932286e23d4f7b43da2eb6b4dff/pages/docs/reference/kapt.md#using-in-cli
