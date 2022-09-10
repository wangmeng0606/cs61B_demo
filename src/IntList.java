import java.util.Iterator;

public class IntList {
    public int first;
    public IntList rest;


    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }


    public int size( ){
         if(rest==null){
             return 1;
         }

         return 1+this.rest.size();

    }

    public int iterativeSize(){
         IntList p=this;
         int size=0;
         while(p!=null){
             size=size+1;

             p=p.rest;

         }
        return size;

    }

    /**
     * use recursion
     * @param i
     * @return
     */
    public int get(int i ){
        if(i==0){
            return first;
        }

        return rest.get(i-1);


    }

    public static IntList incrList(IntList L, int x){

           if(L==null){
               return null;
           }

           return new IntList(L.first+x,incrList(L.rest, x));
    }

//    public static IntList dincrList(IntList L, int x){
//
//        if(L==null){
//            return null;
//        }
//        IntList Q= new IntList(L.first-x,dincrList(L.rest, x));
//        return Q;
//    }

    public static IntList dincrList(IntList L, int x){

        IntList Q= L;

        if(Q!=null){

            Q.first=Q.first-x;
            Q=Q.rest;

        }

        return L;
    }


    public static void main(String[] args){
           IntList L=new IntList(15, null);
           L=new IntList(10, L);
           L=new IntList(5, L);

           IntList Q=dincrList(L, 3);

          System.out.println(L.size());
          System.out.println(L.iterativeSize());

          System.out.println(Q.get(0));




}



}
