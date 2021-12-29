package kata4.main;

import kata4.view.MailListReader;
import kata4.view.MailHistogramBuilder;
import kata4.model.Mail;
import java.util.List;
import kata4.model.Histogram;
import kata4.view.HistogramDisplay;

public class Kata4 {

    public static void main(String[] args) {
        
        String fileName = "email.txt";
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram<String> histogram = MailHistogramBuilder.built(mailList);
        
        HistogramDisplay histoDisplay = new HistogramDisplay("Histograma v1", histogram);
        histoDisplay.execute();
        
    }
}
