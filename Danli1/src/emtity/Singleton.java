package emtity;

 class Singleton {
//	private  Singleton (){}
//	private static Singleton single = null;
//	public static Singleton getsingle(){
//		if(single == null){
//			single = new Singleton();
//		}
//		return single;
//	}
	
	
//	private Singleton(){}
//	public static Singleton single=new Singleton();
//	public static Singleton getsingle(){
//		return single;
//	}
	
	private static Singleton single1 = null;
	private Singleton(){};
	public static Singleton getsingle(){
		if(single1 == null){
			single1 = new Singleton();			
		}
		return single1;
	}
	
	
}
