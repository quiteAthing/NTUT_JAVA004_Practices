package guessingNumMore;
import java.util.Scanner;

public interface cornerGame {
	void setupGame(Scanner scr);//因為是在Console上玩，所以必須傳入一個Scanner型別的物件
	void playGame();//主要遊玩的程式碼編寫在此，注意必須保留接收到"quit"時呼叫quitOnInput()方法的判斷
	void quitOnInput();//當收到"quit"輸入時要做的動作

}
