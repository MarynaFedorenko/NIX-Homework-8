package nix;

import nix.util.*;
import nix.util.abstr.Sorting;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.*;

import static java.util.stream.Collectors.toMap;

public class Main {
    final static Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        String log4jConfigPath = "src/main/resources/log4j.properties";
        PropertyConfigurator.configure(log4jConfigPath);



        int[] ints = new int[100000];
        int index = 0;
        for (int i = 0 ; i < ints.length ; i++) {
            index = (int) Math.floor(Math.random() * 100000);
            ints[i] = index;
        }

//        for (int anInt : ints) {
//            System.out.println("anInt = " + anInt);
//        }

        long [] time = new long[7];
            for(int i=0; i<7; i++)
            time[i]=0;

       List<Sorting> listOfAlgorithms = new ArrayList<Sorting>();
        listOfAlgorithms.add(new BubbleSort());
        listOfAlgorithms.add(new InsertionSort());
        listOfAlgorithms.add(new MergeSort());
        listOfAlgorithms.add(new QuickSort());
        listOfAlgorithms.add(new SelectionSort());
        listOfAlgorithms.add(new ShellSort());
        listOfAlgorithms.add(new ShuttleSort());


        long startTime=0; long endTime=0;
        Map<String, Long> map = new HashMap<>();
        List<Integer> temp = new ArrayList<Integer>(ints.length);
        for(int i : ints) temp.add(i);
        for(int i=0;i <listOfAlgorithms.size(); i++){
            startTime = System.nanoTime();
            listOfAlgorithms.get(i).sort(ints);
            map.put(String.valueOf(listOfAlgorithms.get(i).getClass()), (System.nanoTime()-startTime));
            LOGGER.info("Algorithm: "+listOfAlgorithms.get(i).getClass()+"  time: "+(System.nanoTime()-startTime));
        }
        startTime = System.nanoTime();
        Collections.sort(temp);
        map.put("java.Collections", (System.nanoTime()-startTime));
        LOGGER.info("Algorithm: "+"java.Collections"+"  time: "+(System.nanoTime()-startTime));

        map = map
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(
                        toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));

        System.out.println("Algorithms in descending speed order:" + map);


    }
}
