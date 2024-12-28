public class longestSubString {
    public static int printLongestSubstring(String s) {
        int[]  dict = new int[256];
        for(int i=0; i<256; i++) {
            dict[i] = -1;
        }
        int maxlen = 0;
        int count =-1;
        for(int i=0; i<s.length(); i++) {
            if(dict[s.charAt(i)] > count) {
                count = dict[s.charAt(i)];
            }
            dict[s.charAt(i)] = i;
            maxlen = Math.max(maxlen, i- count);
            }
        return maxlen;
    }
    public static void main(String args[]) {
       String s = "pwwkew";
       System.out.println("Length of longest substring is : " +printLongestSubstring(s));
    }
}
