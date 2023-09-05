public class Max {
    public static Comparable findMax(Comparable a[]){
        int k=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i].compareTo(a[k])>0){
                k=i;
            }
        }
        return a[k];
    }
    public static void main(String[] args) {
        String vals[] = {"abc","bcd","ake"};
        System.out.println(findMax(vals));
    }
}
