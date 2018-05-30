package io.github.edwinvanrooij;

import io.github.edwinvanrooij.bus.MessageBus;
import io.github.edwinvanrooij.bus.MessageHandler;

import static io.github.edwinvanrooij.Util.log;

public class Main {

    private static MessageBus bus;

    public static void main(String[] args) {
        log("Started server.");

        bus = new MessageBus();
        bus.consumeMessage(new MessageHandler() {
            @Override
            public void handleMessage(String text) {
                log(text);
            }
        });
    }
}
