import java.util.concurrent.*;

class Producer implements Runnable {

	BlockingQueue bQueue = null;

	Producer(BlockingQueue bQueue) {
	
		this.bQueue = bQueue;
	}

	public void run() {
	
		for(int i = 1; i <= 10 ; i++) {
		
			try{
				bQueue.put(i);
				System.out.println("Producer : "+i);
			}catch(InterruptedException ie){
			
			}

			try { 
				Thread.sleep(1000);
			}catch(InterruptedException ie) {
			
			}
		}
	}
}

class Consumer implements Runnable {

	BlockingQueue bQueue = null;

	Consumer(BlockingQueue bQueue) {
	
		this.bQueue = bQueue;
	}

	public void run() {
	
		for(int i = 1; i <= 10; i++) {
		
			try{
				bQueue.take();
				System.out.println("Consumer : "+i);
			}catch(InterruptedException ie){
			
			}

			try{
				Thread.sleep(3000);
			}catch(InterruptedException ie){
			
			}
		}
	}
}

class ProConBQDemo {

	public static void main(String[] args) {
		BlockingQueue bq = new ArrayBlockingQueue(10);

		Producer pro = new Producer(bq);
		Consumer con = new Consumer(bq);

		Thread ProThread = new Thread(pro);
		Thread ConThread = new Thread(con);
	
		ProThread.start();
		ConThread.start();
	}
}
