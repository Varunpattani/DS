public class Lab9_50 {
    public static void main(String[] args) {
        Que q = new Que();
        q.enq(1);
        q.enq(2);
        q.enq(3);
        q.enq(4);
        q.deq();
        q.deq();
        q.display();
    }
}
class Que{
    int[] q = new int[10];
    int r = -1, f = -1, n = 10;
    int size = 0;
    
    public void enq(int num){
        if(r>=n) System.out.println("QUEUE OVERFLOW");
        r++;
        int y = num;
        q[r] = y;
        if (f == -1) f++;
        size++;
    }
    
    public void deq(){
        if(f == -1) System.out.println("QUEUE UNDERFLOW");
        q[f] = 0;
        if (f == r) f=r=-1;
        else f++;
    }
    public void display(){
        System.out.print("QUEUE= ");
        
        for(int i=f;i<size;i++){
            try {
                System.out.print(q[i]+" => ");
            } catch (Exception e) {
                System.out.println("UNDERFLOW");
                break;
            }
        }
    }
}
