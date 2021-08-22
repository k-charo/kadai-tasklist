package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Tasklist;

public class TaskValidator {
    public static List<String> validate(Tasklist t) {

        //バリデーションを実行する
        List<String> errors = new ArrayList<String>();

        String content_error = validateContent(t.getContent());
        if (!content_error.equals("")) {
            errors.add(content_error);
        }

        return errors;
    }

    //タスク内容の必須入力チェック
    private static String validateContent(String content) {
        if (content == null || content.equals("")) {
            return "タスク内容を入力してください。";
        }

        return "";
    }
}
