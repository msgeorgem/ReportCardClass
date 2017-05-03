package com.example.android.reportcard;

/**
 * Created by Marcin on 2017-05-03.
 */

public class ReportCard {
    private static final String SCHOOL_NAME = "High School of Cats";
    private static final String STUDENT_NAME = "John Doe";
    private static final int TOTAL = 5;

    private int mEnglishMark;
    private int mMathMark;
    private int mRussianMark;
    private int mJavaMark;
    private int mSqlMark;


    private int sum;
    private double mAverage;

    public ReportCard(int englishMark, int mathMark, int russianMark,
                      int javaMark, int sqlMark, double average) {
        mEnglishMark = englishMark;
        mMathMark = mathMark;
        mRussianMark = russianMark;
        mJavaMark = javaMark;
        mSqlMark = sqlMark;
        mAverage = average;
    }


    public int getEnglishMark() {
        return mEnglishMark;
    }
    public void setEnglishMark(int EnglishMark) {
        mEnglishMark = EnglishMark;
    }
    public int getMathMark() {
        return mMathMark;
    }
    public void setMathMark(int MathMark) {
        mMathMark = MathMark;
    }
    public int getRussianMark() {
        return mRussianMark;
    }
    public void setRussianMark(int RussianMark) {
        mRussianMark = RussianMark;
    }
    public int getJavaMark() {
        return mJavaMark;
    }
    public void setJavaMark(int JavaMark) {
        mJavaMark = JavaMark;
    }
    public int getSqlMark() {
        return mSqlMark;
    }
    public void setSqlMark(int SqlMark) {
        mSqlMark = SqlMark;
    }
    public double getAverage() {
        return mAverage;
    }


    private String getAverage(int eng, int math, int rus, int java, int sql) {
        String gradeName;
        sum = eng + math + rus + java + sql;
        mAverage = sum / TOTAL;

        if (mAverage >= 5.0) {
            gradeName = "Excelent";
        } else if (mAverage < 5.0 && mAverage >= 4.0) {
            gradeName = "Very Good";
        } else if (mAverage < 4.0 && mAverage >= 3.0) {
            gradeName = "Good";
        } else if (mAverage < 3.0 && mAverage >= 2.0) {
            gradeName = "Passing";
        } else if (mAverage < 2.0) {
            gradeName = "Fail";
        } else {
            gradeName = "check all grades";
        }
        return gradeName;
    }


    @Override
    public String toString() {
        return "ReportCard{ + " +
                ", School Name: " + SCHOOL_NAME + '\''+
                ", Student Name: " + STUDENT_NAME + '\''+
                ", mEnglishMark='" + mEnglishMark +
                ", mMathMark='" + mMathMark +
                ", mRussianMark='" + mRussianMark +
                ", mJavaMark='" + mJavaMark +
                ", mSqlMark='" + mSqlMark +
                ", grade='" + getAverage(mEnglishMark, mMathMark, mRussianMark, mJavaMark, mSqlMark) + '\'' +
                '}';
    }

}
