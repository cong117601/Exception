package com.yunhe.day01;

public class ImportCosmeticManger extends CosmeticManager {
//实现输出进口化妆品的管理类
	@Override
	public void printInfo() {
		// 比较两个字符串的值是否相等 equals()
		for (int i = 0; i < count; i++) {
			if ("进口".equals(cs[i].getType())) {
				System.out.println(cs[i].getInfo());
			}

		}
		super.printInfo();
	}
}
