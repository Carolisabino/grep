import java.io.*;

public class Grep {
    public static void main(String[] args) {
        if(args.length < 1) return;

        String word = args[0];
        String filePath = args.length > 1 ? args[1] : null;
        grep(filePath, word);

    }

    private static void grep (String fileInput, String word){
        try(
                BufferedReader reader = getReader(fileInput))
        {
            String line;
            while ((line = reader.readLine()) != null){
                if(line.contains(word)){
                    System.out.println(line);
                }
            }
        } catch(FileNotFoundException e){
            System.out.println("could not locate %s" + e);
        }
        catch(IOException e){
            System.out.println("something went wrong");
        }
    }

    private static BufferedReader getReader(String fileInput) throws FileNotFoundException{
        Reader source = (fileInput != null)
                ? new FileReader(fileInput)
                : new InputStreamReader(System.in);
        return new BufferedReader(source);
    }
}
