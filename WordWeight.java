import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordWeight {
	private static final Comparator compare = null;

	public void count() throws Exception {
		File file = new File("E:\\JAVA\\WordWeight\\src\\x.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);
		StringBuilder builder = new StringBuilder();
		String line = "";
		while ((line = reader.readLine()) != null) {
			builder.append(line);
		}

		Pattern pattern = Pattern.compile("[a-zA-Z]+");
		String content = builder.toString();
		Matcher matcher = pattern.matcher(content);
		Map<String, Integer> map = new HashMap<String, Integer>();
		String word = "";
		Integer times = 0;
		String[] key = { "am", "is", "are", "was", "been", "has", "have",
				"had", "a", "an", " the", "in", " at", " on", "to", " or" };
		while (matcher.find())
			word = matcher.group();

		if (map.containsKey(word)) {
			for (int i = 0; i < 16; i++) {
				if (word == key[i]) {
					times = (int)0.2*map.get(word);
					map.put(word, times + 1);
				} 
			}

		} else {
			map.put(word, 1);
		}
	//}
List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>
         (map.entrySet());
   //        Compare compare = new Compare();
			for (int i = 0; i < 10; i++) {
			Map.Entry<String, Integer> entry = Collections.max(list, compare);// max
			String key1 = entry.getKey();
			Integer value = entry.getValue();
			int index = list.indexOf(entry);
			System.out.println(key1 + " " + value);
			list.remove(index);}
			}


	public static void main(String[] args){
		try {
			WordWeight WordWeight = new WordWeight();
	        WordWeight.count();
		}
	        catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	}
