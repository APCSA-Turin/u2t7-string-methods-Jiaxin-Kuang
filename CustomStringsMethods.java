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
}  
