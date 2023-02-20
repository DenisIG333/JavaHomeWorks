//1.Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json строки.
//Если значение null, то параметр не должен попадать в запрос.
//Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class task1 {
    public static void main(String[] args) {
        split(reader());
    }

    public static String reader() {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("Txt1.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String str = sb.toString();
        return str;

    }

    public static void split(String str) {
        String str2 = str.replace("{", "")
                .replace("}", "")
                .replace(':', '=')
                .replace('"', ' ');

        String[] newStrArray = str2.split(", ");
        String strNew = "";

        for(int i = 0; i < newStrArray.length; i++)
        {
            int indexM = newStrArray[i].indexOf("null");
            if(indexM == -1)
            {
                strNew += newStrArray[i] + "AND";
            }

        }
        System.out.print("SELECT * FROM students WHERE" + strNew.substring(0, strNew.length() - 3));//только костыльным способом нашел как удалить AND в конце (-:
    }

}
