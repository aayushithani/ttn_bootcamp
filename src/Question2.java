package aayushi;

public class Question2 {

    public static void main(String[] args) {

        String str = "aayushi";
        int j = 0;
        char temp = 0;

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++)
        {
            for (j = 0; j < chars.length; j++)
            {
                if (chars[j] > chars[i])
                {
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }

            }

        }

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

    }
}
