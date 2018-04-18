package com.imooc.controller;

import org.kopitubruk.util.json.JSONUtil;
import sun.applet.Main;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class testhttp {
    public static void main(String[] args) {

        tbc tt=new tbc();
        ApList a=new ApList();
        ApBean APB=  new ApBean();
        APB.setBssid("a");
        List s=new ArrayList<ApBean>();
        s.add(APB);
        a.setApList(s);
        tt.setAp(a);
        System.out.println(tt);


        Map o=new HashMap() ;
        Map f=new HashMap() ;
        Map t=new HashMap() ;
        t.put("bssid","a");
        f.put("ap",t);
        o.put("tbc",f);
     String sss=   testhttp.jsonPost("http://192.168.43.83:8080/sell/a/b/c",o);
        System.out.println(sss);
    }


    public static String jsonPost(String strURL,  Map<String, Object> params) {
        try {

            URL url = new URL(strURL);// 创建连接
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(false);
            connection.setInstanceFollowRedirects(true);
            connection.setRequestMethod("POST"); // 设置请求方式
            connection.setRequestProperty("Accept", "application/json"); // 设置接收数据的格式
            connection.setRequestProperty("Content-Type", "application/json"); // 设置发送数据的格式
            connection.connect();
            OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream(), "UTF-8"); // utf-8编码
            System.out.println(JSONUtil.toJSON(params));
            out.append(JSONUtil.toJSON(params));
            out.flush();
            out.close();

            int code = connection.getResponseCode();
            InputStream is = null;
            if (code == 200) {
                is = connection.getInputStream();
            } else {
                is = connection.getErrorStream();
            }

            // 读取响应
            int length = (int) connection.getContentLength();// 获取长度
            if (length != -1) {
                byte[] data = new byte[length];
                byte[] temp = new byte[512];
                int readLen = 0;
                int destPos = 0;
                while ((readLen = is.read(temp)) > 0) {
                    System.arraycopy(temp, 0, data, destPos, readLen);
                    destPos += readLen;
                }
                String result = new String(data, "UTF-8"); // utf-8编码
                return result;
            }

        } catch (IOException e) {
           System.err.println("Exception occur when send http post request!"+e);
        }
        return "error"; // 自定义错误信息
    }


}
