import java.util.Locale;
import java.text.NumberFormat;

public class App {
    public static void main(String[] args) throws Exception {
        formatUKNum();
        formatUSCurrency();
        parseNumber();
    }

    public static void formatUKNum() {
        NumberFormat nf = NumberFormat.getInstance(Locale.UK);
        nf.setMaximumFractionDigits(2);
        System.out.println("UK num: " + nf.format(12345.678));
    }

    public static void formatUSCurrency() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US currency: " + nf.format(12345.678));
    }

    public static void parseNumber() {
        String strNum = "12345.678";

        Double num = Double.parseDouble(strNum);
        System.out.println(num);
    }    

    
}
