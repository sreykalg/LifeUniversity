package object;

public class ToStringMain1 {
    public static void main(String[] args){
        Object o = new Object();
        String str = o.toString();

        //toString
        System.out.println(str);

        // Output object directly
        System.out.println(o);
    }
}

// Execution result :
// java.lang.Object@7f560810
// java.lang.Object@7f560810

// toString method implemented in Object
/*

public String toString() {
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
}

*/
