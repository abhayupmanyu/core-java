class length_breadth extends Exception {
    length_breadth() {
        System.out.println("not a valid length or breadth");
    }

}

public class user_define_length_breadth {

    static int area(int l, int b) throws length_breadth {
        if (l < 0 || b < 0) {
            throw new length_breadth();
        }
        return l * b;

    }


    static void meth() throws length_breadth{
    System.out.println("area of rectangle is "+area(-10,5));
}
public static void main(String[] args) {
    try{
        meth();
    }
    catch(length_breadth e){
        e.printStackTrace();
    }
}

}
