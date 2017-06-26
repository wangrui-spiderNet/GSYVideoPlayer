package com.example.gsyvideoplayer.utils;

import android.content.Context;

import com.example.gsyvideoplayer.R;

import org.apache.http.util.EncodingUtils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import static javax.xml.transform.OutputKeys.ENCODING;

/**
 * Created by wangrui on 2017/6/9.
 */

public class StringUtil {

//    public String getFromRaw(Context context){
//        try {
//            InputStreamReader inputReader = new InputStreamReader(context.getResources().openRawResource(R.raw.test1));
//            BufferedReader bufReader = new BufferedReader(inputReader);
//            String line="";
//            String Result="";
//            while((line = bufReader.readLine()) != null)
//                Result += line;
//            return Result;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return "";
//    }
//    public static String getFromAssets(Context context, String fileName){
//        try {
//            InputStreamReader inputReader = new InputStreamReader( context.getResources().getAssets().open(fileName) );
//            BufferedReader bufReader = new BufferedReader(inputReader);
//            String line="";
//            String Result="";
//            while((line = bufReader.readLine()) != null)
//                Result += line;
//            return Result;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return "";
//    }

    //从assets 文件夹中获取文件并读取数据
    public static String getFromAssets(Context context,String fileName){
        String result = "";
        try {
            InputStream in =context.getResources().getAssets().open(fileName);
//获取文件的字节数
            int lenght = in.available();
//创建byte数组
            byte[]  buffer = new byte[lenght];
//将文件中的数据读到byte数组中
            in.read(buffer);
            result = EncodingUtils.getString(buffer, ENCODING);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
