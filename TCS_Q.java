import java.util.*;

public class TCS_Q {
    public static void main(String[] args) {
        String input = "ancde,abcd,abacaba,aabbcc,xyabz,abdkd,abbdbdb,dlsl";

        String[] strings = input.split(",");

        List<String> result = new ArrayList<>();

        for (String str : strings) {
            if (str.contains("ab") && str.length() > 4) {
                result.add(str);
            }
        }

        System.out.println(result);
    }
}
