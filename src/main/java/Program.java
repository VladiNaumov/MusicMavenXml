import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml" // вызов конфигурации с каталога resources / с файла applicationContext.xml
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class); // "musicPlayer" это <bean id>, MusicPlayer.class это основной class где есть ссылка интерфейс
        musicPlayer.playMusicList();
        musicPlayer.playMusic();

        System.out.println(musicPlayer.getVolume()); // Выводим значение поля int value ;

        context.close();


        /*
        Music a = new PoPMusic();
        Music b = new PoPMusic();
        Music c = new PoPMusic();

        MusicPlayer d = new MusicPlayer(c);
        d.PlayMusic();

         */


    }
}
