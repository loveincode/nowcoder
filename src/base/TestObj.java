package base;
/**
*
* @author loveincode
* @data 2018年2月26日 下午9:25:37
*/
public class TestObj {
	
	public static void main(String[] args){
        Object o=new Object(){
            public boolean equals(Object obj){
                return true;
            }
        };
        System.out.println(o.equals("Fred"));
    }

}
