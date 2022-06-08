package src;

import java.util.Scanner;

class Text{
    public String replace(String[] a,int[] b, String word, int num){
        for(int i = 0;i<a.length; i++){
            b[i] = a[i].length();
        }
        for(int i = 0;i<a.length; i++){
            int p = a[i].length();
            for(int q = 0;q < p;q++){
                String y = a[i];
                if( y.indexOf(".") != -1 || y.indexOf(",") != -1){
                    b[i] -= 1;
                    break;
                }
            }
        }
        for(int i = 0;i<a.length; i++){
            if (b[i] == num ){
                if(a[i].indexOf(".") != -1){
                    a[i] = word+".";
                }
                else if(a[i].indexOf(",") != -1){
                    a[i] = word+",";
                }
                else {
                    a[i] = word;
                }
            }
        }
        String Result = "";
        for(int i = 0;i<a.length; i++){
            Result+=a[i]+" ";
        }
        return Result;
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);


        System.out.println("C3 = "+1103%2);
        System.out.println("C3 = "+1103%17);

        System.out.println("тип текстових змінних: String");

        System.out.println("Введіть текст");
        String words = scanner.nextLine();
        if(words==""){
            System.out.println("Помилка: текст не може бути пустим");
            System.exit(0);
        }
        System.out.println("Введіть довжину слова або слів, що треба замінити");
        int num = scanner2.nextInt();
        if(words==""){
            System.out.println("Помилка: довжина не може бути пустою");
            System.exit(0);
        }

        System.out.println("Введіть слово, яким треба замінити");
        String word = scanner.nextLine();
        if(words==""){
            System.out.println("Помилка: слово не може бути пустим");
            System.exit(0);
        }


        String[] a = words.split(" ");
        int[] b = new int[a.length];
        Text text = new Text();
        String RESULT = text.replace(a,b,word,num);
        System.out.println("Результат :");
        System.out.println(RESULT);
    }
    }




