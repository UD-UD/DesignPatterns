package TheSingletonPatteren.singletons;

/**
 * Created by ud on 23/3/17.
 */
public class Singleton_1 {

    private Singleton_1(){}
    /**
     * Method 1 : Make constructor Private and have global variable
     * Note : not thread safe.
     */

    private static Singleton_1 singleton_1=null;
    public static Singleton_1 getInstance(){
        if(singleton_1 == null){
            singleton_1=new Singleton_1();
        }
        return  singleton_1;
    }
}

class Singleton_2{
    private Singleton_2(){}
    /**
     * initialize global static final instance
     * Thread Safe
     * Eager Loading..Singletons always created even if not need
     */

    private static final Singleton_2 singleton_2= new Singleton_2();

    public static  Singleton_2 getInstance(){
        return singleton_2;
    }
}

class Singleton_3{
    private Singleton_3(){}

    /**
     * initialize global static final instance
     * Thread Safe using synchronized
     * Lazy Loading..
     * Performance degradation.Time consuming to create objects
     * */
    private static Singleton_3 singleton_3=null;

    public static synchronized Singleton_3  getInstance(){
        if(singleton_3 == null){
            singleton_3=new Singleton_3();
        }
        return  singleton_3;
    }
}
