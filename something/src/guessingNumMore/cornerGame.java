package guessingNumMore;
import java.util.Scanner;

public interface cornerGame {
	void setupGame(Scanner scr);//�]���O�bConsole�W���A�ҥH�����ǤJ�@��Scanner���O������
	void playGame();//�D�n�C�����{���X�s�g�b���A�`�N�����O�d������"quit"�ɩI�squitOnInput()��k���P�_
	void quitOnInput();//����"quit"��J�ɭn�����ʧ@

}
