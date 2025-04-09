package NeetCode250.ArrayAndHashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecode {
    /*
      Apprach use Extra character

      S = [ab,b,c,abc]
      ES = [ab#b#c#abc]
     DS = [ab,b,c,abc]

     TC - o(n) SC - o(n)


    Apprach 2
    Adding 4 bits

    Here each string we will create 4 bits and then and that string in ES

    ES 0 0 1 1 a b c 0 0 1 0 a b 0 0 1 0 x y

    DS

     */

    public String encode(List<String> strs) {

        if (strs.size() == 0) {
            return Character.toString((char) 258);
        }

        String separate = Character.toString((char) 257);
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s);
            sb.append(separate);
        }
        //delete the last character as we dont want that
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();

    }

    public List<String> decode(String s) {

        if (s.equals(Character.toString((char) 258))) return new ArrayList<>();

        String seprate = Character.toString((char) 257);

        return java.util.Arrays.asList(s.split(seprate, -1));
    }


}
