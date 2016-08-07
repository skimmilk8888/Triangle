# Triangle

This is class used to determine the type of a triangle given the lengths of its sides

## Dependencies

You will need IntelliJ IDEA to run tests in this project

## Test

Open this project in IntelliJ IDEA, right click the test folder and choose "Run 'All Tests'"

## Discussion

- **Enum return value**. We choose Enum over String as return value because it's type safe and it's faster to compare. And they can be easily converted to String if needed.

- **Static function**. We use a static function to return triangle type because it doesn't use instance variables.

- **Final class**. We make the Triangle class final because we don't expect someone to subclass it.

- **Private constructor**. We make the constructor of Triangle class private because it's a utility/static class without any state so we don't expect someone to instantiate it.

- **Package**. We use package name here to avoid name conflicts. So Triangle class can be used in larger projects as a module. If we have more classes/functions about triangles in the future, we can put them into the same package.

