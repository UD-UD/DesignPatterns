package TheSingletonPatteren.singletons;

/**
 * Created by ud on 23/3/17.
 */
/**
 * Best Approach: Use Enums
 * Concise, serialized,put a check on multiple instantiation
 */

public enum Singleton_4{
    INSTANCE;
    private String myName="Ujjal";

    public String getMyName(){
        return myName;
    }

}
