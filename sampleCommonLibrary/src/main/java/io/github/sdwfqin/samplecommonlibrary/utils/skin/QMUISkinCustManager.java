package io.github.sdwfqin.samplecommonlibrary.utils.skin;

import android.content.Context;

import com.blankj.utilcode.util.Utils;
import com.qmuiteam.qmui.skin.QMUISkinManager;

import io.github.sdwfqin.samplecommonlibrary.R;

public class QMUISkinCustManager {

    public static final int SKIN_BLUE = 1;
    public static final int SKIN_DARK = 2;

    public static void install(Context context) {
        QMUISkinManager skinManager = QMUISkinManager.defaultInstance(context);
        skinManager.addSkin(SKIN_BLUE, R.style.app_skin_blue);
        skinManager.addSkin(SKIN_DARK, R.style.app_skin_dark);
        int storeSkinIndex = QMUISkinPreferenceManager.getInstance(context).getSkinIndex();
//        boolean isDarkMode = (context.getResources().getConfiguration().uiMode
//                & Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES;
//        if (isDarkMode && storeSkinIndex != SKIN_DARK) {
//            skinManager.changeSkin(SKIN_DARK);
//        } else if (!isDarkMode && storeSkinIndex == SKIN_DARK) {
//            skinManager.changeSkin(SKIN_BLUE);
//        }else{
//            skinManager.changeSkin(storeSkinIndex);
//        }
        skinManager.changeSkin(storeSkinIndex);
    }

    public static void changeSkin(int index) {
        QMUISkinManager.defaultInstance(Utils.getApp()).changeSkin(index);
        QMUISkinPreferenceManager.getInstance(Utils.getApp()).setSkinIndex(index);
    }

    public static int getCurrentSkin() {
        return QMUISkinManager.defaultInstance(Utils.getApp()).getCurrentSkin();
    }
}
