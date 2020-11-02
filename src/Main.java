import java.io.IOException;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Main {

    public static void main(String[] args) throws IOException {

        JasonGet jasonGet = new JasonGet();
        JasonGet.url = "https://ifsc.razorpay.com/KARB0000001";
        jasonGet.run();

        System.out.println("Waiting for data...");
        String jsonString = jasonGet.jsonIn;
        System.out.println(jsonString);

        // Считываем json
        Object obj = " ";
        try
        {
            obj = new JSONParser().parse(jsonString);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        System.out.println();

        JSONArray jsonArray = (JSONArray) obj;
        System.out.println(jsonArray.toJSONString());
        System.out.println();

        Banks banks = new Banks();

        for (Object jsonObject : jsonArray)
        {
            JSONObject object = (JSONObject) jsonObject;
            Bank bank = new Bank((String)object.get("BANK"), (String) object.get("IFSC"),(String) object.get("BRANCH"),(String) object.get("ADDRESS"),
                    (String)object.get("CONTACT"), (String) object.get("CITY"),(String) object.get("DISTRICT"),(String) object.get("STATE"),
                    (boolean)object.get("RTGS"), (String) object.get("BANKCODE"));
            banks.add(bank);
        }

        System.out.println("Imported data after parsing:\n" + banks);

        banks.getBanks().sort(Bank.byIdAsc);
        System.out.println("After sorting by ID ascending:\n" + banks);

    }
}
