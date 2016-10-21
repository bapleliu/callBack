package com.callBack.asyn;

/**
 * Class Aʵ�ֽӿ�CallBack callback��������1
 * class A�а���һ��class B������b ��������2
 * class B��һ������Ϊcallback�ķ���f(CallBack callback) ��������3
 * A�Ķ���a����B�ķ��� f(CallBack callback) ����A�����B���ĳ������ C
 * Ȼ��b�Ϳ�����f(CallBack callback)�����е���A�ķ��� ����B�����A���ĳ������D
 * @author zhaoshiquan
 *
 */
public class Question implements CallBack{

	private Answer answer;

	public Question(Answer answer) {
		this.answer = answer;
	}

	public void askQuestion(final String question){  
		System.out.println("Question������"+question);
		//������һ���߳̾����첽��  
		new Thread(new Runnable() {  
			@Override 
			public void run() {  
				answer.executeMessage(Question.this, question);   
			}  
		}).start();  
		play();  
	}  
	
	public void play(){  
		System.out.println("����֮��Question��������ȥ��~~");  
	}  

	@Override
	public void solve(String result) {
		System.out.println("Answer �����Ĵ���" + result);
	}
}
