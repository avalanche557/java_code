import java.util.Random;

public class QueueArray {
	int size;
	int[] ar;
	int front;
	int rare;
	public QueueArray(int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		ar = new int[size];
		front = 0;
		rare = -1;
	}
	public void enqueue(int data) {
		ar[++rare] = data;
		System.out.println(ar[rare]);
	}
	
	public int dequeue() {
		return ar[front++];
	}
	public static void main(String args[]) {
		QueueArray qu = new QueueArray(10);
		for(int i =0; i< 10;i++){
			qu.enqueue(new Random().nextInt(10));
		}


		for(int j =0; j < 10;j++){
			System.out.println("the dequeued value is "+ qu.dequeue());
		}
	}
}
