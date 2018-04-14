package designPatterns;

import com.sun.xml.internal.bind.v2.ClassFactory;

/**
 * Created by oliverwang on 2018/4/14.
 */

//双检查锁机制
public class Singleton {
    private static volatile Singleton instance = null;//第一个锁
    private Singleton(){}
    public static Singleton getInstance(){
        try {
            if (instance != null){

            }else {
                synchronized (Singleton.class){//第二个锁
                    instance = new Singleton();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return instance;
    }


}


//测试
class myThread extends Thread{
    @Override
    public void run(){
        System.out.println(Singleton.getInstance().hashCode());
    }

    public static void main(String[] args){
        myThread[] mts = new myThread[10];
        for(int i = 0 ; i < mts.length ; i++){
            mts[i] = new myThread();
        }

        for (int j = 0; j < mts.length; j++) {
            mts[j].start();
        }

    }

}
