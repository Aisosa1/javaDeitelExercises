package CHAPTER3DITEL;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date (int day, int month, int year){

        this.day = day;
        this.month = month;
        this.year = year;

        }

        public void setDay (int day){

            this.day = day;
    }

    public  int getDay (){
        if (!(day <= 0) && day <= 31)
        return day;
        else
            return 0;
    }

    public void setMonth (int month){
        this.month = month;
    }
    public int getMonth (){
        if (month > 0 && month <= 12)
        return month;
        else
            return 0;
    }

    public void setYear (int year){
        this.year = year;
    }

    public int getYear (){
        return year;

    }

    @Override
    public String toString() {
        return "Date is " + " " + day + " /"+ month + "/ " + year;
    }
}
