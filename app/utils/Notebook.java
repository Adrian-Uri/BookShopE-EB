package utils;


public class Notebook {
    public Integer numOfPages= 90;
    public pageSize size = pageSize.A5;
    public String dedication = "";
    public paperType paper = paperType.GRID;

    Notebook(Integer numOfPages, pageSize size, paperType paper, String dedication){
        this.numOfPages = numOfPages;
        this.size = size;
        this.paper= paper;
        this.dedication = dedication;
    }

    public Notebook(){

    }

    public void setDedication(String dedication) {
        this.dedication = dedication;
    }

    public void setSize(pageSize size) {
        this.size = size;
    }

    public void setPaper(paperType paper) {
        this.paper = paper;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public String getDedication() {
        return dedication;
    }

    public pageSize getSize() {
        return size;
    }

    public paperType getPaper() {
        return paper;
    }
}
