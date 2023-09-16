package asciimirror;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the file path:");
        File file = new File(scanner.nextLine());

        if (file.exists() && file.isFile()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))){
                List<String> list = new ArrayList<>(reader.lines().toList());
                format(list);
                print(list);
            } catch (IOException ignored) {}
        } else {
            System.out.println("File not found!");
        }
    }

    private static void print(List<String> list) {
        list.forEach(e -> System.out.println(e + " | " + reverse(e)));
    }

    private static StringBuilder reverse(String e) {
        Map<String, String> map = new LinkedHashMap<>(){{
            put("<", ">");
            put("[", "]");
            put("{", "}");
            put("(", ")");
            put("/", "\\");
        }};

        for (Map.Entry<String, String> en : map.entrySet()) {
            e = e.replace(en.getValue(), "?8")
                    .replace(en.getKey(), en.getValue())
                    .replace("?8", en.getKey());
        }

        return new StringBuilder(e).reverse();
    }

    private static void format(List<String> list) {
        int max = fndLongest(list);

        list.forEach(e -> list.set(list.indexOf(e), e + " ".repeat(max - e.length())));
    }

    private static int fndLongest(List<String> list) {
        return list.stream().max(Comparator.comparing(String::length)).get().length();
    }
}