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
        return str.charAt(idx) + str + str.charAt(idx);
    }
    public String halvesReversed(String myString) {
        return myString.substring(myString.length()/2) + myString.substring(0, myString.length()/2);
    }
    public String pigLatin(String orig) {
        return orig.substring(1) + orig.charAt(0) + "ay";
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
}  
