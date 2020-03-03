// https://kotlinlang.org/docs/tutorials/javascript/getting-started-command-line/command-line-library-js.html
// kotlinc-js -output sample-library.js -meta-info library.kt

package org.sample
   
fun factorial(n: Int): Long = if (n == 0) 1 else n * factorial(n - 1)
   
inline fun IntRange.forOdd(f: (Int) -> Unit) {
    this.forEach { if (it % 2 == 1) f(it) }
}
