package ui;

import model.Event;
import model.EventLog;

public class LogPrinter {

//    public LogPrinter() {
//
//    }

    // EFFECTS: prints the event log
    public void printLog(EventLog el) {
        for (Event next : el) {
            System.out.println(next.toString() + "\n\n");
        }
    }

}
