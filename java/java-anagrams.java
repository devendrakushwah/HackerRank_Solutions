// My HackerRank Submissions
//@Author - Devendra Kushwah
    static boolean isAnagram(String s1, String s2) {
      boolean isAnagram = false;
    if (s1.length() == s2.length()) 
    {
        String a=s1.toLowerCase();
        String b=s2.toLowerCase();
        char[] s1AsChar = a.toCharArray();
        char[] s2AsChar = b.toCharArray();
        Arrays.sort(s1AsChar);
        Arrays.sort(s2AsChar);
        isAnagram = Arrays.equals(s1AsChar, s2AsChar);
        return isAnagram;
    }
    else
    {
        isAnagram=false;
        return isAnagram;
    }
        
    }