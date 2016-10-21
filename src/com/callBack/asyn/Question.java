package com.callBack.asyn;

/**
 * Class A实现接口CallBack callback——背景1
 * class A中包含一个class B的引用b ——背景2
 * class B有一个参数为callback的方法f(CallBack callback) ——背景3
 * A的对象a调用B的方法 f(CallBack callback) ——A类调用B类的某个方法 C
 * 然后b就可以在f(CallBack callback)方法中调用A的方法 ——B类调用A类的某个方法D
 * @author zhaoshiquan
 *
 */
public class Question implements CallBack{

	private Answer answer;

	public Question(Answer answer) {
		this.answer = answer;
	}

	public void askQuestion(final String question){  
		System.out.println("Question提问了"+question);
		//这里用一个线程就是异步，  
		new Thread(new Runnable() {  
			@Override 
			public void run() {  
				answer.executeMessage(Question.this, question);   
			}  
		}).start();  
		play();  
	}  
	
	public void play(){  
		System.out.println("提问之后，Question干其他事去了~~");  
	}  

	@Override
	public void solve(String result) {
		System.out.println("Answer 给出的答案是" + result);
	}
}
