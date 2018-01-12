package com.imooc;



import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/***
 * fuhang
 * date()
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {
  static   int  i=99;

    /*   注解  @Slf4j 替代
        private final Logger log= LoggerFactory.getLogger(LoggerTest.class);
    */
    @Test
    public void test1(){


        String  name="imooc";
        String password="12345";
        log.debug("debug ------");
        log.info("info ------"+"name:{},password:{}",name,password);

        log.error("error ------");

        String str ="123-456-789-110";
        String  rt=str.substring(str.indexOf("-")+1,str.indexOf("-")+4);

        String[] sm=str.split("-");
        System.out.println(str.subSequence(str.indexOf("-")+1,str.indexOf("-")+4));

        System.out.println(rt);
    }


@Test
    public  void ping() throws Exception {
    ExecutorService executorService = Executors.newFixedThreadPool(200);
    LoggerTest abc = new LoggerTest();



      new myth("192.168.2." +100, 1900).run();
       new myth("192.168.2." +111, 1900).run();
        new myth("192.168.2." +112, 1900).run();
        new myth("192.168.2." +113, 1900).run();
        new myth("192.168.2." +114, 1900).run();
        new myth("192.168.2." +115, 1900).run();
        new myth("192.168.2." +116, 1900).run();
        new myth("192.168.2." +117, 1900).run();
        new myth("192.168.2." +118, 1900).run();




    }

    class myth implements Runnable

    {

        String ipss;
        int times;
        myth(String ip,int times){

            this.ipss=ip;
            this.times=times;
        }

        @Override
        public void run() {
            try {
                i++;
                boolean status = InetAddress.getByName(ipss).isReachable(times);// 当返回值是true时，说明host是可用的，false则不可。
                if(status) {

                   log.error(ipss+"                 有效");
                }else {

                    log.error(ipss+"                 无效");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
