package org.arpit.java2blog.controller; 

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
/**  
 * @Title ListCheck.java  
 * @description TODO  
 * @time 2017年2月27日 下午4:38:44  
 * @author wyz  
 * @version 1.0  
 **/
public class ListCheck {
	
	public static void main(String[] args) 
    {

        List<Map<String,Object>> newList = new ArrayList<Map<String,Object>>();


        Map<String,Object> integerMap = new HashMap<String,Object>();

        integerMap.put("one",new Integer(1));
        integerMap.put("two",new Integer(2));
        integerMap.put("two",new Integer(3));

        Map<String,Object> map1 = new HashMap<String,Object>();

        Map<String,Object> doubleMap = new HashMap<String,Object>();

        doubleMap.put("one",new Double(1.0));
        doubleMap.put("two",new Double(2.0));
        doubleMap.put("two",new Double(3.0));


        newList.add(integerMap);
        newList.add(doubleMap);
        System.out.println("\nnewList.add(integerMap): " + newList);
        
        //target list to which will have all the values of the map
        List<String> targetList = new ArrayList<String>(); 

        /*Code to iterate Map and add the value to the list */

        for (Map<String,Object> currentMap : newList) {
               //check for currentMap null check
                 for (Map.Entry<String,Object> curEntry:currentMap.entrySet()){ 
                    String s = (String) curEntry.getValue().toString();  //handle your case accordingly,with null check and other to stirng
                    targetList.add(s);
                 }
        }


        /*Testing the targetList */

        for (String s : targetList) {
                System.out.println(s);
         }


    }
	
}
 