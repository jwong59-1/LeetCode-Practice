class Solution {
    
    public String decodeString(String s) {
        int[] i = new int[1];  //java cant pass an int by reference //global pointer
        return decode(s,i);
    }
    private String decode(String s, int[] i) {
        StringBuilder sb = new StringBuilder();
        int num = 0;
        while (i[0] < s.length()) {
            char c = s.charAt(i[0]);
            //case 1: number
            if (Character.isDigit(c)) {
                i[0]++;
                num = num*10 + (c - '0'); //number can be > 10
            } 
            else if (c == '[') {
                i[0]++;
                String innerWord = decode(s,i);
                for (int j = 0; j < num; j++) {
                    sb.append(innerWord);
                }
                num = 0;
            } 
            else if (c == ']') {
                i[0]++;
                return sb.toString();
            } 
            else {
                sb.append(c);
                i[0]++;
            } 
        }
        return sb.toString();
    }
}