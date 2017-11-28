package utils;


public class Notebook {
    public Integer numOfPages= 90;
    public pageSize size = pageSize.A5;
    public String dedication = "";
    public paperType paper = paperType.GRID;
    public coverType cover = coverType.SOFT;

    Notebook(Integer numOfPages, pageSize size, paperType paper, String dedication, coverType cover){
        this.numOfPages = numOfPages;
        this.size = size;
        this.paper= paper;
        this.dedication = dedication;

        this.cover = cover;
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

    public void setCover(coverType cover) {
        this.cover = cover;
    }
    public coverType getCover() {
        return cover;
    }
}
