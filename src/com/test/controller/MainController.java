package com.test.controller;

import com.test.dao.ResponseInfoBody;
import com.test.service.AlgorithmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/6/2.
 */
@Controller
@RequestMapping(value="/main")
public class MainController {
    @Autowired
    private AlgorithmService algorithmService;



    /**
     * 快速排序
     * @param arr
     * @return
     */
    @RequestMapping("/quickSort")
    @ResponseBody
    public ResponseInfoBody quickSort(@RequestParam("arr") String arr){
        String returnArr="";
        int array[]=stringToArray(arr);

        algorithmService.quickSort(0,9,array);

        for(int i=0;i<array.length;i++){
            returnArr+=array[i]+",";
        }
        returnArr.substring(0,returnArr.length()-2);
        return new ResponseInfoBody(returnArr);
    }

    /**
     * 冒泡排序
     * @param arr
     * @return
     */
    @RequestMapping("/bubbleSort")
    @ResponseBody
    public ResponseInfoBody bubbleSort(@RequestParam("arr") String arr){
        String returnArr="";
        int array[]=stringToArray(arr);

        algorithmService.bubbleSort(array);

        for(int i=0;i<array.length;i++){
            returnArr+=array[i]+",";
        }
        returnArr.substring(0,returnArr.length()-2);
        return new ResponseInfoBody(returnArr);
    }

    /**
     * 选择排序
     * @param arr
     * @return
     */
    @RequestMapping("/selectSort")
    @ResponseBody
    public ResponseInfoBody selectSort(@RequestParam("arr") String arr){
        String returnArr="";
        int array[]=stringToArray(arr);

        algorithmService.selectSort(array);

        for(int i=0;i<array.length;i++){
            returnArr+=array[i]+",";
        }
        returnArr.substring(0,returnArr.length()-2);
        return new ResponseInfoBody(returnArr);
    }

    /**
     * 逗号分隔的String转int数组
     * @param arr
     * @return
     */
    public int[] stringToArray(String arr){
        String[] arrs=arr.split(",");
        int array[]=new int[arrs.length];
        for(int i=0;i<arrs.length;i++){
            array[i]=Integer.parseInt(arrs[i]);
        }
        return array;
    }
}
