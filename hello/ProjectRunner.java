public class ProjectRunner{
	public static void main(String[] args){
		MyPQ heap = new MyPQ();
		//ThreeHeap heap = new ThreeHeap();
		//BinaryHeap heap = new BinaryHeap();
		for(int i = 0;i<1000;i++){
			heap.insert((int)(Math.random()*10000));
		}
		System.out.println("MyPQ Size: "+heap.size());
		System.out.println("MyPQ is empty: "+heap.isEmpty());
		while(!heap.isEmpty())
			System.out.println(heap.deleteMin()+" removed");
		System.out.println("MyPQ is empty: "+heap.isEmpty());
	}
}