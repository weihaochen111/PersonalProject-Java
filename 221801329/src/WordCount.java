import javafx.util.Pair;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) throws IOException {

        String str = Lib.readFile(Lib.DIR+"\\src\\input.txt");
        String filterStr = Lib.filterChinese(str);
        String deletedStr = Lib.deleteChineseString(str);
        int chars = Lib.countChars(filterStr);
        int lines = Lib.countLines(new File(Lib.DIR+"\\src\\input.txt"));
        //Integer count = 0;
        Pair<HashMap<String,Integer>,Integer> pair = Lib.makeWordPair(deletedStr);


        //System.out.println(pair.getKey());
        //System.out.println("MapSize:"+wordMap.size());
        //int words = Lib.countWords(deletedStr);
        System.out.println("Chars:"+chars);
        System.out.println("Lines:"+lines);
        System.out.println("Words:"+pair.getValue());
        Lib.outputSortedResult();
        //System.out.println("Words:"+words);
        //Lib.wordSort(wordMap);
    }
}
