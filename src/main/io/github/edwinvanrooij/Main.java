package io.github.edwinvanrooij;

import io.github.edwinvanrooij.bus.MessageBus;
import io.github.edwinvanrooij.bus.MessageHandler;

import static io.github.edwinvanrooij.Util.log;

public class Main {

    private static MessageBus bus;

    public static void main(String[] args) {
        log("Started server.");

//        String uuid = args[0];
        String uuid = "c8c770ee-9b60-4c37-bf2c-0162b1863bad";

        bus = new MessageBus(uuid);
        bus.consumeMessage(new MessageHandler() {
            @Override
            public void handleMessage(String text) {
                log(text);
            }
        });
    }
}
