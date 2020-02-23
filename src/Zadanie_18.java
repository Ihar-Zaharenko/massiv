public class Zadanie_18 {
    public static void main(String[]arqs){
        String str="Тестовая, строка, с несколькими,, запятыми!!!";
        int n=0;
        int p=0;
        char symbol;
        int sum=0;
        for (int i=0; i<str.length();i++){
            symbol=str.charAt(i);
            if (symbol==',')
                n++;
            else if (symbol=='!')
                p++;
            sum=n+p;
        }
        System.out.println("У нас есть "+n+" запятых "+p);
        System.out.println("сумма "+sum);
    }
}
