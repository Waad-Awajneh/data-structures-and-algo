/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package HashTable;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

//        HashTable<Object, Object> hashtable = new HashTable<>();
//        hashtable.add("Naim", 1000);
//        hashtable.add("Qusai", 1500);
//        hashtable.add("Deyaa", 10000);
//        hashtable.add("John", 300);
//        hashtable.add("ammar", 400);
//        hashtable.add("Toms", 200);
//        hashtable.add("Jade", 100);
//        hashtable.add("Doa", 6000);
//        hashtable.add("Farah", 800);
//        hashtable.add("Jason", 90000);
//        hashtable.add("adham", 700);
//
//
//        System.out.println("The Integer is => " + hashtable.get("ammar"));
//        System.out.println("The index is => " + hashtable.hash("Toms"));
//        System.out.println("Is contain ? => " + hashtable.contains("ali"));
//        System.out.println("Is contain ? => " + hashtable.contains("Jason"));
        System.out.println(HashTable.repeatedWord("Once upon a time, there was a brave princess who..."));

    }
}
