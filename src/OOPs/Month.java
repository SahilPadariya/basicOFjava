package OOPs;

enum Month {
    JANUARY(1),FEBRUARY(2),MARCH(3),APRIL(4),MAY(5),JUNE(6);
    private int monthno;

    private Month(int monthno){
        this.monthno=monthno;
    }
    public int getMonthno(){
        return this.monthno;
    }
}
