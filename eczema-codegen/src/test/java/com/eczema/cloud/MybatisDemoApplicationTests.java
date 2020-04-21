package com.eczema.cloud;

import java.io.File;
import java.io.IOException;
import com.eczema.cloud.util.GenComp;
import lombok.AllArgsConstructor;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MybatisDemoApplicationTests {
    @Autowired
    private GenComp genComp;
    private static final String targetFile = "D:\\code\\eczema.zip";

    @Test
    public void test() {
        byte[] zipByte = genComp.generatorCode();
        try {
            //生成路径
            FileUtils.writeByteArrayToFile(new File(targetFile), zipByte);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
