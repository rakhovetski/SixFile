package org.example;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.*;

public class ProgTests {
    @Test
    public void checkchar()
    {
        char b = 'a';
        List<String> str1 = new ArrayList<>(List.of("a", "abc", "sda", ""));
        str1.add(null);
        assertEquals(CollectionsDemo.countStringList(str1, b), 2);
    }

    @Test
    public void checkListDemo() {
        List<Human> humans = new ArrayList<>();
        List<Human> res = new ArrayList<>();
        Human human1 = new Human("Раховецкий", "Андрей", "Олегович", 19);
        Human human2 = new Human("Раховецкий", "Олег", "Станиславович", 45);
        Human human3 = new Human("Никитин", "Петр", "Сергеевич", 20);
        humans.add(human1);
        humans.add(human2);
        res = CollectionsDemo.listNamesakes(humans, human3);
        assertTrue(res.isEmpty());
    }

    @Test
    public void checkHuman() {
        ArrayList<Human> humans = new ArrayList<>();
        Human human1 = new Human("Раховецкий", "Андрей", "Олегович", 19);
        Human human2 = new Human("Раховецкий", "Олег", "Станиславович", 45);
        Human human3 = new Human("Никитин", "Петр", "Сергеевич", 20);
        humans.add(human1);
        humans.add(human2);
        humans.add(human3);
        assertEquals(humans.size(), 3);
    }

    @Test
    public void listHashSetsTest(){
        Set<Integer> set1 = new HashSet<>();
        for(int i = 0; i < 5; i++){
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for(int i = 2; i < 7; i++){
            set2.add(i);
        }
        Set<Integer> set3 = new HashSet<>();
        for(int i = 0; i < 3; i++){
            set3.add(i);
        }
        List<Set<Integer>> setList = new ArrayList<>();
        setList.add(set1);
        setList.add(set2);
        setList.add(set3);
        Set<Integer> set4 = new HashSet<>();
        for(int i = 3; i < 8; i++){
            set4.add(i);
        }
        assertEquals(CollectionsDemo.listHashSets(setList, set4).toString(),"[[0, 1, 2]]");
    }

    @Test
    public void checkHumanHere() {
        ArrayList<Human> humans = new ArrayList<>();
        Human human1 = new Human("Раховецкий", "Андрей", "Олегович", 19);
        Human human2 = new Human("Раховецкий", "Олег", "Станиславович", 45);
        Human human3 = new Human("Никитин", "Петр", "Сергеевич", 20);
        humans.add(human1);
        humans.add(human2);
        humans.add(human3);


        List<Human> res = CollectionsDemo.copyArrayList(humans, human1);
        assertEquals(res.size(), 2);
        assertEquals(res.get(0).getName(), "Олег");

        humans.get(1).setName("Марьяна");
        assertEquals(res.get(0).getName(), "Олег");
    }


    @Test
    public void checkmaxage() {
        List<Human> humans = new ArrayList<>();
        Set<Human> humans2 = new HashSet<>();
        Student human1 = new Student("Раховецкий", "Андрей", "Олегович", 19, "omgu");
        Student human2 = new Student("Раховецкий", "Олег", "Станиславович", 45, "omgu");
        Student human3 = new Student("Никитин", "Петр", "Сергеевич", 20, "omgu");
        humans.add(human1);
        humans.add(human2);
        humans.add(human3);
        humans2 = CollectionsDemo.maxAgeList(humans);
        assertEquals(humans2.toString(), "[Human{surname='Раховецкий', name='Олег', patronymic='Станиславович', age=45}]");
    }

    @Test
    public void hashsettest() {
        Set<Human> hum = new HashSet<>();

        int a = 19, b = 20, c = 18;

        Human human1 = new Human("Раховецкий", "Андрей", "Олегович", 19);
        Human human2 = new Human("Раховецкий", "Олег", "Станиславович", 45);
        Human human3 = new Human("Никитин", "Петр", "Сергеевич", 20);

        HashMap<Integer, Human> humanHashMap = new HashMap<>();
        humanHashMap.put(22, human1);
        humanHashMap.put(20, human2);
        humanHashMap.put(21, human3);

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(a);
        hashSet.add(b);
        hashSet.add(c);

        hum = CollectionsDemo.setIdContained(humanHashMap, hashSet);

        assertEquals(hum.size(), 1);
    }

    @Test
    public void hashsetagetest() {
        List<Integer> hum = new ArrayList<>();
        HashMap<Integer, Human> humanHashMap = new HashMap<>();

        Human human1 = new Human("Раховецкий", "Андрей", "Олегович", 19);
        Human human2 = new Human("Раховецкий", "Олег", "Станиславович", 45);
        Human human3 = new Human("Никитин", "Петр", "Сергеевич", 20);

        humanHashMap.put(22, human1);
        humanHashMap.put(20, human2);
        humanHashMap.put(21, human3);

        hum = CollectionsDemo.ageAtLeastEighteen(humanHashMap);
        assertEquals(hum.size(), 3);
    }

    @Test
    public void hashagetaken() {
        List<Integer> hum = new ArrayList<>();
        Map<Integer, Human> humanHashMap = new HashMap<>();
        Map<Integer, Integer> humanHashMap1 = new HashMap<>();

        Human human1 = new Human("Раховецкий", "Андрей", "Олегович", 19);
        Human human2 = new Human("Раховецкий", "Олег", "Станиславович", 45);
        Human human3 = new Human("Никитин", "Петр", "Сергеевич", 20);

        humanHashMap.put(20, human1);
        humanHashMap.put(22, human2);
        humanHashMap.put(21, human3);

        humanHashMap1 = CollectionsDemo.idAndAge(humanHashMap);


        assertEquals(humanHashMap1.toString(), "{20=19, 21=20, 22=45}");
    }

    @Test
    public void hashagetaken1() {
        List<Integer> hum = new ArrayList<>();
        Map<Integer, List<Human>> humanHashMap1 = new HashMap<>();
        Set<Human> people = new HashSet<>();

        Human human1 = new Human("а", "б", "в", 20);
        Human human2 = new Human("г", "д", "е", 17);
        Human human4 = new Human("ж", "з", "и", 17);
        Human human3 = new Human("к", "л", "м", 20);

        people.add(human1);
        people.add(human2);
        people.add(human3);
        people.add(human4);

        humanHashMap1 = CollectionsDemo.compareAgeAndPerson(people);


        assertEquals(humanHashMap1.size(), 2);
        assertEquals(humanHashMap1.get(17).size(), 2);
    }


}
