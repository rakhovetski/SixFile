package org.example;

import java.util.*;

public class CollectionsDemo {
    public static int countStringList(List<String> list, char a) {
        int count = 0;
        for (String s : list) {
            if (s != null && !s.equals("") && s.toCharArray()[0] == a) {
                count++;
            }
        }
        return count;
    }

    public static List<Human> listNamesakes(List<Human> listHumans, Human human) {
        List<Human> namesakes = new ArrayList<>();
        for (int i = 0; i < listHumans.size(); i++) {
            if (listHumans.get(i).getSurname().equals(human.getSurname())) {
                namesakes.add(listHumans.get(i));
            }
        }
        return namesakes;
    }

    public static List<Human> copyArrayList(List<Human> humans, Human human) {
        List<Human> result = new ArrayList<>();
        Human humus;
        for(int i = 0; i < humans.size(); i++){
            if(!humans.get(i).equals(human)){
                humus = new Human(humans.get(i));
                result.add(humus);
            }
        }
        return result;
    }

    public static List<Set<Integer>> listHashSets(List<Set<Integer>> hashSets, Set<Integer> set) {
        List<Set<Integer>> result = new ArrayList<>(hashSets.size());
        for(Set<Integer> item: hashSets){
            boolean flag = false;
            for(Integer data: item){
                if(set.contains(data)){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                result.add(item);
            }
        }
        return result;
    }

    public static Set<Human> maxAgeList(List<Human> humans) {
        int maxAge = 0;
        Set<Human> result = new HashSet<>();
        for (Human human : humans) {
            if (human.getAge() > maxAge) {
                maxAge = human.getAge();
            }
        }
        for (Human human : humans) {
            if (human.getAge() == maxAge) {
                result.add(human);
            }
        }
        return result;
    }

    public static Set<Human> setIdContained(Map<Integer, Human> maps, Set<Integer> ids) {
        HashSet<Human> result = new HashSet<>();
        for (Map.Entry<Integer, Human> entry : maps.entrySet()) {
            Integer key = entry.getKey();
            Human human = entry.getValue();

            if (ids.contains(key)) {
                result.add(human);
            }
        }
        return result;
    }

    public static List<Integer> ageAtLeastEighteen(Map<Integer, Human> maps) {
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Human> entry : maps.entrySet()) {
            Integer key = entry.getKey();
            Human human = entry.getValue();
            if (human.getAge() >= 18) {
                result.add(key);
            }
        }
        return result;
    }

    public static Map<Integer, Integer> idAndAge(Map<Integer, Human> maps) {
        Map<Integer, Integer> result = new HashMap<>();
        for (Map.Entry<Integer, Human> entry : maps.entrySet()) {
            Integer key = entry.getKey();
            Human human = entry.getValue();
            result.put(key, human.getAge());
        }
        return result;
    }

    public static Map<Integer, List<Human>> compareAgeAndPerson(Set<Human> humans) {
        Map<Integer, List<Human>> result = new HashMap<>();

        for (Human human : humans) {
            List<Human> ages = new ArrayList<>();
            for(Human per : humans){
                if(human.getAge() == per.getAge()){
                    ages.add(per);
                }
            }
            result.put(human.getAge(), ages);
        }
        return result;
    }
}
