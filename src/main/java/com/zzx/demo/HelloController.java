package com.zzx.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author sinc
 * @version V1.0
 * @Description: TODO
 * @Package com.zzx.demo.action
 * @date 2017/12/21 11:38
 */

@EnableAutoConfiguration
@SpringBootApplication

@ServletComponentScan
@MapperScan("com.zzx.demo.mapper")
//@ImportResource("classpath:springconfig/*.xml")
//@PropertySource(value = {"classpath:spring/config.properties","classpath:spring/news.properties"})
public class HelloController {

    public static void main(String[] args) throws Exception {
//        SpringApplication.run(HelloController.class, args);

        RandomAccessFile raf = new RandomAccessFile("/Users/admin/Desktop/test/test","rws");
        FileChannel fileChannel = raf.getChannel();
        ByteBuffer buf = ByteBuffer.allocate(2);
        int status = -1;
        while ((status = fileChannel.read(buf)) > -1){

//            buf.flip();
            System.out.println(buf);


            if(buf.hasRemaining()){

                System.out.print((char) buf.get()); // read 1 byte at a time

            }

            buf.clear();

        }



    }


}
