public class HiddenWord{
    private String Word;
    public HiddenWord(String x){
            Word = x;
    }
    public String getHint(String hint){
        String y = "";
        int len = hint.length();
        for(int i = 0; i != len; i++){
            if(hint.substring(i, i+1).equals(Word.substring(i,i+1))){
                y = y + Word.substring(i, i+1);
               
            }
            else if ( Word.indexOf(hint.substring(i,i+1))!= -1){
                y = y + "+";
            
            }
            else{y = y + "*";}
            
        }
        return y;
    }
}