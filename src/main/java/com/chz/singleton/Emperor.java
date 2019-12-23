package com.chz.singleton;

import com.sun.istack.internal.Nullable;

/**
 * 单例模式 皇帝类
 * **/
public class Emperor {
    private String name ;

    private String dynasty;

    private Emperor(String name,String dynasty){
        this.name = name;
        this.dynasty = dynasty;
    }

    private void setName(String name){
        this.name = name;
    }

    private void setDynasty(String dynasty){
        this.dynasty = dynasty;
    }

    private Emperor(){

    }
    // 皇帝发话
    public void action(){
        System.out.println("Emperor "+name+" in "+ dynasty +" 发话了"+"[" +this +"]");
    }

    private static Emperor getInstance(@Nullable String name, @Nullable String dynasty){
        return Singleton.getInstance(name,dynasty);
    }
    /*
    * 使用静态内部类完成单例模式的好处：
    * 若不调用getInstance() JVM是不会去加载Singleton类，一旦调用只会加载一次，
    * 因此保证单例的唯一性，同时也延迟了单例的实例化
    * 即使是new Emperor() 实际上由于Singleton只加载了一次，因此也只分配了一次
    *
    *
    * */
    private static class Singleton {
        private static Emperor emperor = new Emperor();// JVM只会加载一次
        private Singleton(){

        }

        public static Emperor getInstance(@Nullable String name, @Nullable String dynasty){
            emperor.setName(name);
            emperor.setDynasty(dynasty);
            return emperor;
        }
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            Emperor emperor = Emperor.getInstance("Tai", "Tang");
            emperor.action();
        }
    }
}
