public class Zadata_15 {
    public static void main(String[] arqs) {
        int mark[] = {8, 5, 6, 4, 2, 3, 7, 9};
        int maxMark = mark[0];
        int minMark = mark[0];
        int indexmax = 0;
        int indexmin = 0;
        int sum=0;
        for (int i = 0; i < mark.length; i++) {
            if (maxMark < mark[i])
                maxMark = mark[i];
                indexmax = i;
        }
        System.out.println("Максимальное значение " + maxMark);
        System.out.println("индекс " + indexmax);
        for (int i = 0; i < mark.length; i++) {
            if (minMark > mark[i]) {
                minMark = mark[i];
                indexmin = i;
            }
        }
        System.out.println("Минимальное значение " + minMark);
        System.out.println("индекс " + indexmin);
        for (int i=indexmin; i<=indexmax; i++){
            sum=sum+mark[i];
        }
        System.out.println("Сумма между минимальным и максимальным" + sum);
    }
}

