package com.hoomsun.reptile.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 服务启动执行,从数据库中查询需要生成的类并将类生成到对应目录
 * @ClassName: MyStartupRunner  
 * @Description: 服务启动执行
 * @author: xuesongcui
 * @date 2017年12月12日  
 *
 */
@Component
@Order(value=1)
public class MyStartupRunner implements CommandLineRunner{

	private static Logger logger= LoggerFactory.getLogger(MyStartupRunner.class);
	
	@Override
	public void run(String... arg0) throws Exception {
		logger.warn(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作<<<<<<<<<<<<<");
	    
		
	}

}
