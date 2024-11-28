class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length()-2;i++){
            for(int j=i+1;j<s.length()-1;j++){
                for(int k=j+1;k<s.length();k++){
                    HashSet<Character> hs = new HashSet<>();
                    hs.add(s.charAt(i));
                    hs.add(s.charAt(j));
                    hs.add(s.charAt(k));
                    if(hs.size()==k-i+1)count++;
                }
            }
        }
        return count;
    }
}
