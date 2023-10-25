import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LerArquivo {
    public static List<String> retornaStrings(String path) {
        List<String> stringsLinhaArquivo = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(new File(path)))) {
            String line = br.readLine();
            while (line != null) {
                stringsLinhaArquivo.add(line);
                line = br.readLine();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return stringsLinhaArquivo;

    }
}