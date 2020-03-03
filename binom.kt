// https://kotlinlang.org/docs/tutorials/javascript/getting-started-command-line/command-line-library-js.html

// kotlinc-js -output binom.js -libraries sample-library.meta.js binom.kt

import org.sample.factorial
import org.sample.forOdd
    
fun binom(m: Int, n: Int): Long =
    if (m < n) factorial(n) / factorial(m) / factorial(n-m) else 1
        
fun oddFactorial(n: Int): Long {
    var result: Long = 1L
    (1..n).forOdd { result = result * it }
    return result
}
