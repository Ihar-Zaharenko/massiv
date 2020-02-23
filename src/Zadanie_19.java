public class Zadanie_19 {
    public static void main(String[]arqs){
        String str="Тестовая, строка, с несколькими,, запятыми!!!";
        int n=0;
         for (String s: str.split(" ")){
             n++;
             System.out.println(s);
         }
        System.out.println("Количество слов"+n);
        }
    }
