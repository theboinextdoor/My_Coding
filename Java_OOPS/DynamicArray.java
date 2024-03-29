public class DynamicArray {

    private int[] data;
    private int nextIndex;

    public DynamicArray(){
        data= new int[10];
        nextIndex= 0;
    }

    public void add(int element){
        if(nextIndex==data.length){
            restructure();
        }
        data[nextIndex]= element;
        nextIndex++;
    }

    private void restructure(){
        int[] temp= data;
        data= new int[data.length*2];
        for(int i=0; i<temp.length; i++){
            data[i]=temp[i];
        }
    }

    public int size(){
        return nextIndex;
    }

    public void set(int index, int element){
        if(index>nextIndex){
            return ;
        }else if(index<nextIndex){
            data[index]=element;
        }else{
            add(element);
        }
    }

    public int get(int index){
        if(index>nextIndex){
            return -1;
        }
        return data[index];
    }

    public boolean isEqual(){
        if(size()==0){
            return true;
        }
        return false;
    }

    public int removeLast(){
        if(size()==0){
            return -1;
        }
        int value=data[nextIndex-1];
        data[nextIndex-1]=0;
        nextIndex--;
        return value;

    }
}
