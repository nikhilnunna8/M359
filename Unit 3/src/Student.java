public class Student {
    private String fName;
    private String lName;
    public Student(String first,String last){
        fName = first;
        lName = last;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }
    public boolean equals(Student student2){
        if (fName.equals(student2.getFName()) && (lName.equals(student2.getLName()))){
            return true;
        }
        return false;
    }
    public int compareTo(Student student2){
        int output = lName.compareTo(student2.getLName());
        if (lName.equals(student2.getLName())){
            output = fName.compareTo(student2.getFName());
        }
        return output;
    }
}
