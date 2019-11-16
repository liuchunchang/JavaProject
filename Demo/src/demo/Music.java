package demo;

//导入jl1.0.1.jar包才能播放MP3格式的歌曲，不然只能播放au、aiff、wav、midi、rfm格式的音乐

import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Music {

    private String filename;
    private Player player;

    public Music(String filename) {
        this.filename = filename;
    }

    public void play() {
        try {
            BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(filename));
            player = new Player(buffer);
            player.play();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Music mp3 = new Music("D:\\CloudMusic\\没有什么不同.mp3");
        mp3.play();
    }
}



