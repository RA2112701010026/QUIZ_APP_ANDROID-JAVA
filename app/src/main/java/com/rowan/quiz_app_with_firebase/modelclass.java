package com.rowan.quiz_app_with_firebase;

public class modelclass {
    String myquestions;
    String  answers;
    String optionA;
    String optionB;
    String optionC;
    String optionD;

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    public String getMyquestions() {
        return myquestions;
    }

    public void setMyquestions(String myquestions) {
        this.myquestions = myquestions;
    }

    public modelclass(String myquestions, String answers, String optionA, String optionB, String optionC, String optionD) {
        this.myquestions = myquestions;
        this.answers = answers;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
    }
}
