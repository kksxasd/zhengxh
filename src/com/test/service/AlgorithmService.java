package com.test.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2017/6/2.
 */
@Service
@Transactional
public class AlgorithmService {
    /**
     * 冒泡排序
     */
    public void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    /**
     * 选择排序
     */
    public void selectSort(int[] arr){
        int min=0;
        for(int i=0;i<arr.length-1;i++){
            min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if(min!=i){
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
    }

    /**
     * 快速排序
     * @param start
     * @param end
     * @param arr
     */
    public void quickSort(int start,int end,int[] arr){
        int i=start;
        int j=end;
        int key=arr[start];
        while(i<j){
            while(i<j&&arr[j]>=key) {
                j--;
            }
            if(i<j){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
            }
            while(i<j&&arr[i]<=key){
                i++;
            }
            if(i<j){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j--;
            }
        }
        if(i>start) quickSort(start,i-1,arr);
        if(j<end) quickSort(j+1,end,arr);
    }

}
