import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;



public class ProducterConsumer {
	
	class  Consumer   implements Runnable
	{
		
		private  String   name;
		private   Storage  storage;
		public Consumer(String   name,Storage storage) {
			
			this.name=name;
			this.storage=storage;
			
			
		}
		
		@Override
		public void run() {
	
	    while (true) {
		
	    	
	    	
	    	
			
		}
			
			
			 
			

			
			
			
		}
			
	}  
	
	
	class  Producter   implements Runnable
	{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}		
	}
	
	public  class  Storage
	{
	
		  BlockingQueue<Product> queues = new LinkedBlockingQueue<Product>(10);

	        /**
	         * 生产
	         * 
	         * @param p
	         *            产品
	         * @throws InterruptedException
	         */
	        public void push(Product p) throws InterruptedException {
	            queues.put(p);
	        }

	        /**
	         * 消费
	         * 
	         * @return 产品
	         * @throws InterruptedException
	         */
	        public Product pop() throws InterruptedException {
	            return queues.take();
	        }			
	}
	
	public  class   Product
	{
		
	private   int  id;
	
	
	public   Product(int  id)
	{
		
		
		this.id=id;
		
		
	}
		
	public String  toString()
	{
	
		return   "产品id"+id;
		
		
	}	
	
	
		
		
	}
	
	
	

	
	
public  static  void   main(String[]  args)
{
		
		
		
		
}
	
	
}


 