```groovy
def myMethod(String str) {
  if (str == null) {
    return "null"
  }
  return str.toUpperCase()
}

assert myMethod(null) == "null"
assert myMethod("hello") == "HELLO"
```