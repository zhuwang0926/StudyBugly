package com.smatek.studybugly;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Created by zhuwang 2020-11-16-星期一-下午4:04
 * Email zhuwang999@foxmail.com
 */
public class MyApplication extends TinkerApplication {

    public MyApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.smatek.studybugly.MyApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
