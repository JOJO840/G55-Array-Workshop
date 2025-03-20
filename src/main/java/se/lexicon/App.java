package se.lexicon;


import java.util.Arrays;

public class App {
    public static void main(String[] args) {


        NameRepository.setNames(new String[]{"Erik Svensson", "Mehrdad Javan", "Josip Jovanovic", "Fredrik Svensson"});


        System.out.println("get size() = " + NameRepository.getSize()); //GET SIZE
        //NameRepository.clear(); // clear the array
        String[] names = NameRepository.findAll();
        System.out.println(Arrays.toString(names));

        String returnName = NameRepository.find("Josip Jovanovic");
        String returnNull = NameRepository.find("Josip");
        System.out.println("returnName = " + returnName); // return Josip Jovanovic in find method
        System.out.println("returnNull = " + returnNull); // return null in find method

        boolean newName = NameRepository.add("Nicola Tesla");
        System.out.println("newName = " + newName); // return false if name already exists,
        names = NameRepository.findAll(); //need to update the method to see the changes
        System.out.println(Arrays.toString(names));

        // call more methods as needed
    }
}
