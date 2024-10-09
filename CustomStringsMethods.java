public class CustomStringsMethods {
    public CustomStringsMethods(){}
    public boolean longerThan(String myString, int maxLength) {
        if(myString.length() > maxLength){
            return true;
        }
        else{
            return false;
        }
    }
    public String funnyString(String str, int idx) {
        return str.substring(idx, idx + 1) + str + str.substring(idx, idx + 1);
    }
    public String halvesReversed(String myString) {
        return myString.substring(myString.length()/2) + myString.substring(0, myString.length()/2);
    }
    public String pigLatin(String orig) {
        return orig.substring(1) + orig.substring(0) + "ay";
    }
    public String removeCharacter(String myString, int removeIdx) {
        if(removeIdx <= myString.length() - 1){
            return myString.substring(0, removeIdx) + myString.substring(removeIdx + 1);
        }
        else{
            return myString;
        }
    }  
    public String insertAt(String orig, String insertText, String searchStr) {
        if(orig.indexOf(searchStr) != -1){
            return orig.substring(0, orig.indexOf(searchStr)) + insertText + orig.substring(orig.indexOf(searchStr));
        }
        else{
            return orig + insertText;
        }
    }
    public String endUp(String myString, int numToCap){
        if(numToCap < myString.length()){
            return myString.substring(0,myString.length() - numToCap) + myString.substring(myString.length() - numToCap).toUpperCase();
        }
        else{
            return myString.toUpperCase();
        }
    }
    public String yellOrWhisper(String myString) {
        if(myString.substring(0,1).equals(myString.substring(0,1).toUpperCase())){
            return myString.toUpperCase();
        }
        else{
            return myString.toLowerCase();
        }
    }
}  
