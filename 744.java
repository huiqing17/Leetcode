class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        //Arrays.sort(letters);
        for(int i = 0; i < letters.length; i++){
            if(target >= letters[i]){
                //System.out.println(letters[i]);
                continue;
            }else{
                return letters[i];
            }
        }
        
        return letters[0];
        
        
        
        
    }
}
