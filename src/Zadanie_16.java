public class Zadanie_16 {
    public static void main(String[] arqs) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int max;
        for (int i = 0; i < (array.length - 1); i++) {
            max=i;
            System.out.printf("Массив %d",i);
            for (int j=i;j<array.length; j++){
                if (array[max]<array[j]){
                    max=j;
                }
            }
            int temp=array[max];
            array[max]=array[i];
            array[i]=temp;
            System.out.println("="+array[i]);
        }
    }
}
