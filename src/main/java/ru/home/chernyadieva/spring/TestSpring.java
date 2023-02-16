package ru.home.chernyadieva.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.home.chernyadieva.audio.AudioSystem;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        AudioSystem audioSystem = context.getBean("audioSystem", AudioSystem.class);//получаем бин из спринг контекста
        System.out.println(audioSystem);

        context.close();//закрываем контекст
    }
}
