public class strings {
    public static void main(String[] args) {
        // Strings
        String str = "Banana";
        System.out.println(str);
        // There are many methods that can be done to str. Here's a couple examples.
        System.out.println(str.toUpperCase());
        System.out.println(str.length());
        
        // We can even create our own method!
        // This is an example where a method is created within the same Java file.
        // The method can be called using MethodName().
        System.out.println(coolify(str));
    }
    
    public static String coolify(String str) {
        // Try to guess what this does...
        String cool = "zzz";
        return str + cool;
    }

}
