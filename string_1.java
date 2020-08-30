

public class string_1 {
    public static void name(final String[] args) {
        //Anagram

       
        // Scanner sc = new Scanner(System.in);
        // System.out.print("\nInput a word: ");
        // String word = sc.nextLine();
        // word = word.trim();
        // boolean isAnagram = true;
        // String result = ""; 
        // char[] ch=word.toCharArray();  
        // for (int i = ch.length - 1; i >= 0; i--) {
        //         result += ch[i];
        //  }
        //  String r = result.trim();
        // if(word ==r){
        //     isAnagram = true;
        // }else{
        //     isAnagram=false;
        // }
        // sc.close();


        String a= "cat";
        String b = "act";

        boolean isAnagram = false;
        if (a.length() != b.length()) {
            for(int j = 0; j<a.length(); j++){
                char c = a.charAt(j);
                for(int i = 0; i<b.length();i++){
                    if(b.charAt(i)==c){
                        isAnagram= true;
                        break;
                    }
                }
                if (!isAnagram){
                break;
                }
            }
        if(isAnagram){
            System.out.println("anagram");
        }else{
            System.out.println("not");
        }	
    
    }
}

    
}