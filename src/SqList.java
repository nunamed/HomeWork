import java.util.Arrays;

class SqList {

    private int maxSize;
    private int curLen;
    private Object[] listItem;

    public SqList(int maxsize) {
        curLen = 0;
        maxSize = maxsize;
        listItem = new Object[maxSize];
    }

    public void insert(int i, Object x) throws Exception {
        if (curLen == maxSize)
            throw new Exception("顺序表横");
        if (i < 0 || i > curLen)
            throw new Exception("插入位置非法");
        for (int j = curLen; j > i; j--)
            listItem[j] = listItem[j - 1];
        listItem[i] = x;
        curLen++;

    }

    public int indexOf(Object x) {
        for (int i = 0; i <= curLen - 1; i++) {
            if (listItem[i].equals(x))
                return i;
        }
        return -1;
    }
    public int length(){
        return this.curLen;
    }
    public Object get(int i) throws Exception {
        if(i<0||i>curLen-1) throw new Exception("第"+i+"个数据元素不存在");
        return listItem[i];
    }
    public void remove(int i) throws Exception{
        if(i<0||i>curLen-1) throw new Exception("删除位置违法");
        for (int j = i; j < curLen-1; j++) {
            listItem[j]=listItem[j+1];
        }
        curLen--;
    }

    @Override
    public String toString() {
        String list="[";
        for (int i = 0; i < curLen; i++) {
            if(i!=curLen-1)
                list+=listItem[i].toString()+",";
            else
            list+=listItem[i].toString()+"]";
        }
        return list;
    }
    
}