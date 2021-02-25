package com.example.testreznikov;

public class Questions {
    public String nQuestions [] = {
            "Да или нет?",
            "Нет или да",
            "Да или нет?",
            "Нет или да",
            "Да или нет?",
            "Нет или да",
            "Да или нет?",
            "Нет или да"

    };
    private String nChoices [] []= {
            {"Да", "Нет", "Возможно", "Мне все равно"},
            {"Да", "Нет", "Возможно", "Мне все равно"},
            {"Да", "Нет", "Возможно", "Мне все равно"},
            {"Да", "Нет", "Возможно", "Мне все равно"},
            {"Да", "Нет", "Возможно", "Мне все равно"},
            {"Да", "Нет", "Возможно", "Мне все равно"},
            {"Да", "Нет", "Возможно", "Мне все равно"},
            {"Да", "Нет", "Возможно", "Мне все равно"},

    };
    private String nCorrectAnswers [] = {"Да", "Да","Да", "Да","Да", "Да", "Да", "Да"

    };
    public String getQuestion(int a){
        String question = nQuestions[a];
        return question;
    }
    public String getChoice1(int a){
        String choice = nChoices[a][0];
        return choice;
    }
    public String getChoice2(int a){
        String choice = nChoices[a][1];
        return choice;
    }
    public String getChoice3(int a){
        String choice = nChoices[a][2];
        return choice;
    }
    public String getChoice4(int a){
        String choice = nChoices[a][3];
        return choice;
    }
    public String getCorrectAnswer(int a){
        String answer = nCorrectAnswers[a];
        return answer;
    }
}
