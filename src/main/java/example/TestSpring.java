package example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

      // Music music = context.getBean("musicBean",Music.class);

       MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);

        System.out.println(musicPlayer.getMusicList());
        context.close();

    }
}
