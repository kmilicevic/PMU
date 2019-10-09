package rs.etf.pmu.gui;

import android.app.Application;
import android.content.res.Configuration;

public class PmuGuiApplication extends Application {
	private static PmuGuiApplication singleton;

	public static PmuGuiApplication getInstance() {
		return singleton;
	}

	@Override
	public final void onCreate() {
		super.onCreate();
		singleton = this;
	}

	@Override
	public final void onLowMemory() {
		super.onLowMemory();
	}

	@Override
	public final void onTrimMemory(int level) {
		super.onTrimMemory(level);
	}

	@Override
	public final void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
	}
}
