package org.tuni.belovMCollectionsHW;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        List<User> list1 = new ArrayList<>();
        list1.add(new User(20, "Vasya"));
        list1.add(new User(18, "Vanya"));
        list1.add(new User(19, "Petya"));

        List<User> list2 = new ArrayList<>();
        list2.add(new User(20, "Vasya"));
        list2.add(new User(22, "Igor"));
        list2.add(new User(45, "Helen"));
        list2.add(new User(18, "Vanya"));
        list2.add(new User(28, "Misha"));

        List<User> list3 = new ArrayList<>(joinLists(list1, list2));

        System.out.println(list3);

        //Задание 2

        Set<User> set1 = new HashSet<>();
        set1.add(new User(20, "Vasya"));
        set1.add(new User(18, "Vanya"));
        set1.add(new User(19, "Petya"));

        Set<User> set2 = new HashSet<>();
        set2.add(new User(20, "Vasya"));
        set2.add(new User(22, "Igor"));
        set2.add(new User(45, "Helen"));
        set2.add(new User(18, "Vanya"));
        set2.add(new User(28, "Misha"));

        Set<User> set3 = new HashSet<>();
        set3 = joinSets(set1, set2);
        System.out.println(set3);

        //Задание 3
        System.out.println("------------------------");

        List<User> newArrayList = new ArrayList<>();
        newArrayList.add(new User(25, "Ivan"));
        newArrayList.add(new User(44, "John"));
        newArrayList.add(new User(23, "Mike"));
        newArrayList.add(new User(55, "Petr"));
        newArrayList.add(new User(25, "Ivan"));
        newArrayList.add(new User(35, "Ivan"));

        for (int i = 0; i < newArrayList.size(); i++) {
            System.out.println(i + ": " + newArrayList.get(i));
        }

        //Задание 4
        System.out.println("------------------------");

        Set<User> newHashSet = new HashSet<>();
        newHashSet.add(new User(25, "Ivan"));
        newHashSet.add(new User(44, "John"));
        newHashSet.add(new User(23, "Mike"));
        newHashSet.add(new User(55, "Petr"));
        newHashSet.add(new User(25, "Ivan"));


        for (User user : newHashSet) {
            System.out.println(user);
        }

        //Задание 5a
        System.out.println("----------------------------");

        Map<Integer, String> newMap = new HashMap<>();
        newMap.put(25, "Ivan");
        newMap.put(44, "John");
        newMap.put(23, "Mike");
        newMap.put(55, "Petr");
        newMap.put(25, "Vova");
        newMap.put(42, "Petr");

        //System.out.println(newMap.keySet());

        for (Map.Entry<Integer, String> pair : newMap.entrySet()) {
            String value = pair.getValue();
            System.out.println(value);
        }

        System.out.println("----------------------------");

        for (Map.Entry<Integer, String> pair : newMap.entrySet()) {
            Integer key = pair.getKey();
            System.out.println(key);
        }

        System.out.println("----------------------------");

        for (Map.Entry<Integer, String> pair : newMap.entrySet()) {
            Integer key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + ": " + value);
        }

        //System.out.println(newMap.keySet() + ": " + newMap.values());


    }

    public static List<User> joinLists(List<User> a, List<User> b) {

        List<User> resultList = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                if (a.get(i).equals(b.get(j))) {
                    resultList.add(b.get(j));
                }
            }
        }
        return resultList;
    }

    public static Set<User> joinSets(Set<User> a, Set<User> b) {
        if (a.size() >= b.size()) {
            a.retainAll(b);
            return a;
        } else {
            b.retainAll(a);
            return b;
        }
    }

}