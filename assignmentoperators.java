public class assignmentoperators { 
    public static void main(String[] args) {
        
    
        int p = 25;
        int q = 15;

        // =
        q = p;
        System.out.println(q);

        // +=
        p+=q;
        System.out.println(p);

        p-=q; //p=p-q;
        System.out.println(p);

        p*=q; //p=p*q
        System.out.println(p);

        p/=q; // p=p/q;
        System.out.println(p);
    }
}
