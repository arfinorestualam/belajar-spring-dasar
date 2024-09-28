package pzn.belajarspringdasar.aware;

public interface IdAware {

    void setId(String id);

    //belajar penggunaan ordered
    //karena bean post tidak urut, kita perlu ordered agar bean post
    //mengurutkan dari yang terkecil
    String getId();

}
