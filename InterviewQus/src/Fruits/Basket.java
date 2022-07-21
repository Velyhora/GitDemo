package Fruits;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Basket {
    public static void main(String args[]) throws FileNotFoundException {
        List<BasketModel> records = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("C:\\IT\\Basket\\basket.csv"));) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (!line.contains("name")) {
                    records.add(getRecordFromLine(line));
                }
            }
        }

        /*************************************************/
        totalNumberOfFruits(records);
        /*************************************************/

        /*************************************************/
        typesOfFruits(records);
        /*************************************************/

        /*************************************************/
        numberOfEachTypeOfFruits(records);
        /*************************************************/
       colorOfEachFruits(records);
        /**************************************************/
        shapeOfEachFruits(records);
        /**************************************************/
        overTreeDays(records);
        /**************************************************/
    }


    private static void totalNumberOfFruits(List<BasketModel> records) {
        int total = 0;
        for (int i = 0; i < records.size(); i++) {
            total = total + records.get(i).getSize();
        }
        System.out.println("Total number of fruit " + total);

    }

    private static void numberOfEachTypeOfFruits(List<BasketModel> records) {
        TreeMap<String, Integer> treeMapFruits = new TreeMap<>();
        for (int i = 0; i < records.size(); i++) {
            String name = records.get(i).getName();
            treeMapFruits.put(name, treeMapFruits.getOrDefault(name, 0) + records.get(i).getSize());
        }
        for (String name : treeMapFruits.keySet()) {
            String key = name.toString();
            String value = treeMapFruits.get(name).toString();
            System.out.println(key + " :" + value);
        }
        System.out.println("--------------------------------------------");
    }

    private static void typesOfFruits(List<BasketModel> records) {
        TreeSet<String> treeSet = new TreeSet<>();
        for (int i = 0; i < records.size(); i++) {
            treeSet.add(records.get(i).getName());
        }
        System.out.println("Types of fruit --- " + treeSet.size());
    }

    private static BasketModel getRecordFromLine(String line) {
        BasketModel basketModel = null;
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(",");
            while (rowScanner.hasNext()) {
                String name = rowScanner.next();
                int size = Integer.parseInt(rowScanner.next());
                String color = rowScanner.next();
                String shape = rowScanner.next();
                int days = Integer.parseInt(rowScanner.next());

                basketModel = new BasketModel(name, size, color, shape, days);
            }
        }
        return basketModel;

    }

    private static void colorOfEachFruits(List<Fruits.BasketModel> records) {
        TreeMap<String, String> TreeMapFruits = new TreeMap<>();
        for (int i = 0; i < records.size(); i++) {
            String name = records.get(i).getName();
            TreeMapFruits.put(name, TreeMapFruits.getOrDefault(name, " ") + records.get(i).getColor());

        }
        for (String color : TreeMapFruits.keySet()) {
            String key = color;
            String valueName = TreeMapFruits.get(color);
            System.out.println(key + " : " + valueName);

        }
        System.out.println("--------------------------------------------");
    }


    private static void shapeOfEachFruits(List<BasketModel> records) {

        TreeMap<String, String> treeMapFruits = new TreeMap<>();
        for (int i = 0; i < records.size(); i++) {
            String name = records.get(i).getName();
            treeMapFruits.put(name, treeMapFruits.getOrDefault(name, " ") + records.get(i).getShape());


        }
        for (String shape : treeMapFruits.keySet()) {
            String key = shape;
            String value = treeMapFruits.get(shape);
            System.out.println(key + " : " + value);
        }
        System.out.println("--------------------------------------------");
    }

    private static void overTreeDays(List<BasketModel> records) {
        TreeMap<String, Integer> treeMapFruits = new TreeMap<>();
        for (int i = 0; i < records.size(); i++) {
            String name = records.get(i).getName();
            treeMapFruits.put(name, treeMapFruits.getOrDefault(name, 0) + records.get(i).getDays());
        }
        for (String days : treeMapFruits.keySet()) {
            String key = days;
            Integer value = treeMapFruits.get(days);
            int i = 3;


            if (value>i) {
                System.out.println(key + " : " + value);
            }
    }

}
}




