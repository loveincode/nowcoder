package 剑指Offer.type15_分解让复杂问题简单;

import java.util.ArrayList;
import java.util.Collections;

public class Q03_字符串的排列 {

	/*
	 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
	 * 
	 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
	 * 
	 * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
	 */

	public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        if(str.length()==0)
            return list;
        char[] array = str.toCharArray();
        permutation(array,0,list);
        Collections.sort(list);
        return list;
    }
    public void permutation(char[] array,int begin,ArrayList<String> list) {
        if(begin == array.length-1) {
            list.add(String.valueOf(array));
        }else {
            for(int i=begin;i<array.length;++i) {
                if(i==begin || array[i]!=array[begin]) {
                    swap(array,begin,i);
                    permutation(array,begin+1,list);
                    swap(array,begin,i);
                }
            }
        }
    }
    public void swap(char[] array,int i,int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
