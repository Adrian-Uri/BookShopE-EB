package models;


import play.data.Form;
import scala.collection.generic.BitOperations;
import utils.coverType;
import utils.pageSize;
import utils.paperType;

public class Notebook {
    public Integer numOfPages= 30;
    public pageSize size = pageSize.A5;
    public String dedication = "custom dedication";
    public paperType paper = paperType.GRID;
    public coverType cover = coverType.SOFT;
    public String imageId = "/assets/images/covers/cover01.jpg" ;


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
    public void  setImageId(String id){
        this.imageId = id;
    }
    public String getImageId() {
        return imageId;
    }
    /* public static Notebook makeInstance(Form<Notebook> formData) {
        Notebook notebook = new Notebook();
        notebook.numOfPages = formData.numOfPages;
        notebook.size = formData.size;
        for (String hobby : formData.hobbies) {
            notebook.hobbies.add(Hobby.findHobby(hobby));
        }
        notebook.level = GradeLevel.findLevel(formData.level);
        notebook.gpa = GradePointAverage.findGPA(formData.gpa);
        for (String major : formData.majors) {
            notebook.majors.add(Major.findMajor(major));
        }
        return notebook;
    }*/
}
