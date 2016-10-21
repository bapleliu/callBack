package com.callBack.asyn;

public class TestClient {
	public static void main(String[] args) {
		Answer asr = new Answer();
		Question qst = new Question(asr);
		qst.askQuestion("1 + 1 = ?");
	}
}
