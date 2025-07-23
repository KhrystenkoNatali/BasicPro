package app;

public interface Swimmable {

    void  swim();
    default String getType(){
        qwe();
        return "Неизвестный тип";
    };

    private String qwe(){
        return "";
    }
}
