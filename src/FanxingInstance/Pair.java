package FanxingInstance;
/*
 *
 *     @author Qmh
 *
 *   Yuan Li Bug Zhen Ai Sheng Ming
 */

public class Pair<T> {
    private  T first;
    private  T seconde;

    public Pair(T first, T seconde){
        this.first=first;
        this.seconde=seconde;
    }
    public  Pair(){
        /*
        first = new T();
        seconde = new T();
        错误的 不能直接生成实例
        */
        /*
        *   first = T.class.newInstance();
        *   反射也不可以，不过需要运用一些方法生成泛型实例
        *
        */

    }

    /*这可以生成泛型实例*/
    public static <T>Pair<T> makePair(Class<T> tClass) {
        try {
            return new Pair<>(tClass.newInstance(), tClass.newInstance());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
