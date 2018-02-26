package base;
/**
*
* @author loveincode
* @data 2018年2月26日 下午10:02:28
*/
public class getCustomerInfo {
	try {
        // do something that may cause an Exception
    } catch (java.io.FileNotFoundException ex) {
        System.out.print("FileNotFoundException!");
    } catch (java.io.IOException ex) {
        System.out.print("IOException!");
    } catch (java.lang.Exception ex) {
        System.out.print("Exception!");
    }
}
