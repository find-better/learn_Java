public class b {
    public static void main(String[] args) {
//        doprint();
        var result=jiechen(5);
        System.out.println(result);


    }

    static long jiechen(int num) {

        if (num == 1) {
            return 1;
        }
        return jiechen(num - 1) * num;
    }

    static void doprint()
    {
        System.out.println("Hello World");
        doprint();
    }

}
