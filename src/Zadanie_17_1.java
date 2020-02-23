public class Zadanie_17_1 {
    public static void main(String[] args) {
        int SIZE[][]=new int[5][5];
        for(int i=0; i<SIZE.length; i++){
            for(int j=0; j<SIZE.length; j++){

                if (j==0 && i==1 || j==0 && i==2 || j==0 && i==3 || j==1 && i==2 ||j==4 && i==1 || j==4 && i==2 || j==4 && i==3 || j==3 && i==2  ) {
                    SIZE[i][j]=0;
                }else {
                    SIZE[i][j]=1;
                }
                System.out.printf("%d",SIZE[i][j]);
            }
            System.out.println("");
        }
    }
}