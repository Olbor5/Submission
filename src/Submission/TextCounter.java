package Submission;

public class TextCounter {

    private int rowCount = 0;
    private int charCount = 0;

    public void addRow(String text) {
        rowCount++;
        charCount += text.length();
    }

    public int getRowCount() {
        return rowCount;
    }

    public int getCharCount() {
        return charCount;
    }

}
