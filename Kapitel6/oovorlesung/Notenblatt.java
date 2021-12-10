package oovorlesung;

public class Notenblatt {
    private String moduleName;
    private int note;

    public Notenblatt(String moduleName, int note) {
        this.setModuleName(moduleName);
        this.note = note;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public void print() {
        System.out.println("module: " + getModuleName() + " note: " + getNote());
    }

}
