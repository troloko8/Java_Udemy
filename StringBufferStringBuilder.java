
public class StringBufferStringBuilder {
    public static void main(String a[]) 
    {
        StringBuffer sb = new StringBuffer("Tolik"); // capacity by default is 16 bytes
        System.err.println(sb.capacity());

        sb.append(" Tytarenko");

        System.err.println(sb.capacity());
        System.err.println(sb);

        sb.append(" wnat's more then 21 bytes capacity");

        System.err.println(sb.capacity());

    }
}
