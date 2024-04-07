package com.myblog.git;

import org.aspectj.weaver.ast.Or;

public class gitStudy {
    private int id;
    private int age;
    //生成当前这个类的getter和setter方法

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //比较两个数的大小
    public static int compare(int a,int b){
        if(a>b){
            return 1;
        }else if(a<b){
            return -1;
        }else{
            return 0;
        }
    }
    //判断一个字符串是否是回文串
    public static boolean isPalindrome(String str){
        int len = str.length();
        for(int i=0;i<len/2;i++){
            if(str.charAt(i)!=str.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }
}
