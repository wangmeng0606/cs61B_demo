public class SLList<Main> {

    /**
     * if the nested class has no need to use any of the instance methods or variables of SLList
     * you may declare the nested class static,as follows. Declare a nested class as static means
     * that methods inside the static class cannot access any of the members of the enclosing class.
     * in this case, no method in IntNOde would be able to access first, addFirst or getFirst
     */
    public static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }



    private IntNode sentinel;
    public int size;

    public SLList(){
        sentinel=new IntNode(64,null);
        size=0;
    }

    public SLList(int x){
        sentinel= new IntNode(64, null);
        sentinel.next= new IntNode(x, null);
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


        /**
         * This can be satisfied with the special case. but in the code it should be avoided
         *
         */
//        if(first==null){
//            first=new IntNode(x, null);
//            return;
//
//        }

        /**
         * add a sentinel node
         */
        IntNode p=sentinel;

        while(p.next!=null){
            p=p.next;
        }

        p.next=new IntNode(x, null);
        size+=1;

    }

    public int getLast(){
        IntNode p=sentinel;

        while(p.next!=null){

            p=p.next;
        }
        return p.item;
    }

    public void deleteFirst(){
        IntNode p=sentinel;
        if(p.next!=null){

            p.next=p.next.next;

        }

    }


    /**
     * help function to count the size of the list
     * returns the size of the list starting at IntNode p
     */
//    private static int size(IntNode p){
//
//        if(p.next==null){
//            return 1;
//        }
//        return 1+size(p.next);
//    }
//
    public int size(){

        return size;

    }


    public static void main(String[] args){
        SLList L=new SLList(15);

        L.addFirst(10);

        L.addFirst(5);

       // L.addLast(20);

//        SLList s1=new SLList();
//        s1.addLast(5);
//        System.out.println(s1.getFirst());
//        System.out.println(s1.getLast());

        System.out.println(L.getFirst());
        //System.out.println(L.getLast());

        System.out.println(L.size);

        L.deleteFirst();

        System.out.println(L.getFirst());
        //System.out.println(s1.size());

        System.out.println(L.size);




    }



}
