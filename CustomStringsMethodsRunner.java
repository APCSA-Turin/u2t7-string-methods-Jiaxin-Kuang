public class CustomStringsMethodsRunner {
    public static void main(String[] args) {
        CustomStringsMethods methods = new CustomStringsMethods();
        String str = methods.endUp("It's Thursday", 3);
        System.out.println(str);
        str = methods.endUp("hello friend", 3);
        System.out.println(str);
        str = methods.endUp("hello friend!", 3);
        System.out.println(str);
        str = methods.endUp("Shhhh! Be quiet", 3);
        System.out.println(str);
        str = methods.endUp("Yes", 3);
        System.out.println(str);
        str = methods.endUp("Yess", 3);
        System.out.println(str);
        str = methods.endUp("Yesss", 3);
        System.out.println(str);
        str = methods.endUp("no", 3);
        System.out.println(str);
        str = methods.endUp("no!", 3);
        System.out.println(str);
        str = methods.endUp("noo!", 3);
        System.out.println(str);
        str = methods.endUp("noo!!", 3);
        System.out.println(str);
        str = methods.endUp("ALREADY UPPERCASE", 3);
        System.out.println(str);
        str = methods.endUp("hello friend", 1);
        System.out.println(str);
        str = methods.endUp("hello friend", 6);
        System.out.println(str);
        str = methods.endUp("hello friend", 20);
        System.out.println(str);         
    }
}
