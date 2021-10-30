package trees.implemant.node;

public class KTree {
    public NodeK root;
    String allValues="";
    public String fizzBuzz(NodeK root){
        if (Integer.parseInt(root.value) % 3 == 0 && Integer.parseInt(root.value) % 5 == 0 ){
            root.value =  "FizzBuzz";
        }
        else if (Integer.parseInt(root.value) % 3 == 0 ){
            root.value =  "Fizz";
        }
        else if (Integer.parseInt(root.value) % 5 == 0 ){
            root.value = "Buzz";
        }
        allValues+= root.value + " ";
        if(root.children.isEmpty()){
            return null;
        }
        for(NodeK child : root.children){
            fizzBuzz((NodeK) child);
        }
        return allValues;
    }

    public NodeK getRoot() {
        return root;
    }

    public void setRoot(NodeK root) {
        this.root = root;
    }
}
