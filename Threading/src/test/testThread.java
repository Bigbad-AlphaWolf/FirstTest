package test;

	
	public class testThread extends Thread{
		
		public testThread(String name){
			super(name);
		}
		
		public void run(){
			for(int i=0;i<13;i++){
				System.out.println(this.getName());
			}
		}
	}


