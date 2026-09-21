class Solution {
    public int minBishopMoves(int[] s, int[] t) {
        if(( s[0] + s[1]+ t[0]+t[1] ) % 2 != 0) return -1;// unreachable

        if(Math.abs(s[0] - t[0]) == Math.abs(s[1] - t[1])) return 1;//on same diagonal

        return 2;// if not -1, 1 then default 2
    }
}