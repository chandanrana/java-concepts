package dsa;

public class DsaRunner {
    public static void main(String[] args) {

        int a = 1;
        int b = 1;
        System.out.println(a==b);

        FrequencyCounter<String> counter = new FrequencyCounter<>();
        counter.add("A");
        counter.add("B");
        counter.add("B");
        counter.add("C");
        counter.add("A");
        counter.add("D");

        counter.frequencyMap.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
