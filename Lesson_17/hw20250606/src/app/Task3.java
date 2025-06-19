package app;

public class Task3 {

    public static void main(String[] args) {

        boolean isQuietHours = true;       //сейчас тихое время (ночь, например)
        boolean hasNeighborsComplaint = true; // жалуются ли соседи
        boolean isHoliday = false;          //сейчас праздник

        // ----------------
        boolean isMusicAllowed = (!isQuietHours  &&  !hasNeighborsComplaint ) || isHoliday;

        System.out.println("Можно включать музыку: " + isMusicAllowed);


    }
}
