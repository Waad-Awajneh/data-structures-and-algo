/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Stake;



public class App {

    public String getGreeting() {
        return "Hello World!";
    }


    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
//        stackDemo();
//        queueDemo();
//        pesudoqueueDemo();


        AnimalSelter animalShelter = new AnimalSelter();
        animalShelter.enqueue("Cat");
        animalShelter.enqueue("dog");
        animalShelter.enqueue("Cat");
        animalShelter.enqueue("Dog");
        System.out.println(animalShelter.dequeue("cat"));
        System.out.println(animalShelter.dequeue("cat"));
        System.out.println(animalShelter.dequeue("Dog"));

        System.out.println(animalShelter.peek());
        System.out.println(animalShelter.peek());


    }

    public static boolean validatebrackets(String s) {
        Stack<String> stack = new Stack<String>();
        if (stack.isEmpty()) return true;

    }

}

//    private static void stackDemo() {
//        Stack stack = new Stack();
//
//        stack.push("A");
//        stack.push("D");
//        stack.push("H");
//        stack.push("A");
//        stack.push("M");
//
//        System.out.println("The top of the stack is => " + stack.peek());
//
//        System.out.println(stack.pop());
//
//        System.out.println("The top of the stack is => " + stack.peek());
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//    }

//    private static void queueDemo() {
//        Queue queue = new Queue();
//
//        queue.enqueue("A");
//        queue.enqueue("D");
//        queue.enqueue("H");
//        queue.enqueue("A");
//        queue.enqueue("M");
//
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println("The front of the Queue is => " + queue.peek());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//
//
//    }
//    private static void pesudoqueueDemo(){
//        Pseudo b=new Pseudo();
//        b.enqueue("A");
//        b.enqueue("L");
//        b.enqueue("I");
//
//        b.enqueue("L");
//        System.out.println(b.dequeue().toString());
//        System.out.println(b.toString());





