package ru.home.chernyadieva.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.home.chernyadieva.audio.AudioSystem;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        AudioSystem audioSystem = context.getBean("audioSystem", AudioSystem.class);//получаем бин из спринг контекста
        AudioSystem audioSystem2 = context.getBean("audioSystem", AudioSystem.class);//получаем бин из спринг контекста
        System.out.println(audioSystem);
        System.out.println(audioSystem2);
        System.out.println("Objects are equal? -> " + (audioSystem == audioSystem2));

        context.close();//закрываем контекст
    }
}
