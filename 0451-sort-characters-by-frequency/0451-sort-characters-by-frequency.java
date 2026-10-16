class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = freq.getOrDefault(ch, 0) + 1;
            freq.put(ch, count);
            max = Math.max(max, count);
        }

        StringBuilder result = new StringBuilder();

        for (int f = max; f >= 1; f--) {
            for (char ch : freq.keySet()) {
                if (freq.get(ch) == f) {
                    for (int k = 0; k < f; k++) {
                        result.append(ch);
                    }
                }
            }
        }

        return result.toString();
    }
}