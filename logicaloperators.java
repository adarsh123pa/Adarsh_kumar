public class logicaloperators {
    public static void main(String[] args) {
        int p = 17, q = 58, r = 64;
        
        // && operator
        System.out.println((p>q) && (p<q));
        System.out.println((p>q) && (p<r));


        // || opertaor
        System.out.println((r<q) || (p<q));
        System.out.println((p>q) || (q<r));
        System.out.println((p<q) || (q<r));


        // ! operator
        System.out.println(!(p==q));
        System.out.println(!(p>q));

    }
    
}
