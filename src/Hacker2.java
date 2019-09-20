import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine().trim();
        Player[] playerArray =new Player[n];
        if(n>0 && n<=100){
            for(int i=1;i<=n;i++) {
                String playerName = scan.nextLine().trim();
                String userName = scan.nextLine().trim();
                String level = scan.nextLine().trim();
                int score = scan.nextInt();
                scan.nextLine().trim();
                playerArray[i] = new Player(playerName, userName, level, score);
            }
            System.out.println("playerName\tuser\tlevel\tscore");
            for(int j =0;j<n;j++){
                System.out.println(playerArray[j]);
            }
            scan.close();
        }

    }
}
class Player{
    private String playerName;
    private String userName;
    private String level;
    private int score;
    public String getplayerName(){
        return playerName;
    }
    public String getuserName(){
        return userName;
    }
    public String getLevel(){
        return level;
    }
    public int getscore(){
        return score;
    }
    public void setPlayerName(String playerName){
        this.playerName=playerName;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }
    public void setLevel(String level){
        this.level=level;
    }
    public void setscore(int score){
        this.score=score;
    }

    Player(String playerName,String userName,String level,int score){
        this.playerName=playerName;
        this.userName=userName;
        this.level=level;
        this.score=score;
    }
    @Override
    public String toString(){
        return getplayerName() + "\t" + getuserName() + "\t" + getLevel() + "\t" + getscore();
    }
}
