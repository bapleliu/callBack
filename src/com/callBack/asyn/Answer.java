package com.callBack.asyn;

public class Answer {

	public void executeMessage(CallBack callBack, String question){  
		System.out.println("Answer�յ�����--->" + question);  
		for(int i=0; i<1000;i++){  
		}  
		System.out.println("Answer�����Լ�������");
		
		String result = "����2";  
		callBack.solve(result);   
	}  
}
