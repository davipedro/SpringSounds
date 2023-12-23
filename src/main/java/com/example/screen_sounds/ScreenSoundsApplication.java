package com.example.screen_sounds;

import com.example.screen_sounds.controller.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenSoundsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ScreenSoundsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Main main = new Main();
        main.menu();
    }
}
