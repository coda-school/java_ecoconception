package school.coda.java.ecoconception.microbenchmark;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;

public class BenchmarkSample {


    static void main() {
        benchmarkSomething();
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public static void benchmarkSomething() {
        // Écrire ici du code à mesurer


    }
}
