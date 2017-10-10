package TugasLinkedList;


public class Driver {
    public static void main(String[] args) {
        ChainDouble c = new ChainDouble();
        c.add(0, 1);
        c.add(1, 2);
        c.add(2, 3);
        c.add(3, 4);
        c.add(4, 5);
        c.remove(3);
        
        System.out.println(c.toString());
        
        ChainCircular cc = new ChainCircular();
        
        cc.add(0, 1);
        cc.add(1, 2);
        cc.add(2, 3);
        cc.add(3, 4);
        cc.add(4, 5);
        cc.remove(2);
        
        System.out.println(c.toString());
    }
}
