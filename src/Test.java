public class Test {
    // public static void main(String[] args) throws Exception {
    //     SqList L = new  SqList(26);
    //     for (int i = 0; i < 26; i++) {
    //         L.insert(i, 'a'+i);
    //     }
    //     System.out.println("请输入查询元素的位序号：");
    //     int i =new Scanner(System.in).nextInt();
    //     if(i>0&&i<25){
    //         System.out.printf("第"+i+"个元素的直接前驱为：%c\n",L.get(i-1));
    //         System.out.printf("第"+i+"个元素的直接后驱为：%c\n",L.get(i+1));
    //     }
    //     else if (i==0) {
    //         System.out.println("第"+i+"个元素的直接前驱不存在");
    //         System.out.printf("第"+i+"个元素的直接后驱为：%c\n",L.get(i+1));
    //     }
    //     else{
    //         System.out.println("第"+i+"个元素的直接后驱不存在");
    //         System.out.printf("第"+i+"个元素的直接前驱为：%c\n",L.get(i-1));
    //     }
    // }
    // public static SqList difference(SqList a,SqList b) throws Exception{
    //     boolean p = false;
    //     for (int i = 0; i < a.length(); i++) {
    //         for (int j = 0; j < b.length(); j++) {
    //             if(a.get(i).equals(b.get(j))){
    //                 p=true;
    //             }
    //         }
    //         if(p){
    //             a.remove(i);
    //             i--;
    //             p=false;
    //         }
    //     }
    //     return a;
    // }
    // public static void main(String[] args) throws Exception {
    //     SqList a = new SqList(3);
    //     SqList b = new SqList(3);
    //     a.insert(0, 1);
    //     a.insert(1, 2);
    //     a.insert(2, 3);
    //     b.insert(0, 2);
    //     b.insert(1, 3);
    //     b.insert(2, 4);
    //     SqList c = difference(a, b);
    //     System.out.println("C="+c.toString());
    // }
    
    // protected static void isMatched(String str) throws Exception{
    //     SqStack s = new SqStack(str.length());
    //     for (int i = 0; i < str.length(); i++) {
    //         if (str.charAt(i)=='(') {
    //             s.push('(');
    //         }
    //         else if(str.charAt(i)==')'&&!s.isEmpty()){
    //             s.pop();
    //         }
    //         else if(str.charAt(i)==')'&&s.isEmpty()){
    //             System.out.println("括号不匹配");
    //             return;
    //         }
    //     }
    //     if(s.isEmpty()){
    //         System.out.println("括号匹配");
    //     }
    //     else{
    //         System.out.println("括号不匹配");
    //     }
    // }
    // public static void main(String[] args) throws Exception {
    //     String str = "(a+b*(c+d))";
    //     String str2 = "(a+b*(c+d)))";
    //     isMatched(str);
    //     isMatched(str2);
    // }
    protected static int Fib(int n){
        if (n<3) {
            return 1;
        }
        return Fib(n-1)+Fib(n-2);
    }

    public static void main(String[] args) {
            System.out.println(Fib(8));
        }
}