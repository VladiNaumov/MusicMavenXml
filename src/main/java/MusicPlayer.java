
import java.util.List;

public class MusicPlayer {

    private Music music; //ссылка интерфейс

    // IoC. конструктор интерфейса с параметром
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {}

   private  List<Music> musicList;

    public void setMusicList( List<Music> musicList) {
        this.musicList = musicList;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSon());
    }

    public void playMusicList() {
        for(Music music : musicList) {
            System.out.println("Playing musicList: " + music.getSon());
        }
    }

}
