import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
  This program converts date in MM/dd/yyyy to MMM dd, yyyy format
  eg. 03/20/1984 -> Mar 20, 1984
*/
public class DateConverter {
    public static void main(String[] args) {
        String inputDate = "03/20/1984";
        System.out.println(ConvertDate(inputDate));
    }
    
    public static String ConvertDate(String inputDate) {
        SimpleDateFormat in_sdf = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat out_sdf = new SimpleDateFormat("MMM dd, yyyy");

        try {
            Date date = in_sdf.parse(inputDate);
            String outputDate = out_sdf.format(date);
            return outputDate;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}

/* Output 
Mar 20, 1984
*/
