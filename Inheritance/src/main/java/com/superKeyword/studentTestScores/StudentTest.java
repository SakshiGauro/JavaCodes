package com.superKeyword.studentTestScores;

public class StudentTest {

    private int mathScore;
    private int elaScore;
    private String name;

    public StudentTest(String name, int mathScore, int elaScore){
       this.name = name;
       this.mathScore = mathScore;
       this.elaScore = elaScore;
    }

	public int getMathScore() {
	    return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getElaScore() {
	    return elaScore;
	}

	public void setElaScore(int elaScore) {
		this.elaScore = elaScore;
	}

	public String getName() {
		return name;
	}

}
