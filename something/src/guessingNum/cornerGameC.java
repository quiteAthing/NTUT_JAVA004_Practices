package guessingNum;

public abstract class cornerGameC implements cornerGame{
	//�u�W�[quitOnInput��k���{���X�A��L��k�~��ŧi��abstract
	@Override
	public void quitOnInput(){
		gNum.endGame();
	}

}
