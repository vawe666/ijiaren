package top.ijiaren.protocol;

public class InterView {
    public void $o1(){
        /**
         * jdk 与jre的区别
         *
         */

    }
    public void $02(){
        /**
         * ==与equals的区别
         */
    }

    public void $03(){
        /**
         * final的作用
         * 可以 作用于 class 不能被继承
         *
         * 可以 作用于 属性/变量  不能被修改
         *      如果是引用类型的 表示地址不能改变 地址指向的内存内容可以改变
         * 可以 作用于 方法上 标识不能被重新
         */
    }

    public void $04(){
        /**
         * 操作字符串的方法都有哪些,有什么不同
         * String 不可变
         * StringBuilder 可变 没加锁但是性能好
         * StringBuffer 可变 线程安全
         */
    }

    public void $05(){
        /**
         * hashMap与hashTable的联系区别
         * <key,value>
         * hashTable 加锁  不可以放null
         * hashMap 不加锁  可以放 <null,null>
         */
    }

    public void $06(){
        /**
         *简单聊聊 hashMap
         * 存储结构 Entry的数组
         * 存取逻辑 根据计算 hash值
         * 扩容方案 成倍增长
         */
    }


    public void $07(){
        /**
         * Vector 与ArrayList 区别
         * Vector 线程安全  扩容是成倍增长  所以它被用的比较少
         * ArrayList 不加锁  效率快 增长是1.5倍
         *
         */
    }

    public void $08(){
        /**
         * 枚举
         * 更强的类型约束
         * 常用方法
         * name()
         * ordinal()
         * valueOf()
         * 怎么扩展
         * 自定义属性
         * 自定义方法
         * 自定义构造函数
         * 它的集合类
         * EnumSet
         * EnumMap
         */
    }
}
