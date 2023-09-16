package dsa;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4, 2, 5, 3, 6, 1, 3, 3));

        int target = 6;

        ArrayList<Pair<Integer, Integer>> pairs = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size() - 1; j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum == target) {
                    pairs.add(new Pair<>(arr.get(i), arr.get(j)));
                }
            }
        }

        System.out.println(Arrays.toString(pairs.toArray()));

    }

    static class Pair<T1, T2> {
        private T1 a;
        private T2 b;

        public Pair(T1 a, T2 b) {
            this.a = a;
            this.b = b;
        }

        public T1 getFirst() {
            return a;
        }

        public void setFirst(T1 num1) {
            this.a = num1;
        }

        public T2 getSecond() {
            return b;
        }

        public void setSecond(T2 num2) {
            this.b = num2;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "num1=" + a +
                    ", num2=" + b +
                    '}';
        }
    }
}
