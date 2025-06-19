package app;

public class Main3 {

    public static void main(String[] args) {
        /*
        Дано три переменные:
        isQuietHours — сейчас тихое время (ночь, например)
        hasNeighborsComplaint — жалуются ли соседи
        isHoliday — сейчас праздник Музыку можно включить,
        если не тихое время и соседи не жалуются.
        В праздник музыку можно включать даже если соседи жалуются или тихое время.
        Запишите условие для переменной isMusicAllowed: можно ли включать музыку
         */
        boolean isQuietHours = true;             // сейчас тихое время
        boolean hasNeighborsComplaint = false;   // соседи не жалуются
        boolean isHoliday = false;               // сейчас не праздник

        boolean isMusicAllowed = isHoliday || (!isQuietHours && !hasNeighborsComplaint);

        System.out.println("Можно ли включать музыку? " + isMusicAllowed);
    }
}
