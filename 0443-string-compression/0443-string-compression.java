class Solution {
    public int compress(char[] chars) {
        int r = 1, count = 1;
        char curr = chars[0];
        StringBuilder sb = new StringBuilder();
        while(r < chars.length) {
            //check if next equals to prev
            if (curr != chars[r]) {
                //append to sb, then update
                sb.append(curr);
                // if length > 1, we add number
                if (count > 1) {
                    sb.append(count);
                }
                //update new curr
                curr = chars[r];
                count = 0;
            }
            count++;
            r++;
        }
        //add the back if at all
        sb.append(curr);
        if (count > 1) {sb.append(count);}
        //add into char array
        for (int j = 0; j < sb.length(); j++) {
            chars[j] = sb.charAt(j);
        }
        return sb.length();
    }
}