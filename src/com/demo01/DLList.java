public class DLList {

    public static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    /**
     * previous addLast in SLList is not faster to add the node
     * so another variable last was added here
     */
    private IntNode sentinel;
    private IntNode last;
    private int size;

    /**
     * constructor without parameter
     */
    public DLList(){
        sentinel=new IntNode(64,null);
        last=new IntNode(-1, null);

        size=0;
    }

    /**
     * constructor with parameter
     */

    public DLList(int x){
        sentinel= new IntNode(64, null);
        sentinel.next= new IntNode(x, null);

        last= new IntNode(-1, null);
        last.next= new IntNode(x, null);

        size=1;
    }

    public void addFirst(int x){
        sentinel.next= new IntNode(x, sentinel.next);
        size+=1;

    }

    public int getFirst(){

    return sentinel.next.item;
}

    public void addLast(int x){

        last.next=new IntNode(x, null);
        last=last.next;

        size+=1;
    }

    public int getLast(){
       IntNode p=last;

        while(p.next!=null){

            p=p.next;
        }
        return p.item;
    }

//    public int getLast(){
//        return last.item;
//
//    }



    public static void main(String[] args) {

        DLList L = new DLList(15);

        L.addFirst(10);

        L.addFirst(5);

        L.addLast(20);

//        SLList s1=new SLList();
//        s1.addLast(5);
//        System.out.println(s1.getFirst());
//        System.out.println(s1.getLast());

        System.out.println(L.getFirst());
        System.out.println(L.getLast());

        //System.out.println(L.size);



    }


    }



