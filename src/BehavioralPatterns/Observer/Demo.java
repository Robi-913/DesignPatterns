package BehavioralPatterns.Observer;

import BehavioralPatterns.Observer.editor.Editor;
import BehavioralPatterns.Observer.listeners.EmailNotificationListener;
import BehavioralPatterns.Observer.listeners.LogOpenListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}