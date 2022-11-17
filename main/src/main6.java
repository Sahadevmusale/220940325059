import java.util.*;

public class main6 {
    public static void main(String args[])
    {
        List<String> List_Strings = new ArrayList<String>();

       // add some elements (string)
        List_Strings.add("Yellow");
        List_Strings.add("Green");
        List_Strings.add("Black");
        List_Strings.add("White");
        List_Strings.add("Orange");
        List_Strings.add("Red");

        System.out.println(List_Strings);

        for(int i=0;
        i<List_Strings.size(); i++)
        {
            System.out.print(List_Strings.get(i));
            System.out.println(",");
        }


    }


}
