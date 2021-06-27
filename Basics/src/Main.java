import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        System.out.println(pluralize("cat",1));
        System.out.println(flipNHeads(3));
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.println(Time());
        }
    }
    public static String pluralize(String word,int num){
return num ==0 || num>1?word+"s":word;

    }
    public  static  String flipNHeads(int n){
        int count=0;
        int flip=0;

        for (int i=0;i<n;){
            Double randomNum=Math.random();
           if (randomNum<0.5){
               count=0;
               i=0;
               flip++;
               System.out.println("tails");
           }
           else {
               i++;
               count++;
               flip++;
               System.out.println("heads");

           }
        }
        return "it took "+flip+" to give "+count+ " heads in a row";
    }

    public static String Time() {
        LocalDateTime now = LocalDateTime.now();
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        return time;
    }
}
