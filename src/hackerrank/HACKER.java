/*package hackerrank;
import java.util.Scanner;
import java.lang.StringBuilder;
public class HACKER {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        if(num==0){
            System.out.println("N/a");
        }
        else{
            scan.nextLine().trim();
            Book[] b=new Book[num];
            for (int i=0;i<num;i++){
                String bookName =scan.nextLine().trim();
                String authorName=scan.nextLine().trim();
                String isbn=scan.nextLine().trim();
                b[i]=new Book(bookName,authorName,isbn);
            }
        }
    }

}
class Book{}*/