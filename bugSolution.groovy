```groovy
def myMethod(String str) {
  // Use Groovy's elvis operator to provide a default value
  return (str ?: "").toUpperCase()
}

assert myMethod(null) == ""
assert myMethod("hello") == "HELLO"
```