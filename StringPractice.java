
public class StringPractice {

    //      String str = "hello";
    //      String str2 = new String("hello");
    //      is there any difference between these two lines?

    //String ki?
    //String ki type?
    //String and char er parthokko ki?
    //String er bhitore ki thake?
    //String kon package er under e?
    //java.lang package ki ashole?
    //String literral and new diye string declare kora ki ashole?
    //String immutable mane ki?
    //

//Mutable ki? //Mutant <-> Human

    //str = "hello" - 0x5564
    //str2 = "hello" - 0x5564
    //str + " jake" = "hello" + " jake" - 0x5566
    // "hello jake" = 0x5566
    public static void main(String[] args) {
        String str = "h";
        System.out.println(str);
        System.out.println(str.hashCode());

        //Hello World
        //lowercase it
        //uppercase it
        //reverse it
        //find the length
        //find the index of 'e'
        //find the index of 'l'
        //find substring from index 1 to 3
        //replace 'l' with 'm'
        //replace vs replaceAll
        //split it by ' '
        //trim it
        //concat it with " world" (with method)
        //contains
        //equals
        //equalsIgnoreCase
        //compareTo
        // == vs equals
        //difference between isBlank and isEmpty
        //starts with, ends with


        str = str + "e";
        System.out.println(str);
        System.out.println(str.hashCode());
        str = str + "l";
        System.out.println(str);
        System.out.println(str.hashCode());
        str = str + "l";
        System.out.println(str);
        System.out.println(str.hashCode());
        str = str + "o";
        System.out.println(str);
        System.out.println(str.hashCode());

        String str2 = "hello";
        System.out.println(str2);
        System.out.println(str2.hashCode());

        //String builder
        System.out.println("String builder");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("h");
        System.out.println(stringBuilder.toString());
        System.out.println(stringBuilder.hashCode());
        stringBuilder.append("e");
        System.out.println(stringBuilder.toString());
        System.out.println(stringBuilder.hashCode());
        stringBuilder.append("l");
        System.out.println(stringBuilder.toString());
        System.out.println(stringBuilder.hashCode());
        stringBuilder.append("l");
        System.out.println(stringBuilder.toString());
        System.out.println(stringBuilder.hashCode());
        stringBuilder.append("o");
        System.out.println(stringBuilder.toString());
        System.out.println(stringBuilder.hashCode());
    }
}
