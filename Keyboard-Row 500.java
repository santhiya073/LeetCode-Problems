class KeyboardRow {
    public String[] findWords(String[] words) {
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";

        java.util.ArrayList<String> ans = new java.util.ArrayList<>();

        for (String w : words) {
            String s = w.toLowerCase();

            if (check(s, r1) || check(s, r2) || check(s, r3))
                ans.add(w);
        }

        return ans.toArray(new String[0]);
    }

    public boolean check(String s, String row) {
        for (char c : s.toCharArray()) {
            if (row.indexOf(c) == -1)
                return false;
        }
        return true;
    }
}
