package com.company.doc;

/**
 * @author TaiYang
 * @version 1.0
 * @since 1.8
 */

public class DocTest {
    String name;

    /**
     * @author TaiYang
     * @param name
     * @return
     * @throws Exception
     */

    private String getName(String name) throws Exception{
        return name;
    }

    // 通过命令行 javadoc 参数 java 文件
    //javadoc -encoding UTF-8 -charset UTF-8 DocTest.java
}
