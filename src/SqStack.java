public class SqStack implements IStack{

    private Object[] stackElem;
    private int top;
    private int maxSize;
    
    public SqStack(int maxSize) {
        this.maxSize = maxSize;
        stackElem = new Object[maxSize];
    }

    @Override
    public void clear() {
        top=0;
    }

    @Override
    public void display() {
        for(int i=top-1;i>=0;i--){
            System.out.print(stackElem[i]+" ");
        }
        System.out.println();
    }

    @Override
    public boolean isEmpty() {
        return top==0;
    }

    @Override
    public int length() {
        return top;
    }

    @Override
    public Object peek() {
        if (!isEmpty()) {
            return stackElem[top-1];
        }
        else{
            return null;
        }
    }

    @Override
    public Object pop() {
        if(isEmpty()){
            return null;
        }
        top--;
        return stackElem[top];
    }

    @Override
    public void push(Object x) throws Exception {
        if(top==maxSize)
            throw new Exception("栈已满");
        stackElem[top]=x;
        top++;
    }
}
