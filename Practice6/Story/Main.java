package Java.Practice6.Story;

import static Java.Practice6.Story.Kohan.*;
import static Java.Practice6.Story.Kohan.callDeae;
import static Java.Practice6.Story.Kohan.showMondokoro;
import static Java.Practice6.Story.Zenhan.doTogame;
import static Java.Practice6.Story.Zenhan.doWarusa;

/**
 * Created by madoka on 2017/04/24.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Thread thread = null;

        doWarusa();
        doTogame();
        callDeae();
        showMondokoro();

    }



}
