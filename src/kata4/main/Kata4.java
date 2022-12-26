
package kata4.main;


import kata4.model.*;
import kata4.view.*;

public class Kata4 {
    
    public static void main(String[] args) {
        MailListReader mlr = new MailListReader("email.txt");
        Iterable<Mail> it = mlr.mails();
        MailHistogramBuilder mhb = new MailHistogramBuilder();
        Histogram<String> histo = mhb.build(it);
        new HistogramDisplay(histo).execute();
    }
    
}
