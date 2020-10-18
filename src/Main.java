public class Main {

    public static void printData(Data[] data){
        for(int i=0; i<data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public static void sortData(Data[] data){
        boolean isSorted = false;
        Data buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < data.length-1; i++) {
                if(data[i].number > data[i+1].number ||
                        data[i].number == data[i+1].number &&
                        data[i].name.compareTo(data[i+1].name)>0){
                    isSorted = false;
                    buf = data[i];
                    data[i] = data[i+1];
                    data[i+1] = buf;
                }
            }
        }
    }

    public static void main(String[] args) {
        Data[] dataList = new Data[5];
        dataList[0]=(new Data(1,"C"));
        dataList[1]=(new Data(1,"A"));
        dataList[2]=(new Data(2,"D"));
        dataList[3]=(new Data(1,"E"));
        dataList[4]=(new Data(2,"B"));
        System.out.println("До сортировки:");
        printData(dataList);

        System.out.println();
        System.out.println("После сортировки:");
        sortData(dataList);
        printData(dataList);
    }
}
