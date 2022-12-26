
package kata4.main;


import kata4.model.*;
import kata4.view.*;

public class Kata4 {
    
    public static void main(String[] args) {
        execute();
    }
    
    public static void execute() {
        Iterable<Mail> itMail = input("email.txt");
        Histogram<String> histo = process(itMail);
        output(histo);
    }
    
    public static Iterable<Mail> input(String fileName) {
        Iterable<Mail> itMail = new MailListReader(fileName).mails();
        return itMail;
    }
    
    public static Histogram<String> process(Iterable<Mail> itMail) {
        Histogram<String> histo = new MailHistogramBuilder().build(itMail);
        return histo;
    }
    
    public static void output(Histogram<String> histo) {
        new HistogramDisplay(histo).execute();
    }
}
