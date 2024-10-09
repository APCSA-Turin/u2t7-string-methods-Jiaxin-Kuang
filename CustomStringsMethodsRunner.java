public class CustomStringsMethodsRunner {
    public static void main(String[] args) {
        CustomStringsMethods methods = new CustomStringsMethods();
        System.out.println(methods.longerThan("hedgehog", 7));
        System.out.println(methods.funnyString("penguin", 5));
        System.out.println(methods.halvesReversed("shark"));
        System.out.println(methods.pigLatin("hummingbird"));
        System.out.println(methods.removeCharacter("polar bear", 4));
        System.out.println(methods.insertAt("jackel", "fox", "ac"));
        System.out.println(methods.endUp("pronghorn", 4));
        System.out.println(methods.yellOrWhisper("Rabbit"));
    }
}
