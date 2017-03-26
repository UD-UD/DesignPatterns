package TheSingletonPatteren;

import TheSingletonPatteren.singletons.Singleton_1;
import TheSingletonPatteren.singletons.Singleton_4;

/**
 * Created by ud on 23/3/17.
 */
public class AppMain {

    public static void main(String args[]){
        Singleton_1 singleton_1=Singleton_1.getInstance();
        Singleton_4 singleton_4= Singleton_4.INSTANCE;
        System.out.println(singleton_4.getMyName());
    }
}
