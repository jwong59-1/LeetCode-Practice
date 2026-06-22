class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> qd = new LinkedList<Integer>();
        Queue<Integer> qr = new LinkedList<Integer>();
        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                qr.add(i);
            } else {
                qd.add(i);
            }
        }
        int n = senate.length(); //each surviving senate new round
        while (!qd.isEmpty() && !qr.isEmpty()) {
            if (qd.peek() < qr.peek()) {
                qd.add(n++);
            } else  {
                qr.add(n++);
            }
            //remove senators
            qd.poll();
            qr.poll();
        }
        if (qd.isEmpty()) {
            return "Radiant";
        } else {
            return "Dire";
        }
    }
}