package java_8.Lambda;

import java.util.Random;

class RandomPlayer{
    public void playGame(String gameName) throws InterruptedException
    {
        System.out.println(gameName+"Game Started.");
        Thread.sleep(1000);
        System.out.println("Gave Over");
    }
    public void playMusic(String trackName) throws InterruptedException {
        System.out.println(trackName+" Track Started");
        Thread.sleep(1000);
        System.out.println("track ended");
    }
}
public class MultithreadindExample2 {
    static String[] games = {"Gg","sd"};
    static String[] tracks ={"Believe him","Obey him"};
    public static void main(String[] args) {
        RandomPlayer player = new RandomPlayer();
        Random random = new Random();

        Runnable run = ()->{
            try{
               player.playGame(games[random.nextInt(games.length)]);
            } catch (InterruptedException e) {
                e.getMessage();
            }
        };

        Runnable run1 = ()->{
            try{
                player.playMusic(tracks[random.nextInt(tracks.length)]);
            } catch (InterruptedException e) {
                e.getMessage();
            }
        };

        Thread thread1 = new Thread(run);
        Thread thread2 = new Thread(run1);

        thread1.start();
        thread2.start();
    }
}
