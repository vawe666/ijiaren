package top.ijiaren.protocol;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

interface Speaker {
    void speak();
}

public class DynamicProxy {
    /**
     * 动态代理
     * 好处,能做扩充,加持
     * 它们都使用同一接口
     */


}

class Zhangsan implements Speaker {
    public void speak() {
        System.out.println("我老婆打人");
    }
}


class ZhangsanLawfer implements Speaker {
    private Zhangsan zhangsan = new Zhangsan();


    public void speak() {
        zhangsan.speak();
        System.out.println("引用法律条文");
        System.out.println("打人是不对的");
    }
}


/**
 * ===============================================
 */
class LawferProxy implements InvocationHandler {

    private Object object = new Object();

    public LawferProxy(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("speak".equals(method.getName())) {
            method.invoke(object, args);
            System.out.println("引用法律条文");
            System.out.println("打人是不对的");
        }
        return null;
    }
}


/**
 * ===============================================
 */

class Lisi {
    public void speak() {
        System.out.println("我老婆打我");
    }
}

class LawferInteceptor implements MethodInterceptor{
    Object object=new Object();
    public LawferInteceptor(Object object){
        this.object=object;
    }
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        if("speak".equals(method.getName())){
            method.invoke(object, args);
            System.out.println("引用法律条文");
            System.out.println("打人是不对的");
        }
        return null;
    }
}

class Plaintiff {
    /**
     * 起诉  静态代理
     */
    public void prosecute() {
        Zhangsan lawfer = new Zhangsan();
        lawfer.speak();
    }

    /**
     * jdk 动态代理
     */
    public void prosecute_proxy() {
        LawferProxy lawferProxy = new LawferProxy(new Zhangsan());
        Speaker lawfer = (Speaker) Proxy.newProxyInstance(Plaintiff.class.getClassLoader(),
                new Class[]{Speaker.class},
                lawferProxy);
        lawfer.speak();
    }

    /**
     * CGLib 代理
     */
    public void prosecute_proxy_CGLib() {
        LawferInteceptor lawferProxy = new LawferInteceptor(new Lisi());
        Lisi lawfer = (Lisi) Enhancer.create(Lisi.class, lawferProxy);
        lawfer.speak();
    }

}