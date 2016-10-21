package com.callBack.asyn;

public class Answer {

	public void executeMessage(CallBack callBack, String question){  
		System.out.println("Answer收到问题--->" + question);  
		for(int i=0; i<1000;i++){  
		}  
		System.out.println("Answer办完自己的事了");
		
		String result = "答案是2";  
		callBack.solve(result);   
	}  
}
