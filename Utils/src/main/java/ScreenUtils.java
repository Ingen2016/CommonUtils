import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/**
 * 描述：布局方面的工具
 * 创建人：Ingen
 * 创建时间：2018/5/30.
 */
public class ScreenUtils {

    /**
     * 获取屏幕的宽度
     * @param activity
     * @return
     */
    public static float getScreenWidth(Activity activity){
        Resources resources = activity.getResources();
        DisplayMetrics dm = resources.getDisplayMetrics();
        float density = dm.density;
        float width = dm.widthPixels/density;
        return width;
    }

    /**
     * 获取屏幕高度
     * @param activity
     * @return
     */
    public static float getScreenHeight(Activity activity){
        Resources resources = activity.getResources();
        DisplayMetrics dm = resources.getDisplayMetrics();
        float density = dm.density;
        float width = dm.widthPixels/density;
        return width;
    }
}
