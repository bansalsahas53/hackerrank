package hackerrank;
import java.util.Scanner;
import java.lang.String;
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
                b[i]=new Book();
            }
            for (int i=0; i<num;i++){
                System.out.println(b[i]);
            }
            scan.close();
        }
    }

}
class Book{
    private String bookName;
    private String authorName;
    private String isbn;
    @Override
    public String toString(){
        return "--------------------\n"+"Book Name:\t"+bookName+"\n"+
                "Author Name:\t"+authorName+"\n"+"ISBN:\t"+isbn+"\n"+
                "-------------------";
    }
}