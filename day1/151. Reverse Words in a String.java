class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        int i = 0, j = s.length() - 1;
        while(i <= j && s.charAt(i) == ' ') i++;
        while(j >= i && s.charAt(j) == ' ') j--;
        s = s.substring(i, j+1);

        String[] words = s.split("\\s+");
       
        StringBuilder sb = new StringBuilder();

        for(int k = words.length -1; k > 0; k--) {
            sb.append(words[k]).append(" ");

        }
        return sb.append(words[0]).toString();
    }
}
